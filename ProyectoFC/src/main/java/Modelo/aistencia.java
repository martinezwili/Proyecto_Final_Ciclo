package Modelo;

import java.sql.Date;

public class aistencia {
    private String asis_codigo;
    private Date asi_fecha;
    private int asi_cantidadfaltas;

    public aistencia(String asis_codigo, Date asi_fecha, int asi_cantidadfaltas) {
        this.asis_codigo = asis_codigo;
        this.asi_fecha = asi_fecha;
        this.asi_cantidadfaltas = asi_cantidadfaltas;
    }

    public String getAsis_codigo() {
        return asis_codigo;
    }

    public void setAsis_codigo(String asis_codigo) {
        this.asis_codigo = asis_codigo;
    }

    public Date getAsi_fecha() {
        return asi_fecha;
    }

    public void setAsi_fecha(Date asi_fecha) {
        this.asi_fecha = asi_fecha;
    }

    public int getAsi_cantidadfaltas() {
        return asi_cantidadfaltas;
    }

    public void setAsi_cantidadfaltas(int asi_cantidadfaltas) {
        this.asi_cantidadfaltas = asi_cantidadfaltas;
    }
    
    
}
