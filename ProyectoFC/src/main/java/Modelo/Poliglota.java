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
public class Poliglota {
    private String pol_codigo, pol_poliglota;

    public Poliglota(String pol_codigo, String pol_poliglota) {
        this.pol_codigo = pol_codigo;
        this.pol_poliglota = pol_poliglota;
    }

    public Poliglota() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public boolean insertar(){
        Conexionbd conexion = new Conexionbd();
        String nsql = "INSERT INTO poliglota (pol_codigo, pol_poliglota) VALUES ('" + getPol_codigo()+ "','" + getPol_poliglota()+ "');";
        
        if(conexion.noQuery(nsql) == null){
            return true;
        }
        else
        {
            return false;
        }
    }
}
