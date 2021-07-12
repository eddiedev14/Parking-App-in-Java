/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mi PC
 */
public class Insertar_Vehiculo extends javax.swing.JFrame {

        Connection con = null;
String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10421754";
    String driver = "com.mysql.jdbc.Driver";
    String user = "sql10421754";
    String password = "BigZspWGlr";
    
    public Insertar_Vehiculo() {
        initComponents();
        tiempotranscurrido();
    }

    public void tiempotranscurrido(){

    }
   public void buscar_asesor(){
       //Validamos si el textfield esta vacio
       if ("".equals(txtcedula_asesor_select.getText())) {
           JOptionPane.showMessageDialog(null, "Por favor Rellene el Campo de la Cedula antes de Buscar");
       }else{
           
           try {
               Class.forName(driver);
               con = DriverManager.getConnection(url, user, password);
               
               Statement s = con.createStatement();
               
               ResultSet rs = s.executeQuery("SELECT `nombre`, `apellido`, `cedula` FROM `usuarios` WHERE `cedula` = '"+txtcedula_asesor_select.getText()+"'");
               
               if (rs.next()) {
                   JOptionPane.showMessageDialog(null, "Cedula encontrada Correctamente");
                   txtnombre_asesor.setText(rs.getString(1));
                   txtcedula_asesor.setText(rs.getString(3));
               }else{
                   JOptionPane.showMessageDialog(null, "No se encontro el Usuario");
                   txtnombre_asesor.setText("");
                   txtcedula_asesor.setText("");
               }
               
           } catch (ClassNotFoundException | SQLException ex) {
               JOptionPane.showMessageDialog(null, ex);
           }
       }
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCPanel1 = new com.bolivia.panel.JCPanel();
        jCPanel2 = new com.bolivia.panel.JCPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCPanel3 = new com.bolivia.panel.JCPanel();
        jCPanel4 = new com.bolivia.panel.JCPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCPanel5 = new com.bolivia.panel.JCPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre_asesor = new javax.swing.JTextField();
        jCPanel7 = new com.bolivia.panel.JCPanel();
        jLabel6 = new javax.swing.JLabel();
        txtcedula_asesor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtcedula_asesor_select = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCPanel9 = new com.bolivia.panel.JCPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCPanel8 = new com.bolivia.panel.JCPanel();
        jLabel10 = new javax.swing.JLabel();
        txtnombre_cliente = new javax.swing.JTextField();
        jCPanel11 = new com.bolivia.panel.JCPanel();
        jLabel12 = new javax.swing.JLabel();
        txtapellido_cliente = new javax.swing.JTextField();
        jCPanel12 = new com.bolivia.panel.JCPanel();
        jLabel13 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jCPanel10 = new com.bolivia.panel.JCPanel();
        jLabel11 = new javax.swing.JLabel();
        txtcedula_cliente = new javax.swing.JTextField();
        btnHorarios = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jCPanel13 = new com.bolivia.panel.JCPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCPanel14 = new com.bolivia.panel.JCPanel();
        horas = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jCPanel15 = new com.bolivia.panel.JCPanel();
        btnAgregar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SOFTWARE PARA PARQUEADERO");

        jCPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo ParkingApp.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel1Layout = new javax.swing.GroupLayout(jCPanel1);
        jCPanel1.setLayout(jCPanel1Layout);
        jCPanel1Layout.setHorizontalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jCPanel1Layout.setVerticalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jCPanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo ParkingApp.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel2Layout = new javax.swing.GroupLayout(jCPanel2);
        jCPanel2.setLayout(jCPanel2Layout);
        jCPanel2Layout.setHorizontalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jCPanel2Layout.setVerticalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SOFTWARE PARA PARQUEADERO");

        jCPanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo ParkingApp.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel3Layout = new javax.swing.GroupLayout(jCPanel3);
        jCPanel3.setLayout(jCPanel3Layout);
        jCPanel3Layout.setHorizontalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jCPanel3Layout.setVerticalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jCPanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo ParkingApp.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel4Layout = new javax.swing.GroupLayout(jCPanel4);
        jCPanel4.setLayout(jCPanel4Layout);
        jCPanel4Layout.setHorizontalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jCPanel4Layout.setVerticalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(122, 122, 122)
                .addComponent(jCPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 30)); // NOI18N
        jLabel3.setText("INSERTAR VEHICULO");

        jCPanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nombre.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel5Layout = new javax.swing.GroupLayout(jCPanel5);
        jCPanel5.setLayout(jCPanel5Layout);
        jCPanel5Layout.setHorizontalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel5Layout.setVerticalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel4.setText("Nombre Asesor:");

        txtnombre_asesor.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        txtnombre_asesor.setEnabled(false);

        jCPanel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cedula.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel7Layout = new javax.swing.GroupLayout(jCPanel7);
        jCPanel7.setLayout(jCPanel7Layout);
        jCPanel7Layout.setHorizontalGroup(
            jCPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel7Layout.setVerticalGroup(
            jCPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel6.setText("Cedula Asesor:");

        txtcedula_asesor.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        txtcedula_asesor.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtcedula_asesor_select.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel8.setText("Cedula Asesor del Parqueadero:");

        jCPanel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cedula.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel9Layout = new javax.swing.GroupLayout(jCPanel9);
        jCPanel9.setLayout(jCPanel9Layout);
        jCPanel9Layout.setHorizontalGroup(
            jCPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel9Layout.setVerticalGroup(
            jCPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jCPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcedula_asesor_select, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcedula_asesor_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel7.setText("DATOS ASESOR DEL PARQUEADERO");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel9.setText("DATOS VEHICULO");

        jCPanel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nombre Cliente.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel8Layout = new javax.swing.GroupLayout(jCPanel8);
        jCPanel8.setLayout(jCPanel8Layout);
        jCPanel8Layout.setHorizontalGroup(
            jCPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel8Layout.setVerticalGroup(
            jCPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel10.setText("Nombre Cliente:");

        txtnombre_cliente.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N

        jCPanel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apellido Cliente.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel11Layout = new javax.swing.GroupLayout(jCPanel11);
        jCPanel11.setLayout(jCPanel11Layout);
        jCPanel11Layout.setHorizontalGroup(
            jCPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel11Layout.setVerticalGroup(
            jCPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel12.setText("Apellido Cliente:");

        txtapellido_cliente.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N

        jCPanel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Placa de Carro.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel12Layout = new javax.swing.GroupLayout(jCPanel12);
        jCPanel12.setLayout(jCPanel12Layout);
        jCPanel12Layout.setHorizontalGroup(
            jCPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel12Layout.setVerticalGroup(
            jCPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel13.setText("Placa de Carro");

        txtplaca.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N

        jCPanel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cedula Cliente.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel10Layout = new javax.swing.GroupLayout(jCPanel10);
        jCPanel10.setLayout(jCPanel10Layout);
        jCPanel10Layout.setHorizontalGroup(
            jCPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel10Layout.setVerticalGroup(
            jCPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel11.setText("Cedula Cliente:");

        txtcedula_cliente.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N

        btnHorarios.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        btnHorarios.setText("Calcular Horario");
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        btnMenu.setText("Volver al Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jCPanel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fecha.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel13Layout = new javax.swing.GroupLayout(jCPanel13);
        jCPanel13.setLayout(jCPanel13Layout);
        jCPanel13Layout.setHorizontalGroup(
            jCPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel13Layout.setVerticalGroup(
            jCPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel14.setText("Fecha de Entrada");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel15.setText("HORARIO");

        fecha.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        fecha.setText("...");

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel17.setText("Hora de Entrada");

        jCPanel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Horas.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel14Layout = new javax.swing.GroupLayout(jCPanel14);
        jCPanel14.setLayout(jCPanel14Layout);
        jCPanel14Layout.setHorizontalGroup(
            jCPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel14Layout.setVerticalGroup(
            jCPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        horas.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        horas.setText("...");

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel19.setText("Fecha y Hora de Entrada");

        resultado.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        resultado.setText("...");

        jCPanel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HORAS Y FECHA.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel15Layout = new javax.swing.GroupLayout(jCPanel15);
        jCPanel15.setLayout(jCPanel15Layout);
        jCPanel15Layout.setHorizontalGroup(
            jCPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel15Layout.setVerticalGroup(
            jCPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        btnAgregar.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        btnAgregar.setText("Agregar Vehiculo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtnombre_asesor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtcedula_asesor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtnombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtcedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtapellido_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jCPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnombre_asesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcedula_asesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtapellido_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fecha))
                            .addComponent(jCPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(horas))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultado))
                                    .addComponent(jCPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHorarios)
                    .addComponent(btnAgregar)
                    .addComponent(btnMenu))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
Home abrir = new Home();
abrir.show();
this.hide();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
buscar_asesor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
//Fecha
LocalDate fechactual = LocalDate.now();
fecha.setText(String.valueOf(fechactual));

//Horas
Calendar calendario = new GregorianCalendar();
java.util.Date horactual = new java.util.Date();
calendario.setTime(horactual);

String hora, minutos, segundos;

hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);

horas.setText(hora+":"+minutos+":"+segundos);
//Total
String total = fecha.getText() + " " + horas.getText();
resultado.setText(total);


    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
//Validamos TextFields y Labels
if ("...".equals(fecha.getText()) && "...".equals(horas.getText()) && "...".equals(resultado.getText())) {
           JOptionPane.showMessageDialog(null, "Por favor realice el calculo del Horario");
        }else if ("".equals(txtnombre_asesor.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor Realice la Busqueda por Cedula");
        }else if ("".equals(txtcedula_asesor.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor Realice la Busqueda por Cedula");
        }else if ("".equals(txtnombre_cliente.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor Rellene el Nombre del Cliente");
        }else if ("".equals(txtapellido_cliente.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor Rellene el Apellido del Cliente");
        }else if ("".equals(txtcedula_cliente.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor Rellene la Cedula del Cliente");
        }else if ("".equals(txtplaca.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor Rellene la Placa del Carro del Cliente");
        }else{
    try {
        //Select para Validar si el carro ya esta Insertado
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, password);
        
        Statement s = con.createStatement();
        
        ResultSet rs = s.executeQuery("SELECT * FROM `vehiculos` WHERE `placa` = '"+txtplaca.getText()+"'");
        
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "El vehiculo ha insertar ya se encuentra en el Parqueadero");
        }else{
            //Insert
            
            PreparedStatement sinsert = con.prepareStatement("INSERT INTO `vehiculos` VALUES (?,?,?,?,?,?,?,?)");
            
            sinsert.setString(1, null);
            sinsert.setString(2, txtnombre_asesor.getText());
            sinsert.setInt(3, Integer.parseInt(txtcedula_asesor.getText()));
            sinsert.setString(4, txtnombre_cliente.getText());
            sinsert.setString(5, txtapellido_cliente.getText());
            sinsert.setInt(6, Integer.parseInt(txtcedula_cliente.getText()));
            sinsert.setString(7, txtplaca.getText());
            sinsert.setString(8, resultado.getText());
            
            sinsert.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "El Vehiculo fue Insertado Correctamente");
        }
        
    } catch (ClassNotFoundException | SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar_Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel horas;
    private javax.swing.JButton jButton1;
    private com.bolivia.panel.JCPanel jCPanel1;
    private com.bolivia.panel.JCPanel jCPanel10;
    private com.bolivia.panel.JCPanel jCPanel11;
    private com.bolivia.panel.JCPanel jCPanel12;
    private com.bolivia.panel.JCPanel jCPanel13;
    private com.bolivia.panel.JCPanel jCPanel14;
    private com.bolivia.panel.JCPanel jCPanel15;
    private com.bolivia.panel.JCPanel jCPanel2;
    private com.bolivia.panel.JCPanel jCPanel3;
    private com.bolivia.panel.JCPanel jCPanel4;
    private com.bolivia.panel.JCPanel jCPanel5;
    private com.bolivia.panel.JCPanel jCPanel7;
    private com.bolivia.panel.JCPanel jCPanel8;
    private com.bolivia.panel.JCPanel jCPanel9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField txtapellido_cliente;
    private javax.swing.JTextField txtcedula_asesor;
    private javax.swing.JTextField txtcedula_asesor_select;
    private javax.swing.JTextField txtcedula_cliente;
    private javax.swing.JTextField txtnombre_asesor;
    private javax.swing.JTextField txtnombre_cliente;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}
