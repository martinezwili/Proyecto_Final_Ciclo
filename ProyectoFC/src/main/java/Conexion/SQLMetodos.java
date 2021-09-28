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
    
    
    
    
    
    public  ResultSet mcbboxrango(){
        String sql = ("SELECT ran_rango FROM rango");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mcbboxjornada(){
        String sql = ("SELECT jor_jornada FROM jornada");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mcbboxasignatura(){
        String sql = ("SELECT asig_nombre FROM asignatura");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mjtabledocente(){
        String sql = ("SELECT doc_cedula, per_nombre, per_apellido, ran_rango FROM docente INNER JOIN persona ON persona.per_cedula = docente.per_cedula RIGHT JOIN rango ON rango.ran_codigo = docente.ran_codigo");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  String obtenerrango(String a) throws SQLException{
        String sql = ("SELECT ran_codigo FROM rango WHERE ran_rango = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String rango = null;
        while(rs.next()){
            rango = rs.getString("ran_codigo");
        }
        return rango;
    }
    
    public  String obtenerjornada(String a) throws SQLException{
        String sql = ("SELECT jor_codigo FROM jornada WHERE jor_jornada = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String jornada = null;
        while(rs.next()){
             jornada = rs.getString("jor_codigo");
        }
        return jornada;
    }
    
    public  String obtenerasignatura(String a) throws SQLException{
        String sql = ("SELECT asig_codigo FROM asignatura WHERE asig_nombre = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String asignatura = null;
        while(rs.next()){
            asignatura = rs.getString("asig_codigo");
        }
        return asignatura;
    }
}