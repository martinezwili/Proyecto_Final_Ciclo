package Vista;

import Conexion.*;
import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ADMcrearasignatura extends javax.swing.JFrame {
    
    Conexionbd conexion = new Conexionbd();
    Validaciones vali = new Validaciones();
    SQLMetodos sqlm = new SQLMetodos();
  
    public ADMcrearasignatura() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
    }
    
    public void todo() throws SQLException{
        mosnacionalidad();
        mostrar();
        limpiar();
    }
    
    public void mosnacionalidad() throws SQLException{
        cbboxcurso.removeAllItems();
        ResultSet rs = sqlm.mcbboxCurso();
        while(rs.next()){
            cbboxcurso.addItem(rs.getString(1));
        }
    }
    
    public void mostrar() throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"CODIGO", "NOMBRE","CURSO" ,"DESCRIPCION"});
        ResultSet rs = sqlm.masignatura();
        while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("asig_codigo"), rs.getString("asig_nombre"), rs.getString("cur_nombre"), rs.getString("asig_descripcion")});
        }
        jtableasignatura.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jtcodigo = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        cbboxcurso = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtadescripcion = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableasignatura = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jbtncrear = new javax.swing.JButton();
        jbtneliminar = new javax.swing.JButton();
        jbtnmodificar = new javax.swing.JButton();
        jbtsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CODIGO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("NOMBRE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CURSO AL");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("QUE SE ASIGNARA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DESCRIPCION:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        cbboxcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtadescripcion.setColumns(20);
        jtadescripcion.setRows(5);
        jScrollPane3.setViewportView(jtadescripcion);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtcodigo)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(cbboxcurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cbboxcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jtableasignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "CURSO", "DESCRIPCION"
            }
        ));
        jtableasignatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableasignaturaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableasignatura);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2)
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));

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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtncrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbtncrear)
                .addGap(18, 18, 18)
                .addComponent(jbtneliminar)
                .addGap(18, 18, 18)
                .addComponent(jbtnmodificar)
                .addGap(18, 18, 18)
                .addComponent(jbtsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ADMINISTRAR ASIGNATURAS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncrearActionPerformed
        //excepcion de comprobacion de asignatura
        try {
            //obtener codigo de curso
            String rs1 = sqlm.obtenerCurso(cbboxcurso.getSelectedItem().toString());
            // instanciar asignatura
            Asignatura asig = new Asignatura(jtcodigo.getText(), jtfnombre.getText(), jtadescripcion.getText(), rs1);
            //comprobacion de campos vacios
            if(jtcodigo.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtadescripcion.getText().length() != 0){
                //comprobacion de que no existe asignatura
                if(asig.comp() == false){
                    System.out.println("guardado1");
                    //crear asignatura
                    if(asig.insertar()){
                        JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");
                        //captura la excepcion de mostrar y eliminar asignaturas
                        try { todo(); } catch (SQLException ex) { System.out.println("error al mostrar y eliminar asignatura"); }
                    //menasaje de error al crear asignatura
                    } else { JOptionPane.showMessageDialog(rootPane, "No se guardo exitosamente"); }
                //mensaje de comprobacion de existencia de asignatura
                } else { JOptionPane.showMessageDialog(rootPane, "Este codigo de asignatura ya esta registrado"); }
            //mensaje de comprobacion de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden aver espacios vacios verifique"); }
        //mensaje de captura de excepcion
        } catch (SQLException ex) { System.out.println("error al comprobar asignatura crear"); }
    }//GEN-LAST:event_jbtncrearActionPerformed

    private void jbtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneliminarActionPerformed
        //excepcion de comprobacion de asignatura
        try {
            // instanciar asignatura
            Asignatura asig = new Asignatura(jtcodigo.getText(),null,null, null);
            //comprobacion de asignatura
            if(asig.comp()){
                //eliminar asignatura
                if(asig.eliminar()){
                    JOptionPane.showMessageDialog(rootPane, "Eliminado exitosamente");
                    try { todo(); } catch (SQLException ex) { System.out.println("error al mostrar y eliminar asignatura"); }
                //mensaje error al eliminar asignatura
                } else { JOptionPane.showMessageDialog(rootPane, "Error al eliminar"); }
            //mensaje no existe esa asignatura
            } else { JOptionPane.showMessageDialog(rootPane, "Asignatura no encontrada verifique el codigo"); }
        //mensaje de excepcion de comprobar asignatura
        } catch (SQLException ex) { System.out.println("error comprobacion al eliminar asignatura"); }
    }//GEN-LAST:event_jbtneliminarActionPerformed

    private void jbtnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmodificarActionPerformed
        //excepcion de codigo de asignatura
        try {
            //obtener codigo de curso
            String rs1 = sqlm.obtenerCurso(cbboxcurso.getSelectedItem().toString());
            // instanciar asignatura para actualizar
            Asignatura asig = new Asignatura(jtcodigo.getText(), jtfnombre.getText(), jtadescripcion.getText(), rs1);
            //comprobacion de campos vacios
            if(jtcodigo.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtadescripcion.getText().length() != 0){
                //comprobacion de codigo de asignatura
                if(asig.comp()){
                    //actualizar datos
                    if(asig.actualizar()){
                        JOptionPane.showMessageDialog(rootPane, "Actualizado exitosamente");
                        //excepcion de mostrar y limpiar
                        try { todo(); } catch (SQLException ex) { System.out.println("Error actualizar asignatura limpiar y mostrar"); }
                    //mensaje de error al actualizar datos
                    } else { JOptionPane.showMessageDialog(rootPane, "No se Actualizo exitosamente"); }
                //mensaje de comprobacion de codigo de asignatura
                } else { JOptionPane.showMessageDialog(rootPane, "Verifique el codigo de la asignatura"); }
            //mensaje de comprobacion de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden aver espacios vacios verifique"); }
        //mensaje de excepcion de codigo de asignatura
        } catch (SQLException ex) { System.out.println("error comprobar codigo de asignatura"); }
    }//GEN-LAST:event_jbtnmodificarActionPerformed

    private void jtableasignaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableasignaturaMouseClicked
        // obtener datos de la tabla
        int filaa = jtableasignatura.getSelectedRow();
        jtcodigo.setText(jtableasignatura.getValueAt(filaa, 0).toString());
        jtfnombre.setText(jtableasignatura.getValueAt(filaa, 1).toString());
        cbboxcurso.setSelectedItem(jtableasignatura.getValueAt(filaa, 2).toString());
        jtadescripcion.setText(jtableasignatura.getValueAt(filaa, 3).toString());
    }//GEN-LAST:event_jtableasignaturaMouseClicked

    private void jbtsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsalirActionPerformed
        // instanciar login
        this.dispose(); ADMmenu madm = new ADMmenu(); madm.setVisible(true);
    }//GEN-LAST:event_jbtsalirActionPerformed

    public void limpiar(){
        jtcodigo.setText("");
        jtfnombre.setText("");
        jtadescripcion.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbboxcurso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtncrear;
    private javax.swing.JButton jbtneliminar;
    private javax.swing.JButton jbtnmodificar;
    private javax.swing.JButton jbtsalir;
    private javax.swing.JTable jtableasignatura;
    private javax.swing.JTextArea jtadescripcion;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtfnombre;
    // End of variables declaration//GEN-END:variables
}
