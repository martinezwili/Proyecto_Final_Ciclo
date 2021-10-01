package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Poliglota{
    private String pol_codigo, pol_poliglota;

    public Poliglota(String pol_codigo, String pol_poliglota) {
        this.pol_codigo = pol_codigo;
        this.pol_poliglota = pol_poliglota;
    }
    
    public String getPol_codigo() {
        return pol_codigo;
    }

    public void setPol_codigo(String pol_codigo) {
        this.pol_codigo = pol_codigo;
    }

    public String getPol_poliglota() {
        return pol_poliglota;
    }

    public void setPol_poliglota(String pol_poliglota) {
        this.pol_poliglota = pol_poliglota;
    }
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        System.out.println("sa");
        if(conexion.noQuery("INSERT INTO poliglota (pol_codigo, pol_poliglota) VALUES ('" + getPol_codigo()+ "','" + getPol_poliglota()+ "');") == null){
            System.out.println("sa1");
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM poliglota WHERE pol_codigo = '" + getPol_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE poliglota SET pol_codigo = '"+ getPol_codigo() +"', pol_poliglota = '"+ getPol_poliglota() +"' WHERE pol_codigo = '"+ getPol_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT pol_codigo FROM poliglota WHERE pol_codigo = '" + getPol_codigo()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compparaeliminar() throws SQLException{
        ResultSet rs1 = conexion.query("SELECT poliglota.pol_codigo FROM poliglota INNER JOIN relacion ON relacion.pol_codigo = poliglota.pol_codigo");
        if(rs1.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
