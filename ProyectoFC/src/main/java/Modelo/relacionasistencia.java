package Modelo;

public class relacionasistencia {
    private String relasis_codigo, cur_codigo, asis_codigo, alu_cedula;

    public relacionasistencia(String relasis_codigo, String cur_codigo, String asis_codigo, String alu_cedula) {
        this.relasis_codigo = relasis_codigo;
        this.cur_codigo = cur_codigo;
        this.asis_codigo = asis_codigo;
        this.alu_cedula = alu_cedula;
    }

    public String getRelasis_codigo() {
        return relasis_codigo;
    }

    public void setRelasis_codigo(String relasis_codigo) {
        this.relasis_codigo = relasis_codigo;
    }

    public String getCur_codigo() {
        return cur_codigo;
    }

    public void setCur_codigo(String cur_codigo) {
        this.cur_codigo = cur_codigo;
    }

    public String getAsis_codigo() {
        return asis_codigo;
    }

    public void setAsis_codigo(String asis_codigo) {
        this.asis_codigo = asis_codigo;
    }

    public String getAlu_cedula() {
        return alu_cedula;
    }

    public void setAlu_cedula(String alu_cedula) {
        this.alu_cedula = alu_cedula;
    }
    
    
}
