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

    /*public ArrayList<String> mpoliglota() throws SQLException{
        ArrayList<String> lista1 = new ArrayList<String>();
        String sql = "SELECT * FROM poliglota";
        ResultSet rs = conexion.query(sql);
        while(rs.next()){
            Poliglota pol = new Poliglota(null, null);
            pol.setPol_codigo(rs.getString("pol_codigo"));
            pol.setPol_poliglota(rs.getString("pol_poliglota"));
            lista1.add(pol);
        }
        return lista1;
    }*/
}
