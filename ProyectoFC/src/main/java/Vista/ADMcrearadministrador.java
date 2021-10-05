package Vista;

import Conexion.*;
import Modelo.*;
import java.awt.Image;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ADMcrearadministrador extends javax.swing.JFrame {
    
    Conexionbd conexion = new Conexionbd();
    SQLMetodos sqlm = new SQLMetodos();
    Validaciones vali = new Validaciones();
    private ImageIcon imagen;
    private Icon icono;
    
    public ADMcrearadministrador() throws SQLException {
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
        casalbl = new javax.swing.JLabel();
        callelbl = new javax.swing.JLabel();
        comunalbl = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableadministrador = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnregistrarse = new javax.swing.JButton();
        jbtncancelar = new javax.swing.JButton();
        jtbtnmodificar = new javax.swing.JButton();
        jbtneliminar = new javax.swing.JButton();
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
        cedulalbl = new javax.swing.JLabel();
        apellidolbl = new javax.swing.JLabel();
        nombrelbl = new javax.swing.JLabel();
        nacimienolbl = new javax.swing.JLabel();
        telefonolbl = new javax.swing.JLabel();
        contraseñalbl = new javax.swing.JLabel();
        correolbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

        jPanel11.setBackground(new java.awt.Color(0, 204, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("DIRECCION:");

        jtfcalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcalleKeyReleased(evt);
            }
        });

        jtfcomuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcomunaKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("CALLE:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("COMUNA:");

        jtfcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcodigoKeyReleased(evt);
            }
        });

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
                        .addComponent(jLabel11)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfcalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jtfcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcomuna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comunalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(callelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(casalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(callelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(comunalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

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

        jtbtnmodificar.setText("MODIFICAR");
        jtbtnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtnmodificarActionPerformed(evt);
            }
        });

        jbtneliminar.setText("ELIMINAR");
        jbtneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbtnmodificar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtnregistrarse)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtneliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
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
                    .addComponent(jtbtnmodificar)
                    .addComponent(jbtneliminar))
                .addContainerGap())
        );

        contenedor.setBackground(new java.awt.Color(0, 204, 102));

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
                .addGap(0, 0, 0)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        jtfcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfcedulaFocusLost(evt);
            }
        });
        jtfcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcedulaActionPerformed(evt);
            }
        });
        jtfcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcedulaKeyReleased(evt);
            }
        });

        jtfnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfnombreFocusLost(evt);
            }
        });
        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfnombreKeyReleased(evt);
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

        jtfcorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfcorreoFocusLost(evt);
            }
        });
        jtfcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcorreoKeyReleased(evt);
            }
        });

        jtfcontras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfcontrasFocusLost(evt);
            }
        });
        jtfcontras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcontrasKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("F.NACIMIENTO:");

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
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfcontras)
                    .addComponent(jtfcorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfcedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtftelefono)
                    .addComponent(jtfapellido)
                    .addComponent(jcanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedulalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nacimienolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(correolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfcontras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseñalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nacimienolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRAR ADMINISTRADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Administrador ad = new Administrador(jtfcedula.getText(), jtfcorreo.getText(), rs4.toString(), jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfcontras.getText().length() != 0 && jtfcorreo.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtfcorreo.getText(), jtfcontras.getText()) == true){
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
                        //mensaje de verificacion de cedula
                        } else { JOptionPane.showMessageDialog(rootPane, "Cedula ya registrada verifique"); }
                    //mensaje de comprobacion de codigo
                    } else { JOptionPane.showMessageDialog(rootPane, "Codigo de casa ya registrado verifique"); }
                }
            // mensaje de comprobacion de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacios verifique"); }    
        // mensaje de xcepcion
        } catch (SQLException ex) { System.out.println("Error String rs1, rs2, rs3, rs4"); }
    }//GEN-LAST:event_jbtnregistrarseActionPerformed

    private void jbtncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncancelarActionPerformed
        // instanciar login
        this.dispose(); ADMmenu madm = new ADMmenu(); madm.setVisible(true);
    }//GEN-LAST:event_jbtncancelarActionPerformed

    private void jtfcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcedulaFocusLost
        // validacion cedula
        if(vali.validarCedula(jtfcedula.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "Verifique la cedula"); }
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
        if(vali.ValidarTelefono(jtftelefono.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "Verifique el numero telefonico"); }
    }//GEN-LAST:event_jtftelefonoFocusLost

    private void jtfcontrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcontrasFocusLost
        // validar contrase;a
        if(vali.validaContraseña(jtfcontras.getText()) == false){ JOptionPane.showMessageDialog(rootPane, "La contraseña no cumple con los parametros requeridos verifique"); }
    }//GEN-LAST:event_jtfcontrasFocusLost

    private void jtableadministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableadministradorMouseClicked
        try {
            // obtener datos de la tabla
            int filaa = jtableadministrador.getSelectedRow();
            String cedula = jtableadministrador.getValueAt(filaa, 0).toString(); mostrarseleccionado(cedula);
        } catch (SQLException ex) { System.out.println("Error mostrar datos de la tabla"); }
        
    }//GEN-LAST:event_jtableadministradorMouseClicked

    private void jbtneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneliminarActionPerformed
        // instanciar direccion
        Direccion dir = new Direccion(jtfcodigo.getText(), null, null);
        // instanciar relacion
        Relacion rel = new Relacion(jtfcedula.getText(), null, null, null, null);
        // instanciar persona
        Persona per = new Persona(jtfcedula.getText(), null,null, null, null, null, null);
        // instanciar administrador
        Administrador adm = new Administrador(jtfcedula.getText(), null, null, null);
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
    }//GEN-LAST:event_jbtneliminarActionPerformed

    private void jtbtnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtnmodificarActionPerformed
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
            Administrador adm = new Administrador(jtfcedula.getText(), jtfcorreo.getText(), rs4, jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfcontras.getText().length() != 0 && jtfcorreo.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtfcorreo.getText(), jtfcontras.getText()) == true){         
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
                }
            // mensaje de comprobacion de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacios verifique"); }
        //mensaje de error de comprobacion de codigo de direccion
        } catch (SQLException ex) { System.out.println("Error combropacion de codigo direccion"); }
    
    }//GEN-LAST:event_jtbtnmodificarActionPerformed

    private void jtfcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcorreoFocusLost
        //validacion de correo
        //if(vali.validarcorreo(jtfcorreo.getText()) == false) { JOptionPane.showMessageDialog(rootPane, "Verifique el correo"); }
    }//GEN-LAST:event_jtfcorreoFocusLost

    private void jtfcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcedulaActionPerformed

    private void jtfcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcedulaKeyReleased
        // TODO add your handling code here:
        if(vali.validarCedula(jtfcedula.getText())){ this.colocarImagen(this.cedulalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.cedulalbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcedulaKeyReleased

    private void jtfnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombreKeyReleased
        // TODO add your handling code here:
        if(vali.validaNombreoApellido(jtfnombre.getText())){ this.colocarImagen(this.nombrelbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.nombrelbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfnombreKeyReleased

    private void jtfcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcorreoKeyReleased
        // TODO add your handling code here:
        if(vali.validarcorreo(jtfcorreo.getText())){ this.colocarImagen(this.correolbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.correolbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcorreoKeyReleased

    private void jtfcontrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcontrasKeyReleased
        // TODO add your handling code here:
        if(vali.validaContraseña(jtfcontras.getText())){ this.colocarImagen(this.contraseñalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.contraseñalbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcontrasKeyReleased

    private void jtfcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcodigoKeyReleased
        // TODO add your handling code here:
        if(vali.validardijitos8(jtfcodigo.getText())){ this.colocarImagen(this.casalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.casalbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcodigoKeyReleased

    private void jtfcalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcalleKeyReleased
        // TODO add your handling code here:
        if(vali.validardijitos50(jtfcalle.getText())){ this.colocarImagen(this.callelbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.callelbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcalleKeyReleased

    private void jtfcomunaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcomunaKeyReleased
        // TODO add your handling code here:
        if(vali.validardijitos20(jtfcomuna.getText())){ this.colocarImagen(this.comunalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.comunalbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcomunaKeyReleased

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
    
    public boolean cumplirvalidaciones(String cedula, String nombre, String apellido, String telefono, String correo, String contra){
        String as = null;
        boolean ab = false;
        if(vali.validarCedula(cedula) == true){
            if(vali.ValidarTelefono(telefono) == true){
                if(vali.validaNombreoApellido(nombre) == true){
                    if(vali.validaNombreoApellido(apellido) == true){
                        if(vali.validarcorreo(correo) == true){
                            if(vali.validaContraseña(contra) == true){} else { as = "Verifique la contraseña"; }
                        } else { as = "Verifique el correo"; }
                    } else { as = "Verifique el apellido";  }
                } else { as = "Verifique el nombre";  }
            } else { as = "Verifique el telefono";  }
        } else { as = "Verifique la cedula";  }
        
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
    private javax.swing.JLabel apellidolbl;
    private javax.swing.JLabel callelbl;
    private javax.swing.JLabel casalbl;
    private javax.swing.JComboBox<String> cbformacion;
    private javax.swing.JComboBox<String> cbnacionalidad;
    private javax.swing.JComboBox<String> cbpoliglota;
    private javax.swing.JComboBox<String> cbsexo;
    private javax.swing.JLabel cedulalbl;
    private javax.swing.JLabel comunalbl;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel contraseñalbl;
    private javax.swing.JLabel correolbl;
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
    private javax.swing.JButton jbtneliminar;
    private javax.swing.JButton jbtnregistrarse;
    private com.toedter.calendar.JDateChooser jcanacimiento;
    private javax.swing.JTable jtableadministrador;
    private javax.swing.JButton jtbtnmodificar;
    private javax.swing.JTextField jtfapellido;
    private javax.swing.JTextField jtfcalle;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JTextField jtfcodigo;
    private javax.swing.JTextField jtfcomuna;
    private javax.swing.JPasswordField jtfcontras;
    private javax.swing.JTextField jtfcorreo;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    private javax.swing.JLabel nacimienolbl;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JLabel telefonolbl;
    // End of variables declaration//GEN-END:variables
}
