/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea2;
import java.awt.Component;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 * @author dodsiño Quiero un cesarito locoooooo
 * @author juan o(*￣▽￣*)o "es poco, pero es trabajo honesto"
 * @author pablo
 */
public class JFrameForm extends javax.swing.JFrame {    
    private HashMap<String, String> mapaPaises = new HashMap<>();
    private boolean calculoRealizado = false;
    DefaultTableModel model;
    DefaultTableModel model2;
    /**
     * Creates new form JFrameForm
     */
    public JFrameForm() {
        initComponents();

        // Configura el título de la ventana
        setTitle("Tarea 2");

        // Configura el estado de maximización
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Ingresar aqui otros ajustes y configuraciones de la ventana

        // Cierra la aplicación cuando se cierra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializa el mapa de paises
        mapaPaises.put("Antigua y Barbuda", "/imagenes/antigua_y_barbuda.png");
        mapaPaises.put("Argentina", "/imagenes/argentina.png");
        mapaPaises.put("Aruba", "/imagenes/aruba.png");
        mapaPaises.put("Bahamas", "/imagenes/bahamas.png");
        mapaPaises.put("Barbados", "/imagenes/barbados.png");
        mapaPaises.put("Belice", "/imagenes/belice.png");
        mapaPaises.put("Bermudas", "/imagenes/bermudas.png");
        mapaPaises.put("Bolivia", "/imagenes/bolivia.png");
        mapaPaises.put("Brasil", "/imagenes/brasil.png");
        mapaPaises.put("Canadá", "/imagenes/canada.png");
        mapaPaises.put("Chile", "/imagenes/chile.png");
        mapaPaises.put("Colombia", "/imagenes/colombia.png");
        mapaPaises.put("Costa Rica", "/imagenes/costa_rica.png");
        mapaPaises.put("Cuba", "/imagenes/cuba.png");
        mapaPaises.put("Dominica", "/imagenes/dominica.png");
        mapaPaises.put("Ecuador", "/imagenes/ecuador.png");
        mapaPaises.put("El Salvador", "/imagenes/el_salvador.png");
        mapaPaises.put("Estados Unidos", "/imagenes/estados_unidos.png");
        mapaPaises.put("Granada", "/imagenes/granada.png");
        mapaPaises.put("Guatemala", "/imagenes/guatemala.png");
        mapaPaises.put("Guyana", "/imagenes/guyana.png");
        mapaPaises.put("Haití", "/imagenes/haiti.png");
        mapaPaises.put("Honduras", "/imagenes/honduras.png");
        mapaPaises.put("Islas Caimán", "/imagenes/islas_caiman.png");
        mapaPaises.put("Islas Vírgenes Británicas", "/imagenes/islas_virgenes_britanicas.png");
        mapaPaises.put("Islas Vírgenes de los Estados Unidos", "/imagenes/islas_virgenes_estados_unidos.png");
        mapaPaises.put("Jamaica", "/imagenes/jamaica.png");
        mapaPaises.put("México", "/imagenes/mexico.png");
        mapaPaises.put("Nicaragua", "/imagenes/nicaragua.png");
        mapaPaises.put("Panamá", "/imagenes/panama.png");
        mapaPaises.put("Paraguay", "/imagenes/paraguay.png");
        mapaPaises.put("Perú", "/imagenes/peru.png");
        mapaPaises.put("Puerto Rico", "/imagenes/puerto_rico.png");
        mapaPaises.put("República Dominicana", "/imagenes/republica_dominicana.png");
        mapaPaises.put("San Cristóbal y Nieves", "/imagenes/san_cristobal_y_nieves.png");
        mapaPaises.put("San Vicente y las Granadinas", "/imagenes/san_vicente_y_las_granadinas.png");
        mapaPaises.put("Santa Lucía", "/imagenes/santa_lucia.png");
        mapaPaises.put("Surinam", "/imagenes/surinam.png");
        mapaPaises.put("Trinidad y Tobago", "/imagenes/trinidad_y_tobago.png");
        mapaPaises.put("Uruguay", "/imagenes/uruguay.png");
        mapaPaises.put("Venezuela", "/imagenes/venezuela.png");
        
        // Inicializar la tabla
        model = new DefaultTableModel();
        model.addColumn("Paises");
        model.addColumn("Oro");
        model.addColumn("Plata");
        model.addColumn("Bronce");
        model.addColumn("Medallas totales");
        model.addColumn("Bandera");

        model2 = new DefaultTableModel();
        model2.addColumn("Nombre");
        model2.addColumn("Pais");
        model2.addColumn("Nota1");
        model2.addColumn("Nota2");
        model2.addColumn("Nota3");
        model2.addColumn("Nota4");
        model2.addColumn("Nota5");
        model2.addColumn("Nota6");
        model2.addColumn("Nota7");
        model2.addColumn("Nota8");
        model2.addColumn("Factor");
        model2.addColumn("Nota");
        
        Medallero.setModel(model);
        NotasNata.setModel(model2);
        
        Medallero.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());

