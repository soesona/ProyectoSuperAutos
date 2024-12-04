/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosuperautos;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import Clases.Conexionsqlnetbeans;
import Clases.MantenimientoCatalogos;
import Clases.MantenimientoComboBoxes;
import Clases.MantenimientoFacturas;
import Clases.MantenimientoFacturas2;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 *
 * @author Sthefany
 */
public class Factura extends javax.swing.JFrame {
    Conexionsqlnetbeans cone        = new Conexionsqlnetbeans();
    DefaultTableModel   vrmodelo    = new DefaultTableModel();
    Statement           vrstmt      = null;
    ResultSet           vrrs        = null;
    String              vrtabla     = "ROLES";
    MantenimientoComboBoxes mancbo = new MantenimientoComboBoxes();
    String [] Datos = new String[6];
    
    DefaultTableModel vrmodeloTabla      = new DefaultTableModel();
    
//    vrmodeloTabla.addColumn("Descripción del Vehículo");
//    vrmodeloTabla.addColumn("Cantidad");
//    vrmodeloTabla.addColumn("Precio");
//    vrmodeloTabla.addColumn("Descuento");
//    vrmodeloTabla.addColumn("Impuesto");
//    vrmodeloTabla.addColumn("Total");
    
    int fila;
    int codigo;
    
    /**
     * Creates new form Login
     */
    public Factura() {
        initComponents(); 
        this.setLocationRelativeTo(null); 
        cone.obtenerconexion();
        mtd_mostrar_tabla();
        llenarVehiculos();
        this.txtimpuesto.setEnabled(false);
        this.txttotal.setEnabled(false);
        this.txtprecio.setEnabled(false);
        llenarTiposFacturas();
        llenarClientes();
//        this.txtdescripcion.putClientProperty("id",0);
    }
    
    public void mtd_mostrar_tabla()
    {
        vrmodelo.addColumn("Código");
        vrmodelo.addColumn("Descripción del Vehículo");
        vrmodelo.addColumn("Cantidad");
        vrmodelo.addColumn("Precio");
        vrmodelo.addColumn("Descuento");
        vrmodelo.addColumn("Impuesto");
        vrmodelo.addColumn("Total");
        
        this.tbl_detalle.setModel(vrmodelo);
    }
    
    public void llenarVehiculos()     
    {
        CboVehiculos.setModel(mancbo.llenarVehiculos()); 
    }
    
    public void llenarTiposFacturas()     
    {
        this.cbo_tipos_de_facturas.setModel(mancbo.llenartiposfacturas()); 
    }
    
    public void llenarClientes()     
    {
        this.cbo_clientes.setModel(mancbo.llenarClientes()); 
    }
    
    public boolean mtd_buscar(String vrsearch, boolean vrmodificando)
    {
        boolean found   = false;
        
        for (int row = 0; row < vrmodelo.getRowCount(); row++) {
            for (int col = 0; col < vrmodelo.getColumnCount(); col++) {
                Object cellValue = vrmodelo.getValueAt(row, col);
                
                if(vrsearch.equals(cellValue.toString()))
                {
                    this.tbl_detalle.setRowSelectionInterval(row, row);
                    this.tbl_detalle.setColumnSelectionInterval(col, col);

                    found = true;
                    System.out.println("0");
                    if(vrmodificando)
                    {
                        Integer vrid_encontrado;
                        MantenimientoCatalogos vrman = new MantenimientoCatalogos();
                        
                        vrid_encontrado = vrman.obtener_id(vrtabla, vrsearch);
                        
                        if(vrid_encontrado == codigo)
                        {
                            found = false;
                        }
                    }
                    System.out.println("1");
                    if (found) break;
                }
                else
                {
                    System.out.println("2");
                    found = false;
                }
            }
            System.out.println("3");
            if (found) break;
        }

        System.out.println(found);
        return found;
    }
    
//    public void mtd_mostrar_tabla()
//    {
//        MantenimientoCatalogos vrman = new MantenimientoCatalogos();
//        vrmodelo = vrman.obtener_catalogo_grid(vrtabla);        
//        this.tbl_detalle.setModel(vrmodelo);
//    }
    
