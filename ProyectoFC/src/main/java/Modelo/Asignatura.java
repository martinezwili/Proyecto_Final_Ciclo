package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Asignatura {
    private String asig_codigo, asig_nombre, asig_descripcion;

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

    public Conexionbd getConexion() {
        return conexion;
    }

    public void setConexion(Conexionbd conexion) {
        this.conexion = conexion;
    }

    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO asignatura (asig_codigo, asig_nombre, asig_descripcion) VALUES ('" + getAsig_codigo()+ "','" + getAsig_nombre()+ "','" + getAsig_descripcion() + "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM asignatura WHERE asig_codigo = '" + getAsig_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE asignatura SET  asig_nombre = '"+ getAsig_nombre()+"',asig_descripcion = '"+getAsig_descripcion()+"' WHERE asig_codigo = '"+ getAsig_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT asig_codigo FROM asignatura WHERE asig_codigo = '" + getAsig_codigo()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int compparaeliminar() throws SQLException{
        int as = 0;
        ResultSet rs1 = conexion.query("SELECT asis_codigo FROM asistencia WHERE asig_codigo = '" + getAsig_codigo()+ "'");
        if(rs1.next()){
            as++;
        }
        else
        {
            ResultSet rs2 = conexion.query("SELECT not_codigo FROM notas WHERE asig_codigo = '" + getAsig_codigo()+ "'");
            if(rs2.next()){
                as++;
            }
            else
            {
                ResultSet rs3 = conexion.query("SELECT relaasig_codigo FROM relacionasignaturas WHERE asig_codigo = '" + getAsig_codigo()+ "'");
                if(rs3.next()){
                    as++;
                }
                else
                {
                    
                }
            }
        }
        return as;
    }
}
