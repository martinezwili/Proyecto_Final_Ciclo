package Vista;

import Conexion.*;
import Modelo.*;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ADMcrearmodalidad extends javax.swing.JFrame {

    Validaciones vali = new Validaciones();
    SQLMetodos sqlm = new SQLMetodos();
    private ImageIcon imagen;
    private Icon icono;
    
    public ADMcrearmodalidad() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
        this.colocarImagen(this.jlbbuscar4, "src\\main\\java\\Imagenes\\buscar.png");
        this.colocarImagen(this.jlblogo, "src\\main\\java\\Imagenes\\modalidad.png");
    }
    
    public void todo() throws SQLException{
        mostrar();
        limpiar();
    }
    
    public void mostrar() throws SQLException{
        //metodo para mostar los datos en la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"CODIGO", "NOMBRE DE MODALIDAD"});
        ResultSet rs = sqlm.mmodalidad();
        while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("mod_codigo"), rs.getString("mod_modalidad")});
        }
        jTableModalidad.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCodM = new javax.swing.JTextField();
        jNnmod = new javax.swing.JTextField();
        jlbcodigo = new javax.swing.JLabel();
        jlbmodalidad = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCrearM = new javax.swing.JButton();
        jbtnmodificar = new javax.swing.JButton();
        jtbtneliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModalidad = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jlblogo = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jtfbuscar4 = new javax.swing.JTextField();
        jlbbuscar4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("CREAR MODALIDAD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("CODIGO");

        jLabel2.setText("NOMBRE DEL MODALIDAD");

        jCodM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCodMKeyReleased(evt);
            }
        });

        jNnmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNnmodKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCodM, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jNnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbmodalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jCodM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbmodalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jNnmod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));

        btnCrearM.setText("CREAR");
        btnCrearM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMActionPerformed(evt);
            }
        });

        jbtnmodificar.setText("MODIFICAR");
        jbtnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmodificarActionPerformed(evt);
            }
        });

        jtbtneliminar.setText("ELIMINAR");
        jtbtneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtneliminarActionPerformed(evt);
            }
        });

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCrearM, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbtnmodificar)
            .addComponent(jtbtneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtbtneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));

        jTableModalidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "MODALIDAD"
            }
        ));
        jTableModalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModalidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableModalidad);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(153, 255, 153));

        jtfbuscar4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfbuscar4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfbuscar4)
                .addGap(18, 18, 18)
                .addComponent(jlbbuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbbuscar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfbuscar4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52)))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtneliminarActionPerformed
        //excepcion de comprobar 
        try {
            // instanciar clase modalidad
            Modalidad moda = new Modalidad(jCodM.getText(), null);
             //verificacion de campos vacios
            if(jCodM.getText().length() != 0 && jNnmod.getText().length() != 0){
                //comprobacion de registrado
                if(moda.comp()){
                    //comprobacion de relacion para eliminar
                    if(moda.compparaeliminar() == false){
                        //eliminar modalidad
                        if(moda.eliminar()){
                            JOptionPane.showMessageDialog(rootPane, "Eliminado exitosamente");
                            //excepcion de mostrar y limpiar datos
                            try { todo(); } catch (SQLException ex) { System.out.println("error mostrar y limpiar datos de modalidad"); }
                        //mensaje de error que no se elimino modalidad
                        } else { JOptionPane.showMessageDialog(rootPane, "No se elimino exitosamente"); }
                    //mensaje de comprobacion de relacion
                    } else { JOptionPane.showMessageDialog(rootPane, "No se puede eliminar por que se esta usando"); }
                    //mensaje de comprobacion de codigo
                } else { JOptionPane.showMessageDialog(rootPane, "codigo de modalidad no registado verifique"); }
            }
        //mensaje error de excepcion de comprobacion
        } catch (SQLException ex) { System.out.println("error comprobacion registrar modalidad"); }
    }//GEN-LAST:event_jtbtneliminarActionPerformed

    private void jbtnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmodificarActionPerformed
        // excepcion de comprobacion de modalidad
        try{
            //instanciar clase modalidad
            Modalidad moda = new Modalidad(jCodM.getText(), jNnmod.getText());
            //verificacion de campos vacios
            if(jCodM.getText().length() != 0 && jNnmod.getText().length() != 0){
                //validar validaciones
                if(cumplirvalidaciones(jCodM.getText(), jNnmod.getText()) == true){
                    //comprobacion de registrado
                    if(moda.comp()){
                        //actualizar modalidad
                        if(moda.actualizar()){
                            JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");
                            //excepcion de mostrar y limpiar datos
                            try { todo(); } catch (SQLException ex) { System.out.println("error mostrar y limpiar datos de modalidad"); }
                        //mensaje de error al actualisar datos
                        } else { JOptionPane.showMessageDialog(rootPane, "No se guardo exitosamente"); }
                        //mensaje de comprobacion de codigo
                    } else { JOptionPane.showMessageDialog(rootPane, "codigo de modalidad no registado verifique"); }
                }
            //mensaje de control de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden estar espacios vacios verifique"); }
        //mensaje error de excepcion de comprobacion
        } catch (SQLException ex) { System.out.println("error comprobacion crear modalidad"); }
    }//GEN-LAST:event_jbtnmodificarActionPerformed

    private void btnCrearMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMActionPerformed
        //excepcion de comprobacion
        try{
            // instanciar clase modalidad
            Modalidad moda = new Modalidad(jCodM.getText(), jNnmod.getText());
            //verificacion de campos vacios
            if(jCodM.getText().length() != 0 && jNnmod.getText().length() != 0){
                //validar validaciones
                if(cumplirvalidaciones(jCodM.getText(), jNnmod.getText()) == true){
                    //comprobacion de registrado
                    if(moda.comp() == false){
                        //insertar modalidad
                        if(moda.insertar()){
                            JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");
                            //excepcion de mostrar y limpiar datos
                            try { todo(); } catch (SQLException ex) { System.out.println("error mostrar y limpiar datos de modalidad"); }
                        //mensaje de error al insertar datos
                        } else { JOptionPane.showMessageDialog(rootPane, "No se guardo exitosamente"); }
                        //mensaje de comprobacion de codigo
                    } else { JOptionPane.showMessageDialog(rootPane, "codigo de modalidad ya registado verifique"); }
                }
            //mensaje de control de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden estar espacios vacios verifique"); }
        //mensaje error de excepcion de comprobacion
        } catch (SQLException ex) { System.out.println("error comprobacion registrar modalidad"); }
    }//GEN-LAST:event_btnCrearMActionPerformed

    private void jTableModalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModalidadMouseClicked
        int filaa = jTableModalidad.getSelectedRow();
        String codigo = jTableModalidad.getValueAt(filaa, 0).toString(); jCodM.setText(codigo);
        String modalidad = jTableModalidad.getValueAt(filaa, 1).toString(); jNnmod.setText(modalidad);
    }//GEN-LAST:event_jTableModalidadMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // instanciar login
        this.dispose(); ADMmenu madm = new ADMmenu(); madm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCodMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCodMKeyReleased
        if(vali.validardijitos8(jCodM.getText())){ this.colocarImagen(this.jlbcodigo, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbcodigo, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jCodMKeyReleased

    private void jNnmodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNnmodKeyReleased
        if(vali.validardijitos20(jNnmod.getText())){ this.colocarImagen(this.jlbmodalidad, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbmodalidad, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jNnmodKeyReleased

    private void jtfbuscar4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfbuscar4KeyReleased
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CODIGO", "MODALIDAD"});
            ResultSet rs = sqlm.buscarmodalidad(jtfbuscar4.getText());
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("mod_codigo"), rs.getString("mod_modalidad")});
            }
            jTableModalidad.setModel(modelo);
        } catch (SQLException ex) { System.out.println("error buscar modalidad"); }
    }//GEN-LAST:event_jtfbuscar4KeyReleased

    public void limpiar(){
        jCodM.setText("");
        jNnmod.setText("");
    }
    
    public boolean cumplirvalidaciones(String codigo, String modalidad){
        String as = null;
        boolean ab = false;
        if(vali.validardijitos8(codigo) == true){
            if(vali.validardijitos20(modalidad) == true){
                as = null;
            } else { as = "Verifique la modalidad";  }
        } else { as = "Verifique el codigo";  }
        
        if(as == null){
            ab = true;
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, as);
        }
        return ab;
    }
    
    private void colocarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(), 
                        lbl.getHeight(), 
                        Image.SCALE_SMOOTH)
        );lbl.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearM;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jCodM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNnmod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModalidad;
    private javax.swing.JButton jbtnmodificar;
    private javax.swing.JLabel jlbbuscar4;
    private javax.swing.JLabel jlbcodigo;
    private javax.swing.JLabel jlblogo;
    private javax.swing.JLabel jlbmodalidad;
    private javax.swing.JButton jtbtneliminar;
    private javax.swing.JTextField jtfbuscar4;
    // End of variables declaration//GEN-END:variables
}