        // Esto permite que la tabla sea de solo lectura en el UI
        Medallero.setDefaultEditor(Object.class, null);
        NatacionAgregar.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CajaOro = new javax.swing.JTextField();
        CajaPlata = new javax.swing.JTextField();
        CajaBronce = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Medallero = new javax.swing.JTable();
        Bandera = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        terminarJuegos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        primerLugar = new javax.swing.JLabel();
        segundoLugar = new javax.swing.JLabel();
        tercerLugar = new javax.swing.JLabel();
        banderaPrimerLugar = new javax.swing.JLabel();
        banderaSegundoLugar = new javax.swing.JLabel();
        banderaTercerLugar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NombreNata = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Factor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Nota1 = new javax.swing.JTextField();
        Nota2 = new javax.swing.JTextField();
        Nota3 = new javax.swing.JTextField();
        Nota4 = new javax.swing.JTextField();
        Nota5 = new javax.swing.JTextField();
        Nota6 = new javax.swing.JTextField();
        Nota7 = new javax.swing.JTextField();
        Nota8 = new javax.swing.JTextField();
        NatacionAgregar = new javax.swing.JButton();
        BotonCalcular = new javax.swing.JButton();
        AquiResultado = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NotasNata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("País:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antigua y Barbuda", "Argentina", "Aruba", "Bahamas", "Barbados", "Belice", "Bermudas", "Bolivia", "Brasil", "Canadá", "Chile", "Colombia", "Costa Rica", "Cuba", "Dominica", "Ecuador", "El Salvador", "Estados Unidos", "Granada", "Guatemala", "Guyana", "Haití", "Honduras", "Islas Caimán", "Islas Vírgenes Británicas", "Islas Vírgenes de los Estados Unidos", "Jamaica", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "Puerto Rico", "República Dominicana", "San Cristóbal y Nieves", "San Vicente y las Granadinas", "Santa Lucía", "Surinam", "Trinidad y Tobago", "Uruguay", "Venezuela" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Medallas");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Plata");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Oro");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Bronce");

        CajaOro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CajaOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaOroActionPerformed(evt);
            }
        });

        CajaPlata.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CajaPlata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaPlataActionPerformed(evt);
            }
        });

        CajaBronce.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CajaBronce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaBronceActionPerformed(evt);
            }
        });

        BotonAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonAgregar.setText("Agregar");
        BotonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarMouseClicked(evt);
            }
        });

        BotonModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.setToolTipText("");
        BotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonModificarMouseClicked(evt);
            }
        });
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        Medallero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Oro", "Plata", "Bronce", "Medallas totales", "Bandera"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Medallero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedalleroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Medallero);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        Bandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/antigua_y_barbuda.png"))); // NOI18N
        Bandera.setMaximumSize(new java.awt.Dimension(230, 175));
        Bandera.setMinimumSize(new java.awt.Dimension(230, 175));
        Bandera.setPreferredSize(new java.awt.Dimension(230, 175));

        try {
            // Carga la imagen utilizando ImageIO
            java.awt.Image imagenOriginal = ImageIO.read(getClass().getResource("/imagenes/antigua_y_barbuda.png"));

            // Escala la imagen al tamaño de la etiqueta
            int anchoEtiqueta = 211;
            int altoEtiqueta = 121;
            Image imagenEscalada = imagenOriginal.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_SMOOTH);

            // Crea un ImageIcon con la imagen escalada
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

            Bandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            Bandera.setMaximumSize(new java.awt.Dimension(230, 175));
            Bandera.setMinimumSize(new java.awt.Dimension(230, 175));
            Bandera.setPreferredSize(new java.awt.Dimension(230, 175));
            Bandera.setIcon(iconoEscalado); // NOI18N

        } catch (IOException e) {
            e.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(Bandera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(BotonAgregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaOro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CajaPlata, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaBronce, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonModificar)
                                .addGap(32, 32, 32)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CajaOro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CajaBronce, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CajaPlata, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAgregar)
                            .addComponent(BotonModificar)))
                    .addComponent(Bandera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Posiciones", jPanel1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Juegos panamericanos 2023");

        terminarJuegos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        terminarJuegos.setText("Terminar juegos");
        terminarJuegos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        terminarJuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminarJuegosMouseClicked(evt);
            }
        });
        terminarJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarJuegosActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2. ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1. ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("3. ");

        primerLugar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        primerLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        primerLugar.setText("...");

        segundoLugar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        segundoLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segundoLugar.setText("...");

        tercerLugar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tercerLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tercerLugar.setText("...");

        banderaPrimerLugar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        banderaPrimerLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banderaPrimerLugar.setText("...");

        banderaSegundoLugar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        banderaSegundoLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banderaSegundoLugar.setText("...");

        banderaTercerLugar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        banderaTercerLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banderaTercerLugar.setText("...");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(terminarJuegos))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(primerLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(segundoLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tercerLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(banderaPrimerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(banderaSegundoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(banderaTercerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(terminarJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banderaPrimerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banderaSegundoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tercerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banderaTercerLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(471, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Final", jPanel3);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        NombreNata.setText(" ");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("País");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText("Factor");

        Factor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactorActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setText("Nota 1");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("Nota 2");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("Nota 3");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setText("Nota 4");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("Nota 5");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setText("Nota 6");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel22.setText("Nota 7");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("Nota 8");

        NatacionAgregar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        NatacionAgregar.setText("Agregar");
        NatacionAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NatacionAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NatacionAgregarMouseClicked(evt);
            }
        });
        NatacionAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NatacionAgregarActionPerformed(evt);
            }
        });

        BotonCalcular.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonCalcular.setText("Calcular");
        BotonCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCalcularMouseClicked(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antigua y Barbuda", "Argentina", "Aruba", "Bahamas", "Barbados", "Belice", "Bermudas", "Bolivia", "Brasil", "Canadá", "Chile", "Colombia", "Costa Rica", "Cuba", "Dominica", "Ecuador", "El Salvador", "Estados Unidos", "Granada", "Guatemala", "Guyana", "Haití", "Honduras", "Islas Caimán", "Islas Vírgenes Británicas", "Islas Vírgenes de los Estados Unidos", "Jamaica", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "Puerto Rico", "República Dominicana", "San Cristóbal y Nieves", "San Vicente y las Granadinas", "Santa Lucía", "Surinam", "Trinidad y Tobago", "Uruguay", "Venezuela" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(NatacionAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Factor)
                                    .addGap(95, 95, 95)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreNata, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nota2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Nota3)
                                        .addComponent(Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Nota1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Nota6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                            .addComponent(Nota5)
                                            .addComponent(Nota7)
                                            .addComponent(Nota8)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AquiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(205, Short.MAX_VALUE))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(NombreNata, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Factor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(582, 582, 582))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Nota5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NatacionAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AquiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(268, 268, 268))))
        );

        NotasNata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "País", "Nota1", "Nota 2", "Nota 3", "Nota 4", "Nota 5", "Nota 6", "Nota 7", "Nota 8", "Factor", "NOTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(NotasNata);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Natación", jPanel2);

        getContentPane().add(jTabbedPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void agregarFilaTabla(String pais, int oro, int plata, int bronce, int medallasTotales, Icon bandera)
    {
        model.addRow(new Object[]{pais, oro, plata, bronce, medallasTotales, bandera});
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Add your handling code here:
        try 
        {
            String paisSeleccionado = jComboBox1.getSelectedItem().toString();
            String rutaImagen = mapaPaises.get(paisSeleccionado);
            
            // Carga la imagen utilizando ImageIO
            java.awt.Image imagenOriginal = ImageIO.read(getClass().getResource(rutaImagen));
        
            // Escala la imagen al tamaño de la etiqueta
            int anchoEtiqueta = 211;
            int altoEtiqueta = 121;
            Image imagenEscalada = imagenOriginal.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_SMOOTH);
        
            // Crea un ImageIcon con la imagen escalada
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        
            Bandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            Bandera.setMaximumSize(new java.awt.Dimension(230, 175));
            Bandera.setMinimumSize(new java.awt.Dimension(230, 175));
            Bandera.setPreferredSize(new java.awt.Dimension(230, 175));
            Bandera.setIcon(iconoEscalado); // NOI18N
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CajaOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaOroActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_CajaOroActionPerformed

    private void CajaPlataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaPlataActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_CajaPlataActionPerformed

    private void CajaBronceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaBronceActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_CajaBronceActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // add your handling code here:
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void terminarJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarJuegosActionPerformed
        // add your handling code here:
    }//GEN-LAST:event_terminarJuegosActionPerformed

    private void BotonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarMouseClicked
        String pais = jComboBox1.getSelectedItem().toString();
        
        boolean posibleAgregar = true;
        int oro = 0, plata = 0, bronce = 0;
        
        try
        {
            String tOro = CajaOro.getText();
            String tPlata = CajaPlata.getText();
            String tBronce = CajaBronce.getText();
            
            oro = Integer.parseInt(tOro);
            plata = Integer.parseInt(tPlata);
            bronce = Integer.parseInt(tBronce);

        } catch (NumberFormatException e){
            posibleAgregar = false;
            String mensajeError = "Error: Ingresa números válidos de medallas.";
            JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        ImageIcon bandera = (ImageIcon) Bandera.getIcon();
        
        // Escalar la imagen antes de agregarla a la tabla
        int ancho = 30;  // Establecer el ancho deseado
        int alto = 30;   // Establecer el alto deseado
        ImageIcon banderaEscalada = escalarImagen(bandera, ancho, alto);
        int medallasTotales = oro + plata + bronce;
        
        if (posibleAgregar){
            if (existePaisEnTabla(pais)) {
                JOptionPane.showMessageDialog(this, "El país ya existe en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if(oro >= 0 && plata >= 0 && bronce >= 0){
                    agregarFilaTabla(pais, oro, plata, bronce, medallasTotales, banderaEscalada);
                    Conexion con = new Conexion();
                    con.conectar();
                    con.agregarBD(pais, oro, plata, bronce, medallasTotales);

                    con.verificarPais(pais);
                }
                else{JOptionPane.showMessageDialog(this, "Verifique los numeros", "Error", JOptionPane.ERROR_MESSAGE);}
            }
        }

        DefaultTableModel modelo = (DefaultTableModel) Medallero.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        Medallero.setRowSorter(sorter);

        int columnaMedallasOro = 1; // La columna de medallas de oro es la segunda columna (0-indexed).
        sorter.setComparator(columnaMedallasOro, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Ordenar de mayor a menor
                return o2.compareTo(o1);
            }
        });

        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(columnaMedallasOro, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();

    }//GEN-LAST:event_BotonAgregarMouseClicked

    private class ImageRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof Icon) {
                setIcon((Icon) value);
                setText("");
            } else {
                setIcon(null);
                setText("N/A");
            }
            return this;
        }
    }
    
    private ImageIcon escalarImagen(ImageIcon imagenIcono, int ancho, int alto) {
        Image imagenOriginal = imagenIcono.getImage();
        Image imagenEscalada = imagenOriginal.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imagenEscalada);
    }

    private boolean existePaisEnTabla(String nuevoPais) {
        int columnaPais = 0;  // Índice de la columna "Pais"

        for (int fila = 0; fila < model.getRowCount(); fila++) {
            Object valorEnCelda = model.getValueAt(fila, columnaPais);

            // Comparar el valor de la celda con el nuevo país
            if (valorEnCelda != null && valorEnCelda.toString().equals(nuevoPais)) {
                return true;  // El país ya existe en la tabla
            }
        }

        return false;  // El país no existe en la tabla
    }
    private boolean existePaisEnTabla2(String nuevoPais) {
        int columnaPais = 1;  // Índice de la columna "Pais"

        for (int fila = 0; fila < model2.getRowCount(); fila++) {
            Object valorEnCelda = model2.getValueAt(fila, columnaPais);

            // Comparar el valor de la celda con el nuevo país
            if (valorEnCelda != null && valorEnCelda.toString().equals(nuevoPais)) {
                return true;  // El país ya existe en la tabla
            }
        }

        return false;  // El país no existe en la tabla
    }

    private void FactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactorActionPerformed
        // add your handling code here:
    }//GEN-LAST:event_FactorActionPerformed

    private void NatacionAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NatacionAgregarActionPerformed
        // add your handling code here:
    }//GEN-LAST:event_NatacionAgregarActionPerformed

    private void BotonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseClicked

        String pais = jComboBox1.getSelectedItem().toString();
        Conexion con = new Conexion();
        con.conectar();

        int oro = 0, plata = 0, bronce = 0;
        
        try
        {
            String tOro = CajaOro.getText();
            String tPlata = CajaPlata.getText();
            String tBronce = CajaBronce.getText();
            
            oro = Integer.parseInt(tOro);
            plata = Integer.parseInt(tPlata);
            bronce = Integer.parseInt(tBronce);

            int medallasTotales = oro + plata + bronce;
            int filaSeleccionada = Medallero.getSelectedRow();
            if (oro >= 0 && plata >= 0 && bronce >= 0){
                con.modificarBD(pais, oro, plata, bronce, medallasTotales);
                if (filaSeleccionada >= 0) {
                    // Actualizar los valores de la fila seleccionada con el nuevo dato
                    Medallero.setValueAt(oro, filaSeleccionada, 1);
                    Medallero.setValueAt(plata, filaSeleccionada, 2);
                    Medallero.setValueAt(bronce, filaSeleccionada, 3);
                } else {
                    // Manejar la situación cuando no hay una fila seleccionada
                    JOptionPane.showMessageDialog(JFrameForm.this, "Seleccione una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{JOptionPane.showMessageDialog(JFrameForm.this, "Verifique los numeros", "Error", JOptionPane.ERROR_MESSAGE);}

        } catch (NumberFormatException e){
            String mensajeError = "Error: Ingresa números válidos de medallas.";
            JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BotonModificarMouseClicked

    private void BotonCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCalcularMouseClicked
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, 
                nota5 = 0, nota6 = 0, nota7 = 0, nota8 = 0, resultado = 0 , factor = 0;
        double[] notas = null;
        String tnota1 = Nota1.getText();
        String tnota2 = Nota2.getText();
        String tnota3 = Nota3.getText();
        String tnota4 = Nota4.getText();
        String tnota5 = Nota5.getText();
        String tnota6 = Nota6.getText();
        String tnota7 = Nota7.getText();
        String tnota8 = Nota8.getText();
        String tfactor = Factor.getText();
        
        try{
            nota1 = Float.parseFloat(tnota1);
            nota2 = Float.parseFloat(tnota2);
            nota3 = Float.parseFloat(tnota3);
            nota4 = Float.parseFloat(tnota4);
            nota5 = Float.parseFloat(tnota5);
            nota6 = Float.parseFloat(tnota6);
            nota7 = Float.parseFloat(tnota7);
            nota8 = Float.parseFloat(tnota8);
            factor = Float.parseFloat(tfactor);
            notas = new double[]{nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8};
        }catch(NumberFormatException e){
            String mensajeError = "Error: Ingresa notas válidas.";
            JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }
        Arrays.sort(notas);
        double[] notasFiltradas = Arrays.copyOfRange(notas, 2, notas.length - 2);
        for (double nota : notasFiltradas) {
                resultado += nota;
            }
        resultado = resultado * factor;
        AquiResultado.setText(String.valueOf(resultado));
        NatacionAgregar.setEnabled(true);
    }//GEN-LAST:event_BotonCalcularMouseClicked

    private void MedalleroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedalleroMouseClicked
        int fila=Medallero.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null, "Usuario No seleccionado");            
        }else{
            String pais = (String)Medallero.getValueAt(fila,0);
            int oro = Integer.parseInt((String)Medallero.getValueAt(fila,1).toString());
            int plata = Integer.parseInt((String)Medallero.getValueAt(fila,2).toString());
            int bronce = Integer.parseInt((String)Medallero.getValueAt(fila,3).toString());
            String rutaImagen = mapaPaises.get(pais);
            
            try{
                java.awt.Image imagenOriginal = ImageIO.read(getClass().getResource(rutaImagen));
        
                // Escala la imagen al tamaño de la etiqueta
                int anchoEtiqueta = 211;
                int altoEtiqueta = 121;
                Image imagenEscalada = imagenOriginal.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_SMOOTH);

                // Crea un ImageIcon con la imagen escalada
                ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

                Bandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                Bandera.setMaximumSize(new java.awt.Dimension(230, 175));
                Bandera.setMinimumSize(new java.awt.Dimension(230, 175));
                Bandera.setPreferredSize(new java.awt.Dimension(230, 175));
                Bandera.setIcon(iconoEscalado); // NOI18N
            }catch (IOException e){
                e.printStackTrace();
            }
            
            CajaOro.setText(""+oro);
            CajaPlata.setText(""+plata);
            CajaBronce.setText(""+bronce);
            jComboBox1.setSelectedItem(pais);
        }
    }//GEN-LAST:event_MedalleroMouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void terminarJuegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminarJuegosMouseClicked
        // add your handling code here:
        // Obtener el RowSorter asociado a la tabla
        TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) Medallero.getRowSorter();

        // Obtener las claves de orden actual
        List<? extends RowSorter.SortKey> sortKeys = sorter.getSortKeys();

        // Supongamos que la primera clave de orden corresponde a las medallas de oro
        RowSorter.SortKey primeraClaveOrden = sortKeys.get(0);

        // Obtener el índice de la columna ordenada
        int indiceColumnaOrdenada = primeraClaveOrden.getColumn();

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) Medallero.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) NotasNata.getModel();

        String pais1 = "", pais2 = "", pais3 = "";

        // Obtener las primeras 3 filas ordenadas
        int numeroFilas = 3;
        List<Integer> filasOrdenadas = new ArrayList<>();
        for (int i = 0; i < numeroFilas && i < modelo.getRowCount(); i++) {
            int indiceFila = Medallero.convertRowIndexToModel(i);
            filasOrdenadas.add(indiceFila);
        }

        // Obtener los datos de las filas ordenadas
        for (int i = 0; i < filasOrdenadas.size(); i++) {
            int fila = filasOrdenadas.get(i);
            Object pais = modelo.getValueAt(fila, 0); // Suponiendo que la columna 0 contiene el país
            Object medallasOro = modelo.getValueAt(fila, 1); // Suponiendo que la columna 1 contiene las medallas de oro

            if(i == 0)
            {
                pais1 = pais.toString();
                primerLugar.setText(pais.toString());
            }
            else if(i == 1)
            {
                pais2 = pais.toString();
                segundoLugar.setText(pais.toString());
            }
            else if(i == 2)
            {
                pais3 = pais.toString();
                tercerLugar.setText(pais.toString());
            }
        }

            // Primero se elimina el texto
            banderaPrimerLugar.setText("");
            banderaSegundoLugar.setText("");
            banderaTercerLugar.setText("");

            // Luego se agrega la imagen
            try
            {
                String textoPais1 = pais1;
                String textoPais2 = pais2;
                String textoPais3 = pais3;
                System.out.println(pais1 + " " + pais2 + " " + pais3);
                String rutaImagen1 = mapaPaises.get(textoPais1);
                String rutaImagen2 = mapaPaises.get(textoPais2);
                String rutaImagen3 = mapaPaises.get(textoPais3);
                System.out.println(rutaImagen1 + " " + rutaImagen2 + " " + rutaImagen3);
                
                // Carga la imagen utilizando ImageIO
                java.awt.Image imagenOriginal1 = ImageIO.read(getClass().getResource(rutaImagen1));
                java.awt.Image imagenOriginal2 = ImageIO.read(getClass().getResource(rutaImagen2));
                java.awt.Image imagenOriginal3 = ImageIO.read(getClass().getResource(rutaImagen3));
            
                // Escala la imagen al tamaño de la etiqueta
                int anchoEtiqueta = 211;
                int altoEtiqueta = 121;
                Image imagenEscalada1 = imagenOriginal1.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_SMOOTH);
                Image imagenEscalada2 = imagenOriginal2.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_SMOOTH);
                Image imagenEscalada3 = imagenOriginal3.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_SMOOTH);
            
                // Crea un ImageIcon con la imagen escalada
                ImageIcon iconoEscalado1 = new ImageIcon(imagenEscalada1);
                ImageIcon iconoEscalado2 = new ImageIcon(imagenEscalada2);
                ImageIcon iconoEscalado3 = new ImageIcon(imagenEscalada3);
            
                banderaPrimerLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                banderaPrimerLugar.setMaximumSize(new java.awt.Dimension(230, 175));
                banderaPrimerLugar.setMinimumSize(new java.awt.Dimension(230, 175));
                banderaPrimerLugar.setPreferredSize(new java.awt.Dimension(230, 175));
                banderaPrimerLugar.setIcon(iconoEscalado1);

                banderaSegundoLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                banderaSegundoLugar.setMaximumSize(new java.awt.Dimension(230, 175));
                banderaSegundoLugar.setMinimumSize(new java.awt.Dimension(230, 175));
                banderaSegundoLugar.setPreferredSize(new java.awt.Dimension(230, 175));
                banderaSegundoLugar.setIcon(iconoEscalado2);

                banderaTercerLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                banderaTercerLugar.setMaximumSize(new java.awt.Dimension(230, 175));
                banderaTercerLugar.setMinimumSize(new java.awt.Dimension(230, 175));
                banderaTercerLugar.setPreferredSize(new java.awt.Dimension(230, 175));
                banderaTercerLugar.setIcon(iconoEscalado3);

            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        

    }//GEN-LAST:event_terminarJuegosMouseClicked

    private void NatacionAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NatacionAgregarMouseClicked
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, 
                nota5 = 0, nota6 = 0, nota7 = 0, nota8 = 0, nota = 0 , factor = 0;
        
        boolean posibleAgregar = true;
        
        String pais = jComboBox2.getSelectedItem().toString();
        String nombre = NombreNata.getText();
        String tnota1 = Nota1.getText();
        String tnota2 = Nota2.getText();
        String tnota3 = Nota3.getText();
        String tnota4 = Nota4.getText();
        String tnota5 = Nota5.getText();
        String tnota6 = Nota6.getText();
        String tnota7 = Nota7.getText();
        String tnota8 = Nota8.getText();
        String tfactor = Factor.getText();
        String tresultado = AquiResultado.getText();
        
        try{
            nota1 = Float.parseFloat(tnota1);
            nota2 = Float.parseFloat(tnota2);
            nota3 = Float.parseFloat(tnota3);
            nota4 = Float.parseFloat(tnota4);
            nota5 = Float.parseFloat(tnota5);
            nota6 = Float.parseFloat(tnota6);
            nota7 = Float.parseFloat(tnota7);
            nota8 = Float.parseFloat(tnota8);
            factor = Float.parseFloat(tfactor);
            nota = Float.parseFloat(tresultado);
            
        }catch(NumberFormatException e){
            posibleAgregar = false;
            String mensajeError = "Error: Ingresa notas válidas.";
            JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if (posibleAgregar){
            if (existePaisEnTabla2(pais)) {
                JOptionPane.showMessageDialog(this, "El país ya existe en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                model2.addRow(new Object[]{nombre, pais, nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, factor, nota});
                Conexion con = new Conexion();
                con.conectar();
                con.BDNatacion(nombre, pais, nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, factor, nota);
                
                con.verificarPais(pais);
            }
        }
    }//GEN-LAST:event_NatacionAgregarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AquiResultado;
    private javax.swing.JLabel Bandera;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JTextField CajaBronce;
    private javax.swing.JTextField CajaOro;
    private javax.swing.JTextField CajaPlata;
    private javax.swing.JTextField Factor;
    private javax.swing.JTable Medallero;
    private javax.swing.JButton NatacionAgregar;
    private javax.swing.JTextField NombreNata;
    private javax.swing.JTextField Nota1;
    private javax.swing.JTextField Nota2;
    private javax.swing.JTextField Nota3;
    private javax.swing.JTextField Nota4;
    private javax.swing.JTextField Nota5;
    private javax.swing.JTextField Nota6;
    private javax.swing.JTextField Nota7;
    private javax.swing.JTextField Nota8;
    private javax.swing.JTable NotasNata;
    private javax.swing.JLabel banderaPrimerLugar;
    private javax.swing.JLabel banderaSegundoLugar;
    private javax.swing.JLabel banderaTercerLugar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel primerLugar;
    private javax.swing.JLabel segundoLugar;
    private javax.swing.JLabel tercerLugar;
    private javax.swing.JButton terminarJuegos;
    // End of variables declaration//GEN-END:variables
}
