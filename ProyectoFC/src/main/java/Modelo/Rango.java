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
public class Rango {
    private String ran_codigo,ran_rango;

    public Rango(String ran_codigo, String ran_rango) {
        this.ran_codigo = ran_codigo;
        this.ran_rango = ran_rango;
    }

    public String getRan_codigo() {
        return ran_codigo;
    }

    public void setRan_codigo(String ran_codigo) {
        this.ran_codigo = ran_codigo;
    }

    public String getRan_rango() {
        return ran_rango;
    }

    public void setRan_rango(String ran_rango) {
        this.ran_rango = ran_rango;
    }
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO rango (ran_codigo,ran_rango ) VALUES ('" + getRan_codigo()+ "','" + getRan_rango() + "');";
        
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
        String nsql = "DELETE FROM rango WHERE ran_codigo = '" + getRan_codigo()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
   }
}
