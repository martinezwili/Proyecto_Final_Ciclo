package Vista;

import Conexion.*;
import Modelo.*;
import java.awt.Image;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ADMcreardocente extends javax.swing.JFrame {
    
    SQLMetodos sqlm = new SQLMetodos();
    Validaciones vali = new Validaciones();
    private ImageIcon imagen;
    private Icon icono;
    
    public ADMcreardocente() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        todo();
        this.colocarImagen(this.jlbbuscadocentes, "src\\main\\java\\Imagenes\\buscar.png");
        this.colocarImagen(this.jlblogo2, "src\\main\\java\\Imagenes\\profesor.png");
    }    
    
    public void todo() throws SQLException{
        mosnacionalidad();
        mospoliglota();
        mossexo();
        mosformacion();
        mosrango();
        mosjornada();
        mosdocente();
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
    
    public void mosrango() throws SQLException{
        cbrango.removeAllItems();
        ResultSet rs = sqlm.mcbboxrango();
        while(rs.next()){
            cbrango.addItem(rs.getString(1));
        }
    }
    
    public void mosjornada() throws SQLException{
        cbjornada.removeAllItems();
        ResultSet rs = sqlm.mcbboxjornada();
        while(rs.next()){
            cbjornada.addItem(rs.getString(1));
        }
    }
    
    public void mosdocente() throws SQLException{
        //mostrar informacion de la tabla administrador
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "RANGO"});
        ResultSet rs = sqlm.mjtabledocente();
        while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("DOC_cedula"), rs.getString("per_nombre"), rs.getString("per_apellido"), rs.getString("ran_rango")});
        }
        jtabladocentes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jtfcalle = new javax.swing.JTextField();
        jtfcomuna = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfcodigo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        codCasalbl = new javax.swing.JLabel();
        callelbl = new javax.swing.JLabel();
        comunalbl = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabladocentes = new javax.swing.JTable();
        contenedor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbpoliglota = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbnacionalidad = new javax.swing.JComboBox<>();
        cbsexo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cbformacion = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbrango = new javax.swing.JComboBox<>();
        cbjornada = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        rbtnactivo = new javax.swing.JRadioButton();
        rdbtninactivo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jtfbuscardocente = new javax.swing.JTextField();
        jlbbuscadocentes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtncrear = new javax.swing.JButton();
        jbtnsalir = new javax.swing.JButton();
        jbtnmodificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlblogo2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jtfcontra = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcnacimiento = new com.toedter.calendar.JDateChooser();
        jtftelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cedulalbl = new javax.swing.JLabel();
        nombrelbl = new javax.swing.JLabel();
        jtfcedula = new javax.swing.JTextField();
        apellidolbl = new javax.swing.JLabel();
        telefonolbl = new javax.swing.JLabel();
        nacimientolbl = new javax.swing.JLabel();
        contraseñalbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("DIRECCION:");

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("CALLE:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("COMUNA:");

        jtfcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcodigoKeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("CODIGO DE LA CASA:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jtfcalle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcomuna))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codCasalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(callelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comunalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comunalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19))
                                    .addComponent(codCasalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addComponent(callelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));

        jtabladocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "RANGO"
            }
        ));
        jtabladocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabladocentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabladocentes);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        contenedor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("POLIGLOTA");

        cbpoliglota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NACIONALIDAD:");

        cbnacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("SEXO:");

        cbformacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("TIPO DE FORMACION:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("RANGO:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("JORNADA:");

        cbrango.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbjornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ESTADO:");

        rbtnactivo.setBackground(new java.awt.Color(204, 204, 204));
        btngrup.add(rbtnactivo);
        rbtnactivo.setText("Activo");

        rdbtninactivo.setBackground(new java.awt.Color(204, 204, 204));
        btngrup.add(rdbtninactivo);
        rdbtninactivo.setText("Inactivo");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(rbtnactivo)
                        .addGap(18, 18, 18)
                        .addComponent(rdbtninactivo))
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbformacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbsexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbpoliglota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbnacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbrango, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbjornada, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbrango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(7, 7, 7)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnactivo)
                    .addComponent(rdbtninactivo)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jtfbuscardocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfbuscardocenteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfbuscardocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbbuscadocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfbuscardocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbbuscadocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jbtncrear.setText("REGISTRAR");
        jbtncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncrearActionPerformed(evt);
            }
        });

        jbtnsalir.setText("SALIR");
        jbtnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsalirActionPerformed(evt);
            }
        });

        jbtnmodificar.setText("MODIFICAR");
        jbtnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnmodificar)
                .addGap(18, 18, 18)
                .addComponent(jbtnsalir)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtncrear)
                    .addComponent(jbtnmodificar)
                    .addComponent(jbtnsalir))
                .addGap(40, 40, 40))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRAR DOCENTE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jtfcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfcontraKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CONTRASEÑA:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("F.DE NACIMIENTO:");

        jcnacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcnacimientoKeyReleased(evt);
            }
        });

        jtftelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtftelefonoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TELEFONO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("APELLIDO:");

        jtfapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfapellidoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfnombreKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CEDULA:");

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
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcontra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jcnacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cedulalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nacimientolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cedulalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombrelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(apellidolbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(telefonolbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nacimientolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfcontra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñalbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(460, 460, 460)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(87, 105, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncrearActionPerformed
        try {
            //se pasa la fecha de nacimiento del formato date de jcalendar a string y de nuevo a date
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String nacimiento = f.format(jcnacimiento.getDate());
            //obtener codigos por medio de consulta sql de los combo box
            String rs1 = sqlm.obtenerpoliglota(cbpoliglota.getSelectedItem().toString()),rs2 = sqlm.obtenernacionalidad(cbnacionalidad.getSelectedItem().toString()), rs3 = sqlm.obtenersexo(cbsexo.getSelectedItem().toString()), rs4 = sqlm.obtenerformacion(cbformacion.getSelectedItem().toString()), rs5 = sqlm.obtenerrango(cbrango.getSelectedItem().toString()), rs6 = sqlm.obtenerjornada(cbjornada.getSelectedItem().toString());
            //instanciar direccion con datos
            Direccion dir = new Direccion(jtfcodigo.getText(), jtfcalle.getText(), jtfcomuna.getText());
            //instanciar relacion con datos
            Relacion rel = new Relacion(jtfcedula.getText(), jtfcodigo.getText(), rs3, rs2, rs1);
            //instanciar persona con datos
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontra.getText(), "ACTIVO", jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar docente con datos
            Docente doc = new Docente(jtfcedula.getText(), rs4, rs5, rs6, jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtfcontra.getText(), "ACTIVO") == true){    
                    //comprueba dirccion
                    if(dir.compb() == false){
                        //excepcion de comprobar persona
                        try {
                            //comprueba personas
                            if(per.comp() == false){
                                //insertar direccion
                                if(dir.insertar()){
                                    //insertar relacion
                                    if(rel.insertar()){
                                        //insertar persona
                                        if(per.insertar()){
                                            //insertar docente
                                            if(doc.insertar()){
                                                JOptionPane.showMessageDialog(rootPane, "Guardado exitosamente");  
                                                //excepcion llama metodo de limpiar y todo
                                                try {limpiar(); todo(); } catch (SQLException ex) { System.out.println("Error limpiar y mostrar docente");}
                                            //elimina datos ingresados por que hay un error
                                            }else { doc.eliminar(); per.eliminar(); rel.eliminar(); dir.eliminar(); JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                                        //elimina datos ingresados por que hay un error
                                        }else { per.eliminar(); rel.eliminar(); dir.eliminar(); JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                                    //elimina datos ingresados por que hay un error
                                    }else { rel.eliminar(); dir.eliminar(); JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                                //elimina datos ingresados por que hay un error
                                }else { dir.eliminar(); JOptionPane.showMessageDialog(rootPane, "No se guaro exitosamente"); }
                            //mensaje de cedula ya existente
                            }else { JOptionPane.showMessageDialog(rootPane, "Esta cedula ya esta registrado Verifique"); }
                        //mensaje de excepcion  de comprobar persona
                        } catch (SQLException ex) { System.out.println("Error comprobacion de persona"); } 
                    ////mensaje de codigo de casa ya existente
                    }else{ JOptionPane.showMessageDialog(rootPane, "Este codigo de la casa ya esta registrado Verifique"); }
                }
            // mensaje de comprobacion de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacios verifique"); }
        //mensaje de excepcion de comprobar direccion
        } catch (SQLException ex) { System.out.println("Error comprobasion de direccion"); }
    }//GEN-LAST:event_jbtncrearActionPerformed

    private void jtabladocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabladocentesMouseClicked
        // obtener datos de la tabla
        int filaa = jtabladocentes.getSelectedRow();
        String cedula = jtabladocentes.getValueAt(filaa, 0).toString();
        try { mostrarseleccionado(cedula); } catch (SQLException ex) { System.out.println("error selecion tabla mostrar datos"); }        
    }//GEN-LAST:event_jtabladocentesMouseClicked

    private void jbtnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmodificarActionPerformed
        try {                                              
            // TODO add your handling code here:
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String nacimiento = f.format(jcnacimiento.getDate());
            String estado = null;
            if(rbtnactivo.isSelected() == true){ estado = "ACTIVO"; } else if (rdbtninactivo.isSelected() == true){ estado = "INACTIVO"; }
            
            //se emvia datos por parametros a metodos en clase SQLMetodos
            String rs1 = sqlm.obtenerpoliglota(cbpoliglota.getSelectedItem().toString()),rs2 = sqlm.obtenernacionalidad(cbnacionalidad.getSelectedItem().toString()), rs3 = sqlm.obtenersexo(cbsexo.getSelectedItem().toString()), rs4 = sqlm.obtenerformacion(cbformacion.getSelectedItem().toString()), rs5 = sqlm.obtenerrango(cbrango.getSelectedItem().toString()), rs6 = sqlm.obtenerjornada(cbjornada.getSelectedItem().toString());
            //instanciar direccion
            Direccion dir = new Direccion(jtfcodigo.getText(), jtfcalle.getText(), jtfcomuna.getText());
            //instanciar relacion
            Relacion rel = new Relacion(jtfcedula.getText(), jtfcodigo.getText(), rs3, rs2, rs1);
            //instanciar persona
            Persona per = new Persona(jtfcedula.getText(), jtfnombre.getText(), jtfapellido.getText(), jtftelefono.getText(), jtfcontra.getText(), estado, jtfcedula.getText(), Date.valueOf(nacimiento));
            //instanciar docente
            Docente doc = new Docente(jtfcedula.getText(), rs4, rs5, rs6, jtfcedula.getText());
            //verificacion de campos vacios
            if(jtfapellido.getText().length() != 0 && jtfcalle.getText().length() != 0 && jtfcodigo.getText().length() != 0 && jtfcomuna.getText().length() != 0 && jtfcontra.getText().length() != 0 && jtfnombre.getText().length() != 0 && jtftelefono.getText().length() != 0 && nacimiento.length() != 0 && jtfcedula.getText().length() != 0){
                //verificar que se cumplan las validaciones
                if(cumplirvalidaciones(jtfcedula.getText(), jtfnombre.getText() ,jtfapellido.getText(), jtftelefono.getText(), jtfcontra.getText(), estado) == true){
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
                                            if(doc.actualizar()){
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
                        } catch (SQLException ex) { System.out.println("Error comprobar persona"); Logger.getLogger(ADMcreardocente.class.getName()).log(Level.SEVERE, null, ex); }
                    //mensaje de que el codigo de la direccion no esta registrada
                    } else { JOptionPane.showMessageDialog(rootPane, "Verifique el codigo de la casa"); }
                }
            // mensaje de comprobacion de campos vacios
            } else { JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacios verifique"); }
        //mensaje de error de comprobacion de codigo de direccion
        } catch (SQLException ex) { System.out.println("Error combropacion de codigo direccion"); Logger.getLogger(ADMcreardocente.class.getName()).log(Level.SEVERE, null, ex); }
    }//GEN-LAST:event_jbtnmodificarActionPerformed

    private void jtfbuscardocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfbuscardocenteKeyReleased
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRE", "APELLIDO", "RANGO"});
            ResultSet rs = sqlm.buscardocenteadm(jtfbuscardocente.getText());
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("doc_cedula"), rs.getString("per_nombre"), rs.getString("per_apellido"), rs.getString("ran_rango")});
            }
            jtabladocentes.setModel(modelo);
        } catch (SQLException ex) { System.out.println("error buscar docente"); }
    }//GEN-LAST:event_jtfbuscardocenteKeyReleased

    private void jtfcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcedulaKeyReleased
       if(vali.validarCedula(jtfcedula.getText())){ this.colocarImagen(this.Cedulalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.Cedulalbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfcedulaKeyReleased

    private void jtfnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombreKeyReleased
       if(vali.validaNombreoApellido(jtfnombre.getText())){ this.colocarImagen(this.nombrelbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.nombrelbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfnombreKeyReleased

    private void jtfapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfapellidoKeyReleased
        if(vali.validaNombreoApellido(jtfapellido.getText())){ this.colocarImagen(this.apellidolbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.apellidolbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtfapellidoKeyReleased

    private void jtftelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtftelefonoKeyReleased
        if(vali.ValidarTelefono(jtftelefono.getText())){ this.colocarImagen(this.telefonolbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.telefonolbl, "src\\main\\java\\Imagenes\\V2.png"); }        
    }//GEN-LAST:event_jtftelefonoKeyReleased

    private void jcnacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcnacimientoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcnacimientoKeyReleased

    private void jtfcontraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcontraKeyReleased
        if(vali.validaContraseña(jtfcontra.getText())){ this.colocarImagen(this.contraseñalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.contraseñalbl, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcontraKeyReleased

    private void jtfcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcodigoKeyReleased
        if(vali.validardijitos8(jtfcodigo.getText())){ this.colocarImagen(this.codCasalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.codCasalbl, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcodigoKeyReleased

    private void jtfcalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcalleKeyReleased
        if(vali.validardijitos50(jtfcalle.getText())){ this.colocarImagen(this.callelbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.callelbl, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcalleKeyReleased

    private void jtfcomunaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcomunaKeyReleased
        if(vali.validardijitos20(jtfcomuna.getText())){ this.colocarImagen(this.comunalbl, "src\\main\\java\\Imagenes\\V1.png"); }else{ this.colocarImagen(this.comunalbl, "src\\main\\java\\Imagenes\\V2.png"); }
    }//GEN-LAST:event_jtfcomunaKeyReleased

    private void jbtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsalirActionPerformed
        this.dispose(); ADMmenu madm = new ADMmenu(); madm.setVisible(true);
    }//GEN-LAST:event_jbtnsalirActionPerformed

    private void jtfcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfcedulaFocusLost
        try {
            mostrarseleccionado(jtfcedula.getText());
        } catch (SQLException ex) { System.out.println("error mostrar cedula repetida"); }
    }//GEN-LAST:event_jtfcedulaFocusLost

    public void mostrarseleccionado(String a) throws SQLException{
        cbpoliglota.setSelectedItem(sqlm.mpoliglota(a));
        cbnacionalidad.setSelectedItem(sqlm.mnacionalidad(a));
        cbsexo.setSelectedItem(sqlm.msexo(a));
        cbformacion.setSelectedItem(sqlm.mformacion(a));
        cbrango.setSelectedItem(sqlm.mrango(a));
        cbjornada.setSelectedItem(sqlm.mjornada(a));
        
        ResultSet rs = sqlm.mtablepersona(a); String est = null;
        while(rs.next()){
            jtfcedula.setText(rs.getString("per_cedula"));
            jtfnombre.setText(rs.getString("per_nombre"));
            jtfapellido.setText(rs.getString("per_apellido"));
            jtftelefono.setText(rs.getString("per_telefono"));
            jcnacimiento.setDate(rs.getDate("per_nacimiento"));
            jtfcontra.setText(rs.getString("per_contraseña"));
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
        jtfcontra.setText("");
        jtfnombre.setText("");
        jtftelefono.setText("");
        jcnacimiento.setDate(null);
        cbpoliglota.setSelectedItem("");
        cbnacionalidad.setSelectedItem("");
        cbsexo.setSelectedItem("");
        cbformacion.setSelectedItem("");
        cbrango.setSelectedItem("");
        cbjornada.setSelectedItem("");  
        rbtnactivo.setSelected(false);
        rdbtninactivo.setSelected(false);   
        todo();   
    }
    
    public boolean cumplirvalidaciones(String cedula, String nombre, String apellido, String telefono, String contra, String estado){
        String as = null;
        boolean ab = false;
        if(vali.validarCedula(cedula) == true){
            if(vali.ValidarTelefono(telefono) == true){
                if(vali.validaNombreoApellido(nombre) == true){
                    if(vali.validaNombreoApellido(apellido) == true){
                        if(vali.validaContraseña(contra) == true){
                            if(vali.validarestado(estado) == true){
                                if(vali.validardijitos8(jtfcodigo.getText()) == true){
                                    if(vali.validardijitos50(jtfcalle.getText()) == true){
                                        if(vali.validardijitos20(jtfcomuna.getText()) == true){ } else { as = "Verifique la comuna"; }
                                    } else { as = "Verifique la calle"; }
                                } else { as = "Verifique el codigo de la casa"; }
                            } else { as = "Verifique el estado"; }
                        } else { as = "Verifique la contraseña"; }
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
        if(tipo.equals("doc")){
            int r = JOptionPane.showConfirmDialog(rootPane, "esta cedula ya esta registrada desea ver");
            if(r == 0){
                mostrarseleccionado(cedula);
            }
        }else if(tipo.equals("alu")){
            int r1 = JOptionPane.showConfirmDialog(rootPane, "esta cedula ya esta registrada desea ver");
            if(r1 == 0){
                this.dispose(); ADMcrearalumno calu = new ADMcrearalumno(); calu.setVisible(true); calu.mostrarseleccionado(cedula); 
            }
        }else if (tipo.equals("adm")){
            int r2 = JOptionPane.showConfirmDialog(rootPane, "esta cedula ya esta registrada desea ver");
            if(r2 == 0){
                this.dispose(); ADMcrearadministrador cadm = new ADMcrearadministrador(); cadm.setVisible(true); cadm.mostrarseleccionado(cedula); 
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
    private javax.swing.JLabel Cedulalbl;
    private javax.swing.JLabel apellidolbl;
    private javax.swing.ButtonGroup btngrup;
    private javax.swing.JLabel callelbl;
    private javax.swing.JComboBox<String> cbformacion;
    private javax.swing.JComboBox<String> cbjornada;
    private javax.swing.JComboBox<String> cbnacionalidad;
    private javax.swing.JComboBox<String> cbpoliglota;
    private javax.swing.JComboBox<String> cbrango;
    private javax.swing.JComboBox<String> cbsexo;
    private javax.swing.JLabel codCasalbl;
    private javax.swing.JLabel comunalbl;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel contraseñalbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncrear;
    private javax.swing.JButton jbtnmodificar;
    private javax.swing.JButton jbtnsalir;
    private com.toedter.calendar.JDateChooser jcnacimiento;
    private javax.swing.JLabel jlbbuscadocentes;
    private javax.swing.JLabel jlblogo2;
    private javax.swing.JTable jtabladocentes;
    private javax.swing.JTextField jtfapellido;
    private javax.swing.JTextField jtfbuscardocente;
    private javax.swing.JTextField jtfcalle;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JTextField jtfcodigo;
    private javax.swing.JTextField jtfcomuna;
    private javax.swing.JPasswordField jtfcontra;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    private javax.swing.JLabel nacimientolbl;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JRadioButton rbtnactivo;
    private javax.swing.JRadioButton rdbtninactivo;
    private javax.swing.JLabel telefonolbl;
    // End of variables declaration//GEN-END:variables
}
