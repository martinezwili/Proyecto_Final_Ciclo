/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelo.Poliglota;
import Vista.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author MAWIL
 */

//bebecita
public class SQLMetodos {
    
    Conexionbd conexion = new Conexionbd();
    
    public  ResultSet mcbboxnacionalidad(){
        String sql = ("SELECT nac_nacionalidad FROM nacionalidad");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mcbboxpoliglota(){
        String sql = ("SELECT pol_poliglota FROM poliglota");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mcbboxsexo(){
        String sql = ("SELECT sex_sexo FROM sexo");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mcbboxformacion(){
        String sql = ("SELECT for_nivel FROM formacion");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mjtableadministrador(){
        String sql = ("SELECT adm_cedula, per_nombre, per_apellido, adm_correo FROM persona INNER JOIN administrador ON persona.per_cedula = administrador.per_cedula");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  String obtenernacionalidad(String a) throws SQLException{
        String sql = ("SELECT nac_codigo FROM nacionalidad WHERE nac_nacionalidad = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String nacionalidad = null;
        while(rs.next()){
            nacionalidad = rs.getString("nac_codigo");
        }
        return nacionalidad;
    }
    
    public  String obtenerpoliglota(String a) throws SQLException{
        String sql = ("SELECT pol_codigo FROM poliglota WHERE pol_poliglota = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String poliglota = null;
        while(rs.next()){
            poliglota = rs.getString("pol_codigo");
        }
        return poliglota;
    }
    
    public  String obtenersexo(String a) throws SQLException{
        String sql = ("SELECT sex_codigo FROM sexo WHERE sex_sexo = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String sexo = null;
        while(rs.next()){
             sexo = rs.getString("sex_codigo");
        }
        return sexo;
    }
    
    public  String obtenerformacion(String a) throws SQLException{
        String sql = ("SELECT for_codigo FROM formacion WHERE for_nivel = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String formacion = null;
        while(rs.next()){
            formacion = rs.getString("for_codigo");
        }
        return formacion;
    }
}