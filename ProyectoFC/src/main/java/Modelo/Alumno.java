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
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertarA(){
        if(conexion.noQuery("INSERT INTO alumno (alu_cedula, alu_telrepresentante, jor_codigo, mod_codigo,cur_codigo) VALUES ('" + getAlu_cedula() + "','" + getAlu_telrepresentante() + "','" +getJor_codigo()+ "','" + getMod_codigo()+ "','" +getCur_codigo()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminarA(){
        if(conexion.noQuery("DELETE FROM alumno WHERE alu_cedula = '" + getAlu_cedula()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT alu_cedula FROM alumno WHERE alu_cedula = '" + getAlu_cedula() + "'");
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
        int resul = 0; 
        boolean as = false;
        ResultSet rs = conexion.query("SELECT alu_cedula FROM alumno WHERE alu_cedula = '" + a +"'");
        if(rs.next()){
            ResultSet rs2 = conexion.query("SELECT per_cedula FROM persona WHERE per_cedula = '" + a + "' and per_contraseña = '" + b + "'");
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
