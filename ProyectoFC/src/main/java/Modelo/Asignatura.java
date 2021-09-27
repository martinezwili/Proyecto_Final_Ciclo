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
public class Asignatura {
    private String asig_codigo,asig_nombre,asig_descripcion;

    public Asignatura(String asig_codigo, String asig_nombre, String asig_descripcion) {
        this.asig_codigo = asig_codigo;
        this.asig_nombre = asig_nombre;
        this.asig_descripcion = asig_descripcion;
    }

    public String getAsig_codigo() {
        return asig_codigo;
    }

    public void setAsig_codigo(String asig_codigo) {
        this.asig_codigo = asig_codigo;
    }

    public String getAsig_nombre() {
        return asig_nombre;
    }

    public void setAsig_nombre(String asig_nombre) {
        this.asig_nombre = asig_nombre;
    }

    public String getAsig_descripcion() {
        return asig_descripcion;
    }

    public void setAsig_descripcion(String asig_descripcion) {
        this.asig_descripcion = asig_descripcion;
    }
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO asignatura (asig_codigo, asig_nombre, asig_descripcion) VALUES ('" + getAsig_codigo()+ "','" + getAsig_nombre()+ "','" + getAsig_descripcion() + "');";
        
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
        String nsql = "DELETE FROM asignatura WHERE asig_codigo = '" + getAsig_codigo()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
