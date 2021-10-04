package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Direccion {
    private String dir_codigo, dic_calle, dir_comuna;

    public Direccion(String dir_codigo, String dic_calle, String dir_comuna) {
        this.dir_codigo = dir_codigo;
        this.dic_calle = dic_calle;
        this.dir_comuna = dir_comuna;
    }

    public String getDir_codigo() {
        return dir_codigo;
    }

    public void setDir_codigo(String dir_codigo) {
        this.dir_codigo = dir_codigo;
    }

    public String getDic_calle() {
        return dic_calle;
    }

    public void setDic_calle(String dic_calle) {
        this.dic_calle = dic_calle;
    }

    public String getDir_comuna() {
        return dir_comuna;
    }

    public void setDir_comuna(String dir_comuna) {
        this.dir_comuna = dir_comuna;
    }
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO direccion (dir_codigo, dic_calle, dir_comuna) VALUES ('" + getDir_codigo()+ "','" + getDic_calle()+ "','" + getDir_comuna() + "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE direccion SET dic_calle = '"+ getDic_calle() +"', dir_comuna = '"+ getDir_comuna() +"' WHERE dir_codigo = '"+ getDir_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM direccion WHERE dir_codigo = '" + getDir_codigo() + "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compb() throws SQLException{
        ResultSet rs = conexion.query("SELECT dir_codigo FROM direccion WHERE dir_codigo = '" + getDir_codigo() + "'");
        if(rs.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
