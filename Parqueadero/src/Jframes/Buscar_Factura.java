/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;
import com.itextpdf.text.BadElementException;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import java.io.IOException;
import java.net.MalformedURLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mi PC
 */
public class Buscar_Factura extends javax.swing.JFrame {

            Connection con = null;
String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10421754";
    String driver = "com.mysql.jdbc.Driver";
    String user = "sql10421754";
    String password = "BigZspWGlr";

    
    public Buscar_Factura() {
        initComponents();
        rellenar_combo();
    }

public void rellenar_combo(){

}
public void buscar_placa(){
                try {
                    Class.forName(driver);
                    con = DriverManager.getConnection(url, user, password);
                    
                    String qr = "SELECT `nombre_cliente`, `apellido_cliente`, `cedula_cliente`, `placa`, `fecha_entrada`, `fecha_salida`, `horas_transcurridas`, `minutos_transcurridos`, `segundos_transcurridos`, `precio_total` FROM `factura` WHERE `placa` = '"+txtplaca_select.getText()+"'";
                    
                    Statement st = con.createStatement();
                    
                    ResultSet rs = st.executeQuery(qr);
                    
                    tablafacturas.setModel(DbUtils.resultSetToTableModel(rs));
                    
                    JOptionPane.showMessageDialog(null, "Tabla Actualizada Correctamente, Seleccione una Factura para Visualizarla y Descargarla como PDF");
                    
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
}
public void preciototal(){
 
    
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
        jLabel14 = new javax.swing.JLabel();
        jCPanel13 = new com.bolivia.panel.JCPanel();
        jLabel15 = new javax.swing.JLabel();
        jCPanel14 = new com.bolivia.panel.JCPanel();
        jLabel16 = new javax.swing.JLabel();
        fechasalida = new javax.swing.JLabel();
        fechaentrada = new javax.swing.JLabel();
        jCPanel15 = new com.bolivia.panel.JCPanel();
        jLabel17 = new javax.swing.JLabel();
        txthoras_transcurridas = new javax.swing.JTextField();
        jCPanel16 = new com.bolivia.panel.JCPanel();
        jLabel18 = new javax.swing.JLabel();
        txtminutos_transcurridos = new javax.swing.JTextField();
        jCPanel17 = new com.bolivia.panel.JCPanel();
        jLabel19 = new javax.swing.JLabel();
        txtsegundos_transcurridos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        etiprecio_total = new javax.swing.JLabel();
        jCPanel18 = new com.bolivia.panel.JCPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jCPanel1 = new com.bolivia.panel.JCPanel();
        jLabel20 = new javax.swing.JLabel();
        btnRuta = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablafacturas = new javax.swing.JTable();

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
        jLabel4.setText("BUSQUEDA FACTURA");

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
        txtnombre_cliente.setEnabled(false);

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
        txtapellido_cliente.setEnabled(false);

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
        txtcedula_cliente.setEnabled(false);

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
        txtplaca.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel14.setText("HORARIOS");

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
        jLabel15.setText("Fecha de Entrada");

        jCPanel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fecha 2.png"))); // NOI18N

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

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel16.setText("Fecha de Salida");

        fechasalida.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        fechasalida.setText("...");

        fechaentrada.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        fechaentrada.setText("...");

        jCPanel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Horas.png"))); // NOI18N

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

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel17.setText("Horas Transcurridas");

        txthoras_transcurridas.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        txthoras_transcurridas.setEnabled(false);

        jCPanel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minutos.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel16Layout = new javax.swing.GroupLayout(jCPanel16);
        jCPanel16.setLayout(jCPanel16Layout);
        jCPanel16Layout.setHorizontalGroup(
            jCPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel16Layout.setVerticalGroup(
            jCPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel18.setText("Minutos Transcurridos");

        txtminutos_transcurridos.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        txtminutos_transcurridos.setEnabled(false);

        jCPanel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Segundos.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel17Layout = new javax.swing.GroupLayout(jCPanel17);
        jCPanel17.setLayout(jCPanel17Layout);
        jCPanel17Layout.setHorizontalGroup(
            jCPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel17Layout.setVerticalGroup(
            jCPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel19.setText("Segundos Transcurridos");

        txtsegundos_transcurridos.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        txtsegundos_transcurridos.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel21.setText("Precio Total:");

        etiprecio_total.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        etiprecio_total.setText("...");

        jCPanel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Precio.png"))); // NOI18N

        javax.swing.GroupLayout jCPanel18Layout = new javax.swing.GroupLayout(jCPanel18);
        jCPanel18.setLayout(jCPanel18Layout);
        jCPanel18Layout.setHorizontalGroup(
            jCPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jCPanel18Layout.setVerticalGroup(
            jCPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel2.setText("GENERAR PDF FACTURA");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jLabel5.setText("Direccion:");

        txtdireccion.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        txtdireccion.setEnabled(false);

        jCPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Descargar PDF.png"))); // NOI18N
        jCPanel1.setVisibleLogo(false);
        jCPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jCPanel1Layout = new javax.swing.GroupLayout(jCPanel1);
        jCPanel1.setLayout(jCPanel1Layout);
        jCPanel1Layout.setHorizontalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jCPanel1Layout.setVerticalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel20.setText("GENERAR PDF");

        btnRuta.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        btnRuta.setText("Seleccionar Ruta");
        btnRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRutaMouseClicked(evt);
            }
        });
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jButton6.setText("Volver Al Menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tablafacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablafacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablafacturasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablafacturas);

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
                                .addComponent(jCPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(txthoras_transcurridas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txtsegundos_transcurridos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(txtminutos_transcurridos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(98, 98, 98)
                                        .addComponent(jCPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(etiprecio_total, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(jLabel9)))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnRuta)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addComponent(jButton6)))
                                                .addGap(124, 124, 124))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jCPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(fechaentrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(256, 256, 256)))
                                        .addComponent(jCPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(61, 61, 61))
                                    .addComponent(fechasalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
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
                .addComponent(jLabel14)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechasalida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaentrada))
                    .addComponent(jCPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txthoras_transcurridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtminutos_transcurridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiprecio_total))
                            .addComponent(jCPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsegundos_transcurridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnRuta)
                .addGap(18, 18, 18)
                .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaActionPerformed
 JFileChooser dlg = new JFileChooser();
 int option = dlg.showSaveDialog(this);
 
        if (option == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            String f1 = f.toString();
            
            txtdireccion.setText(f1);
        }
    }//GEN-LAST:event_btnRutaActionPerformed

    private void jCPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCPanel1MouseClicked
String ruta = txtdireccion.getText();
        if ("".equals(ruta)) {
            JOptionPane.showMessageDialog(null, "Por favor Seleccione una Ruta");
        }else{
            
        
        try {
            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
            
            
            Document documento = new Document();
            
            Image header = Image.getInstance("Header.png");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Formato de Factura Creado por Parking App © \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            
            Paragraph info = new Paragraph();
            info.setAlignment(Paragraph.ALIGN_JUSTIFIED);
            info.add("Factura para el/la Señor/Señora "+txtnombre_cliente.getText()+" "+txtapellido_cliente.getText()+", Quien utiliza un Carro con la placa "+txtplaca.getText()+" que se alojo durante "+txthoras_transcurridas.getText()+" Horas"+", "+txtminutos_transcurridos.getText()+" Minutos y "+txtsegundos_transcurridos.getText()+" Segundos en nuestro Parqueadero, por lo cual, teniendo en cuenta este periodo de tiempo transcurrido, el precio total a pagar es de "+etiprecio_total.getText()+" Pesos Colombianos, Puede Revisar los datos anteriormente dichos en la siguiente Tabla \n\n");
            info.setFont(FontFactory.getFont("Tahoma", 16, Font.BOLD, BaseColor.DARK_GRAY));
            
                    
            try {
                PdfWriter.getInstance(documento, archivo);
                
                documento.open();
                documento.add(header);
                documento.add(parrafo);
                documento.add(info);
                        
                 PdfPTable tabla = new PdfPTable(10);      
                 
                 tabla.addCell("Nombre Cliente");
                 tabla.addCell("Apellido Cliente");
                 tabla.addCell("Cedula Cliente");
                 tabla.addCell("Placa Carro");
                 tabla.addCell("Fecha Entrada");
                 tabla.addCell("Fecha Salida");
                 tabla.addCell("Horas Transcurridas");
                 tabla.addCell("Minutos Transcurridos");
                 tabla.addCell("Segundos Transcurridos");
                 tabla.addCell("Precio Total");
                 
                 try {
                    Class.forName(driver);
                    con = DriverManager.getConnection(url, user, password);
                    
                    PreparedStatement pst = con.prepareStatement("SELECT * FROM `factura` WHERE `placa` = '"+txtplaca.getText()+"' AND `fecha_entrada`= '"+fechaentrada.getText()+"' AND `fecha_salida` = '"+fechasalida.getText()+"'");
                    
                    ResultSet rs = pst.executeQuery();
                    
                     if (rs.next()) {
                         
                         do {                             
                             
                             tabla.addCell(rs.getString(2));
                             tabla.addCell(rs.getString(3));
                             tabla.addCell(rs.getString(4));
                             tabla.addCell(rs.getString(5));
                             tabla.addCell(rs.getString(6));
                             tabla.addCell(rs.getString(7));
                             tabla.addCell(rs.getString(8));
                             tabla.addCell(rs.getString(9));
                             tabla.addCell(rs.getString(10));
                             tabla.addCell(rs.getString(11));
                             
                         } while (rs.next());
                         documento.add(tabla);
                     }
                } catch (Exception e) {
                }
                 documento.close();
                 JOptionPane.showMessageDialog(null, "PDF Creado Correctamente");
            } catch (Exception e) {
            }
            
            
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error en la Imagen: "+e);
        } catch (BadElementException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
        }
    }//GEN-LAST:event_jCPanel1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Home abrir = new Home();
abrir.show();
this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRutaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRutaMouseClicked

    private void tablafacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablafacturasMouseClicked
int seleccionar = tablafacturas.rowAtPoint(evt.getPoint());
txtnombre_cliente.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 0)));
txtapellido_cliente.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 1)));
txtcedula_cliente.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 2)));
txtplaca.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 3)));
fechaentrada.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 4)));
fechasalida.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 5)));
txthoras_transcurridas.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 6)));
txtminutos_transcurridos.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 7)));
txtsegundos_transcurridos.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 8)));
etiprecio_total.setText(String.valueOf(tablafacturas.getValueAt(seleccionar, 9)));
    }//GEN-LAST:event_tablafacturasMouseClicked

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
            java.util.logging.Logger.getLogger(Buscar_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRuta;
    private javax.swing.JLabel etiprecio_total;
    private javax.swing.JLabel fechaentrada;
    private javax.swing.JLabel fechasalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private com.bolivia.panel.JCPanel jCPanel1;
    private com.bolivia.panel.JCPanel jCPanel10;
    private com.bolivia.panel.JCPanel jCPanel11;
    private com.bolivia.panel.JCPanel jCPanel12;
    private com.bolivia.panel.JCPanel jCPanel13;
    private com.bolivia.panel.JCPanel jCPanel14;
    private com.bolivia.panel.JCPanel jCPanel15;
    private com.bolivia.panel.JCPanel jCPanel16;
    private com.bolivia.panel.JCPanel jCPanel17;
    private com.bolivia.panel.JCPanel jCPanel18;
    private com.bolivia.panel.JCPanel jCPanel5;
    private com.bolivia.panel.JCPanel jCPanel6;
    private com.bolivia.panel.JCPanel jCPanel8;
    private com.bolivia.panel.JCPanel jCPanel9;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablafacturas;
    private javax.swing.JTextField txtapellido_cliente;
    private javax.swing.JTextField txtcedula_cliente;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txthoras_transcurridas;
    private javax.swing.JTextField txtminutos_transcurridos;
    private javax.swing.JTextField txtnombre_cliente;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtplaca_select;
    private javax.swing.JTextField txtsegundos_transcurridos;
    // End of variables declaration//GEN-END:variables
}
