package Modelo;

import Conexion.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Docente {
    private String doc_cedula,for_codigo,ran_codigo,as1_codigo,as2_codigo,as3_codigo,jor_codigo,per_cedula;

    public Docente(String doc_cedula, String for_codigo, String ran_codigo, String as1_codigo, String as2_codigo, String as3_codigo, String jor_codigo, String per_cedula) {
        this.doc_cedula = doc_cedula;
        this.for_codigo = for_codigo;
        this.ran_codigo = ran_codigo;
        this.as1_codigo = as1_codigo;
        this.as2_codigo = as2_codigo;
        this.as3_codigo = as3_codigo;
        this.jor_codigo = jor_codigo;
        this.per_cedula = per_cedula;
    }

    public String getDoc_cedula() {
        return doc_cedula;
    }

    public void setDoc_cedula(String doc_cedula) {
        this.doc_cedula = doc_cedula;
    }

    public String getFor_codigo() {
        return for_codigo;
    }

    public void setFor_codigo(String for_codigo) {
        this.for_codigo = for_codigo;
    }

    public String getRan_codigo() {
        return ran_codigo;
    }

    public void setRan_codigo(String ran_codigo) {
        this.ran_codigo = ran_codigo;
    }

    public String getAs1_codigo() {
        return as1_codigo;
    }

    public void setAs1_codigo(String as1_codigo) {
        this.as1_codigo = as1_codigo;
    }

    public String getAs2_codigo() {
        return as2_codigo;
    }

    public void setAs2_codigo(String as2_codigo) {
        this.as2_codigo = as2_codigo;
    }

    public String getAs3_codigo() {
        return as3_codigo;
    }

    public void setAs3_codigo(String as3_codigo) {
        this.as3_codigo = as3_codigo;
    }

    public String getJor_codigo() {
        return jor_codigo;
    }

    public void setJor_codigo(String jor_codigo) {
        this.jor_codigo = jor_codigo;
    }

    public String getPer_cedula() {
        return per_cedula;
    }

    public void setPer_cedula(String per_cedula) {
        this.per_cedula = per_cedula;
    }

    Conexionbd conexion = new Conexionbd();
    
    public boolean insertar(){
        if(conexion.noQuery("INSERT INTO docente (doc_cedula, for_codigo, ran_codigo, as1_codigo, as2_codigo, as3_codigo, jor_codigo, per_cedula) VALUES ('" + getDoc_cedula()+ "','" + getFor_codigo()+ "','" + getRan_codigo()+ "','" + getAs1_codigo()+ "','" +getAs2_codigo()+ "','" +getAs3_codigo()+ "','" +getJor_codigo()+ "','" +getPer_cedula() + "');") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean actualizar(){
        if(conexion.noQuery("UPDATE docente SET for_codigo = '"+ getFor_codigo() +"', ran_codigo = '"+ getRan_codigo() +"', as1_codigo ='"+ getAs1_codigo() +"', as2_codigo = '"+ getAs2_codigo() +"', as3_codigo = '"+ getAs3_codigo() +"', jor_codigo = '"+ getJor_codigo() +"' WHERE doc_cedula = '"+ getDoc_cedula() +"'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        if(conexion.noQuery("DELETE FROM docente WHERE doc_cedula = '" + getDoc_cedula()+ "'") == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean compd() throws SQLException{
        ResultSet rs2 = conexion.query("SELECT doc_cedula FROM docente WHERE doc_cedula = '" + getDoc_cedula()+ "'");
        if(rs2.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean loginDO(String a, String b) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        //sentencia para validar que sea un administrador
        int resul = 0; 
        boolean as = false;
        ResultSet rs = conexion.query("SELECT doc_cedula FROM docente WHERE doc_cedula = '" + a +"'");
        if(rs.next()){
            //sentencia para comprovar contrase;a
            ResultSet rs2 = conexion.query("SELECT per_cedula FROM persona WHERE per_cedula = '" + a + "' and per_contraseña = '" + b + "'");
            if(rs2.next()){
                as = true;
            }
            else
            {
                as = false;
            }
        }
        else
        {
            as =  false;
        }
        return as;
    }
}