    public void mtd_limpiar()
    {
        vrmodelo    = new DefaultTableModel();
        mtd_mostrar_tabla();
//        SwingUtilities.invokeLater(() -> txtcantidad.requestFocusInWindow());
    }
    
//    private void mtd_cargar_catalogo()
//    {
//         MantenimientoCatalogos vrman = new MantenimientoCatalogos();
//         
//         
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnAgregar = new javax.swing.JButton();
        BtnAgregar1 = new javax.swing.JButton();
        BtnAgregar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_detalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbo_tipos_de_facturas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbo_clientes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fecha_desde = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        fecha_hasta = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CboVehiculos = new javax.swing.JComboBox<>();
        txtnumero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtdescuento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtimpuesto = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        BtnAgregar3 = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BtnAgregar.setBackground(new java.awt.Color(2, 167, 63));
        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/Diskete3 35x35.png"))); // NOI18N
        BtnAgregar.setText("Guardar");
        BtnAgregar.setBorderPainted(false);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar.setIconTextGap(8);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnAgregar1.setBackground(new java.awt.Color(2, 167, 63));
        BtnAgregar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/Clean 35x35.png"))); // NOI18N
        BtnAgregar1.setText("Limpiar");
        BtnAgregar1.setBorderPainted(false);
        BtnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar1.setIconTextGap(8);
        BtnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregar1ActionPerformed(evt);
            }
        });

        BtnAgregar2.setBackground(new java.awt.Color(193, 82, 57));
        BtnAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/Bin 35x35.png"))); // NOI18N
        BtnAgregar2.setText("Eliminar");
        BtnAgregar2.setBorderPainted(false);
        BtnAgregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar2.setIconTextGap(8);
        BtnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregar2ActionPerformed(evt);
            }
        });

        tbl_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_detalle);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Facturas");

        cbo_tipos_de_facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipos_de_facturasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tipo:");

        cbo_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_clientesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Cliente:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Fecha:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Número factura:");

        txtcantidad.setText("1");
        txtcantidad.setToolTipText("");
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantidadKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Lapso de renta:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Fecha desde:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Fecha hasta:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Cantidad:");

        CboVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboVehiculosActionPerformed(evt);
            }
        });

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Vehículo:");

        txtdescuento.setText("0.00");
        txtdescuento.setToolTipText("");
        txtdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescuentoActionPerformed(evt);
            }
        });
        txtdescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescuentoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdescuentoKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Descuento:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Impuesto:");

        txtimpuesto.setText("0.00");
        txtimpuesto.setToolTipText("");
        txtimpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimpuestoActionPerformed(evt);
            }
        });

        txttotal.setText("0.00");
        txttotal.setToolTipText("");
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Total:");

        BtnAgregar3.setBackground(new java.awt.Color(2, 167, 63));
        BtnAgregar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/AggIcon.png"))); // NOI18N
        BtnAgregar3.setText("Agregar");
        BtnAgregar3.setBorderPainted(false);
        BtnAgregar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar3.setIconTextGap(8);
        BtnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregar3ActionPerformed(evt);
            }
        });

        txtprecio.setText("0.00");
        txtprecio.setToolTipText("");
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Precio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addComponent(cbo_tipos_de_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbo_clientes, 0, 190, Short.MAX_VALUE)
                                            .addComponent(txtnumero))))
                                .addGap(146, 146, 146)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fecha_desde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fecha_hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdescuento)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtimpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(BtnAgregar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_tipos_de_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(fecha_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fecha_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CboVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtimpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnAgregar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detalleMouseClicked
        fila                    = tbl_detalle.getSelectedRow();
        String vrdescripcion    = tbl_detalle.getValueAt(fila, 0).toString();
        this.txtcantidad.setText(vrdescripcion);
        MantenimientoCatalogos vrman = new MantenimientoCatalogos();
        codigo = vrman.obtener_id(vrtabla, vrdescripcion);
    }//GEN-LAST:event_tbl_detalleMouseClicked

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        MantenimientoFacturas vrmanFacturas = new MantenimientoFacturas();
        Integer vrid_tipo_factura = this.cbo_tipos_de_facturas.getSelectedIndex();
        Integer vrid_cliente = Integer.valueOf(this.cbo_clientes.getSelectedItem().toString().substring(1, 3));
        System.out.println(vrid_cliente);
        String vrnumero_factura = this.txtnumero.getText();
        String vrfecha = ((JTextField) this.fecha.getDateEditor().getUiComponent()).getText();
        String vrfecha_desde = ((JTextField) this.fecha_desde.getDateEditor().getUiComponent()).getText();
        String vrfecha_hasta = ((JTextField) this.fecha_hasta.getDateEditor().getUiComponent()).getText();
        
        vrmanFacturas.ingresar(1, vrfecha, vrnumero_factura, vrid_cliente, vrfecha_desde, vrfecha_hasta);
    }//GEN-LAST:event_BtnAgregarActionPerformed
    
    private void mtd_total()
    {   
        Double vrcantidad = 0.00;
        Double  vrdescuento = 0.00;
                
        if(this.txtdescuento.getText().equals(""))
        {
            vrdescuento = 0.00;
        }
        else
        {
            vrdescuento = Double.valueOf(this.txtdescuento.getText());
        }
        
        if(this.txtcantidad.getText().equals(""))
        {
            vrcantidad = 0.00;
        }
        else
        {
            vrcantidad = Double.valueOf(this.txtcantidad.getText());
        }
                
        Double  vrprecio    = Double.valueOf(this.txtprecio.getText());
        Double  vrimpuesto  = Double.valueOf(this.txtimpuesto.getText());
        
        this.txttotal.setText(String.valueOf((vrprecio+vrdescuento+vrimpuesto) * vrcantidad));
    }
    
    private void mtd_limpiar_detalle()
    {
        this.txtcantidad.setText("1");
        this.txtprecio.setText("0.00");
        this.txtdescuento.setText("0.00");
        this.txtimpuesto.setText("0.00");
        this.txtprecio.setText("0.00");
        this.txttotal.setText("0.00");
//        this.CboVehiculos.setSelectedIndex(0);
    }
    
    private void BtnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregar1ActionPerformed
        mtd_limpiar();
    }//GEN-LAST:event_BtnAgregar1ActionPerformed

    private void BtnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregar2ActionPerformed

        if(codigo == 0) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un ítem de la lista", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el ítem seleccionado?");
        
            if (respuesta == 0)
            {
                MantenimientoCatalogos vrman = new MantenimientoCatalogos();

                MantenimientoCatalogos.eliminar(codigo, "SP_" + vrtabla);

                JOptionPane.showMessageDialog(this, "El ítem ha sido eliminado correctamente", "Error", JOptionPane.INFORMATION_MESSAGE);

                mtd_limpiar();
            }
        }
    }//GEN-LAST:event_BtnAgregar2ActionPerformed

    private void cbo_tipos_de_facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipos_de_facturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_tipos_de_facturasActionPerformed

    private void cbo_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_clientesActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        this.mtd_total();
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void CboVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboVehiculosActionPerformed

        Integer vrid = Integer.valueOf((this.CboVehiculos.getSelectedItem()).toString().substring(1, 3));

        Double  vrprecio, vrdescuento;

        MantenimientoCatalogos vrman = new MantenimientoCatalogos();


        if (vrid != 0)
        {
            vrprecio = vrman.obtener_precio_vehiculo(vrid);
        }
        else
        {
            vrprecio = 0.00;
        }
        
        if(this.txtdescuento.getText().equals(""))
        {
            vrdescuento = 0.00;
        }
        else
        {
            vrdescuento = Double.valueOf(this.txtdescuento.getText());
        }

        this.txtprecio.setText(vrprecio.toString()); 

        this.txtimpuesto.setText(String.valueOf((vrprecio-vrdescuento)*0.15));

        mtd_total();
    }//GEN-LAST:event_CboVehiculosActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescuentoActionPerformed
        this.mtd_total();
    }//GEN-LAST:event_txtdescuentoActionPerformed

    private void txtimpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimpuestoActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void BtnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregar3ActionPerformed
        String [] Datos = new String[6];
        
        Datos[0] = this.CboVehiculos.getSelectedItem().toString();
        Datos[1] = this.txtcantidad.getText();
        Datos[2] = this.txtprecio.getText();
        Datos[3] = this.txtdescuento.getText();
        Datos[4] = this.txtimpuesto.getText();
        Datos[5] = this.txttotal.getText();
        
