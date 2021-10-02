package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO modalidad (mod_codigo, mod_modalidad) VALUES ('" + getMod_codigo()+ "','" + getMod_modalidad()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM modalidad WHERE mod_codigo = '" + getMod_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE modalidad SET mod_modalidad = '"+ getMod_modalidad()+"' WHERE mod_codigo = '"+ getMod_codigo()+"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT mod_codigo FROM modalidad WHERE mod_codigo = '" + getMod_codigo()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compparaeliminar() throws SQLException{
        ResultSet rs1 = conexion.query("SELECT alu_cedula FROM alumno WHERE mod_codigo = '"+ getMod_codigo()+"'");
        if(rs1.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
