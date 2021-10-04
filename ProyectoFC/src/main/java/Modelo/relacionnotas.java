package Modelo;

public class relacionnotas {
    private String relanot_codigo, not_codigo, cur_codigo, asig_codigo, alu_cedula;

    public relacionnotas(String relanot_codigo, String not_codigo, String cur_codigo, String asig_codigo, String alu_cedula) {
        this.relanot_codigo = relanot_codigo;
        this.not_codigo = not_codigo;
        this.cur_codigo = cur_codigo;
        this.asig_codigo = asig_codigo;
        this.alu_cedula = alu_cedula;
    }

    public String getRelanot_codigo() {
        return relanot_codigo;
    }

    public void setRelanot_codigo(String relanot_codigo) {
        this.relanot_codigo = relanot_codigo;
    }

    public String getNot_codigo() {
        return not_codigo;
    }

    public void setNot_codigo(String not_codigo) {
        this.not_codigo = not_codigo;
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
    
    
}
