package Modelo;

import Conexion.Conexionbd;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Matricula {
    private String mat_codigo, cur_codigo, alu_cedula, mat_estado;
    private Date mat_fecha;

    public Matricula(String mat_codigo, String cur_codigo, String alu_cedula, String mat_estado, Date mat_fecha) {
        this.mat_codigo = mat_codigo;
        this.cur_codigo = cur_codigo;
        this.alu_cedula = alu_cedula;
        this.mat_estado = mat_estado;
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

    public String getMat_estado() {
        return mat_estado;
    }

    public void setMat_estado(String mat_estado) {
        this.mat_estado = mat_estado;
    }

    public Date getMat_fecha() {
        return mat_fecha;
    }

    public void setMat_fecha(Date mat_fecha) {
        this.mat_fecha = mat_fecha;
    }

    public Conexionbd getConexion() {
        return conexion;
    }

    public void setConexion(Conexionbd conexion) {
        this.conexion = conexion;
    }
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO matricula (mat_codigo, mat_fecha, cur_codigo, alu_cedula, mat_estado) VALUES ('" + getMat_codigo()+ "','" + getMat_fecha()+ "','" + getCur_codigo()+ "','" + getAlu_cedula()+ "', '"+ getMat_estado() +"');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean comcodigo(String codigo) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        ResultSet rs = conexion.query("SELECT mat_codigo FROM matricula WHERE mat_codigo = '" + codigo + "'");
        if(rs.next()){ return true; }else { return false; }
    }
}
