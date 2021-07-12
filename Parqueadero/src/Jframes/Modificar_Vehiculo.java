/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;
import com.mxrck.autocompleter.TextAutoCompleter;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mi PC
 */
public class Modificar_Vehiculo extends javax.swing.JFrame {

            Connection con = null;
String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10421754";
    String driver = "com.mysql.jdbc.Driver";
    String user = "sql10421754";
    String password = "BigZspWGlr";

    
    public Modificar_Vehiculo() {
        initComponents();
        autocompletarnombre();
    }

public void autocompletarnombre(){

    TextAutoCompleter autocompletar = new TextAutoCompleter(txtplaca_select);
    
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
           Statement st = con.createStatement();
        
       ResultSet rs = st.executeQuery("SELECT `placa` FROM `vehiculos`");
        
        //Ciclo While cada vez que el result set encuentre algo
        
        while(rs.next()){ 
        autocompletar.addItem(rs.getString("placa"));
        }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    
    
    
 }
public void buscar_placa(){
                try {
                    Class.forName(driver);
                    con = DriverManager.getConnection(url, user, password);
                    
                    Statement s = con.createStatement();
                    
                    ResultSet rs = s.executeQuery("SELECT `nombre_cliente`, `apellido_cliente`, `cedula_cliente`, `placa`, `fechayhora` FROM `vehiculos` WHERE `placa` = '"+txtplaca_select.getText()+"'");
                    
                    if (rs.next()) {
                        txtnombre_cliente.setText(rs.getString(1));
                        txtapellido_cliente.setText(rs.getString(2));
                        txtcedula_cliente.setText(rs.getString(3));
                        txtplaca.setText(rs.getString(4));
                        txtfecha.setText(rs.getString(5));
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontraron los datos con esa Placa");
                        txtnombre_cliente.setText("");
                        txtapellido_cliente.setText("");
                        txtcedula_cliente.setText("");
                        txtplaca.setText("");
                        txtfecha.setText("");
                    }
                   
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCPanel5 = new com.bolivia.panel.JCPanel();
        jCPanel6 = new com.bolivia.panel.JCPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCPanel9 = new com.bolivia.panel.JCPanel();
        jButton1 = new javax.swing.JButton();
        txtplaca_select = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCPanel8 = new com.bolivia.panel.JCPanel();
        jLabel10 = new javax.swing.JLabel();
        txtnombre_cliente = new javax.swing.JTextField();
        jCPanel11 = new com.bolivia.panel.JCPanel();
        jLabel12 = new javax.swing.JLabel();
        txtapellido_cliente = new javax.swing.JTextField();
        jCPanel10 = new com.bolivia.panel.JCPanel();
        jLabel11 = new javax.swing.JLabel();
        txtcedula_cliente = new javax.swing.JTextField();
        jCPanel12 = new com.bolivia.panel.JCPanel();
        jLabel13 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jCPanel13 = new com.bolivia.panel.JCPanel();
        jLabel15 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SOFTWARE PARA PARQUEADERO");

        jCPanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo ParkingApp.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel5Layout = new javax.swing.GroupLayout(jCPanel5);
        jCPanel5.setLayout(jCPanel5Layout);
        jCPanel5Layout.setHorizontalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jCPanel5Layout.setVerticalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jCPanel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo ParkingApp.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel6Layout = new javax.swing.GroupLayout(jCPanel6);
        jCPanel6.setLayout(jCPanel6Layout);
        jCPanel6Layout.setHorizontalGroup(
            jCPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jCPanel6Layout.setVerticalGroup(
            jCPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel8.setText("Placa de Carro");

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

        txtplaca_select.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jCPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtplaca_select, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jButton1)
                .addContainerGap(213, Short.MAX_VALUE))
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
                                .addComponent(txtplaca_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 30)); // NOI18N
        jLabel4.setText("MODIFICAR VEHICULO");

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

        jCPanel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fecha 1.png"))); // NOI18N

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

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel15.setText("Fecha de Entrada (yyyy-mm-dd hh:mm:ss)");

        txtfecha.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jButton2.setText("Actualizar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jButton3.setText("Eliminar  Vehiculo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jButton4.setText("Volver al Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtnombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtcedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtapellido_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jCPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(jLabel9)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(61, 61, 61)
                .addComponent(jButton3)
                .addGap(49, 49, 49)
                .addComponent(jButton4)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtapellido_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
buscar_placa();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                try {
                    Class.forName(driver);
                    con = DriverManager.getConnection(url, user, password);
                    
                    PreparedStatement s = con.prepareStatement("UPDATE `vehiculos` SET `nombre_cliente`='"+txtnombre_cliente.getText()+"',`apellido_cliente`='"+txtapellido_cliente.getText()+"',`cedula_cliente`='"+txtcedula_cliente.getText()+"',`placa`='"+txtplaca.getText()+"',`fechayhora`='"+txtfecha.getText()+"' WHERE `placa` = '"+txtplaca_select.getText()+"'");
                    
                    s.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
                    
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                try {
                    Class.forName(driver);
                    con = DriverManager.getConnection(url, user, password);
                    
                    PreparedStatement seliminar = con.prepareStatement("DELETE FROM `vehiculos` WHERE `placa` = '"+txtplaca_select.getText()+"'");
                    
                    seliminar.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Vehiculo Eliminado Correctamente");
                    
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Home abrir = new Home();
abrir.show();
this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.bolivia.panel.JCPanel jCPanel10;
    private com.bolivia.panel.JCPanel jCPanel11;
    private com.bolivia.panel.JCPanel jCPanel12;
    private com.bolivia.panel.JCPanel jCPanel13;
    private com.bolivia.panel.JCPanel jCPanel5;
    private com.bolivia.panel.JCPanel jCPanel6;
    private com.bolivia.panel.JCPanel jCPanel8;
    private com.bolivia.panel.JCPanel jCPanel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapellido_cliente;
    private javax.swing.JTextField txtcedula_cliente;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre_cliente;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtplaca_select;
    // End of variables declaration//GEN-END:variables
}