//        vrmodeloTabla.addColumn("Descripción del Vehículo");
//        vrmodeloTabla.addColumn("Cantidad");
//        vrmodeloTabla.addColumn("Precio");
//        vrmodeloTabla.addColumn("Descuento");
//        vrmodeloTabla.addColumn("Impuesto");
//        vrmodeloTabla.addColumn("Total");
//        
        vrmodelo.addRow(Datos);
        
        this.tbl_detalle.setModel(vrmodelo);
        
        mtd_limpiar_detalle();
    }//GEN-LAST:event_BtnAgregar3ActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtdescuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescuentoKeyPressed
        Double vrprecio = Double.valueOf(this.txtprecio.getText());
        Double vrdescuento = 0.00;
        
        if(this.txtdescuento.getText().equals(""))
        {
            vrdescuento = 0.00;
        }
        else
        {
            vrdescuento = Double.valueOf(this.txtdescuento.getText());
        }
        
        this.txtimpuesto.setText(String.valueOf((vrprecio - vrdescuento) * 0.15));
        
        this.mtd_total();
    }//GEN-LAST:event_txtdescuentoKeyPressed
    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed

        this.mtd_total();
    }//GEN-LAST:event_txtcantidadKeyPressed

    private void txtdescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescuentoKeyReleased
        Double vrprecio = Double.valueOf(this.txtprecio.getText());
        Double vrdescuento = 0.00;
        
        if(this.txtdescuento.getText().equals(""))
        {
            vrdescuento = 0.00;
        }
        else
        {
            vrdescuento = Double.valueOf(this.txtdescuento.getText());
        }
        
        this.txtimpuesto.setText(String.valueOf((vrprecio - vrdescuento) * 0.15));
        
        this.mtd_total();
    }//GEN-LAST:event_txtdescuentoKeyReleased

    private void txtcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyReleased
        this.mtd_total();
    }//GEN-LAST:event_txtcantidadKeyReleased

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAgregar1;
    private javax.swing.JButton BtnAgregar2;
    private javax.swing.JButton BtnAgregar3;
    private javax.swing.JComboBox<String> CboVehiculos;
    private javax.swing.JComboBox<String> cbo_clientes;
    private javax.swing.JComboBox<String> cbo_tipos_de_facturas;
    private com.toedter.calendar.JDateChooser fecha;
    private com.toedter.calendar.JDateChooser fecha_desde;
    private com.toedter.calendar.JDateChooser fecha_hasta;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_detalle;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtimpuesto;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
