package Vista;

import Conexion.*;
import Modelo.*;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ADMasignaturas extends javax.swing.JFrame {

    SQLMetodos sqlm = new SQLMetodos();
    public static String cedula;
    Validaciones vali = new Validaciones();
    private ImageIcon imagen;
    private Icon icono;
    
    public ADMasignaturas() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
        this.colocarImagen(this.jlbcargar, "src\\main\\java\\Imagenes\\cargando.png");
    }
    
    public void todo() throws SQLException{
        mosasignatura();
        moscurso();
        mostrartabla();
        limpiar();
    }

    public void mosasignatura() throws SQLException{
        cbasignatura.removeAllItems();
        ResultSet rs = sqlm.mcbboxasignatura();
        while(rs.next()){
            cbasignatura.addItem(rs.getString(1));
        }
    }
    
    public void moscurso() throws SQLException{
        cbcurso.removeAllItems();
        ResultSet rs = sqlm.mcbboxCurso();
        while(rs.next()){
            cbcurso.addItem(rs.getString(1));
        }
    }
    
    public void mostrartabla() throws SQLException{
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.setColumnIdentifiers(new Object[]{"CODIGO", "ASIGNATURA", "CURSO", "CEDULA", "NOMBRE", "APELLIDO"});
        ResultSet rs1 = sqlm.mdocentes();
        while(rs1.next()){
            modelo1.addRow(new Object[]{rs1.getString("relaasig_codigo"), rs1.getString("asig_nombre"), rs1.getString("cur_nombre"), rs1.getString("doc_cedula"), rs1.getString("per_nombre"), rs1.getString("per_apellido")});
        }
        jtabledatos.setModel(modelo1);
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
        cbcurso = new javax.swing.JComboBox<>();
        cbasignatura = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtfcodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfcedula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jlbcargar = new javax.swing.JLabel();
        codigolbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnasignar = new javax.swing.JButton();
        jbtneliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfbuscarcursos = new javax.swing.JTextField();
        jbtnbusca = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setText("ASIGNAR ASIGNATURAS A CURSOS.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        jLabel2.setText("CURSO:");

        jLabel3.setText("ASIGNATURAS:");

        cbcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbasignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("CODIGO:");

        jtfcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcodigoKeyReleased(evt);
            }
        });

        jLabel6.setText("DOCENTE:");

        jButton1.setText("DOCENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlbcargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbcargarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cbcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jlbcargar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)))
                        .addComponent(codigolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jlbcargar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));

        jbtnasignar.setText("ASIGNAR");
        jbtnasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnasignarActionPerformed(evt);
            }
        });

        jbtneliminar.setText("ELIMINAR");
        jbtneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneliminarActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnasignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnasignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));

        jLabel4.setText("BUSCAR CURSO:");

        jbtnbusca.setText("BUSCAR");
        jbtnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtfbuscarcursos, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnbusca)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfbuscarcursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnbusca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "ASIGNATURA", "CURSO", "CEDULA", "NOMBRE", "APELLIDO"
            }
        ));
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtabledatos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnasignarActionPerformed
        try {
            //obtener datos del combo box
            String rs1 = sqlm.obtenerCurso(cbcurso.getSelectedItem().toString()), rs2 = sqlm.obtenerasignatura(cbasignatura.getSelectedItem().toString());
            //instanciar clase
            relacionasignaturas rca = new relacionasignaturas(jtfcodigo.getText(), rs2, rs1, jtfcedula.getText());
            //insertar datos
            if(rca.insertar()){ JOptionPane.showMessageDialog(rootPane, "Los datos se guardaron exitosamente"); todo(); } else { JOptionPane.showMessageDialog(rootPane, "No se guardaron exitosamente los datos"); }
        } catch (SQLException ex) { System.out.println("error obtener codigo de combo box"); }
    }//GEN-LAST:event_jbtnasignarActionPerformed

    private void jbtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneliminarActionPerformed
        //instanciar clase
        relacionasignaturas rca = new relacionasignaturas(jtfcodigo.getText(), null, null, null);
        //insertar datos
        try { if(rca.eliminar()){ JOptionPane.showMessageDialog(rootPane, "Los datos se eliminaron exitosamente"); todo(); } else { JOptionPane.showMessageDialog(rootPane, "No se eliminaron exitosamente los datos"); } } catch (SQLException ex) { System.out.println("error eliminar asignacion"); }
    }//GEN-LAST:event_jbtneliminarActionPerformed

    private void jbtnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscaActionPerformed
              try {
            DefaultTableModel modelo2 = new DefaultTableModel();
            modelo2.setColumnIdentifiers(new Object[]{"CODIGO", "ASIGNATURA", "CURSO", "CEDULA", "NOMBRE", "APELLIDO"});
            ResultSet rs2 = sqlm.mbuscarasignacion(jtfbuscarcursos.getText());
            while(rs2.next()){
                modelo2.addRow(new Object[]{rs2.getString("relaasig_codigo"), rs2.getString("asig_nombre"), rs2.getString("cur_nombre"), rs2.getString("doc_cedula"), rs2.getString("per_nombre"), rs2.getString("per_apellido")});
            }
            jtabledatos.setModel(modelo2);
        } catch (SQLException ex) { System.out.println("error mostrar datos de busqueda"); }
    }//GEN-LAST:event_jbtnbuscaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            ADMobtenerdocente admod = new ADMobtenerdocente();
            admod.setVisible(true);
        } catch (SQLException ex) { System.out.println("error pasar a buscar docente"); }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlbcargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbcargarMouseClicked
        jtfcedula.setText(cedula);
    }//GEN-LAST:event_jlbcargarMouseClicked

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked
       // pasar datos de jtabla a jtext file
        int filaa = jtabledatos.getSelectedRow();
        String codigo = jtabledatos.getValueAt(filaa, 0).toString(); jtfcodigo.setText(codigo);
        String asignatura = jtabledatos.getValueAt(filaa, 1).toString(); cbasignatura.setSelectedItem(asignatura);
        String curso = jtabledatos.getValueAt(filaa, 2).toString(); cbcurso.setSelectedItem(curso);
        String buscar = jtabledatos.getValueAt(filaa, 2).toString(); jtfbuscarcursos.setText(buscar);
        String cedula = jtabledatos.getValueAt(filaa, 3).toString(); jtfcedula.setText(cedula);
    }//GEN-LAST:event_jtabledatosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // instanciar login
        this.dispose(); ADMmenu madm = new ADMmenu(); madm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcodigoKeyReleased
        // TODO add your handling code here:
        if(vali.validardijitos8(jtfcodigo.getText())){ this.colocarImagen(this.codigolbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.codigolbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcodigoKeyReleased

    public void limpiar(){
        jtfbuscarcursos.setText("");
        jtfcodigo.setText("");
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
    private javax.swing.JComboBox<String> cbasignatura;
    private javax.swing.JComboBox<String> cbcurso;
    private javax.swing.JLabel codigolbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnasignar;
    private javax.swing.JButton jbtnbusca;
    private javax.swing.JButton jbtneliminar;
    private javax.swing.JLabel jlbcargar;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JTextField jtfbuscarcursos;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JTextField jtfcodigo;
    // End of variables declaration//GEN-END:variables
}
