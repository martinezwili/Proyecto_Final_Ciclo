/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexionbd;

/**
 *
 * @author MAWIL
 */
public class Relacion {
    private String rel_cedula, dir_codigo, sex_codigo, nac_codigo, pol_codigo;

    public Relacion(String rel_cedula, String dir_codigo, String sex_codigo, String nac_codigo, String pol_codigo) {
        this.rel_cedula = rel_cedula;
        this.dir_codigo = dir_codigo;
        this.sex_codigo = sex_codigo;
        this.nac_codigo = nac_codigo;
        this.pol_codigo = pol_codigo;
    }

    public String getRel_cedula() {
        return rel_cedula;
    }

    public void setRel_cedula(String rel_cedula) {
        this.rel_cedula = rel_cedula;
    }

    public String getDir_codigo() {
        return dir_codigo;
    }

    public void setDir_codigo(String dir_codigo) {
        this.dir_codigo = dir_codigo;
    }

    public String getSex_codigo() {
        return sex_codigo;
    }

    public void setSex_codigo(String sex_codigo) {
        this.sex_codigo = sex_codigo;
    }

    public String getNac_codigo() {
        return nac_codigo;
    }

    public void setNac_codigo(String nac_codigo) {
        this.nac_codigo = nac_codigo;
    }

    public String getPol_codigo() {
        return pol_codigo;
    }

    public void setPol_codigo(String pol_codigo) {
        this.pol_codigo = pol_codigo;
    }
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO relacion (rel_cedula, dir_codigo, sex_codigo, nac_codigo, pol_codigo) VALUES ('" + getRel_cedula()+ "','" + getDir_codigo()+ "','" + getSex_codigo()+ "','" + getNac_codigo()+ "','" + getPol_codigo() + "');";
        
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
        String nsql = "DELETE FROM relacion WHERE rel_cedula = '" + getRel_cedula()+ "'";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
