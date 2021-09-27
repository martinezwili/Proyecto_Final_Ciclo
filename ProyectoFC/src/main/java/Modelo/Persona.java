/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import Conexion.Conexionbd;

/**
 *
 * @author MAWIL
 */
public class Persona {
    private String per_cedula, per_nombre, per_apellido, per_telefono, per_contraseña, rel_cedula;
    private Date per_nacimiento;

    public Persona(String per_cedula, String per_nombre, String per_apellido, String per_telefono, String per_contraseña, String rel_cedula, Date per_nacimiento) {
        this.per_cedula = per_cedula;
        this.per_nombre = per_nombre;
        this.per_apellido = per_apellido;
        this.per_telefono = per_telefono;
        this.per_contraseña = per_contraseña;
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
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_telefono, per_nacimiento, per_contraseña, rel_cedula) VALUES ('" + getPer_cedula() + "','" + getPer_nombre() + "','" + getPer_apellido() + "','" + getPer_telefono() + "','" + getPer_nacimiento() + "','" + getPer_contraseña() + "','" + getRel_cedula() + "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "DELETE FROM persona WHERE per_cedula = '" + getPer_cedula() +"'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
