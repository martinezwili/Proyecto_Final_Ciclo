package Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    public  ResultSet mcbboxCurso(){
        String sql = ("SELECT cur_nombre FROM curso");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mcbboxmodalidad(){
        String sql = ("SELECT mod_modalidad FROM modalidad");
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
    
    public  String obtenermodalidad(String a) throws SQLException{
        String sql = ("SELECT mod_codigo FROM modalidad WHERE mod_modalidad = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String modalidad = null;
        while(rs.next()){
            modalidad = rs.getString("mod_codigo");
        }
        return modalidad;
    }
    
    public  String obtenerCurso(String a) throws SQLException{
        String sql = ("SELECT cur_codigo FROM curso WHERE cur_nombre = '" + a + "'");
        ResultSet rs = conexion.query(sql);
        String curso = null;
        while(rs.next()){
            curso = rs.getString("cur_codigo");
        }
        return curso;
    }
    
    
    
    
    
    public  ResultSet mjtableadministrador(){
        String sql = ("SELECT adm_cedula, per_nombre, per_apellido, adm_correo FROM persona INNER JOIN administrador ON persona.per_cedula = administrador.per_cedula");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    public  ResultSet mjtabledocente(){
        String sql = ("SELECT doc_cedula, per_nombre, per_apellido, ran_rango FROM docente INNER JOIN persona ON persona.per_cedula = docente.per_cedula INNER JOIN rango ON rango.ran_codigo = docente.ran_codigo");
        ResultSet rs = conexion.query(sql);
        return rs;
    }
    
    
    
    
    
    public  String mnacionalidad(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT nac_nacionalidad FROM nacionalidad INNER JOIN relacion ON relacion.rel_cedula = '"+ a +"' AND relacion.nac_codigo = nacionalidad.nac_codigo");
        String nacionalidad = null;
        while(rs.next()){
            nacionalidad = rs.getString("nac_nacionalidad");
        }
        return nacionalidad;
    }
    
    public  String mpoliglota(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT pol_poliglota FROM poliglota INNER JOIN relacion ON relacion.rel_cedula = '"+ a +"' AND relacion.pol_codigo = poliglota.pol_codigo");
        String poliglota = null;
        while(rs.next()){
            poliglota = rs.getString("pol_poliglota");
        }
        return poliglota;
    }
    
    public  String msexo(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT sex_sexo FROM sexo INNER JOIN relacion ON relacion.rel_cedula = '"+ a +"' AND relacion.sex_codigo = sexo.sex_codigo");
        String sexo = null;
        while(rs.next()){
             sexo = rs.getString("sex_sexo");
        }
        return sexo;
    }
    
    public  String mformacion(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT for_nivel FROM formacion INNER JOIN docente ON docente.doc_cedula = '"+ a +"' AND docente.for_codigo = formacion.for_codigo");
        String formacion = null;
        while(rs.next()){
            formacion = rs.getString("for_nivel");
        }
        return formacion;
    }
    
    public  String mrango(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT ran_rango FROM rango INNER JOIN docente ON docente.doc_cedula = '"+ a +"' AND docente.ran_codigo = rango.ran_codigo");
        String rango = null;
        while(rs.next()){
            rango = rs.getString("ran_rango");
        }
        return rango;
    }
    
    public  String mjornada(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT jor_jornada FROM jornada INNER JOIN docente ON docente.doc_cedula = '"+ a +"' AND docente.jor_codigo = jornada.jor_codigo");
        String jornada = null;
        while(rs.next()){
             jornada = rs.getString("jor_jornada");
        }
        return jornada;
    }
    
    public  String masignatura1(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT asig_nombre FROM asignatura INNER JOIN docente ON docente.doc_cedula = '"+ a +"' AND docente.as1_codigo = asignatura.asig_codigo");
        String asignatura1 = null;
        while(rs.next()){
            asignatura1 = rs.getString("asig_nombre");
        }
        return asignatura1;
    }
    
    public  String masignatura2(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT asig_nombre FROM asignatura INNER JOIN docente ON docente.doc_cedula = '"+ a +"' AND docente.as2_codigo = asignatura.asig_codigo");
        String asignatura2 = null;
        while(rs.next()){
            asignatura2 = rs.getString("asig_nombre");
        }
        return asignatura2;
    }
    
    public  String masignatura3(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT asig_nombre FROM asignatura INNER JOIN docente ON docente.doc_cedula = '"+ a +"' AND docente.as3_codigo = asignatura.asig_codigo");
        String asignatura3 = null;
        while(rs.next()){
            asignatura3 = rs.getString("asig_nombre");
        }
        return asignatura3;
    }
    
    public String mformacionadm(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT for_nivel FROM formacion INNER JOIN administrador ON administrador.adm_cedula = '"+ a +"' AND administrador.for_codigo = formacion.for_codigo");
        String formacion = null;
        while(rs.next()){
            formacion = rs.getString("for_nivel");
        }
        return formacion;
    }
    
    public  String mcorreo(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT adm_correo FROM administrador WHERE adm_cedula = '"+ a +"'");
        String correo = null;
        while(rs.next()){
            correo = rs.getString("adm_correo");
        }
        return correo;
    }
        
    public  ResultSet mtabledireccion(String a){
        ResultSet rs = conexion.query("SELECT direccion.dir_codigo, dic_calle, dir_comuna FROM direccion INNER JOIN relacion ON relacion.rel_cedula = '"+ a +"' AND relacion.dir_codigo = direccion.dir_codigo");
        return rs;
    }
    
    public  ResultSet mtablepersona(String a){
        ResultSet rs = conexion.query("SELECT per_cedula, per_nombre, per_apellido, per_telefono, per_nacimiento, per_contraseña FROM persona WHERE per_cedula = '"+ a +"'");
        return rs;
    }
    
    public  ResultSet masignatura(){
        ResultSet rs = conexion.query("SELECT asig_codigo, asig_nombre, asig_descripcion, cur_nombre FROM asignatura INNER JOIN curso ON curso.cur_codigo = asignatura.cur_codigo");
        return rs;
    }
    
    public  ResultSet mcurso(){
        ResultSet rs = conexion.query("SELECT * FROM curso");
        return rs;
    }
    
    public  ResultSet mnacionalidad(){
        ResultSet rs = conexion.query("SELECT * FROM nacionalidad");
        return rs;
    }
    
    public  ResultSet mpoliglota(){
        ResultSet rs = conexion.query("SELECT * FROM poliglota");
        return rs;
    }
    
    public  ResultSet msexo(){
        ResultSet rs = conexion.query("SELECT * FROM sexo");
        return rs;
    }
}