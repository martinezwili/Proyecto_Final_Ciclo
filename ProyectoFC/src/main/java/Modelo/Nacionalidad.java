package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        if(conexion.noQuery("INSERT INTO nacionalidad (nac_codigo, nac_nacionalidad) VALUES ('" + getNac_codigo()+ "','" + getNac_nacionalidad()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
       
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM nacionalidad WHERE nac_codigo = '" + getNac_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE nacionalidad SET nac_nacionalidad = '"+ getNac_nacionalidad() +"' WHERE nac_codigo = '"+ getNac_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT nac_codigo FROM nacionalidad WHERE nac_codigo = '" + getNac_codigo()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compparaeliminar() throws SQLException{
        ResultSet rs1 = conexion.query("SELECT rel_cedula FROM relacion WHERE nac_codigo = '" + getNac_codigo()+ "'");
        if(rs1.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
