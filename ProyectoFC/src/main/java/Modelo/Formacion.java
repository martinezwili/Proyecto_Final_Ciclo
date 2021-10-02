package Modelo;

import Conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO formacion (for_codigo, for_nivel) VALUES ('" + getFor_codigo()+ "','" + getFor_nivel()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM formacion WHERE for_codigo = '" + getFor_codigo() + "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE formacion SET for_nivel = '"+ getFor_nivel()+"' WHERE for_codigo = '" + getFor_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT for_codigo FROM formacion WHERE for_codigo = '" + getFor_codigo()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compparaeliminar() throws SQLException{
        boolean as = false;
        ResultSet rs1 = conexion.query("SELECT adm_cedula FROM administrador WHERE for_codigo = '"+ getFor_codigo() +"'");
        if(rs1.next()){
            as = true;
        }
        else
        {
            ResultSet rs2 = conexion.query("SELECT doc_cedula FROM docente WHERE for_codigo = '" + getFor_codigo() + "'");
            if(rs2.next()){
                as = true;
            }
            else
            {
                as = false;
            }
        }
        return as;
    }
}
