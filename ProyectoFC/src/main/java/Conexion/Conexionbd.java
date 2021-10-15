package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexionbd {
    Connection con;
    Statement st;
    ResultSet rs;
    
    public static String url = "jdbc:mysql://localhost:3306/sisescolar";
    public static String usuario = "root";
    public static String contraseña = "12345sql";
    
    public Conexionbd(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Se Cargo Driver.");
        }catch(ClassNotFoundException e){
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, e);
        }
        
        try{
            con = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Se establecio la coneccion");
        }catch(SQLException e){
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public SQLException noQuery(String nsql){
        System.out.println("nsql");
        try{
            st = con.createStatement();
            st.execute(nsql);
            st.close();
            return null;
        }catch(SQLException e){
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, e);
            return e;
        }
    }
    
    public ResultSet query(String sql){
        System.out.println("sql");
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        }catch(SQLException e){
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }        
    }
    
    public Connection getCon(){
        return con;
    }
    
    public void setCon(){
        this.con = con;
    }
}
