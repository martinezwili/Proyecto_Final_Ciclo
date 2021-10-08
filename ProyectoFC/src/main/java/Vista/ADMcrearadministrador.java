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
    
    SQLMetodos sqlm = new SQLMetodos();
    Validaciones vali = new Validaciones();
    private ImageIcon imagen;
    private Icon icono;
    
    public ADMcrearadministrador() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
        this.colocarImagen(this.jlbbuscar4, "src\\main\\java\\Imagenes\\buscar.png");
        this.colocarImagen(this.jlblogo2, "src\\main\\java\\Imagenes\\apoyo.png");
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

        rbtngrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableadministrador = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnregistrarse = new javax.swing.JButton();
        jbtncancelar = new javax.swing.JButton();
        jtbtnmodificar = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        rbtnactivo = new javax.swing.JRadioButton();
        rdbtninactivo = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        cbformacion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbsexo = new javax.swing.JComboBox<>();
        cbnacionalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbpoliglota = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jtfbuscar4 = new javax.swing.JTextField();
        jlbbuscar4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblogo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfcedula = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        jtfapellido = new javax.swing.JTextField();
        jtftelefono = new javax.swing.JTextField();
        jcanacimiento = new com.toedter.calendar.JDateChooser();
        jtfcontras = new javax.swing.JPasswordField();
        jlbcedula = new javax.swing.JLabel();
        jlbnombre = new javax.swing.JLabel();
        jlbapellido = new javax.swing.JLabel();
        jlbtelefono = new javax.swing.JLabel();
        jlbnacimiento = new javax.swing.JLabel();
        jlbcorreo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfcorreo = new javax.swing.JTextField();
        jlbcontras = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtfcalle = new javax.swing.JTextField();
        jtfcomuna = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfcodigo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jlbcodigo = new javax.swing.JLabel();
        jlbcalle = new javax.swing.JLabel();
        jlbcomuna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbtnregistrarse)
                .addGap(14, 14, 14)
                .addComponent(jtbtnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnregistrarse)
                    .addComponent(jtbtnmodificar)
                    .addComponent(jbtncancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRAR ADMINISTRADOR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedor.setBackground(new java.awt.Color(0, 204, 102));

        rbtnactivo.setBackground(new java.awt.Color(0, 204, 102));
        rbtngrupo.add(rbtnactivo);
        rbtnactivo.setText("Activo");

        rdbtninactivo.setBackground(new java.awt.Color(0, 204, 102));
        rbtngrupo.add(rdbtninactivo);
        rdbtninactivo.setText("Inactivo");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ESTADO:");

        cbformacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("TIPO DE FORMACION:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEXO:");

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbnacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NACIONALIDAD:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("POLIGLOTA");

        cbpoliglota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbformacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbsexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbpoliglota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addComponent(rbtnactivo)
                        .addGap(18, 18, 18)
                        .addComponent(rdbtninactivo)))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
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
                .addGap(13, 13, 13)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnactivo)
                    .addComponent(jLabel17)
                    .addComponent(rdbtninactivo)))
        );

        jPanel10.setBackground(new java.awt.Color(0, 204, 102));

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
                .addComponent(jtfbuscar4, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlbbuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbbuscar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfbuscar4))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(0, 204, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel18.setText("CEDULA:");

        jLabel19.setText("NOMBRE:");

        jLabel20.setText("APELLIDO:");

        jLabel21.setText("TELEFONO:");

        jLabel22.setText("F.NACIMIENTO:");

        jLabel23.setText("CONTRASEÑA:");

        jtfcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcedulaKeyReleased(evt);
            }
        });

        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfnombreKeyReleased(evt);
            }
        });

        jtfapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfapellidoKeyReleased(evt);
            }
        });

        jtftelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtftelefonoKeyReleased(evt);
            }
        });

        jcanacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcanacimientoKeyReleased(evt);
            }
        });

        jtfcontras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcontrasKeyReleased(evt);
            }
        });

        jLabel2.setText("CORREO:");

        jtfcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcorreoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcorreo)
                            .addComponent(jtftelefono)
                            .addComponent(jtfcedula)
                            .addComponent(jtfnombre)
                            .addComponent(jtfapellido)
                            .addComponent(jcanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfcontras, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jlbcontras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel18))
                                                    .addComponent(jlbcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel19)))
                                            .addComponent(jlbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20)))
                                    .addComponent(jlbapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)))
                            .addComponent(jlbtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addComponent(jlbnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfcontras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addComponent(jlbcontras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfcalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jtfcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcomuna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfcodigo)
                        .addComponent(jlbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfcalle)
                        .addComponent(jlbcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfcomuna)
                        .addComponent(jlbcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(700, 700, 700))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, Short.MAX_VALUE)
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
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontras.getText(), "ACTIVO", jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar administrador
            Administrador ad = new Administrador(jtfcedula.getText(), jtfcorreo.getText(), rs4.toString(), jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfcontras.getText().length() != 0 && jtfcorreo.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtfcorreo.getText(), jtfcontras.getText(), "ACTIVO") == true){
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

    private void jtableadministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableadministradorMouseClicked
        try {
            // obtener datos de la tabla
            int filaa = jtableadministrador.getSelectedRow();
            String cedula = jtableadministrador.getValueAt(filaa, 0).toString(); mostrarseleccionado(cedula);
        } catch (SQLException ex) { System.out.println("Error mostrar datos de la tabla"); }
        
    }//GEN-LAST:event_jtableadministradorMouseClicked

    private void jtbtnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtnmodificarActionPerformed
        try {                                              
            // TODO add your handling code here:
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String nacimiento = f.format(jcanacimiento.getDate());
            String estado = null;
            if(rbtnactivo.isSelected() == true){ estado = "ACTIVO"; } else if (rdbtninactivo.isSelected() == true){ estado = "INACTIVO"; }
            
            //se emvia datos por parametros a metodos en clase SQLMetodos
            String rs1 = sqlm.obtenerpoliglota(cbpoliglota.getSelectedItem().toString()),rs2 = sqlm.obtenernacionalidad(cbnacionalidad.getSelectedItem().toString()), rs3 = sqlm.obtenersexo(cbsexo.getSelectedItem().toString()), rs4 = sqlm.obtenerformacion(cbformacion.getSelectedItem().toString());
            //instanciar direccion
            Direccion dir = new Direccion(jtfcodigo.getText(), jtfcalle.getText(), jtfcomuna.getText());
            //instanciar relacion
            Relacion rel = new Relacion(jtfcedula.getText(), jtfcodigo.getText(), rs3, rs2, rs1);
            //instanciar persona
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontras.getText(), estado, jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar docente
            Administrador adm = new Administrador(jtfcedula.getText(), jtfcorreo.getText(), rs4, jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfcontras.getText().length() != 0 && jtfcorreo.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtfcorreo.getText(), jtfcontras.getText(), estado) == true){         
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

    private void jtfbuscar4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfbuscar4KeyReleased
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "CORREO"});
            ResultSet rs = sqlm.buscaradministradores(jtfbuscar4.getText());
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("adm_cedula"), rs.getString("per_nombre"), rs.getString("per_apellido"), rs.getString("adm_correo")});
            }
            jtableadministrador.setModel(modelo);
        } catch (SQLException ex) { System.out.println("error buscar administrador"); }
    }//GEN-LAST:event_jtfbuscar4KeyReleased

    private void jtfcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcedulaKeyReleased
        if(vali.validarCedula(jtfcedula.getText())){ this.colocarImagen(this.jlbcedula, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbcedula, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcedulaKeyReleased

    private void jtfnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombreKeyReleased
        if(vali.validaNombreoApellido(jtfnombre.getText())){ this.colocarImagen(this.jlbnombre, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbnombre, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfnombreKeyReleased

    private void jtfapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfapellidoKeyReleased
        if(vali.validaNombreoApellido(jtfapellido.getText())){ this.colocarImagen(this.jlbapellido, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbapellido, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfapellidoKeyReleased

    private void jtftelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtftelefonoKeyReleased
        if(vali.ValidarTelefono(jtftelefono.getText())){ this.colocarImagen(this.jlbtelefono, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbtelefono, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtftelefonoKeyReleased

    private void jcanacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcanacimientoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcanacimientoKeyReleased

    private void jtfcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcorreoKeyReleased
        if(vali.validarcorreo(jtfcorreo.getText())){ this.colocarImagen(this.jlbcorreo, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbcorreo, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcorreoKeyReleased

    private void jtfcontrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcontrasKeyReleased
        if(vali.validaContraseña(jtfcontras.getText())){ this.colocarImagen(this.jlbcontras, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbcontras, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcontrasKeyReleased

    private void jtfcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcodigoKeyReleased
        if(vali.validardijitos8(jtfcodigo.getText())){ this.colocarImagen(this.jlbcodigo, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbcodigo, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcodigoKeyReleased

    private void jtfcalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcalleKeyReleased
        if(vali.validardijitos50(jtfcalle.getText())){ this.colocarImagen(this.jlbcalle, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbcalle, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcalleKeyReleased

    private void jtfcomunaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcomunaKeyReleased
        if(vali.validardijitos20(jtfcomuna.getText())){ this.colocarImagen(this.jlbcomuna, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbcomuna, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcomunaKeyReleased

    public void mostrarseleccionado(String a) throws SQLException{
        cbpoliglota.setSelectedItem(sqlm.mpoliglota(a));
        cbnacionalidad.setSelectedItem(sqlm.mnacionalidad(a));
        cbsexo.setSelectedItem(sqlm.msexo(a));
        cbformacion.setSelectedItem(sqlm.mformacionadm(a));
        jtfcorreo.setText(sqlm.mcorreo(a));
        
        ResultSet rs = sqlm.mtablepersona(a); String est = null;
        while(rs.next()){
            jtfcedula.setText(rs.getString("per_cedula"));
            jtfnombre.setText(rs.getString("per_nombre"));
            jtfapellido.setText(rs.getString("per_apellido"));
            jtftelefono.setText(rs.getString("per_telefono"));
            jcanacimiento.setDate(rs.getDate("per_nacimiento"));
            jtfcontras.setText(rs.getString("per_contraseña"));
            est = rs.getString("per_estado");
        }
        if(est.equals("ACTIVO")){ rbtnactivo.setSelected(true); } else { rdbtninactivo.setSelected(true); }
        
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
        rbtnactivo.setSelected(false);
        rdbtninactivo.setSelected(false);
        todo();   
    }
    
    public boolean cumplirvalidaciones(String cedula, String nombre, String apellido, String telefono, String correo, String contra, String estado){
        String as = null;
        boolean ab = false;
        if(vali.validarCedula(cedula) == true){
            if(vali.ValidarTelefono(telefono) == true){
                if(vali.validaNombreoApellido(nombre) == true){
                    if(vali.validaNombreoApellido(apellido) == true){
                        if(vali.validarcorreo(correo) == true){
                            if(vali.validaContraseña(contra) == true){
                                if(vali.validarestado(estado) == true){
                                    if(vali.validardijitos8(jtfcodigo.getText()) == true){
                                        if(vali.validardijitos50(jtfcalle.getText()) == true){
                                            if(vali.validardijitos20(jtfcomuna.getText()) == true){ } else { as = "Verifique la comuna"; }
                                        } else { as = "Verifique la calle"; }
                                    } else { as = "Verifique el codigo de la casa"; }
                                } else { as = "Verifique el estado"; }
                            } else { as = "Verifique la contraseña"; }
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
    private javax.swing.JComboBox<String> cbformacion;
    private javax.swing.JComboBox<String> cbnacionalidad;
    private javax.swing.JComboBox<String> cbpoliglota;
    private javax.swing.JComboBox<String> cbsexo;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncancelar;
    private javax.swing.JButton jbtnregistrarse;
    private com.toedter.calendar.JDateChooser jcanacimiento;
    private javax.swing.JLabel jlbapellido;
    private javax.swing.JLabel jlbbuscar4;
    private javax.swing.JLabel jlbcalle;
    private javax.swing.JLabel jlbcedula;
    private javax.swing.JLabel jlbcodigo;
    private javax.swing.JLabel jlbcomuna;
    private javax.swing.JLabel jlbcontras;
    private javax.swing.JLabel jlbcorreo;
    private javax.swing.JLabel jlblogo2;
    private javax.swing.JLabel jlbnacimiento;
    private javax.swing.JLabel jlbnombre;
    private javax.swing.JLabel jlbtelefono;
    private javax.swing.JTable jtableadministrador;
    private javax.swing.JButton jtbtnmodificar;
    private javax.swing.JTextField jtfapellido;
    private javax.swing.JTextField jtfbuscar4;
    private javax.swing.JTextField jtfcalle;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JTextField jtfcodigo;
    private javax.swing.JTextField jtfcomuna;
    private javax.swing.JPasswordField jtfcontras;
    private javax.swing.JTextField jtfcorreo;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JRadioButton rbtnactivo;
    private javax.swing.ButtonGroup rbtngrupo;
    private javax.swing.JRadioButton rdbtninactivo;
    // End of variables declaration//GEN-END:variables
}
