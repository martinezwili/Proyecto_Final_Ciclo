/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAWIL
 */
public class Formacion {
    private String for_codigo, for_nivel;

    public Formacion(String for_codigo, String for_nivel) {
        this.for_codigo = for_codigo;
        this.for_nivel = for_nivel;
    }

    public String getFor_codigo() {
        return for_codigo;
    }

    public void setFor_codigo(String for_codigo) {
        this.for_codigo = for_codigo;
    }

    public String getFor_nivel() {
        return for_nivel;
    }

    public void setFor_nivel(String for_nivel) {
        this.for_nivel = for_nivel;
    }
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO formacion (for_codigo, for_nivel) VALUES ('" + getFor_codigo()+ "','" + getFor_nivel()+ "');";
        
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
        String nsql = "DELETE FROM formacion WHERE for_codigo = '" + getFor_codigo() + "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
