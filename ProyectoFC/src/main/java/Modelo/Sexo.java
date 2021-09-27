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
public class Sexo {
    private String sex_codigo, sex_sexo;

    public Sexo(String sex_codigo, String sex_sexo) {
        this.sex_codigo = sex_codigo;
        this.sex_sexo = sex_sexo;
    }

    public String getSex_codigo() {
        return sex_codigo;
    }

    public void setSex_codigo(String sex_codigo) {
        this.sex_codigo = sex_codigo;
    }

    public String getSex_sexo() {
        return sex_sexo;
    }

    public void setSex_sexo(String sex_sexo) {
        this.sex_sexo = sex_sexo;
    }
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO sexo (sex_codigo, sex_sexo) VALUES ('" + getSex_codigo()+ "','" + getSex_sexo()+ "');";
        
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
        String nsql = "DELETE FROM sexo WHERE sex_codigo =" + getSex_codigo()+ "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
