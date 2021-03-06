package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    Conexionbd conexion = new Conexionbd();
 
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO curso (cur_codigo, cur_nombre) VALUES ('" + getCur_codigo()+ "','" + getCur_nombre()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE curso SET cur_nombre = '"+ getCur_nombre() +"' WHERE cur_codigo = '" + getCur_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM curso WHERE cur_codigo = '" + getCur_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT cur_codigo FROM curso WHERE cur_codigo = '" + getCur_codigo()+ "'");
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
        ResultSet rs1 = conexion.query("SELECT relaasig_codigo FROM relacionasignaturas WHERE cur_codigo = '" + getCur_codigo()+ "'");
        if(rs1.next()){
            as++;
        }
        else
        {
            ResultSet rs2 = conexion.query("SELECT not_codigo FROM notas WHERE cur_codigo = '" + getCur_codigo()+ "'");
            if(rs2.next()){
                as++;;
            }
            else
            {
                ResultSet rs3 = conexion.query("SELECT asis_codigo FROM asistencia WHERE cur_codigo = '" + getCur_codigo()+ "'");
                if(rs3.next()){
                    as++;
                }
                else
                {
                    ResultSet rs4 = conexion.query("SELECT mat_codigo FROM matricula WHERE cur_codigo = '" + getCur_codigo()+ "'");
                    if(rs4.next()){
                        as++;
                    }
                    else
                    {
                       
                    }
                }
            }
        }
        return as;
    }
}
