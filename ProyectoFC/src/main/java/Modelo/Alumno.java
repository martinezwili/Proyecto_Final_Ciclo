/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class Alumno {
    private String alu_telrepresentante;
    private String alu_cedula,jor_codigo,mod_codigo,cur_codigo;

    public Alumno(String alu_telrepresentante, String alu_cedula, String jor_codigo, String mod_codigo, String cur_codigo) {
        this.alu_telrepresentante = alu_telrepresentante;
        this.alu_cedula = alu_cedula;
        this.jor_codigo = jor_codigo;
        this.mod_codigo = mod_codigo;
        this.cur_codigo = cur_codigo;
    }

    public String getAlu_telrepresentante() {
        return alu_telrepresentante;
    }

    public void setAlu_telrepresentante(String alu_telrepresentante) {
        this.alu_telrepresentante = alu_telrepresentante;
    }

    public String getAlu_cedula() {
        return alu_cedula;
    }

    public void setAlu_cedula(String alu_cedula) {
        this.alu_cedula = alu_cedula;
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

    public String getCur_codigo() {
        return cur_codigo;
    }

    public void setCur_codigo(String cur_codigo) {
        this.cur_codigo = cur_codigo;
    }
    public boolean insertarA(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO alumno (alu_cedula, alu_correo, for_codigo, per_cedula) VALUES ('" + getAlu_cedula() + "','" + getAlu_telrepresentante() + "','" +getJor_codigo()+ "','" + getMod_codigo()+ "','" +getCur_codigo()+ "','" + "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminarA(){
         Conexionbd conexion = new Conexionbd();
        String nsql = "DELETE FROM alumno WHERE alu_cedula = '" + getAlu_cedula()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean loginE(String a, String b) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        String sql = "SELECT alu_cedula FROM alumno WHERE alu_cedula = '" + a +"'";
        int resul = 0; 
        boolean as = false;
        ResultSet rs = conexion.query(sql);
        if(rs.next()){
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
