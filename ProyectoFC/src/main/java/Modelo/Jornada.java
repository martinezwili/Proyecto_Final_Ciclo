/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;

/**
 *
 * @author byron
 */
public class Jornada {
    private String jor_codigo,jor_jornada;

    public Jornada(String jor_codigo, String jor_jornada) {
        this.jor_codigo = jor_codigo;
        this.jor_jornada = jor_jornada;
    }

    public String getJor_codigo() {
        return jor_codigo;
    }

    public void setJor_codigo(String jor_codigo) {
        this.jor_codigo = jor_codigo;
    }

    public String getJor_jornada() {
        return jor_jornada;
    }

    public void setJor_jornada(String jor_jornada) {
        this.jor_jornada = jor_jornada;
    }
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO jornada (jor_codigo, jor_jornada) VALUES ('" + getJor_codigo()+ "','" + getJor_jornada()+ "');";
        
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
        String nsql = "DELETE FROM jornada WHERE jor_codigo = '" + getJor_codigo()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
