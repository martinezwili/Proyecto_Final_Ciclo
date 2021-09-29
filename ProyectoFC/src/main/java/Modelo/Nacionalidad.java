/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;

/**
 *
 * @author MAWIL
 */
public class Nacionalidad {
    private String nac_codigo, nac_nacionalidad;

    public Nacionalidad(String nac_codigo, String nac_nacionalidad) {
        this.nac_codigo = nac_codigo;
        this.nac_nacionalidad = nac_nacionalidad;
    }

    public String getNac_codigo() {
        return nac_codigo;
    }

    public void setNac_codigo(String nac_codigo) {
        this.nac_codigo = nac_codigo;
    }

    public String getNac_nacionalidad() {
        return nac_nacionalidad;
    }

    public void setNac_nacionalidad(String nac_nacionalidad) {
        this.nac_nacionalidad = nac_nacionalidad;
    }
    
        Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO nacionalidad (nac_codigo, nac_nacionalidad) VALUES ('" + getNac_codigo()+ "','" + getNac_nacionalidad()+ "');";
        
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
        String nsql = "DELETE FROM nacionalidad WHERE nac_codigo = '" + getNac_codigo()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE nacionalidad SET nac_codigo = '"+ getNac_codigo() +"', nac_nacionalidad = '"+ getNac_nacionalidad() +"' WHERE nac_codigo = '"+ getNac_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
