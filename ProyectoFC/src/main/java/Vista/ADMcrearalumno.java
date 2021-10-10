
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

public class ADMcrearalumno extends javax.swing.JFrame {
    
    SQLMetodos sqlm = new SQLMetodos();
    Validaciones vali = new Validaciones();
    private ImageIcon imagen;
    private Icon icono;
        
    public ADMcrearalumno() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
        this.colocarImagen(this.jlbbuscar, "src\\main\\java\\Imagenes\\buscar.png");
        this.colocarImagen(this.jlblogo2, "src\\main\\java\\Imagenes\\alumno.png");
    }
    
    public void todo() throws SQLException{
        mosjornada();
        mosnacionalidad();
        mospoliglota();
        mossexo();
        mcurso();
        mmodalidad();
        mosalumno();
        limpiar();
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
    
    public void mosjornada() throws SQLException{
        cbjornada.removeAllItems();
        ResultSet rs = sqlm.mcbboxjornada();
        while(rs.next()){
            cbjornada.addItem(rs.getString(1));
        }
    }
    
    public void mmodalidad() throws SQLException{
        cbmodalidad.removeAllItems();
        ResultSet rs = sqlm.mcbboxmodalidad();
        while(rs.next()){
            cbmodalidad.addItem(rs.getString(1));
        }
    }
    
    public void mcurso() throws SQLException{
        cbcurso.removeAllItems();
        ResultSet rs = sqlm.mcbboxCurso();
        while(rs.next()){
            cbcurso.addItem(rs.getString(1));
        }
    }
    
    public void mosalumno() throws SQLException{
        //mostrar informacion de la tabla administradorr
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "TELEFONO REPRESENTANTE", "CURSO", "MODALIDAD", "JORNADA"});
        ResultSet rs = sqlm.mjtableAlumno();
        while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("alu_cedula"), rs.getString("per_nombre"), rs.getString("per_apellido"), rs.getString("alu_telrepresentante"), rs.getString("cur_nombre"), rs.getString("mod_modalidad"), rs.getString("jor_jornada")});
        }
        jtablealumno.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablealumno = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnregistrarse = new javax.swing.JButton();
        jbtncancelar = new javax.swing.JButton();
        jtbtnmodificar = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbpoliglota = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbnacionalidad = new javax.swing.JComboBox<>();
        cbsexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbjornada = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbcurso = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbmodalidad = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        rbtnactivo = new javax.swing.JRadioButton();
        rdbtninactivo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jtfbuscar = new javax.swing.JTextField();
        jlbbuscar = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblogo2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtfcodigo = new javax.swing.JTextField();
        jtfcalle = new javax.swing.JTextField();
        jtfcomuna = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlbcodigo = new javax.swing.JLabel();
        jlbcalle = new javax.swing.JLabel();
        jlbcomuna = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfcontras = new javax.swing.JPasswordField();
        jtftelefonorepresentante = new javax.swing.JTextField();
        jcanacimiento = new com.toedter.calendar.JDateChooser();
        jtftelefono = new javax.swing.JTextField();
        jtfapellido = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        jtfcedula = new javax.swing.JTextField();
        jlbcedula = new javax.swing.JLabel();
        jlbnombre = new javax.swing.JLabel();
        jlbapellido = new javax.swing.JLabel();
        jlbtelefono = new javax.swing.JLabel();
        jlbnacimiento = new javax.swing.JLabel();
        jlbrtelefono = new javax.swing.JLabel();
        jlbcontras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(82, 82, 164));

        jPanel7.setBackground(new java.awt.Color(82, 82, 164));

        jtablealumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "TELEFONO REPRESENTANTE", "CURSO", "MODALIDAD", "JORNADA"
            }
        ));
        jtablealumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablealumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablealumno);

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

        jPanel3.setBackground(new java.awt.Color(82, 82, 164));

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
                .addContainerGap()
                .addComponent(jbtnregistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbtnmodificar)
                .addGap(18, 18, 18)
                .addComponent(jbtncancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        contenedor.setBackground(new java.awt.Color(82, 82, 164));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("POLIGLOTA");

        cbpoliglota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NACIONALIDAD:");

        cbnacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEXO:");

        cbjornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("JORNADA:");

        cbcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("CURSO:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("MODALIDAD:");

        cbmodalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("ESTADO:");

        rbtnactivo.setBackground(new java.awt.Color(82, 82, 164));
        btngrupo.add(rbtnactivo);
        rbtnactivo.setText("Activo");

        rdbtninactivo.setBackground(new java.awt.Color(82, 82, 164));
        btngrupo.add(rdbtninactivo);
        rdbtninactivo.setText("Inactivo");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbjornada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbsexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbpoliglota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbnacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, 0, 137, Short.MAX_VALUE)
                            .addComponent(cbmodalidad, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbcurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addContainerGap(62, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnactivo)
                        .addGap(18, 18, 18)
                        .addComponent(rdbtninactivo)))
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
                    .addComponent(cbjornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmodalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnactivo)
                    .addComponent(jLabel19)
                    .addComponent(rdbtninactivo)))
        );

        jPanel2.setBackground(new java.awt.Color(82, 82, 164));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRAR ALUMNO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(195, 195, 195))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(82, 82, 164));

        jtfbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jlbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfbuscar))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(82, 82, 164));

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

        jPanel8.setBackground(new java.awt.Color(82, 82, 164));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("DIRECCION:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("CODIGO DE LA CASA:");

        jtfcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcodigoKeyReleased(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jtfcalle)
                            .addComponent(jtfcomuna))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlbcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jtfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addComponent(jlbcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(82, 82, 164));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CEDULA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("APELLIDO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TELEFONO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("F.NACIMIENTO:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("TLF.REPRESENTANTE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CONTRASEÑA:");

        jtfcontras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcontrasKeyReleased(evt);
            }
        });

        jtftelefonorepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtftelefonorepresentanteKeyReleased(evt);
            }
        });

        jcanacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcanacimientoKeyReleased(evt);
            }
        });

        jtftelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtftelefonoKeyReleased(evt);
            }
        });

        jtfapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfapellidoKeyReleased(evt);
            }
        });

        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfnombreKeyReleased(evt);
            }
        });

        jtfcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfcedulaFocusLost(evt);
            }
        });
        jtfcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcedulaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcontras)
                            .addComponent(jtftelefonorepresentante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfcedula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfapellido)
                            .addComponent(jcanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbrtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbcontras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jtftelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jlbcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlbapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlbtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtftelefonorepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(jlbrtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfcontras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbcontras, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jtablealumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablealumnoMouseClicked
        // obtener datos de la tabla
        int filaa = jtablealumno.getSelectedRow();
        String cedula = jtablealumno.getValueAt(filaa, 0).toString();
        try { mostrarseleccionado(cedula); } catch (SQLException ex) { System.out.println("error selecion tabla mostrar datos"); }  

    }//GEN-LAST:event_jtablealumnoMouseClicked

    private void jbtnregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnregistrarseActionPerformed
        try {
            //se pasa la fecha de nacimiento del formato date de jcalendar a string y de nuevo a date
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String nacimiento = f.format(jcanacimiento.getDate());
            //se emvia datos por parametros a metodos en clase SQLMetodos
            String rs1 = sqlm.obtenerpoliglota(cbpoliglota.getSelectedItem().toString()), rs2 = sqlm.obtenernacionalidad(cbnacionalidad.getSelectedItem().toString()), rs3 = sqlm.obtenersexo(cbsexo.getSelectedItem().toString()), rs4 = sqlm.obtenerjornada(cbjornada.getSelectedItem().toString()); String rs5 = sqlm.obtenermodalidad(cbmodalidad.getSelectedItem().toString()); String rs6 = sqlm.obtenerCurso(cbcurso.getSelectedItem().toString());
            //instanciar clases direccion
            Direccion dir = new Direccion(jtfcodigo.getText(), jtfcalle.getText(), jtfcomuna.getText());
            //instanciar relacion
            Relacion rel = new Relacion(jtfcedula.getText(), jtfcodigo.getText(), rs3, rs2, rs1);
            // instanciar persona
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontras.getText(), "ACTIVO", jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar alumno
            Alumno al = new Alumno(jtfcedula.getText(), jtftelefonorepresentante.getText(), rs4, rs5, rs6, jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfcontras.getText().length() != 0 && jtftelefonorepresentante.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtftelefonorepresentante.getText(), jtfcontras.getText(), "ACTIVO") == true){
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
                                        if(al.insertar()){
                                            JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");
                                            //exepcion para limpiar y mostrar datos del alumno
                                            todo();
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

    private void jtbtnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtnmodificarActionPerformed
        try {
            // TODO add your handling code here:
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String nacimiento = f.format(jcanacimiento.getDate());
            
            String estado = null;
            if(rbtnactivo.isSelected() == true){ estado = "ACTIVO"; } else if (rdbtninactivo.isSelected() == true){ estado = "INACTIVO"; }
            
            //se emvia datos por parametros a metodos en clase SQLMetodos
            String rs1 = sqlm.obtenerpoliglota(cbpoliglota.getSelectedItem().toString()), rs2 = sqlm.obtenernacionalidad(cbnacionalidad.getSelectedItem().toString()), rs3 = sqlm.obtenersexo(cbsexo.getSelectedItem().toString()), rs4 = sqlm.obtenerjornada(cbjornada.getSelectedItem().toString()); String rs5 = sqlm.obtenermodalidad(cbmodalidad.getSelectedItem().toString()); String rs6 = sqlm.obtenerCurso(cbcurso.getSelectedItem().toString());
            //instanciar direccion
            Direccion dir = new Direccion(jtfcodigo.getText(), jtfcalle.getText(), jtfcomuna.getText());
            //instanciar relacion
            Relacion rel = new Relacion(jtfcedula.getText(), jtfcodigo.getText(), rs3, rs2, rs1);
            //instanciar persona
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontras.getText(), estado, jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar alumno
            Alumno al = new Alumno(jtfcedula.getText(), jtftelefonorepresentante.getText(), rs4, rs5, rs6, jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfcontras.getText().length() != 0 && jtftelefonorepresentante.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtftelefonorepresentante.getText(), jtfcontras.getText(), "ACTIVO") == true){
                    //comprobar direccion
                    if(dir.compb()){
                            //comprobar persona
                            if(per.comp()){
                                //actualizar direccion
                                if(dir.actualizar()){
                                    //actualizar relacion
                                    if(rel.actualizar()){
                                        //actualizar persona
                                        if(per.actualizar()){
                                            //actualizar alumno
                                            if(al.actualizar()){
                                                JOptionPane.showMessageDialog(rootPane, "Los datos se actualizaron correctamente");
                                                //llamar a los metodos impiar y todo
                                                todo();
                                                //mensaje de datos no actualizados crrectamente de alumno
                                            } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                                            //mensaje de datos no actualizados crrectamente de persona
                                        } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                                        //mensaje de datos no actualizados crrectamente de relacion
                                    } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                                    //mensaje de datos no actualizados crrectamente de direccion
                                } else { JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos correctamente intente nuevamente"); }
                                //mensaje de que la cedula no esta registrada
                            } else { JOptionPane.showMessageDialog(rootPane, "Verifique la cedula"); }
                        //mensaje de que el codigo de la direccion no esta registrada
                    } else { JOptionPane.showMessageDialog(rootPane, "Verifique el codigo de la casa"); }
                }
                // mensaje de comprobacion de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacios verifique"); }
            //mensaje de error de comprobacion de codigo de direccion
        } catch (SQLException ex) { System.out.println("Error combropacion de codigo direccion"); }

    }//GEN-LAST:event_jtbtnmodificarActionPerformed

    private void jtfbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfbuscarKeyReleased
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "TELEFONO REPRESENTANTE", "CURSO", "MODALIDAD", "JORNADA"});
            ResultSet rs = sqlm.buscaralumno(jtfbuscar.getText());
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("alu_cedula"), rs.getString("per_nombre"), rs.getString("per_apellido"), rs.getString("alu_telrepresentante"), rs.getString("cur_nombre"), rs.getString("mod_modalidad"), rs.getString("jor_jornada")});
            }
            jtablealumno.setModel(modelo);
        } catch (SQLException ex) { System.out.println("error buscar alumno"); }
    }//GEN-LAST:event_jtfbuscarKeyReleased

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

    private void jtftelefonorepresentanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtftelefonorepresentanteKeyReleased
        if(vali.ValidarTelefono(jtftelefonorepresentante.getText())){ this.colocarImagen(this.jlbrtelefono, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.jlbrtelefono, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtftelefonorepresentanteKeyReleased

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

    private void jtfcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcedulaFocusLost
        try {
            mostrarseleccionado(jtfcedula.getText());
        } catch (SQLException ex) { System.out.println("eror mostrar datos de cedula registrada"); }
    }//GEN-LAST:event_jtfcedulaFocusLost
    
    public void mostrarseleccionado(String a) throws SQLException{
        cbpoliglota.setSelectedItem(sqlm.mpoliglota(a));
        cbnacionalidad.setSelectedItem(sqlm.mnacionalidad(a));
        cbsexo.setSelectedItem(sqlm.msexo(a));
        cbjornada.setSelectedItem(sqlm.mjornadaalu(a));
        cbmodalidad.setSelectedItem(sqlm.mmodalidad(a));
        cbcurso.setSelectedItem(sqlm.mcursoalu(a));
        
        jtftelefonorepresentante.setText(sqlm.mtelefonorepresentante(a));
        
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
        jtfcedula.setText("");
        jtfcalle.setText("");
        jtfcodigo.setText("");
        jtfcomuna.setText("");
        jtfcontras.setText("");
        jtfnombre.setText("");
        jtftelefono.setText("");
        jcanacimiento.setDate(null);
        jtftelefonorepresentante.setText("");
        cbpoliglota.setSelectedItem("");
        cbnacionalidad.setSelectedItem("");
        cbsexo.setSelectedItem("");
        cbmodalidad.setSelectedItem("");
        cbcurso.setSelectedItem("");
        cbjornada.setSelectedItem("");  
        rbtnactivo.setSelected(false);
        rdbtninactivo.setSelected(false); 
    }
    
    public boolean cumplirvalidaciones(String cedula, String nombre, String apellido, String telefono, String rtelefono, String contra, String estado){
        String as = null;
        boolean ab = false;
        if(vali.validarCedula(cedula) == true){
            if(vali.ValidarTelefono(telefono) == true){
                if(vali.validaNombreoApellido(nombre) == true){
                    if(vali.validaNombreoApellido(apellido) == true){
                        if(vali.ValidarTelefono(rtelefono) == true){
                            if(vali.validaContraseña(contra) == true){
                                if(vali.validarestado(estado) == true){
                                    if(vali.validardijitos8(jtfcodigo.getText()) == true){
                                        if(vali.validardijitos50(jtfcalle.getText()) == true){
                                            if(vali.validardijitos20(jtfcomuna.getText()) == true){ } else { as = "Verifique la comuna"; }
                                        } else { as = "Verifique la calle"; }
                                    } else { as = "Verifique el codigo de la casa"; }
                                } else { as = "Verifique el estado"; }
                            } else { as = "Verifique la contraseña"; }
                        } else { as = "Verifique el el telefono del representante "; }
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
    
    public void cedulaingresada(String cedula) throws SQLException{
        String tipo = sqlm.ADMcomcedula(cedula);
        if(tipo.equals("alu")){
            int r = JOptionPane.showConfirmDialog(rootPane, "esta cedula ya esta registrada desea ver");
            if(r == 0){
                mostrarseleccionado(cedula);
            }
        }else if(tipo.equals("adm")){
            int r1 = JOptionPane.showConfirmDialog(rootPane, "esta cedula ya esta registrada desea ver");
            if(r1 == 0){
                this.dispose(); ADMcrearadministrador cadm = new ADMcrearadministrador(); cadm.setVisible(true); cadm.mostrarseleccionado(cedula); 
            }
        }else if (tipo.equals("doc")){
            int r2 = JOptionPane.showConfirmDialog(rootPane, "esta cedula ya esta registrada desea ver");
            if(r2 == 0){
                this.dispose(); ADMcreardocente cdoc = new ADMcreardocente(); cdoc.setVisible(true); cdoc.mostrarseleccionado(cedula); 
            }
        }
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
    private javax.swing.ButtonGroup btngrupo;
    private javax.swing.JComboBox<String> cbcurso;
    private javax.swing.JComboBox<String> cbjornada;
    private javax.swing.JComboBox<String> cbmodalidad;
    private javax.swing.JComboBox<String> cbnacionalidad;
    private javax.swing.JComboBox<String> cbpoliglota;
    private javax.swing.JComboBox<String> cbsexo;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncancelar;
    private javax.swing.JButton jbtnregistrarse;
    private com.toedter.calendar.JDateChooser jcanacimiento;
    private javax.swing.JLabel jlbapellido;
    private javax.swing.JLabel jlbbuscar;
    private javax.swing.JLabel jlbcalle;
    private javax.swing.JLabel jlbcedula;
    private javax.swing.JLabel jlbcodigo;
    private javax.swing.JLabel jlbcomuna;
    private javax.swing.JLabel jlbcontras;
    private javax.swing.JLabel jlblogo2;
    private javax.swing.JLabel jlbnacimiento;
    private javax.swing.JLabel jlbnombre;
    private javax.swing.JLabel jlbrtelefono;
    private javax.swing.JLabel jlbtelefono;
    private javax.swing.JTable jtablealumno;
    private javax.swing.JButton jtbtnmodificar;
    private javax.swing.JTextField jtfapellido;
    private javax.swing.JTextField jtfbuscar;
    private javax.swing.JTextField jtfcalle;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JTextField jtfcodigo;
    private javax.swing.JTextField jtfcomuna;
    private javax.swing.JPasswordField jtfcontras;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    private javax.swing.JTextField jtftelefonorepresentante;
    private javax.swing.JRadioButton rbtnactivo;
    private javax.swing.JRadioButton rdbtninactivo;
    // End of variables declaration//GEN-END:variables
}
