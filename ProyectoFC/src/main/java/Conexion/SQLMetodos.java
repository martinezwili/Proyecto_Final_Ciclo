package Conexion;

import java.sql.Date;
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
    
    public  ResultSet mjtableAlumno(){
        String sql = ("SELECT alu_cedula, per_nombre, per_apellido, alu_telrepresentante, cur_nombre, mod_modalidad, jor_jornada FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula INNER JOIN curso ON curso.cur_codigo = alumno.cur_codigo INNER JOIN modalidad ON modalidad.mod_codigo = alumno.mod_codigo INNER JOIN jornada ON jornada.jor_codigo = alumno.jor_codigo");
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
    
    public  String mjornadaalu(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT jor_jornada FROM jornada INNER JOIN alumno ON alumno.alu_cedula = '"+ a +"' AND alumno.jor_codigo = jornada.jor_codigo");
        String jornada = null;
        while(rs.next()){
             jornada = rs.getString("jor_jornada");
        }
        return jornada;
    }
    
    public  String mcursoalu(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT cur_nombre FROM curso INNER JOIN alumno ON alumno.alu_cedula = '"+ a +"' AND alumno.cur_codigo = curso.cur_codigo");
        String curso = null;
        while(rs.next()){
            curso = rs.getString("cur_nombre");
        }
        return curso;
    }
    
    public  String mmodalidad(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT mod_modalidad FROM modalidad INNER JOIN alumno ON alumno.alu_cedula = '"+ a +"' AND alumno.mod_codigo = modalidad.mod_codigo");
        String modalidad = null;
        while(rs.next()){
            modalidad = rs.getString("mod_modalidad");
        }
        return modalidad;
    }
    
    public  String mtelefonorepresentante(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT alu_telrepresentante FROM alumno WHERE alumno.alu_cedula = '"+ a +"'");
        String tel = null;
        while(rs.next()){
            tel = rs.getString("alu_telrepresentante");
        }
        return tel;
    }
    
       
    
    
        
    public  ResultSet mtabledireccion(String a){
        ResultSet rs = conexion.query("SELECT direccion.dir_codigo, dic_calle, dir_comuna FROM direccion INNER JOIN relacion ON relacion.rel_cedula = '"+ a +"' AND relacion.dir_codigo = direccion.dir_codigo");
        return rs;
    }
    
    public  ResultSet mtablepersona(String a){
        ResultSet rs = conexion.query("SELECT per_cedula, per_nombre, per_apellido, per_telefono, per_nacimiento, per_contraseña, per_estado FROM persona WHERE per_cedula = '"+ a +"'");
        return rs;
    }
    
    public  ResultSet masignatura(){
        ResultSet rs = conexion.query("SELECT asig_codigo, asig_nombre, asig_descripcion FROM asignatura");
        return rs;
    }
    
    public ResultSet mdocentes() throws SQLException{
        ResultSet rs = conexion.query("SELECT relaasig_codigo, asig_nombre, cur_nombre, doc_cedula, per_nombre, per_apellido FROM relacionasignaturas INNER JOIN asignatura ON asignatura.asig_codigo = relacionasignaturas.asig_codigo INNER JOIN curso ON curso.cur_codigo = relacionasignaturas.cur_codigo INNER JOIN persona ON persona.per_cedula = relacionasignaturas.doc_cedula");
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
    
    public  ResultSet mformacion(){
        ResultSet rs = conexion.query("SELECT * FROM formacion");
        return rs;
    }
    
    public  ResultSet mjornada(){
        ResultSet rs = conexion.query("SELECT * FROM jornada");
        return rs;
    }
    
    public  ResultSet mmodalidad(){
        ResultSet rs = conexion.query("SELECT * FROM modalidad");
        return rs;
    }
    
    public  ResultSet mrango(){
        ResultSet rs = conexion.query("SELECT * FROM rango");
        return rs;
    }
    
    public ResultSet mbuscarasignacion(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT relaasig_codigo, asig_nombre, cur_nombre, doc_cedula, per_nombre, per_apellido FROM relacionasignaturas INNER JOIN asignatura ON asignatura.asig_codigo = relacionasignaturas.asig_codigo INNER JOIN curso ON curso.cur_codigo = relacionasignaturas.cur_codigo INNER JOIN persona ON persona.per_cedula = relacionasignaturas.doc_cedula WHERE curso.cur_nombre = '" + a + "'");
        return rs;
    }
    
    
    
    
    
    public  ResultSet buscardocentes(String a){
        ResultSet rs = conexion.query("SELECT doc_cedula, per_nombre, per_apellido FROM docente INNER JOIN persona ON docente.doc_cedula = persona.per_cedula AND persona.per_nombre LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscaradministradores(String a){
        ResultSet rs = conexion.query("SELECT adm_cedula, per_nombre, per_apellido, adm_correo FROM administrador INNER JOIN persona ON administrador.adm_cedula = persona.per_cedula AND persona.per_nombre LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscaralumno(String a){
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido, alu_telrepresentante, cur_nombre, mod_modalidad, jor_jornada FROM alumno INNER JOIN persona ON alumno.alu_cedula = persona.per_cedula AND persona.per_nombre LIKE '"+ a +"_%' INNER JOIN curso ON curso.cur_codigo = alumno.cur_codigo INNER JOIN modalidad ON modalidad.mod_codigo = alumno.mod_codigo INNER JOIN jornada ON jornada.jor_codigo = alumno.jor_codigo");
        return rs;
    }
    
    public  ResultSet buscarasignatura(String a){
        ResultSet rs = conexion.query("SELECT asig_codigo, asig_nombre, asig_descripcion FROM asignatura WHERE asig_nombre LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarcurso(String a){
        ResultSet rs = conexion.query("SELECT cur_codigo, cur_nombre FROM curso WHERE cur_nombre LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscardocenteadm(String a){
        ResultSet rs = conexion.query("SELECT doc_cedula, per_nombre, per_apellido, ran_rango FROM docente INNER JOIN persona ON docente.doc_cedula = persona.per_cedula AND persona.per_nombre LIKE '"+ a +"_%' INNER JOIN rango ON rango.ran_codigo = docente.ran_codigo");
        return rs;
    }
    
    public  ResultSet buscarformacion(String a){
        ResultSet rs = conexion.query("SELECT for_codigo, for_nivel FROM formacion WHERE for_nivel LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarjornada(String a){
        ResultSet rs = conexion.query("SELECT jor_codigo, jor_jornada FROM jornada WHERE jor_jornada LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarmodalidad(String a){
        ResultSet rs = conexion.query("SELECT mod_codigo, mod_modalidad FROM modalidad WHERE mod_modalidad LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarnacionalidad(String a){
        ResultSet rs = conexion.query("SELECT nac_codigo, nac_nacionalidad FROM nacionalidad WHERE nac_nacionalidad LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarpoliglota(String a){
        ResultSet rs = conexion.query("SELECT pol_codigo, pol_poliglota FROM poliglota WHERE pol_poliglota LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarrango(String a){
        ResultSet rs = conexion.query("SELECT ran_codigo, ran_rango FROM rango WHERE ran_rango LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarsexo(String a){
        ResultSet rs = conexion.query("SELECT sex_codigo, sex_sexo FROM sexo WHERE sex_sexo LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscarasislistadoestudiantes(String c, String b){
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula AND alumno.cur_codigo = '"+ c +"' AND persona.per_apellido LIKE '"+ b +"_%' ORDER BY persona.per_apellido");
        return rs;
    }
    
    
    
    
    
    public  ResultSet DOCcurso(String a){
        ResultSet rs = conexion.query("SELECT DISTINCT cur_nombre FROM curso INNER JOIN relacionasignaturas ON relacionasignaturas.doc_cedula = '"+ a +"' AND relacionasignaturas.cur_codigo = curso.cur_codigo ");
        return rs;
    }
    
    public  ResultSet DOCasignaturas(String a, String c){
        ResultSet rs = conexion.query("SELECT DISTINCT asig_nombre FROM asignatura INNER JOIN relacionasignaturas ON relacionasignaturas.doc_cedula = '"+ a +"' AND relacionasignaturas.cur_codigo = '"+ c +"' AND relacionasignaturas.asig_codigo = asignatura.asig_codigo ");
        return rs;
    }
    
    public  ResultSet DOCactividades(String c, String a){
        ResultSet rs = conexion.query("SELECT DISTINCT not_nombre FROM notas WHERE cur_codigo = '"+ c +"' AND asig_codigo = '"+ a +"' ORDER BY not_nombre ");
        return rs;
    }
    
    public  ResultSet DOCasislistadoestudiantes(String c){
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula AND alumno.cur_codigo = '"+ c +"' ORDER BY persona.per_apellido");
        return rs;
    }
    
    public  ResultSet DOCasislistadoestudiantesasistencia(String c, String a, Date fc){
        ResultSet rs = conexion.query("SELECT asistencia.alu_cedula, per_nombre, per_apellido, asi_faltas FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula INNER JOIN asistencia ON alumno.alu_cedula = asistencia.alu_cedula WHERE asistencia.cur_codigo = '"+ c +"' AND asistencia.asig_codigo = '"+ a +"' AND asistencia.asi_fecha = '"+ fc +"' ORDER BY persona.per_apellido");
        return rs;
    }
    
    public  ResultSet DOCasislistadoestudiantesnotas(String c, String a, String ac){
        ResultSet rs = conexion.query("SELECT DISTINCT notas.alu_cedula, per_nombre, per_apellido, not_nota FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula INNER JOIN notas ON alumno.alu_cedula = notas.alu_cedula WHERE notas.cur_codigo = '"+ c +"' AND notas.asig_codigo = '"+ a +"' AND notas.not_nombre = '"+ ac +"' ORDER BY persona.per_apellido");
        return rs;
    }
    
    public static boolean compestado(String a) throws SQLException{
        Conexionbd conexion = new Conexionbd();
        ResultSet rs = conexion.query("SELECT per_cedula FROM persona WHERE per_cedula = '"+ a +"' AND per_estado = 'INACTIVO'");
        if(rs.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
}