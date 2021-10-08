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

public class ADMcrearformacion extends javax.swing.JFrame {
    
    Validaciones vali = new Validaciones();
    SQLMetodos sqlm = new SQLMetodos();
    private ImageIcon imagen;
    private Icon icono;
    
    public ADMcrearformacion() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
        this.colocarImagen(this.jlbbuscar4, "src\\main\\java\\Imagenes\\buscar.png");
        this.colocarImagen(this.jlblogo1, "src\\main\\java\\Imagenes\\formacion.png");
    }
    
    public void todo() throws SQLException{
        mtabla();
        limpiar();
    }
    
    public void mtabla() throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"CODIGO", "FORMACION"});
        ResultSet rs = sqlm.mformacion();
        while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("for_codigo"), rs.getString("for_nivel")});
        }
        jtableformacion.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jtcodigo = new javax.swing.JTextField();
        jtformacion = new javax.swing.JTextField();
        formacionlbl = new javax.swing.JLabel();
        codigolbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableformacion = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jbtncrear = new javax.swing.JButton();
        jbtneliminar = new javax.swing.JButton();
        jbtnmodificar = new javax.swing.JButton();
        jbtsalir = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jtfbuscar4 = new javax.swing.JTextField();
        jlbbuscar4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlblogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("TIPO DE FORMACION CREAR / MODIFICAR / ELIMINAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CODIGO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NIVEL DE FORMACION:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtcodigoKeyReleased(evt);
            }
        });

        jtformacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtformacionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jtformacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formacionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formacionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jtableformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "FORMACION"
            }
        ));
        jtableformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableformacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableformacion);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        jbtncrear.setText("CREAR");
        jbtncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncrearActionPerformed(evt);
            }
        });

        jbtneliminar.setText("ELIMINAR");
        jbtneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneliminarActionPerformed(evt);
            }
        });

        jbtnmodificar.setText("MODIFICAR");
        jbtnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmodificarActionPerformed(evt);
            }
        });

        jbtsalir.setText("SALIR");
        jbtsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtncrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jbtncrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

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

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncrearActionPerformed
        //excepcion de comprobacion
        try{
            // instanciar clase formacion
            Formacion form = new Formacion(jtcodigo.getText(), jtformacion.getText());
            //verificacion de campos vacios
            if(jtcodigo.getText().length() != 0 && jtformacion.getText().length() != 0){
                //validar validaciones
                if(cumplirvalidaciones(jtcodigo.getText(), jtformacion.getText()) == true){
                    //comprobacion de registrado
                    if(form.comp() == false){
                        //insertar formacion
                        if(form.insertar()){
                            JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");
                            //excepcion de mostrar y limpiar datos
                            try { todo(); } catch (SQLException ex) { System.out.println("error mostrar y limpiar datos de formacion"); }
                        //mensaje de error al insertar datos
                        } else { JOptionPane.showMessageDialog(rootPane, "No se guardo exitosamente"); }
                        //mensaje de comprobacion de codigo
                    } else { JOptionPane.showMessageDialog(rootPane, "codigo de formacion ya registado verifique"); }
                }
            //mensaje de control de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden estar espacios vacios verifique"); }
        //mensaje error de excepcion de comprobacion
        } catch (SQLException ex) { System.out.println("error comprobacion registrar formacion"); }
    }//GEN-LAST:event_jbtncrearActionPerformed

    private void jbtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneliminarActionPerformed
        //excepcion de comprobar 
        try {
            // instanciar clase formacion
            Formacion form = new Formacion(jtcodigo.getText(), null);
             //verificacion de campos vacios
            if(jtcodigo.getText().length() != 0 && jtformacion.getText().length() != 0){
                //comprobacion de registrado
                if(form.comp()){
                    //comprobacion de relacion para eliminar
                    if(form.compparaeliminar() == false){
                        //eliminar formacion
                        if(form.eliminar()){
                            JOptionPane.showMessageDialog(rootPane, "Eliminado exitosamente");
                            //excepcion de mostrar y limpiar datos
                            try { todo(); } catch (SQLException ex) { System.out.println("error mostrar y limpiar datos de formacion"); }
                        //mensaje de error que no se elimino formacion
                        } else { JOptionPane.showMessageDialog(rootPane, "No se elimino exitosamente"); }
                    //mensaje de comprobacion de relacion
                    } else { JOptionPane.showMessageDialog(rootPane, "No se puede eliminar por que se esta usando"); }
                    //mensaje de comprobacion de codigo
                } else { JOptionPane.showMessageDialog(rootPane, "codigo de formacion no registado verifique"); }
            }
        //mensaje error de excepcion de comprobacion
        } catch (SQLException ex) { System.out.println("error comprobacion registrar formacion"); }
    }//GEN-LAST:event_jbtneliminarActionPerformed

    private void jbtnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmodificarActionPerformed
        // excepcion de comprobacion de formacion
        try{
            //instanciar clase formacion
            Formacion form = new Formacion(jtcodigo.getText(), jtformacion.getText());
            //verificacion de campos vacios
            if(jtcodigo.getText().length() != 0 && jtformacion.getText().length() != 0){
                //validar validaciones
                if(cumplirvalidaciones(jtcodigo.getText(), jtformacion.getText()) == true){
                    //comprobacion de registrado
                    if(form.comp()){
                        //actualizar formacion
                        if(form.actualizar()){
                            JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");
                            //excepcion de mostrar y limpiar datos
                            try { todo(); } catch (SQLException ex) { System.out.println("error mostrar y limpiar datos de formacion"); }
                        //mensaje de error al actualisar datos
                        } else { JOptionPane.showMessageDialog(rootPane, "No se guardo exitosamente"); }
                        //mensaje de comprobacion de codigo
                    } else { JOptionPane.showMessageDialog(rootPane, "codigo de formacion no registado verifique"); }
                }
            //mensaje de control de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden estar espacios vacios verifique"); }
        //mensaje error de excepcion de comprobacion
        } catch (SQLException ex) { System.out.println("error comprobacion crear formacion"); }
    }//GEN-LAST:event_jbtnmodificarActionPerformed

    private void jtableformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableformacionMouseClicked
        // pasar datos de jtabla a jtext file
        int filaa = jtableformacion.getSelectedRow();
        String codigo = jtableformacion.getValueAt(filaa, 0).toString(); jtcodigo.setText(codigo);
        String modalidad = jtableformacion.getValueAt(filaa, 1).toString(); jtformacion.setText(modalidad);
    }//GEN-LAST:event_jtableformacionMouseClicked

    private void jbtsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsalirActionPerformed
        // instanciar login
        this.dispose(); ADMmenu madm = new ADMmenu(); madm.setVisible(true);
    }//GEN-LAST:event_jbtsalirActionPerformed

    private void jtcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtcodigoKeyReleased
        // TODO add your handling code here:
        if(vali.validardijitos8(jtcodigo.getText())){ this.colocarImagen(this.codigolbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.codigolbl, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtcodigoKeyReleased

    private void jtformacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtformacionKeyReleased
        // TODO add your handling code here:
        if(vali.validardijitos20(jtformacion.getText())){ this.colocarImagen(this.formacionlbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.formacionlbl, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtformacionKeyReleased

    private void jtfbuscar4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfbuscar4KeyReleased
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CODIGO", "FORMACION"});
            ResultSet rs = sqlm.buscarformacion(jtfbuscar4.getText());
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("for_codigo"), rs.getString("for_nivel")});
            }
            jtableformacion.setModel(modelo);
        } catch (SQLException ex) { System.out.println("error buscar formacion"); }
    }//GEN-LAST:event_jtfbuscar4KeyReleased

    public void limpiar(){
        jtcodigo.setText("");
        jtformacion.setText("");
    }
    
    public boolean cumplirvalidaciones(String codigo, String formacion){
        String as = null;
        boolean ab = false;
        if(vali.validardijitos8(codigo) == true){
            if(vali.validardijitos20(formacion) == true){
                as = null;
            } else { as = "Verifique el formacion";  }
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
    private javax.swing.JLabel codigolbl;
    private javax.swing.JLabel formacionlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncrear;
    private javax.swing.JButton jbtneliminar;
    private javax.swing.JButton jbtnmodificar;
    private javax.swing.JButton jbtsalir;
    private javax.swing.JLabel jlbbuscar4;
    private javax.swing.JLabel jlblogo;
    private javax.swing.JLabel jlblogo1;
    private javax.swing.JTable jtableformacion;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtfbuscar4;
    private javax.swing.JTextField jtformacion;
    // End of variables declaration//GEN-END:variables
}
