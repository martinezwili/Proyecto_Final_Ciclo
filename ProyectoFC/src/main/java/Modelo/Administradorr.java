/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAWIL
 */
public class Administradorr{
    private String adm_cedula, adm_correo, for_codigo, adm_per_cedula;

    public Administradorr(String adm_cedula, String adm_correo, String for_codigo, String adm_per_cedula) {
        this.adm_cedula = adm_cedula;
        this.adm_correo = adm_correo;
        this.for_codigo = for_codigo;
        this.adm_per_cedula = adm_per_cedula;
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

    public String getAdm_per_cedula() {
        return adm_per_cedula;
    }

    public void setAdm_per_cedula(String adm_per_cedula) {
        this.adm_per_cedula = adm_per_cedula;
    }

    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO administrador (adm_cedula, adm_correo, for_codigo, per_cedula) VALUES ('" + getAdm_cedula()+ "','" + getAdm_correo()+ "','" + getFor_codigo()+ "','" + getAdm_per_cedula() + "');";
        
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
        String nsql = "DELETE FROM administrador WHERE adm_cedula = '" + getAdm_cedula()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }  
    
    public static boolean login(String a, String b) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        //sentencia para validar que sea un administrador
        String sql = "SELECT adm_cedula FROM administrador WHERE adm_cedula = '" + a +"'";
        int resul = 0; 
        boolean as = false;
        ResultSet rs = conexion.query(sql);
        if(rs.next()){
            //sentencia para comprovar contrase;a
            String sql2 = "SELECT per_cedula FROM persona WHERE per_cedula = '" + a + "' and per_contraseña = '" + b + "'";
            ResultSet rs2 = conexion.query(sql2);
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
