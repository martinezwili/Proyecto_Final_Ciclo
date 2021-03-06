package Modelo;

import Conexion.Conexionbd;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Administrador extends Persona{
    private String adm_cedula, adm_correo, for_codigo;

    public Administrador(String adm_cedula, String adm_correo, String for_codigo, String per_cedula, String per_nombre, String per_apellido, String per_telefono, String per_contraseña, String per_estado, String rel_cedula, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_telefono, per_contraseña, per_estado, rel_cedula, per_nacimiento);
        this.adm_cedula = adm_cedula;
        this.adm_correo = adm_correo;
        this.for_codigo = for_codigo;
    }

    public String getAdm_cedula() {
        return adm_cedula;
    }

    public void setAdm_cedula(String adm_cedula) {
        this.adm_cedula = adm_cedula;
    }

    public String getAdm_correo() {
        return adm_correo;
    }

    public void setAdm_correo(String adm_correo) {
        this.adm_correo = adm_correo;
    }

    public String getFor_codigo() {
        return for_codigo;
    }

    public void setFor_codigo(String for_codigo) {
        this.for_codigo = for_codigo;
    }

    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO administrador (adm_cedula, adm_correo, for_codigo) VALUES ('" + getAdm_cedula()+ "','" + getAdm_correo()+ "','" + getFor_codigo()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE administrador SET adm_correo = '"+ getAdm_correo() +"', for_codigo = '"+ getFor_codigo() +"' WHERE adm_cedula = '"+ getAdm_cedula()+"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM administrador WHERE adm_cedula = '" + getAdm_cedula()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }  
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT adm_cedula FROM administrador WHERE adm_cedula = '" + getAdm_cedula()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean loginAD(String a, String b) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        //sentencia para validar que sea un administrador
        int resul = 0; 
        boolean as = false;
        ResultSet rs = conexion.query("SELECT adm_cedula FROM administrador WHERE adm_cedula = '" + a +"'");
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