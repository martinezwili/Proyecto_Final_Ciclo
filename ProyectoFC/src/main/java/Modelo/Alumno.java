package Modelo;

import Conexion.Conexionbd;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Alumno extends Persona{
    private String alu_cedula, alu_telrepresentante, jor_codigo, mod_codigo;

    public Alumno(String alu_cedula, String alu_telrepresentante, String jor_codigo, String mod_codigo, String per_cedula, String per_nombre, String per_apellido, String per_telefono, String per_contraseña, String per_estado, String rel_cedula, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_telefono, per_contraseña, per_estado, rel_cedula, per_nacimiento);
        this.alu_cedula = alu_cedula;
        this.alu_telrepresentante = alu_telrepresentante;
        this.jor_codigo = jor_codigo;
        this.mod_codigo = mod_codigo;
    }

    public String getAlu_cedula() {
        return alu_cedula;
    }

    public void setAlu_cedula(String alu_cedula) {
        this.alu_cedula = alu_cedula;
    }

    public String getAlu_telrepresentante() {
        return alu_telrepresentante;
    }

    public void setAlu_telrepresentante(String alu_telrepresentante) {
        this.alu_telrepresentante = alu_telrepresentante;
    }

    public String getJor_codigo() {
        return jor_codigo;
    }

    public void setJor_codigo(String jor_codigo) {
        this.jor_codigo = jor_codigo;
    }

    public String getMod_codigo() {
        return mod_codigo;
    }

    public void setMod_codigo(String mod_codigo) {
        this.mod_codigo = mod_codigo;
    }

    public Conexionbd getConexion() {
        return conexion;
    }

    public void setConexion(Conexionbd conexion) {
        this.conexion = conexion;
    }
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO alumno (alu_cedula, alu_telrepresentante, jor_codigo, mod_codigo) VALUES ('" + getAlu_cedula() + "','" + getAlu_telrepresentante() + "','" +getJor_codigo()+ "','" + getMod_codigo()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE alumno SET alu_telrepresentante = '"+ getAlu_telrepresentante()+"', jor_codigo = '"+ getJor_codigo()+"', mod_codigo ='"+ getMod_codigo() +"' WHERE alu_cedula = '"+ getAlu_cedula()+"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM alumno WHERE alu_cedula = '" + getAlu_cedula()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }  
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT alu_cedula FROM alumno WHERE alu_cedula = '" + getAlu_cedula()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
            
    public static boolean loginAL(String a, String b) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        //sentencia para validar que sea un alumno
        int resul = 0; 
        boolean as = false;
        ResultSet rs = conexion.query("SELECT alu_cedula FROM alumno WHERE alu_cedula = '" + a +"'");
        if(rs.next()){
            //sentencia para comprovar contrase;a
            ResultSet rs2 = conexion.query("SELECT per_cedula FROM persona WHERE per_cedula = '" + a + "' and per_contraseña = '" + b + "' AND per_estado = '"+ "ACTIVO" +"'");
            if(rs2.next()){
                as = true;
            }
            else
            {
                as = false;
            }
        }
        else
        {
            as =  false;
        }
        return as;
    }
}
