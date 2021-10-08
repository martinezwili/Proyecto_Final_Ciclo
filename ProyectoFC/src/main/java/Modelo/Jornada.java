package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jornada {
    private String jor_codigo,jor_jornada;

    public Jornada(String jor_codigo, String jor_jornada) {
        this.jor_codigo = jor_codigo;
        this.jor_jornada = jor_jornada;
    }

    public String getJor_codigo() {
        return jor_codigo;
    }

    public void setJor_codigo(String jor_codigo) {
        this.jor_codigo = jor_codigo;
    }

    public String getJor_jornada() {
        return jor_jornada;
    }

    public void setJor_jornada(String jor_jornada) {
        this.jor_jornada = jor_jornada;
    }
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO jornada (jor_codigo, jor_jornada) VALUES ('" + getJor_codigo()+ "','" + getJor_jornada()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM jornada WHERE jor_codigo = '" + getJor_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
        
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE jornada SET jor_jornada = '"+ getJor_jornada() +"' WHERE jor_codigo = '"+ getJor_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT jor_codigo FROM jornada WHERE jor_codigo = '" + getJor_codigo()+ "'");
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
        ResultSet rs1 = conexion.query("SELECT alu_cedula FROM alumno WHERE jor_codigo = '"+ getJor_codigo()+"'");
        if(rs1.next()){
            as = true;
        }
        else
        {
            ResultSet rs2 = conexion.query("SELECT doc_cedula FROM docente WHERE jor_codigo = '" + getJor_codigo()+ "'");
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
