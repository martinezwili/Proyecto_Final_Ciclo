package Modelo;

import Conexion.Conexionbd;
import com.mysql.cj.protocol.Resultset;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Asistencia {
    private String asis_codigo, cur_codigo, asig_codigo, alu_cedula;
    private Date asi_fecha;
    private int asi_faltas;

    public Asistencia(String asis_codigo, String cur_codigo, String asig_codigo, String alu_cedula, Date asi_fecha, int asi_faltas) {
        this.asis_codigo = asis_codigo;
        this.cur_codigo = cur_codigo;
        this.asig_codigo = asig_codigo;
        this.alu_cedula = alu_cedula;
        this.asi_fecha = asi_fecha;
        this.asi_faltas = asi_faltas;
    }

    public String getAsis_codigo() {
        return asis_codigo;
    }

    public void setAsis_codigo(String asis_codigo) {
        this.asis_codigo = asis_codigo;
    }

    public String getCur_codigo() {
        return cur_codigo;
    }

    public void setCur_codigo(String cur_codigo) {
        this.cur_codigo = cur_codigo;
    }

    public String getAsig_codigo() {
        return asig_codigo;
    }

    public void setAsig_codigo(String asig_codigo) {
        this.asig_codigo = asig_codigo;
    }

    public String getAlu_cedula() {
        return alu_cedula;
    }

    public void setAlu_cedula(String alu_cedula) {
        this.alu_cedula = alu_cedula;
    }

    public Date getAsi_fecha() {
        return asi_fecha;
    }

    public void setAsi_fecha(Date asi_fecha) {
        this.asi_fecha = asi_fecha;
    }

    public int getAsi_faltas() {
        return asi_faltas;
    }

    public void setAsi_faltas(int asi_faltas) {
        this.asi_faltas = asi_faltas;
    }

    public Conexionbd getConexion() {
        return conexion;
    }

    public void setConexion(Conexionbd conexion) {
        this.conexion = conexion;
    }
    
    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO asistencia (asis_codigo, asi_fecha, asi_faltas, cur_codigo, asig_codigo, alu_cedula) VALUES ('"+ getAsis_codigo() +"','"+ getAsi_fecha() +"','" + getAsi_faltas()+ "','" + getCur_codigo()+"','"+ getAsig_codigo()+"','" + getAlu_cedula()+"');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE asistencia SET asi_faltas = '"+ getAsi_faltas() +"' WHERE cur_codigo = '"+ getCur_codigo() +"' AND asig_codigo = '"+ getAsig_codigo() +"' AND alu_cedula = '"+ getAlu_cedula() +"' AND asi_fecha = '"+ getAsi_fecha() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean comcodigo(String codigo) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        ResultSet rs = conexion.query("SELECT asis_codigo FROM asistencia WHERE asis_codigo = '" + codigo + "'");
        if(rs.next()){ return true; }else { return false; }
    }
    
    public static boolean comprobarpararegistrar(Date f, String c, String a) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        ResultSet rs1 = conexion.query("SELECT asis_codigo FROM asistencia WHERE asi_fecha = '"+ f +"' AND cur_codigo = '"+ c +"' AND asig_codigo = '"+ a +"' ");
        if(rs1.next()){ return true; } else { return false; }
    }
}
