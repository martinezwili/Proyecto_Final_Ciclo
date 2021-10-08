package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class relacionasignaturas {
    private String relaasig_codigo, asig_codigo, cur_codigo, doc_cedula;

    public relacionasignaturas(String relaasig_codigo, String asig_codigo, String cur_codigo, String doc_cedula) {
        this.relaasig_codigo = relaasig_codigo;
        this.asig_codigo = asig_codigo;
        this.cur_codigo = cur_codigo;
        this.doc_cedula = doc_cedula;
    }

    public String getRelaasig_codigo() {
        return relaasig_codigo;
    }

    public void setRelaasig_codigo(String relaasig_codigo) {
        this.relaasig_codigo = relaasig_codigo;
    }

    public String getAsig_codigo() {
        return asig_codigo;
    }

    public void setAsig_codigo(String asig_codigo) {
        this.asig_codigo = asig_codigo;
    }

    public String getCur_codigo() {
        return cur_codigo;
    }

    public void setCur_codigo(String cur_codigo) {
        this.cur_codigo = cur_codigo;
    }

    public String getDoc_cedula() {
        return doc_cedula;
    }

    public void setDoc_cedula(String doc_cedula) {
        this.doc_cedula = doc_cedula;
    }

    public Conexionbd getConexion() {
        return conexion;
    }

    public void setConexion(Conexionbd conexion) {
        this.conexion = conexion;
    }
    
    Conexionbd conexion = new Conexionbd();
 
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO relacionasignaturas (relaasig_codigo, asig_codigo, cur_codigo, doc_cedula) VALUES ('" + getRelaasig_codigo()+ "','" + getAsig_codigo()+ "','" + getCur_codigo()+ "','" + getDoc_cedula()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM relacionasignaturas WHERE relaasig_codigo = '" + getRelaasig_codigo()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean comp() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT relaasig_codigo FROM relacionasignaturas WHERE relaasig_codigo = '" + getRelaasig_codigo()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compasignacion() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT relaasig_codigo FROM relacionasignaturas WHERE asig_codigo = '" + getAsig_codigo()+ "' AND cur_codigo = '"+ getCur_codigo() +"'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /*public boolean compparaeliminar() throws SQLException{
        boolean as = false;
        ResultSet rs1 = conexion.query("SELECT relaasig_codigo FROM relacionasignaturas WHERE asig_codigo = '" + getCur_codigo()+ "'");
        if(rs1.next()){
            as = true;
        }
        else
        {
            ResultSet rs2 = conexion.query("SELECT not_codigo FROM relacionasignaturas WHERE cur_codigo = '" + getCur_codigo()+ "'");
            if(rs2.next()){
                as = true;
            }
            else
            {
                ResultSet rs3 = conexion.query("SELECT alu_cedula FROM relacionasignaturas WHERE cur_codigo = '" + getCur_codigo()+ "'");
                if(rs3.next()){
                    as = true;
                }
                else
                {
                    as = false;
                }
            }
        }
        return as;
    }*/
}
