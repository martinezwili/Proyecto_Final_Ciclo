/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;

/**
 *
 * @author usuario
 */
public class Modalidad {
    private String mod_codigo,mod_modalidad;

    public Modalidad(String mod_codigo, String mod_modalidad) {
        this.mod_codigo = mod_codigo;
        this.mod_modalidad = mod_modalidad;
    }

    public String getMod_codigo() {
        return mod_codigo;
    }

    public void setMod_codigo(String mod_codigo) {
        this.mod_codigo = mod_codigo;
    }

    public String getMod_modalidad() {
        return mod_modalidad;
    }

    public void setMod_modalidad(String mod_modalidad) {
        this.mod_modalidad = mod_modalidad;
    }
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO modalidad (mod_codigo, mod_modalidad) VALUES ('" + getMod_codigo()+ "','" + getMod_modalidad()+ "');";
        
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
        String nsql = "DELETE FROM sexo WHERE mod_codigo =" + getMod_codigo()+ "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
