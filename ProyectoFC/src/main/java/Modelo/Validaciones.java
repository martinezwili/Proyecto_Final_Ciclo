/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MAWIL
 */
public class Validaciones {
    public boolean validaCedulaoTelefono(String tfcedularv){
        if(tfcedularv.matches("[0-9]{10}") == true){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean validaNombreoApellido(String tfnombre){
        if(tfnombre.matches("[a-zA-Z\\s]*") == true){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean validaContraseña(String tfclevarv){
        String letrama = ".*[A-Z].*";
        String letrami = ".*[a-z].*";
        String numeros = ".*[0-9].*";
        if((tfclevarv.matches(letrama)) && (tfclevarv.matches(letrami)) && (tfclevarv.matches(numeros))){
            int longitud = 0;
            longitud = tfclevarv.length();
            if((longitud >= 8) && (longitud <= 12)){
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
