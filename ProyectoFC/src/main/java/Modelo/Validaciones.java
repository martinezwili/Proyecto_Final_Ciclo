package Modelo;

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
}
