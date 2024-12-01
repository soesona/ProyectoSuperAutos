/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosuperautos;

import Clases.Conexionsqlnetbeans;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.JPanel;
/**
 *
 * @author Sthefany
 */
public class Menu extends javax.swing.JFrame {
Conexionsqlnetbeans cone = new Conexionsqlnetbeans();
int xMouse;
    int yMouse;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null); 
         rsscalelabel.RSScaleLabel.setScaleLabel(ProgramaAutos, "src/RecursosImagenes/LogoEnPNG.png");
         
         
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        BtnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnVehiculos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnVentas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnProveedores = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnEmpleados = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BtnClientes = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ProgramaAutos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnPlanilla = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BtnCatalogo = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        BtnTransacciones = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        BtnUsuarios = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(156, 210, 176));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnPrincipal.setBackground(new java.awt.Color(73, 176, 111));
        BtnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        BtnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPrincipalMousePressed(evt);
            }
        });
        BtnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        BtnPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 50));

        BtnVehiculos.setBackground(new java.awt.Color(73, 176, 111));
        BtnVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        BtnVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnVehiculos.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVehiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVehiculosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnVehiculosMousePressed(evt);
            }
        });
        BtnVehiculos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnVehiculos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vehículos");
        BtnVehiculos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        BtnVentas.setBackground(new java.awt.Color(73, 176, 111));
        BtnVentas.setForeground(new java.awt.Color(255, 255, 255));
        BtnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnVentas.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnVentasMousePressed(evt);
            }
        });
        BtnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnVentas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ventas");
        BtnVentas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        BtnProveedores.setBackground(new java.awt.Color(73, 176, 111));
        BtnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        BtnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnProveedores.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnProveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnProveedoresMousePressed(evt);
            }
        });
        BtnProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnProveedores.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Proveedores");
        BtnProveedores.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        BtnEmpleados.setBackground(new java.awt.Color(73, 176, 111));
        BtnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        BtnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEmpleados.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEmpleadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnEmpleadosMousePressed(evt);
            }
        });
        BtnEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEmpleados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleados");
        BtnEmpleados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        BtnClientes.setBackground(new java.awt.Color(73, 176, 111));
        BtnClientes.setForeground(new java.awt.Color(255, 255, 255));
        BtnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnClientes.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnClientesMousePressed(evt);
            }
        });
        BtnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnClientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Clientes");
        BtnClientes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        ProgramaAutos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProgramaAutos.setForeground(new java.awt.Color(255, 255, 255));
        ProgramaAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/SedanSilueta.png"))); // NOI18N
        Menu.add(ProgramaAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 64, 64));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 20));

        BtnPlanilla.setBackground(new java.awt.Color(73, 176, 111));
        BtnPlanilla.setForeground(new java.awt.Color(255, 255, 255));
        BtnPlanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnPlanilla.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPlanillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPlanillaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPlanillaMousePressed(evt);
            }
        });
        BtnPlanilla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnPlanilla.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Planilla de pago");
        BtnPlanilla.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, -1));

        BtnCatalogo.setBackground(new java.awt.Color(73, 176, 111));
        BtnCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        BtnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCatalogo.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCatalogoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnCatalogoMousePressed(evt);
            }
        });
        BtnCatalogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCatalogo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" Catálogo general");
        BtnCatalogo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        BtnTransacciones.setBackground(new java.awt.Color(73, 176, 111));
        BtnTransacciones.setForeground(new java.awt.Color(255, 255, 255));
        BtnTransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnTransacciones.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnTransacciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnTransaccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnTransaccionesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnTransaccionesMousePressed(evt);
            }
        });
        BtnTransacciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnTransacciones.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Transacciones ");
        BtnTransacciones.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        BtnUsuarios.setBackground(new java.awt.Color(73, 176, 111));
        BtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnUsuarios.setPreferredSize(new java.awt.Dimension(270, 51));
        BtnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnUsuariosMousePressed(evt);
            }
        });
        BtnUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnUsuarios.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Usuarios");
        BtnUsuarios.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(BtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 630));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 940, 610));

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(red_squrLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, red_squrLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit))
        );

        Background.add(red_squr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void BtnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrincipalMouseEntered
      
    }//GEN-LAST:event_BtnPrincipalMouseEntered

    private void BtnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrincipalMouseExited
      
    }//GEN-LAST:event_BtnPrincipalMouseExited

    private void BtnPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrincipalMousePressed
     
   
    }//GEN-LAST:event_BtnPrincipalMousePressed

    private void BtnVehiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVehiculosMouseEntered
   
    }//GEN-LAST:event_BtnVehiculosMouseEntered

    private void BtnVehiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVehiculosMouseExited
       
    }//GEN-LAST:event_BtnVehiculosMouseExited

    private void BtnVehiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVehiculosMousePressed

     
    }//GEN-LAST:event_BtnVehiculosMousePressed

    private void BtnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMouseEntered
     
    }//GEN-LAST:event_BtnVentasMouseEntered

    private void BtnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMouseExited
       
    }//GEN-LAST:event_BtnVentasMouseExited

    private void BtnVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMousePressed

    }//GEN-LAST:event_BtnVentasMousePressed

    private void BtnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMouseEntered

    }//GEN-LAST:event_BtnProveedoresMouseEntered

    private void BtnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMouseExited
 
    }//GEN-LAST:event_BtnProveedoresMouseExited

    private void BtnProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMousePressed

    }//GEN-LAST:event_BtnProveedoresMousePressed

    private void BtnEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmpleadosMouseEntered

    }//GEN-LAST:event_BtnEmpleadosMouseEntered

    private void BtnEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmpleadosMouseExited
    
    }//GEN-LAST:event_BtnEmpleadosMouseExited

    private void BtnEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmpleadosMousePressed
    
    }//GEN-LAST:event_BtnEmpleadosMousePressed

    private void BtnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientesMouseEntered
  
    }//GEN-LAST:event_BtnClientesMouseEntered

    private void BtnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientesMouseExited
  
    }//GEN-LAST:event_BtnClientesMouseExited

    private void BtnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientesMousePressed
    
    }//GEN-LAST:event_BtnClientesMousePressed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

   
    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
      int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void BtnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientesMouseClicked
     Clientes p2 = new Clientes ();
       ShowPanel((JPanel) p2.getContentPane());
    }//GEN-LAST:event_BtnClientesMouseClicked

    private void BtnPlanillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPlanillaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPlanillaMouseEntered

    private void BtnPlanillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPlanillaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPlanillaMouseExited

    private void BtnPlanillaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPlanillaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPlanillaMousePressed

    private void BtnCatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCatalogoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCatalogoMouseEntered

    private void BtnCatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCatalogoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCatalogoMouseExited

    private void BtnCatalogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCatalogoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCatalogoMousePressed

    private void BtnTransaccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTransaccionesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTransaccionesMouseEntered

    private void BtnTransaccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTransaccionesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTransaccionesMouseExited

    private void BtnTransaccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTransaccionesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTransaccionesMousePressed

    private void BtnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsuariosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUsuariosMouseEntered

    private void BtnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsuariosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUsuariosMouseExited

    private void BtnUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsuariosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUsuariosMousePressed

    private void BtnPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrincipalMouseClicked
     
    }//GEN-LAST:event_BtnPrincipalMouseClicked

    
    private void ShowPanel(JPanel p) {
        p.setSize(940,550);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate(); 
        content.repaint(); 
    }
  
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BtnCatalogo;
    private javax.swing.JPanel BtnClientes;
    private javax.swing.JPanel BtnEmpleados;
    private javax.swing.JPanel BtnPlanilla;
    private javax.swing.JPanel BtnPrincipal;
    private javax.swing.JPanel BtnProveedores;
    private javax.swing.JPanel BtnTransacciones;
    private javax.swing.JPanel BtnUsuarios;
    private javax.swing.JPanel BtnVehiculos;
    private javax.swing.JPanel BtnVentas;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel ProgramaAutos;
    private javax.swing.JPanel Title;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel red_squr;
    // End of variables declaration//GEN-END:variables
}
