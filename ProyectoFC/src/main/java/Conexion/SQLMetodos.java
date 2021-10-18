package Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SQLMetodos {
    
    Conexionbd conexion = new Conexionbd();
    
    public  ResultSet mcbboxnacionalidad(){
        ResultSet rs = conexion.query("SELECT nac_nacionalidad FROM nacionalidad");
        return rs;
    }
    
    public  ResultSet mcbboxpoliglota(){
        ResultSet rs = conexion.query("SELECT pol_poliglota FROM poliglota");
        return rs;
    }
    
    public  ResultSet mcbboxsexo(){
        ResultSet rs = conexion.query("SELECT sex_sexo FROM sexo");
        return rs;
    }
    
    public  ResultSet mcbboxformacion(){
        ResultSet rs = conexion.query("SELECT for_nivel FROM formacion");
        return rs;
    }
    
    public  ResultSet mcbboxrango(){
        ResultSet rs = conexion.query("SELECT ran_rango FROM rango");
        return rs;
    }
    
    public  ResultSet mcbboxjornada(){
        ResultSet rs = conexion.query("SELECT jor_jornada FROM jornada");
        return rs;
    }
    
    public  ResultSet mcbboxasignatura(){
        ResultSet rs = conexion.query("SELECT asig_nombre FROM asignatura");
        return rs;
    }
    
    public  ResultSet mcbboxCurso(){
        ResultSet rs = conexion.query("SELECT cur_nombre FROM curso");
        return rs;
    }
    
    public  ResultSet mcbboxmodalidad(){
        ResultSet rs = conexion.query("SELECT mod_modalidad FROM modalidad");
        return rs;
    }
       
    
       
    
       
    public  String obtenernacionalidad(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT nac_codigo FROM nacionalidad WHERE nac_nacionalidad = '" + a + "'");
        String nacionalidad = null;
        while(rs.next()){
            nacionalidad = rs.getString("nac_codigo");
        }
        return nacionalidad;
    }
    
    public  String obtenerpoliglota(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT pol_codigo FROM poliglota WHERE pol_poliglota = '" + a + "'");
        String poliglota = null;
        while(rs.next()){
            poliglota = rs.getString("pol_codigo");
        }
        return poliglota;
    }
    
    public  String obtenersexo(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT sex_codigo FROM sexo WHERE sex_sexo = '" + a + "'");
        String sexo = null;
        while(rs.next()){
             sexo = rs.getString("sex_codigo");
        }
        return sexo;
    }
    
    public  String obtenerformacion(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT for_codigo FROM formacion WHERE for_nivel = '" + a + "'");
        String formacion = null;
        while(rs.next()){
            formacion = rs.getString("for_codigo");
        }
        return formacion;
    }
    
    public  String obtenerrango(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT ran_codigo FROM rango WHERE ran_rango = '" + a + "'");
        String rango = null;
        while(rs.next()){
            rango = rs.getString("ran_codigo");
        }
        return rango;
    }
    
    public  String obtenerjornada(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT jor_codigo FROM jornada WHERE jor_jornada = '" + a + "'");
        String jornada = null;
        while(rs.next()){
             jornada = rs.getString("jor_codigo");
        }
        return jornada;
    }
    
    public  String obtenerasignatura(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT asig_codigo FROM asignatura WHERE asig_nombre = '" + a + "'");
        String asignatura = null;
        while(rs.next()){
            asignatura = rs.getString("asig_codigo");
        }
        return asignatura;
    }
    
    public  String obtenermodalidad(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT mod_codigo FROM modalidad WHERE mod_modalidad = '" + a + "'");
        String modalidad = null;
        while(rs.next()){
            modalidad = rs.getString("mod_codigo");
        }
        return modalidad;
    }
    
    public  String obtenerCurso(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT cur_codigo FROM curso WHERE cur_nombre = '" + a + "'");
        String curso = null;
        while(rs.next()){
            curso = rs.getString("cur_codigo");
        }
        return curso;
    }
    
    
    
    
    
    public  ResultSet mjtableadministrador(){
        ResultSet rs = conexion.query("SELECT adm_cedula, per_nombre, per_apellido, adm_correo FROM persona INNER JOIN administrador ON persona.per_cedula = administrador.adm_cedula");
        return rs;
    }
    
    public  ResultSet mjtabledocente(){
        ResultSet rs = conexion.query("SELECT doc_cedula, per_nombre, per_apellido, ran_rango FROM docente INNER JOIN persona ON persona.per_cedula = docente.doc_cedula INNER JOIN rango ON rango.ran_codigo = docente.ran_codigo");
        return rs;
    }
    
    public  ResultSet mjtableAlumno(){
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido, alu_telrepresentante, mod_modalidad, jor_jornada FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula INNER JOIN modalidad ON modalidad.mod_codigo = alumno.mod_codigo INNER JOIN jornada ON jornada.jor_codigo = alumno.jor_codigo");
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
        ResultSet rs = conexion.query("SELECT relaasig_codigo, asig_nombre, cur_nombre, doc_cedula, per_nombre, per_apellido FROM relacionasignaturas INNER JOIN asignatura ON asignatura.asig_codigo = relacionasignaturas.asig_codigo INNER JOIN curso ON curso.cur_codigo = relacionasignaturas.cur_codigo INNER JOIN persona ON persona.per_cedula = relacionasignaturas.doc_cedula WHERE curso.cur_nombre LIKE '" + a + "_%'");
        return rs;
    }
    
    
    
    
    
    public  ResultSet buscardocentes(String a){
        ResultSet rs = conexion.query("SELECT doc_cedula, per_nombre, per_apellido FROM docente INNER JOIN persona ON docente.doc_cedula = persona.per_cedula AND persona.per_nombre LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet obtenerdocente(){
        ResultSet rs = conexion.query("SELECT doc_cedula, per_nombre, per_apellido FROM docente INNER JOIN persona ON docente.doc_cedula = persona.per_cedula");
        return rs;
    }
    
    public  ResultSet buscaradministradores(String a){
        ResultSet rs = conexion.query("SELECT adm_cedula, per_nombre, per_apellido, adm_correo FROM administrador INNER JOIN persona ON administrador.adm_cedula = persona.per_cedula AND persona.per_nombre LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet buscaralumno(String a){
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido, alu_telrepresentante, mod_modalidad, jor_jornada FROM alumno INNER JOIN persona ON alumno.alu_cedula = persona.per_cedula AND persona.per_nombre LIKE '"+ a +"_%' INNER JOIN modalidad ON modalidad.mod_codigo = alumno.mod_codigo INNER JOIN jornada ON jornada.jor_codigo = alumno.jor_codigo");
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
        ResultSet rs = conexion.query("SELECT alumno.alu_cedula, per_nombre, per_apellido FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula INNER JOIN matricula ON  matricula.alu_cedula = alumno.alu_cedula AND matricula.cur_codigo = '"+ c +"' WHERE persona.per_nombre LIKE '"+ b +"_%' OR persona.per_apellido LIKE '"+ b +"_%' ORDER BY persona.per_apellido");
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
        ResultSet rs = conexion.query("SELECT alumno.alu_cedula, per_nombre, per_apellido FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula INNER JOIN matricula ON  matricula.alu_cedula = alumno.alu_cedula AND matricula.mat_estado = 'ACTIVO' AND matricula.cur_codigo = '"+ c +"' ORDER BY persona.per_apellido");
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
    
    public String ADMcomcedula(String a) throws SQLException{
        String as = "--";
        ResultSet rs = conexion.query("SELECT adm_cedula FROM administrador WHERE adm_cedula = '"+ a +"'");
        if(rs.next()){  
            as = "adm";
        }
        else
        {
            ResultSet rs1 = conexion.query("SELECT alu_cedula FROM alumno WHERE alu_cedula = '"+ a +"'");
            if(rs1.next()){  
                as = "alu";
            }
            else
            {
                ResultSet rs2 = conexion.query("SELECT doc_cedula FROM docente WHERE doc_cedula = '"+ a +"'");
                if(rs2.next()){  
                    as = "doc";
                }
                else
                {

                }
            }
        }
        return as;
    }
    
    public ResultSet matricula(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido, per_estado FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula AND alumno.cur_codigo = '"+ a +"'");
        return rs;
    }
    
    public  ResultSet buscaralumnomatricula(String a, String b){
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido, per_estado FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula AND alumno.cur_codigo = '"+ a +"' AND persona.per_nombre LIKE '"+ b +"_%'");
        return rs;
    }
    
    
    
    
    
    //Buscar administrador
    public  ResultSet fbuscaradministradoradm(String a, String b, String c, String d, String e){
        ResultSet rs = conexion.query("SELECT DISTINCT adm_cedula, per_nombre, per_apellido, per_telefono, per_nacimiento, per_estado, adm_correo FROM administrador INNER JOIN persona ON persona.per_cedula = administrador.adm_cedula AND persona.per_cedula LIKE '"+ a +"_%' OR persona.per_cedula = administrador.adm_cedula AND persona.per_nombre LIKE '"+ b +"_%' OR persona.per_cedula = administrador.adm_cedula AND persona.per_apellido LIKE '"+ c +"_%' OR persona.per_cedula = administrador.adm_cedula AND persona.per_telefono LIKE '"+ d +"_%' OR persona.per_cedula = administrador.adm_cedula AND administrador.adm_correo LIKE '"+ e +"_%' ORDER BY persona.per_cedula");
        return rs;
    }
          
    public  ResultSet fbuscardocenteadm(String a, String b, String c, String d){
        ResultSet rs = conexion.query("SELECT DISTINCT doc_cedula, per_nombre, per_apellido, per_telefono, per_nacimiento, per_estado FROM docente INNER JOIN persona ON persona.per_cedula = docente.doc_cedula AND persona.per_cedula LIKE '"+ a +"_%' OR persona.per_cedula = docente.doc_cedula AND persona.per_nombre LIKE '"+ b +"_%' OR persona.per_cedula = docente.doc_cedula AND persona.per_apellido LIKE '"+ c +"_%' OR persona.per_cedula = docente.doc_cedula AND persona.per_telefono LIKE '"+ d +"_%' OR persona.per_cedula = docente.doc_cedula ORDER BY persona.per_cedula");
        return rs;
    }
    
    public  ResultSet fbuscaralumnoadm(String a, String b, String c, String d, String e){
        ResultSet rs = conexion.query("SELECT DISTINCT alu_cedula, per_nombre, per_apellido, per_telefono, per_nacimiento, per_estado, alu_telrepresentante FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula AND persona.per_cedula LIKE '"+ a +"_%' OR persona.per_cedula = alumno.alu_cedula AND persona.per_nombre LIKE '"+ b +"_%' OR persona.per_cedula = alumno.alu_cedula AND persona.per_apellido LIKE '"+ c +"_%' OR persona.per_cedula = alumno.alu_cedula AND persona.per_telefono LIKE '"+ d +"_%' OR persona.per_cedula = alumno.alu_cedula AND alumno.alu_telrepresentante LIKE '"+ e +"_%' ORDER BY persona.per_cedula");
        return rs;
    }
    
    //PARA REPORTES DEL ALUMNO
    public  ResultSet mReporteAlumno(String cedula){
        ResultSet rs = conexion.query("SELECT alu_cedula, per_nombre, per_apellido,per_telefono,per_nacimiento,dic_calle, alu_telrepresentante FROM alumno INNER JOIN persona ON persona.per_cedula = alumno.alu_cedula INNER JOIN relacion ON relacion.rel_cedula = persona.per_cedula INNER JOIN direccion ON direccion.dir_codigo= relacion.dir_codigo WHERE alu_cedula = '"+ cedula +"'");
        return rs;
    }  
    
    public  ResultSet mReporteAsigAlumno(String cedula){
        ResultSet rs = conexion.query("SELECT asig_nombre FROM asignatura INNER JOIN relacionasignaturas ON asignatura.asig_codigo=relacionasignaturas.asig_codigo INNER JOIN curso  ON curso.cur_codigo=relacionasignaturas.cur_codigo INNER JOIN matricula ON matricula.cur_codigo= curso.cur_codigo AND matricula.mat_estado = 'ACTIVO' WHERE alu_cedula = '"+ cedula +"'");
        return rs;
    } 
    
    public  ResultSet mReporteNotasAlumno(String asig, String cedula){
        ResultSet rs = conexion.query("SELECT DISTINCT not_nombre, not_nota FROM notas  INNER JOIN asignatura ON notas.asig_codigo=asignatura.asig_codigo INNER JOIN curso ON curso.cur_codigo=notas.cur_codigo WHERE notas.asig_codigo = '"+ asig +"' AND notas.alu_cedula='"+cedula+"'");
        return rs;
    } 
    
    public  ResultSet mReporteAsisAlumno(String cedula,String asignatura){
        ResultSet rs = conexion.query("select asig_nombre, asi_faltas,asi_fecha FROM asistencia INNER JOIN asignatura ON asistencia.asig_codigo=asignatura.asig_codigo INNER JOIN curso ON curso.cur_codigo=asistencia.cur_codigo WHERE asistencia.alu_cedula='"+cedula+"'AND asistencia.asig_codigo='"+asignatura+"'");
        return rs;
    } 
    
    public  ResultSet CoboAsigAlumno(String cedula){
        ResultSet rs = conexion.query("SELECT asig_nombre FROM asignatura INNER JOIN relacionasignaturas ON asignatura.asig_codigo=relacionasignaturas.asig_codigo INNER JOIN curso  ON curso.cur_codigo=relacionasignaturas.cur_codigo INNER JOIN matricula ON matricula.cur_codigo= curso.cur_codigo AND matricula.mat_estado = 'ACTIVO' WHERE alu_cedula = '"+ cedula +"'");
        return rs;
    }
    
    public  ResultSet mReporteNotasAlumnoBuscar(String asig, String cedula, String a){
        ResultSet rs = conexion.query("SELECT DISTINCT not_nombre, not_nota FROM notas  INNER JOIN asignatura ON notas.asig_codigo=asignatura.asig_codigo INNER JOIN curso ON curso.cur_codigo=notas.cur_codigo WHERE notas.asig_codigo = '"+ asig +"' AND notas.alu_cedula = '"+ cedula +"' AND not_nombre LIKE '"+ a +"_%'");
        return rs;
    } 
        
    //Finaliza Reporte del Alumno
    
     //reportes docente
     public  ResultSet Reportedocente(String cedula){
        ResultSet rs = conexion.query("SELECT doc_cedula, per_nombre, per_apellido,per_telefono,per_nacimiento,dic_calle, ran_rango FROM docente INNER JOIN persona ON persona.per_cedula = docente.doc_cedula INNER JOIN relacion ON relacion.rel_cedula = persona.per_cedula INNER JOIN direccion ON direccion.dir_codigo= relacion.dir_codigo INNER JOIN rango ON docente.ran_codigo=rango.ran_codigo WHERE persona.per_cedula='"+ cedula +"'");
        return rs;
    }
     
    public ResultSet reporteAsistencia(String curso, String asignatura){
        ResultSet rs = conexion.query("select asistencia.alu_cedula,per_nombre,per_apellido,asi_faltas FROM alumno inner join persona on persona.per_cedula=alumno.alu_cedula inner join asistencia on alumno.alu_cedula = asistencia.alu_cedula inner join asignatura on asignatura.asig_codigo=asistencia.asig_codigo where asistencia.cur_codigo='"+curso+"' and asignatura.asig_codigo='"+asignatura+"'");
        return rs;
    }
    
    public ResultSet reporteNotas(String docente, String curso){
        ResultSet rs = conexion.query("select asig_nombre, avg(not_nota) from notas INNER JOIN asignatura on notas.asig_codigo=asignatura.asig_codigo INNER JOIN curso ON curso.cur_codigo=notas.cur_codigo INNER JOIN relacionasignaturas ON relacionasignaturas.cur_codigo = curso.cur_codigo AND relacionasignaturas.asig_codigo = asignatura.asig_codigo WHERE relacionasignaturas.doc_cedula = '"+ docente +"' AND relacionasignaturas.cur_codigo = '"+ curso +"'");
        return rs;
    }
    
    public ResultSet reporteNotasbuscar(String curso, String a){
        ResultSet rs = conexion.query("select asig_nombre, avg(not_nota) from notas INNER JOIN asignatura on notas.asig_codigo=asignatura.asig_codigo INNER JOIN curso ON curso.cur_codigo=notas.cur_codigo  WHERE notas.cur_codigo='"+ curso +"' AND asig_nombre LIKE '"+ a +"_%'");
        return rs;
    }
    
    //fiin
    
    public boolean cedularg(String a) throws SQLException{
        ResultSet rs = conexion.query("SELECT per_cedula FROM persona WHERE per_cedula = '"+ a +"'");
        if(rs.next()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
   //Matricula
    public  ResultSet matriculaAlumno(){
        ResultSet rs = conexion.query("SELECT alumno.alu_cedula, per_nombre, per_apellido, per_estado FROM persona INNER JOIN alumno ON alumno.alu_cedula = persona.per_cedula ORDER BY persona.per_cedula");
        return rs;
    }
   
    public  ResultSet matriculaAlumnobuscar(String a){
        ResultSet rs = conexion.query("SELECT alumno.alu_cedula, per_nombre, per_apellido, per_estado FROM persona INNER JOIN alumno ON alumno.alu_cedula = persona.per_cedula WHERE alumno.alu_cedula LIKE '"+ a +"_%' OR persona.per_nombre LIKE '"+ a +"_%' OR persona.per_apellido LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  ResultSet historialmatriculaAlumno(){
        ResultSet rs = conexion.query("SELECT alumno.alu_cedula, per_nombre, per_apellido, per_estado, cur_nombre, mat_fecha  FROM persona INNER JOIN alumno ON persona.per_cedula = alumno.alu_cedula INNER JOIN matricula ON matricula.alu_cedula = alumno.alu_cedula INNER JOIN curso ON matricula.cur_codigo = curso.cur_codigo");
        return rs;
    }
   
    public  ResultSet historialmatriculaAlumnobuscar(String a){
        ResultSet rs = conexion.query("SELECT alumno.alu_cedula, per_nombre, per_apellido, per_estado, cur_nombre, mat_fecha  FROM persona INNER JOIN alumno ON persona.per_cedula = alumno.alu_cedula INNER JOIN matricula ON matricula.alu_cedula = alumno.alu_cedula INNER JOIN curso ON matricula.cur_codigo = curso.cur_codigo WHERE alumno.alu_cedula LIKE '"+ a +"_%' OR persona.per_nombre LIKE '"+ a +"_%' OR persona.per_apellido LIKE '"+ a +"_%'");
        return rs;
    }
    
    public  void matriculainactivar(String a) throws SQLException{
        String codigo = null; 
        ResultSet rs = conexion.query("SELECT mat_codigo FROM matricula WHERE mat_estado = 'ACTIVO' AND alu_cedula = '"+ a +"'");
            while(rs.next()){
                codigo = rs.getString("mat_codigo");
            }
        if(codigo != null ){
            conexion.noQuery("UPDATE matricula SET mat_estado = 'INACTIVO' WHERE mat_codigo = '"+ codigo +"'");
        }
    }
}