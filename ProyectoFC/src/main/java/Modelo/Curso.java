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
public class Curso {
    private String cur_codigo,cur_nombre;

    public Curso(String cur_codigo, String cur_nombre) {
        this.cur_codigo = cur_codigo;
        this.cur_nombre = cur_nombre;
    }

    

    public String getCur_codigo() {
        return cur_codigo;
    }

    public void setCur_codigo(String cur_codigo) {
        this.cur_codigo = cur_codigo;
    }

    public String getCur_nombre() {
        return cur_nombre;
    }

    public void setCur_nombre(String cur_nombre) {
        this.cur_nombre = cur_nombre;
    }

 
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO curso (cur_codigo, cur_nombre) VALUES ('" + getCur_codigo()+ "','" + getCur_nombre()+ "');";
        
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
        String nsql = "DELETE FROM curso WHERE cur_codigo =" + getCur_codigo()+ "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
