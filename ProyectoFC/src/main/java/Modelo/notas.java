package Modelo;

public class notas {
    private String not_codigo, not_nombre;
    private Double not_nota;

    public notas(String not_codigo, String not_nombre, Double not_nota) {
        this.not_codigo = not_codigo;
        this.not_nombre = not_nombre;
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

    public Double getNot_nota() {
        return not_nota;
    }

    public void setNot_nota(Double not_nota) {
        this.not_nota = not_nota;
    }

    
}
