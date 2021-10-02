package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Rango {
    private String ran_codigo, ran_rango;

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
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO rango (ran_codigo,ran_rango ) VALUES ('" + getRan_codigo()+ "','" + getRan_rango() + "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM rango WHERE ran_codigo = '" + getRan_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
   }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE rango SET ran_rango = '"+ getRan_rango() +"' WHERE ran_codigo = '"+ getRan_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT ran_codigo FROM rango WHERE ran_codigo = '" + getRan_codigo()+ "'");
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
        ResultSet rs2 = conexion.query("SELECT doc_cedula FROM docente WHERE ran_codigo = '" + getRan_codigo()+ "'");
        if(rs2.next()){
            as = true;
        }
        else
        {
            as = false;
        }
        return as;
    }
}
