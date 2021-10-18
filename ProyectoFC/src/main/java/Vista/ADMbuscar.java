package Vista;

import Conexion.SQLMetodos;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ADMbuscar extends javax.swing.JFrame {

    SQLMetodos sqlm = new SQLMetodos();
    private ImageIcon imagen;
    private Icon icono;
    
    public ADMbuscar() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.colocarImagen(this.jlbbuscar, "src\\main\\java\\Imagenes\\buscar.png");
        this.colocarImagen(this.jlblogo2, "src\\main\\java\\Imagenes\\adm.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbbuscar = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jtfbuscar = new javax.swing.JTextField();
        jlbbuscar = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblogo2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableresultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 212, 224));

        jPanel2.setBackground(new java.awt.Color(17, 212, 224));

        jLabel1.setText("BUSCAR..");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(579, 579, 579)
                .addComponent(jLabel1)
                .addContainerGap(712, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(17, 212, 224));

        jLabel2.setText("ES:");

        cbes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "DOCENTE", "ALUMNO" }));
        cbes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbesMouseClicked(evt);
            }
        });

        jLabel3.setText("BUSCAR POR:");

        cbbuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel8.setBackground(new java.awt.Color(17, 212, 224));

        jtfbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jlbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfbuscar)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(17, 212, 224));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbuscar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbes, 0, 135, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(17, 212, 224));

        jtableresultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableresultados);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfbuscarKeyReleased
        try {
            ResultSet admrs1 = null, admrs2 = null, admrs3 = null;
            if(cbes.getSelectedItem().equals("ADMINISTRADOR")){
                if(cbbuscar.getSelectedItem().equals("CEDULA")){ admrs1 = sqlm.fbuscaradministradoradm(jtfbuscar.getText(), null, null, null, null); } else if(cbbuscar.getSelectedItem().equals("NOMBRE")){admrs1 = sqlm.fbuscaradministradoradm(null, jtfbuscar.getText(), null, null, null); } else if(cbbuscar.getSelectedItem().equals("APELLIDO")){admrs1 = sqlm.fbuscaradministradoradm(null, null, jtfbuscar.getText(), null, null); } else if(cbbuscar.getSelectedItem().equals("TELEFONO")){ admrs1 = sqlm.fbuscaradministradoradm(null, null, null, jtfbuscar.getText(), null); } else if(cbbuscar.getSelectedItem().equals("CORREO")){ admrs1 = sqlm.fbuscaradministradoradm(null, null, null, null, jtfbuscar.getText()); }
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "TELEFONO", "F.NACIMIENTO", "ESTADO", "CORREO"});
                while(admrs1.next()){
                    modelo.addRow(new Object[]{admrs1.getString("adm_cedula"), admrs1.getString("per_nombre"), admrs1.getString("per_apellido"), admrs1.getString("per_telefono"), admrs1.getString("per_nacimiento"), admrs1.getString("per_estado"), admrs1.getString("adm_correo")});
                }
                jtableresultados.setModel(modelo);
            }
            if(cbes.getSelectedItem().equals("DOCENTE")){
                if(cbbuscar.getSelectedItem().equals("CEDULA")){ admrs2 = sqlm.fbuscardocenteadm(jtfbuscar.getText(), null, null, null); } else if(cbbuscar.getSelectedItem().equals("NOMBRE")){admrs2 = sqlm.fbuscardocenteadm(null, jtfbuscar.getText(), null, null); } else if(cbbuscar.getSelectedItem().equals("APELLIDO")){admrs2 = sqlm.fbuscardocenteadm(null, null, jtfbuscar.getText(), null); } else if(cbbuscar.getSelectedItem().equals("TELEFONO")){ admrs2 = sqlm.fbuscardocenteadm(null, null, null, jtfbuscar.getText()); }
                DefaultTableModel modelo1 = new DefaultTableModel();
                modelo1.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "TELEFONO", "F.NACIMIENTO", "ESTADO"});
                while(admrs2.next()){
                    modelo1.addRow(new Object[]{admrs2.getString("doc_cedula"), admrs2.getString("per_nombre"), admrs2.getString("per_apellido"), admrs2.getString("per_telefono"), admrs2.getString("per_nacimiento"), admrs2.getString("per_estado")});
                }
                jtableresultados.setModel(modelo1);
            }
            if(cbes.getSelectedItem().equals("ALUMNO")){
                if(cbbuscar.getSelectedItem().equals("CEDULA")){ admrs3 = sqlm.fbuscaralumnoadm(jtfbuscar.getText(), null, null, null, null); } else if(cbbuscar.getSelectedItem().equals("NOMBRE")){admrs3 = sqlm.fbuscaralumnoadm(null, jtfbuscar.getText(), null, null, null); } else if(cbbuscar.getSelectedItem().equals("APELLIDO")){admrs3 = sqlm.fbuscaralumnoadm(null, null, jtfbuscar.getText(), null, null); } else if(cbbuscar.getSelectedItem().equals("TELEFONO")){ admrs3 = sqlm.fbuscaralumnoadm(null, null, null, jtfbuscar.getText(), null); } else if(cbbuscar.getSelectedItem().equals("TL.REPRESENTANTE")){ admrs3 = sqlm.fbuscaralumnoadm(null, null, null, null, jtfbuscar.getText()); }
                DefaultTableModel modelo2 = new DefaultTableModel();
                modelo2.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "TELEFONO", "F.NACIMIENTO", "ESTADO", "TLF.REPRESENTANTE"});
                while(admrs3.next()){
                    modelo2.addRow(new Object[]{admrs3.getString("alu_cedula"), admrs3.getString("per_nombre"), admrs3.getString("per_apellido"), admrs3.getString("per_telefono"), admrs3.getString("per_nacimiento"), admrs3.getString("per_estado"), admrs3.getString("alu_telrepresentante")});
                }
                jtableresultados.setModel(modelo2);
            }
            
        } catch (SQLException ex) { System.out.println("error buscar alumno"); }
    }//GEN-LAST:event_jtfbuscarKeyReleased

    private void cbesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbesMouseClicked
        if(cbes.getSelectedItem().equals("ADMINISTRADOR")){
            cbbuscar.removeAllItems(); cbbuscar.addItem("CEDULA"); cbbuscar.addItem("NOMBRE"); cbbuscar.addItem("APELLIDO"); cbbuscar.addItem("TELEFONO"); cbbuscar.addItem("CORREO");
        } else if(cbes.getSelectedItem().equals("DOCENTE")){
            cbbuscar.removeAllItems(); cbbuscar.addItem("CEDULA"); cbbuscar.addItem("NOMBRE"); cbbuscar.addItem("APELLIDO"); cbbuscar.addItem("TELEFONO");
        } else if(cbes.getSelectedItem().equals("ALUMNO")){
            cbbuscar.removeAllItems(); cbbuscar.addItem("CEDULA"); cbbuscar.addItem("NOMBRE"); cbbuscar.addItem("APELLIDO"); cbbuscar.addItem("TELEFONO"); cbbuscar.addItem("TL.REPRESENTANTE"); 
        }
    }//GEN-LAST:event_cbesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // instanciar login
        this.dispose(); ADMmenu madm = new ADMmenu(); madm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
    private javax.swing.JComboBox<String> cbbuscar;
    private javax.swing.JComboBox<String> cbes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbbuscar;
    private javax.swing.JLabel jlblogo2;
    private javax.swing.JTable jtableresultados;
    private javax.swing.JTextField jtfbuscar;
    // End of variables declaration//GEN-END:variables
}
