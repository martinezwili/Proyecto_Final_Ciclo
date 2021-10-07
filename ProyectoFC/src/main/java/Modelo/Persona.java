package Modelo;

import java.sql.Date;
import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Persona {
    private String per_cedula, per_nombre, per_apellido, per_telefono, per_contraseña, per_estado, rel_cedula;
    private Date per_nacimiento;

    public Persona(String per_cedula, String per_nombre, String per_apellido, String per_telefono, String per_contraseña, String per_estado, String rel_cedula, Date per_nacimiento) {
        this.per_cedula = per_cedula;
        this.per_nombre = per_nombre;
        this.per_apellido = per_apellido;
        this.per_telefono = per_telefono;
        this.per_contraseña = per_contraseña;
        this.per_estado = per_estado;
        this.rel_cedula = rel_cedula;
        this.per_nacimiento = per_nacimiento;
    }

    public String getPer_cedula() {
        return per_cedula;
    }

    public void setPer_cedula(String per_cedula) {
        this.per_cedula = per_cedula;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    public String getPer_contraseña() {
        return per_contraseña;
    }

    public void setPer_contraseña(String per_contraseña) {
        this.per_contraseña = per_contraseña;
    }

    public String getPer_estado() {
        return per_estado;
    }

    public void setPer_estado(String per_estado) {
        this.per_estado = per_estado;
    }

    public String getRel_cedula() {
        return rel_cedula;
    }

    public void setRel_cedula(String rel_cedula) {
        this.rel_cedula = rel_cedula;
    }

    public Date getPer_nacimiento() {
        return per_nacimiento;
    }

    public void setPer_nacimiento(Date per_nacimiento) {
        this.per_nacimiento = per_nacimiento;
    }

    public Conexionbd getConexion() {
        return conexion;
    }

    public void setConexion(Conexionbd conexion) {
        this.conexion = conexion;
    }

    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_telefono, per_nacimiento, per_contraseña, per_estado, rel_cedula) VALUES ('" + getPer_cedula() + "','" + getPer_nombre() + "','" + getPer_apellido() + "','" + getPer_telefono() + "','" + getPer_nacimiento() + "','" + getPer_contraseña() + "','" + getPer_estado() + "','" + getRel_cedula() + "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE persona SET per_nombre = '"+ getPer_nombre() +"', per_apellido = '"+ getPer_apellido() +"', per_telefono = '"+ getPer_telefono() +"', per_nacimiento = '"+ getPer_nacimiento() +"', per_contraseña = '"+ getPer_contraseña() +"', per_estado = '"+ getPer_estado()+"' WHERE per_cedula ='"+ getPer_cedula() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("UPDATE persona per_estado = '"+ getPer_estado() +"' WHERE per_cedula = '" + getPer_cedula() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT per_cedula FROM persona WHERE per_cedula = '" + getPer_cedula()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
