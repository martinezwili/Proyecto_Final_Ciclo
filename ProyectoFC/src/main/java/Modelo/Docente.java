/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;
import java.sql.Date;

/**
 *
 * @author MAWIL
 */
public class Docente extends Persona {
    private String doc_cedula,for_codigo,ran_codigo,as1_codigo,as2_codigo,as3_codigo,jor_codigo;

    public Docente(String doc_cedula, String for_codigo, String ran_codigo, String as1_codigo, String as2_codigo, String as3_codigo, String jor_codigo, String per_cedula, String per_nombre, String per_apellido, String per_telefono, String per_contraseña, String rel_cedula, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_telefono, per_contraseña, rel_cedula, per_nacimiento);
        this.doc_cedula = doc_cedula;
        this.for_codigo = for_codigo;
        this.ran_codigo = ran_codigo;
        this.as1_codigo = as1_codigo;
        this.as2_codigo = as2_codigo;
        this.as3_codigo = as3_codigo;
        this.jor_codigo = jor_codigo;
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

    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO administrador (adm_cedula, adm_correo, for_codigo, per_cedula) VALUES ('" + getDoc_cedula()+ "','" + getFor_codigo()+ "','" + getRan_codigo()+ "','" + getAs1_codigo()+ "','" +getAs2_codigo()+ "','" +getAs3_codigo()+ "','" +getJor_codigo()+ "','" +getPer_cedula() + "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean eliminar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "DELETE FROM administrador WHERE adm_cedula = '" + getDoc_cedula()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
