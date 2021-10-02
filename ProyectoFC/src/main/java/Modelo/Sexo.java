package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO sexo (sex_codigo, sex_sexo) VALUES ('" + getSex_codigo()+ "','" + getSex_sexo()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM sexo WHERE sex_codigo = '" + getSex_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE sexo SET sex_sexo = '"+ getSex_sexo() +"' WHERE sex_codigo = '"+ getSex_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT sex_codigo FROM sexo WHERE sex_codigo = '" + getSex_codigo()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compparaeliminar() throws SQLException{
        ResultSet rs1 = conexion.query("SELECT rel_cedula FROM relacion WHERE sex_codigo = '" + getSex_codigo()+ "'");
        if(rs1.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
