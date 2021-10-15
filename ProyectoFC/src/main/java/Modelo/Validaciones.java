package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    public boolean ValidarTelefono(String tfcedularv){ if(tfcedularv.matches("[0-9]{10}") == true){ return true; } else { return false; } }
    
    public boolean validaNombreoApellido(String tfnombre){ if(tfnombre.matches("[a-zA-Z\\s]{1,15}") == true){ return true; } else { return false; }
    }
    
    public boolean validaContraseña(String tfclevarv){
        String letrama = ".*[A-Z].*"; String letrami = ".*[a-z].*"; String numeros = ".*[0-9].*";
        if((tfclevarv.matches(letrama)) && (tfclevarv.matches(letrami)) && (tfclevarv.matches(numeros))){
            int longitud = 0; longitud = tfclevarv.length(); if((longitud >= 8) && (longitud <= 20)){ return true; } else { return false; }
        } else { return false; }
    }
    
    public boolean validarcorreo(String correo){
        boolean as = false;
        Pattern guia = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = guia.matcher(correo);
        if(correo.length() <= 30){ as = mat.find(); } else { as = false; } return as; 
    }
    
    public boolean validardijitos8(String a){ if(a.length() <= 8){ return true; } else { return false; } }
    
    public boolean validardijitos10(String a){ if(a.length() <= 10){ return true; } else { return false; } }
    
    public boolean validardijitos15(String a){ if(a.length() <= 15){ return true; } else { return false; } }
    
    public boolean validardijitos20(String a){ if(a.length() <= 20){ return true; } else { return false; } }
    
    public boolean validardijitos30(String a){ if(a.length() <= 30){ return true; } else { return false; } }
    
    public boolean validardijitos50(String a){ if(a.length() <= 50){ return true; } else { return false; } }
    
    public boolean validardijitos200(String a){ if(a.length() <= 200){ return true; } else { return false; } }

    public boolean validarCedula(String cedula) {
        boolean estado = false;
        try {
            ///Restricción 1
            if (cedula.length() == 10) {
                ///Restricción 3
                if ((Integer.parseInt(cedula.substring(0, 2)) <= 24) || (Integer.parseInt(cedula.substring(0, 2)) == 30)) {
                    int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2}; int digitoVerificador = Integer.parseInt(cedula.substring(cedula.length() - 1, cedula.length()));
                    int suma = 0; int digitoXcoeficiente = 0; int modulo = 0;
                    ///Restricción 4
                    for (int i = 0; i < cedula.length() - 1; i++) {
                        ///Paso 1
                        digitoXcoeficiente = Integer.parseInt(cedula.substring(i, i + 1)) * coeficientes[i];
                        ///Paso 2
                        digitoXcoeficiente = (digitoXcoeficiente > 9) ? digitoXcoeficiente -= 9 : digitoXcoeficiente;
                        ///Paso 3
                        suma += digitoXcoeficiente;
                    }
                    ///Paso 4
                    modulo = suma % 10;
                    ///Paso 5
                    if ((10 - modulo) == digitoVerificador) { estado = true; }
                    if (modulo == 0 & modulo == digitoVerificador) { estado = true; }
                } else {/*Fin Restricción 3*/ estado = false; }
            } else {/*Fin Restricción 1*/ estado = false; }
        } catch (NumberFormatException e) { estado = false; System.out.println("Error al intentar validar"); }
        return estado;
    }
    
    public boolean validarestado(String estado){
        if(estado.equals("ACTIVO") || estado.equals("INACTIVO")){ return true; } else { return false; }
    }
    
    public static boolean validarnacimiento(Date nacimi){
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fac = new Date();
        String ff = f1.format(fac);
        String a = ff.substring(0, 4);
        int ao = Integer.valueOf(a);
        
        String nac = f1.format(nacimi);
        String anac = nac.substring(0, 4);
        int aanac = Integer.valueOf(anac);
        
        if(ao > aanac){ return true; } else { return false; }
    }
    
    public static boolean validarfechaasistencia(Date fecha){
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fac = new Date();
        String ff = f1.format(fac);
        String a = ff.substring(0, 4);
        String m = ff.substring(5, 7);
        String d = ff.substring(8, 10);
        int aa = Integer.valueOf(a);
        int ma = Integer.valueOf(m);
        int da = Integer.valueOf(d);
        
        String ff2 = f1.format(fecha);
        String a2 = ff2.substring(0, 4);
        String m2 = ff2.substring(5, 7);
        String d2 = ff2.substring(8, 10);
        int aa2 = Integer.valueOf(a2);
        int ma2 = Integer.valueOf(m2);
        int da2 = Integer.valueOf(d2);
        
        if(aa == aa2 && ma == ma2 && da == da2){ return true; } else { return false; }
    }
    
    public String obtenerfecha(){
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fac = new Date();
        String ff = f1.format(fac);
        return ff;
    } 
}
