package Vista;

import Conexion.Conexionbd;
import Conexion.SQLMetodos;
import Modelo.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrearAdministrador extends javax.swing.JFrame {
    
    Conexionbd conexion = new Conexionbd();
    SQLMetodos sqlm = new SQLMetodos();
    Validaciones vali = new Validaciones();
    
    public CrearAdministrador() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
    }
    
    public void todo() throws SQLException{
        mosnacionalidad();
        mospoliglota();
        mossexo();
        mosformacion();
        mosadministrador();
    }
    
    public void mosnacionalidad() throws SQLException{
        cbnacionalidad.removeAllItems();
        ResultSet rs = sqlm.mcbboxnacionalidad();
        while(rs.next()){
            cbnacionalidad.addItem(rs.getString(1));
        }
    }
    
    public void mospoliglota() throws SQLException{
        cbpoliglota.removeAllItems();
        ResultSet rs = sqlm.mcbboxpoliglota();
        while(rs.next()){
            cbpoliglota.addItem(rs.getString(1));
        }
    }
    
    public void mossexo() throws SQLException{
        cbsexo.removeAllItems();
        ResultSet rs = sqlm.mcbboxsexo();
        while(rs.next()){
            cbsexo.addItem(rs.getString(1));
        }
    }
    
    public void mosformacion() throws SQLException{
        cbformacion.removeAllItems();
        ResultSet rs = sqlm.mcbboxformacion();
        while(rs.next()){
            cbformacion.addItem(rs.getString(1));
        }
    }
    
    public void mosadministrador() throws SQLException{
        //mostrar informacion de la tabla administrador
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "CORREO"});
        ResultSet rs = sqlm.mjtableadministrador();
        while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("adm_cedula"), rs.getString("per_nombre"), rs.getString("per_apellido"), rs.getString("adm_correo")});
        }
        jtableadministrador.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtfcalle = new javax.swing.JTextField();
        jtfcomuna = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfcodigo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableadministrador = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnregistrarse = new javax.swing.JButton();
        jbtncancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbpoliglota = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbnacionalidad = new javax.swing.JComboBox<>();
        cbsexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbformacion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jtfcedula = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        jtfapellido = new javax.swing.JTextField();
        jtftelefono = new javax.swing.JTextField();
        jtfcorreo = new javax.swing.JTextField();
        jtfcontras = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcanacimiento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("DIRECCION:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("CALLE:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("COMUNA:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("CODIGO DE LA CASA:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfcalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jtfcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcomuna))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(138, 138, 138))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(28, 28, 28))
        );

        jtableadministrador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "CORREO"
            }
        ));
        jtableadministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableadministradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableadministrador);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnregistrarse.setText("REGISTRAR");
        jbtnregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnregistrarseActionPerformed(evt);
            }
        });

        jbtncancelar.setText("SALIR");
        jbtncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncancelarActionPerformed(evt);
            }
        });

        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtnregistrarse)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnregistrarse)
                    .addComponent(jbtncancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("POLIGLOTA");

        cbpoliglota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NACIONALIDAD:");

        cbnacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEXO:");

        cbformacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("TIPO DE FORMACION:");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbformacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbsexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbpoliglota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbpoliglota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtfcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfcedulaFocusLost(evt);
            }
        });

        jtfnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfnombreFocusLost(evt);
            }
        });

        jtfapellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfapellidoFocusLost(evt);
            }
        });

        jtftelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtftelefonoFocusLost(evt);
            }
        });

        jtfcontras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfcontrasFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("FECHA DE NACIMIENTO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CEDULA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("APELLIDO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TELEFONO:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("CORREO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CONTRASEÑA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfcontras)
                    .addComponent(jtfcorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfcedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtftelefono)
                    .addComponent(jtfapellido)
                    .addComponent(jcanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcontras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRAR ADMINISTRADOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnregistrarseActionPerformed
        try {
            //se pasa la fecha de nacimiento del formato date de jcalendar a string y de nuevo a date
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String nacimiento = f.format(jcanacimiento.getDate());
            //se emvia datos por parametros a metodos en clase SQLMetodos
            String rs1 = sqlm.obtenerpoliglota(cbpoliglota.getSelectedItem().toString()),rs2 = sqlm.obtenernacionalidad(cbnacionalidad.getSelectedItem().toString()), rs3 = sqlm.obtenersexo(cbsexo.getSelectedItem().toString()), rs4 = sqlm.obtenerformacion(cbformacion.getSelectedItem().toString());
            //instanciar clases direccion
            Direccion dir = new Direccion(jtfcodigo.getText(), jtfcalle.getText(), jtfcomuna.getText());
            //instanciar relacion
            Relacion rel = new Relacion(jtfcedula.getText(), jtfcodigo.getText(), rs3, rs2, rs1);
            // instanciar persona
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontras.getText(), jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar administrador
            Administradorr ad = new Administradorr(jtfcedula.getText(), jtfcorreo.getText(), rs4.toString(), jtfcedula.getText());
            //comprobacion de codigo de direccion
            if(dir.compb() == false){
                //comprobacion de cedula de persona
                if(per.comp() == false){
                    //guardar datos de direccion
                    if(dir.insertar()){
                        //guardar datos de relacion
                        if(rel.insertar()){
                            //guardar datos de persona
                            if(per.insertar()){
                                //guardar datos de administrador
                                if(ad.insertar()){
                                    JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");
                                    //exepcion para limpiar y mostrar datos del administrador
                                    try { limpiar(); mosadministrador(); } catch (SQLException ex) { System.out.println("Error mosadministrador"); }
                                    //se elimina los datos registrados de direccion relacion y persona
                                } else { per.eliminar(); rel.eliminar(); dir.eliminar(); JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                                //se elimina los datos registrados de direccion relacion
                            } else { rel.eliminar(); dir.eliminar(); JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                            //se elimina los datos registrados de direccion
                        } else { dir.eliminar(); JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                        // mensaje de no se guardaron datos
                    } else { JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                } else { JOptionPane.showMessageDialog(rootPane, "Cedula ya registrada verifique"); }
            } else { JOptionPane.showMessageDialog(rootPane, "Codigo de casa ya registrado verifique"); }
            // mensaje de xcepcion
        } catch (SQLException ex) { System.out.println("Error String rs1, rs2, rs3, rs4"); }
    }//GEN-LAST:event_jbtnregistrarseActionPerformed

    private void jbtncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncancelarActionPerformed
        // instanciar login
        this.dispose();
        Menuadministrador madm = new Menuadministrador();
        madm.setVisible(true);
    }//GEN-LAST:event_jbtncancelarActionPerformed

    private void jtfcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcedulaFocusLost
        // validacion cedula
        if(vali.validaCedulaoTelefono(jtfcedula.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "Verifique la cedula"); }
    }//GEN-LAST:event_jtfcedulaFocusLost

    private void jtfnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfnombreFocusLost
        // validacion nombre
        if(vali.validaNombreoApellido(jtfnombre.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "Verifique el nombre"); }
    }//GEN-LAST:event_jtfnombreFocusLost

    private void jtfapellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfapellidoFocusLost
        // validacion apellido
        if(vali.validaNombreoApellido(jtfapellido.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "Verifique el apellido"); }
    }//GEN-LAST:event_jtfapellidoFocusLost

    private void jtftelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtftelefonoFocusLost
        // validacion telefono
        if(vali.validaCedulaoTelefono(jtftelefono.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "Verifique el numero telefonico"); }
    }//GEN-LAST:event_jtftelefonoFocusLost

    private void jtfcontrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcontrasFocusLost
        // validar contrase;a
        if(vali.validaContraseña(jtfcontras.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "La contraseña no cumple con los parametros requeridos verifique"); }
    }//GEN-LAST:event_jtfcontrasFocusLost

    private void jtableadministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableadministradorMouseClicked
        try {
            // obtener datos de la tabla
            int filaa = jtableadministrador.getSelectedRow();
            String cedula = jtableadministrador.getValueAt(filaa, 0).toString();
            mostrarseleccionado(cedula);
        } catch (SQLException ex) { System.out.println("Error mostrar datos de la tabla"); }
        
    }//GEN-LAST:event_jtableadministradorMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // instanciar direccion
        Direccion dir = new Direccion(jtfcodigo.getText(), null, null);
        // instanciar relacion
        Relacion rel = new Relacion(jtfcedula.getText(), null, null, null, null);
        // instanciar persona
        Persona per = new Persona(jtfcedula.getText(), null,null, null, null, null, null);
        // instanciar administrador
        Administradorr adm = new Administradorr(jtfcedula.getText(), null, null, null);
        //excepcion de comprobar direccion
        try {
            //comprobar direccion
            if(dir.compb()){
                //excepcion de comprobar persona
                try {
                    //comprueba que exista la cedula de la persona
                    if(per.comp()){
                        //elimina administrador
                        if(adm.eliminar()){
                            //elimina persona
                            if(per.eliminar()){
                                //elimina relacion
                                if(rel.eliminar()){
                                    //elimina direccion
                                    if(dir.eliminar()){
                                        JOptionPane.showMessageDialog(rootPane, "Los datos se eliminaron correctamente");
                                        //limpia datos y actualiza
                                        limpiar(); todo();
                                        //mensaje de falla en eliminar datos
                                    } else { JOptionPane.showMessageDialog(rootPane, "No se eliminaron los datos correctamente intente nuevamente"); }
                                    //mensaje de falla en eliminar datos
                                } else { JOptionPane.showMessageDialog(rootPane, "No se eliminaron los datos correctamente intente nuevamente"); }
                                //mensaje de falla en eliminar datos
                            } else { JOptionPane.showMessageDialog(rootPane, "No se eliminaron los datos correctamente intente nuevamente"); }
                            //mensaje de falla en eliminar datos
                        } else { JOptionPane.showMessageDialog(rootPane, "No se eliminaron los datos correctamente intente nuevamente"); }
                        //mensaje de verifique la cedula
                    } else { JOptionPane.showMessageDialog(rootPane, "Verifique la cedula"); }
                    //mensaje de exepcion de comprobacion de personas
                } catch (SQLException ex) { System.out.println("Error comprobar persona"); }
                //mensaje de comprobacion de direccion
            } else { JOptionPane.showMessageDialog(rootPane, "Verifique el codigo de la casa"); }
        //mensaje de excepcion comprobar direccion
        } catch (SQLException ex) { System.out.println("Error en verificacion de codigo de casa"); }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {                                              
            // TODO add your handling code here:
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String nacimiento = f.format(jcanacimiento.getDate());
            //se emvia datos por parametros a metodos en clase SQLMetodos
            String rs1 = sqlm.obtenerpoliglota(cbpoliglota.getSelectedItem().toString()),rs2 = sqlm.obtenernacionalidad(cbnacionalidad.getSelectedItem().toString()), rs3 = sqlm.obtenersexo(cbsexo.getSelectedItem().toString()), rs4 = sqlm.obtenerformacion(cbformacion.getSelectedItem().toString());
            //instanciar direccion
            Direccion dir = new Direccion(jtfcodigo.getText(), jtfcalle.getText(), jtfcomuna.getText());
            //instanciar relacion
            Relacion rel = new Relacion(jtfcedula.getText(), jtfcodigo.getText(), rs3, rs2, rs1);
            //instanciar persona
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontras.getText(), jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar docente
            Administradorr adm = new Administradorr(jtfcedula.getText(), jtfcorreo.getText(), rs4, jtfcedula.getText());
            //comprobar direccion
            if(dir.compb()){
                //excepcion de comprobar persona
                try {
                    //comprobar persona
                    if(per.comp()){
                        //actualizar direccion
                        if(dir.actualizar()){
                            //actualizar relacion
                            if(rel.actualizar()){
                                //actualizar persona
                                if(per.actualizar()){
                                    //actualizar docente
                                    if(adm.actualizar()){
                                        JOptionPane.showMessageDialog(rootPane, "Los datos se actualizaron correctamente");
                                        //llamar a los metodos impiar y todo
                                        limpiar(); todo();
                                    //mensaje de datos no actualizados crrectamente de docente
                                    } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                                //mensaje de datos no actualizados crrectamente de persona
                                } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                            //mensaje de datos no actualizados crrectamente de relacion
                            } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                        //mensaje de datos no actualizados crrectamente de direccion
                        } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                    //mensaje de que la cedula no esta registrada
                    } else { JOptionPane.showMessageDialog(rootPane, "Verifique la cedula"); }
                //mensaje de error de comprobacion de cedula
                } catch (SQLException ex) { System.out.println("Error comprobar persona"); }
            //mensaje de que el codigo de la direccion no esta registrada
            } else { JOptionPane.showMessageDialog(rootPane, "Verifique el codigo de la casa"); }
        //mensaje de error de comprobacion de codigo de direccion
        } catch (SQLException ex) { System.out.println("Error combropacion de codigo direccion"); }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    public void mostrarseleccionado(String a) throws SQLException{
        cbpoliglota.setSelectedItem(sqlm.mpoliglota(a));
        cbnacionalidad.setSelectedItem(sqlm.mnacionalidad(a));
        cbsexo.setSelectedItem(sqlm.msexo(a));
        cbformacion.setSelectedItem(sqlm.mformacionadm(a));
        jtfcorreo.setText(sqlm.mcorreo(a));
        
        ResultSet rs = sqlm.mtablepersona(a);
        while(rs.next()){
            jtfcedula.setText(rs.getString("per_cedula"));
            jtfnombre.setText(rs.getString("per_nombre"));
            jtfapellido.setText(rs.getString("per_apellido"));
            jtftelefono.setText(rs.getString("per_telefono"));
            jcanacimiento.setDate(rs.getDate("per_nacimiento"));
            jtfcontras.setText(rs.getString("per_contraseña"));
        }
        
        ResultSet rs1 = sqlm.mtabledireccion(a);
        while(rs1.next()){
            jtfcodigo.setText(rs1.getString("dir_codigo"));
            jtfcalle.setText(rs1.getString("dic_calle"));
            jtfcomuna.setText(rs1.getString("dir_comuna"));
        }
    }

    public void limpiar() throws SQLException{
        jtfapellido.setText("");
        jtftelefono.setText("");
        jtfnombre.setText("");
        jtfcalle.setText("");
        jtfcorreo.setText("");
        jtfcontras.setText("");
        jtfcedula.setText("");
        jtfcodigo.setText("");
        jtfcomuna.setText("");
        jcanacimiento.setDate(null);
        cbformacion.setSelectedItem("");
        cbnacionalidad.setSelectedItem("");
        cbpoliglota.setSelectedItem("");
        cbsexo.setSelectedItem("");
        todo();   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbformacion;
    private javax.swing.JComboBox<String> cbnacionalidad;
    private javax.swing.JComboBox<String> cbpoliglota;
    private javax.swing.JComboBox<String> cbsexo;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncancelar;
    private javax.swing.JButton jbtnregistrarse;
    private com.toedter.calendar.JDateChooser jcanacimiento;
    private javax.swing.JTable jtableadministrador;
    private javax.swing.JTextField jtfapellido;
    private javax.swing.JTextField jtfcalle;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JTextField jtfcodigo;
    private javax.swing.JTextField jtfcomuna;
    private javax.swing.JPasswordField jtfcontras;
    private javax.swing.JTextField jtfcorreo;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    // End of variables declaration//GEN-END:variables
}
