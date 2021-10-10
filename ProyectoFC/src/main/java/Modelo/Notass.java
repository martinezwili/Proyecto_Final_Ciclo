package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Notass {
    private String not_codigo, not_nombre, cur_codigo, asig_codigo, alu_cedula;
    private Double not_nota;

    public Notass(String not_codigo, String not_nombre, String cur_codigo, String asig_codigo, String alu_cedula, Double not_nota) {
        this.not_codigo = not_codigo;
        this.not_nombre = not_nombre;
        this.cur_codigo = cur_codigo;
        this.asig_codigo = asig_codigo;
        this.alu_cedula = alu_cedula;
        this.not_nota = not_nota;
    }

    public String getNot_codigo() {
        return not_codigo;
    }

    public void setNot_codigo(String not_codigo) {
        this.not_codigo = not_codigo;
    }

    public String getNot_nombre() {
        return not_nombre;
    }

    public void setNot_nombre(String not_nombre) {
        this.not_nombre = not_nombre;
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

    public Double getNot_nota() {
        return not_nota;
    }

    public void setNot_nota(Double not_nota) {
        this.not_nota = not_nota;
    }

    public Conexionbd getConexion() {
        return conexion;
    }

    public void setConexion(Conexionbd conexion) {
        this.conexion = conexion;
    }

    

    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO notas (not_codigo, not_nombre, not_nota, cur_codigo, asig_codigo, alu_cedula) VALUES ('" + getNot_codigo()+ "','" + getNot_nombre()+ "','" + getNot_nota()+ "','" + getCur_codigo()+ "','" + getAsig_codigo()+ "','" +getAlu_cedula() + "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE notas SET not_nota = '"+ getNot_nota() + "' WHERE not_nombre = '"+ getNot_nombre() +"' AND cur_codigo = '"+ getCur_codigo() +"' AND asig_codigo = '"+ getAsig_codigo() +"' AND alu_cedula = '"+ getAlu_cedula()+"'") == null){
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
        
    }
}
