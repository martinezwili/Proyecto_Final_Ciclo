package Modelo;

import Conexion.Conexionbd;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Matricula {
    private String mat_codigo, cur_codigo, alu_cedula;
    private Date mat_fecha;

    public Matricula(String mat_codigo, String cur_codigo, String alu_cedula, Date mat_fecha) {
        this.mat_codigo = mat_codigo;
        this.cur_codigo = cur_codigo;
        this.alu_cedula = alu_cedula;
        this.mat_fecha = mat_fecha;
    }

    public String getMat_codigo() {
        return mat_codigo;
    }

    public void setMat_codigo(String mat_codigo) {
        this.mat_codigo = mat_codigo;
    }

    public String getCur_codigo() {
        return cur_codigo;
    }

    public void setCur_codigo(String cur_codigo) {
        this.cur_codigo = cur_codigo;
    }

    public String getAlu_cedula() {
        return alu_cedula;
    }

    public void setAlu_cedula(String alu_cedula) {
        this.alu_cedula = alu_cedula;
    }

    public Date getMat_fecha() {
        return mat_fecha;
    }

    public void setMat_fecha(Date mat_fecha) {
        this.mat_fecha = mat_fecha;
    }
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO matricula (mat_codigo, mat_fecha, cur_codigo, alu_cedula) VALUES ('" + getMat_codigo()+ "','" + getMat_fecha()+ "','" + getCur_codigo()+ "','" + getAlu_cedula()+ "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    /*
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE matricula SET mat_fecha = '"+ getMat_fecha()+ "' cur_codigo = '"+ getCur_codigo() +"' WHERE not_nombre = '"+ getNot_nombre() +"' AND cur_codigo = '"+ getCur_codigo() +"' AND asig_codigo = '"+ getAsig_codigo() +"' AND alu_cedula = '"+ getAlu_cedula()+"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM notas WHERE not_nombre = '"+ getNot_nombre() +"' AND cur_codigo = '"+ getCur_codigo() +"' AND asig_codigo = '"+ getAsig_codigo() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean comcodigo(String codigo) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        ResultSet rs = conexion.query("SELECT not_codigo FROM notas WHERE not_codigo = '" + codigo + "'");
        if(rs.next()){ return true; }else { return false; }
    }
    
    public static boolean comactividad(String a) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        ResultSet rs = conexion.query("SELECT not_codigo FROM notas WHERE not_nombre = '" + a + "'");
        if(rs.next()){ return true; }else { return false; }
    }
    
    public static boolean comnotaalumno(String c, String cu, String as, String no) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        ResultSet rs = conexion.query("SELECT not_codigo FROM notas WHERE alu_cedula = '" + c + "' AND asig_codigo = '" + as + "' AND cur_codigo = '" + cu + "' AND not_nombre = '" + no + "'");
        if(rs.next()){ return true; }else { return false; }
        
    }*/
}
