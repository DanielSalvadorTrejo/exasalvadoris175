package Vista;
//librerias

import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos

public class SoftwareCRUD extends javax.swing.JFrame { //inicia clase 
    //variables de conexion

    public Connection cn;//conexion a BD
    public Statement stmt;//Instrucciones SQL querys de BD
    public ResultSet rs;//Resultado final de datos

    public SoftwareCRUD() {//metodo especial llamadp constructor 
        initComponents();
    }//termina constructor 

    //metodo para conectar bd 
    public void conectarBase() {//inicia metodo conectar
        try {//inicia try
            //puente de conexion
            Class.forName("com.mysql.jdbc.Driver");//puente de conexion
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdexasalvador175", "root", "");
            stmt = cn.createStatement();//genera sentencias sql
            JOptionPane.showMessageDialog(null, "CONEXION BD ESTABLECIDA \nSalvador");
        } catch (SQLException ex) {//inicia exeption
            JOptionPane.showMessageDialog(null, ex);
        } catch (Exception e) {//inica exception errores generales
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnPrueba = new javax.swing.JButton();
        PanAlta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEquipos = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        PanBusquedaEditar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEquiposMod = new javax.swing.JTextField();
        txtIdMod = new javax.swing.JTextField();
        txtMarcaMod = new javax.swing.JTextField();
        txtLugarMod = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaProductos = new javax.swing.JTable();
        btnActualizarProductos = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPrueba.setText("Prueba de conexión");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });

        PanAlta.setBackground(new java.awt.Color(153, 204, 255));
        PanAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar"));

        jLabel1.setText("Id producto");

        jLabel2.setText("Equipos");

        jLabel3.setText("Marca");

        jLabel4.setText("Lugar");

        txtEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquiposActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarActionPerformed(evt);
            }
        });

        btnAlta.setText("Alta de producto");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanAltaLayout = new javax.swing.GroupLayout(PanAlta);
        PanAlta.setLayout(PanAltaLayout);
        PanAltaLayout.setHorizontalGroup(
            PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanAltaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAltaLayout.createSequentialGroup()
                        .addGroup(PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanAltaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAltaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAltaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlta)
                                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAltaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanAltaLayout.setVerticalGroup(
            PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAlta)
                .addGap(50, 50, 50))
        );

        PanBusquedaEditar.setBackground(new java.awt.Color(153, 204, 255));
        PanBusquedaEditar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jLabel6.setText("Id producto");

        jLabel7.setText("Equipos");

        jLabel8.setText("Marca");

        jLabel9.setText("Lugar");

        txtEquiposMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquiposModActionPerformed(evt);
            }
        });

        txtIdMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdModActionPerformed(evt);
            }
        });

        txtMarcaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaModActionPerformed(evt);
            }
        });

        txtLugarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarModActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanBusquedaEditarLayout = new javax.swing.GroupLayout(PanBusquedaEditar);
        PanBusquedaEditar.setLayout(PanBusquedaEditarLayout);
        PanBusquedaEditarLayout.setHorizontalGroup(
            PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanBusquedaEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanBusquedaEditarLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanBusquedaEditarLayout.createSequentialGroup()
                        .addGroup(PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanBusquedaEditarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMarcaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanBusquedaEditarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEquiposMod, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanBusquedaEditarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLugarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanBusquedaEditarLayout.createSequentialGroup()
                                        .addComponent(btnBuscarProducto)
                                        .addGap(36, 36, 36)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanBusquedaEditarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(txtIdMod, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        PanBusquedaEditarLayout.setVerticalGroup(
            PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanBusquedaEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEquiposMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(PanBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLugarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarProducto)
                .addGap(50, 50, 50))
        );

        jtConsultaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "Equipos", "Marca", "Lugar"
            }
        ));
        jScrollPane1.setViewportView(jtConsultaProductos);

        btnActualizarProductos.setText("Consultar Equipos");
        btnActualizarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(PanAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(PanBusquedaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnPrueba))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(btnActualizarProductos)
                                .addGap(27, 27, 27)))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnPrueba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanBusquedaEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarProductos)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        conectarBase();//llamada a la conexion de base de datos 
    }//GEN-LAST:event_btnPruebaActionPerformed

    private void txtEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquiposActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        conectarBase();//llamada a metodo conectar
        //declaracion de variables de entrada
        int Id = Integer.parseInt(txtId.getText());
        String Equipos = txtEquipos.getText();
        String Marca = txtMarca.getText();
        String Lugar = txtLugar.getText();

        //proceso guardar en la base de datos
        String altaProducto = "INSERT INTO VENDEDOR VALUES ('" + Id + "','" + Equipos + "','" + Marca + "','" + Lugar + "')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego producto de forma correcta\n" + Equipos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD de Alta:\n" + e);
        }//termina catch
    }//GEN-LAST:event_btnAltaActionPerformed

    private void txtEquiposModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquiposModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquiposModActionPerformed

    private void txtIdModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdModActionPerformed

    private void txtMarcaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaModActionPerformed

    private void txtLugarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarModActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        try {
            conectarBase();
            int IdMod = Integer.parseInt(this.txtIdMod.getText());
            //instruccion para buscar usuario
            rs = stmt.executeQuery("SELECT * FROM vendedor where Id='" + IdMod + "'");
            JOptionPane.showMessageDialog(null, "Buscando Producto...");
            if (rs.next() == true) {
                this.txtEquiposMod.setText(rs.getString("Equipos"));
                this.txtMarcaMod.setText(rs.getString("Marca"));
                this.txtLugarMod.setText(rs.getString("Lugar"));
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe ese ID de Producto\nVerifica");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD en busqueda de producto" + e);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnActualizarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductosActionPerformed
        try {//inicia try    Estructura de control para trataminento de errores
            conectarBase();//llamada  a la conexion a BD
            //Objeto Model es para almacenar  y guardar los valores de la tabla
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsultaProductos.setModel(modeloDatos);
            rs = stmt.executeQuery("Select * from vendedor");
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Id");
            modeloDatos.addColumn("Equipos");
            modeloDatos.addColumn("Marca");
            modeloDatos.addColumn("Lugar");
            while (rs.next()) { //inicia                    
                //arreglo objetos para imprimir filas
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                    fila[i] = rs.getObject(i + 1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD en consulta verifica\n" + ex);
        }//terrmina catch
    }//GEN-LAST:event_btnActualizarProductosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoftwareCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanAlta;
    private javax.swing.JPanel PanBusquedaEditar;
    private javax.swing.JButton btnActualizarProductos;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnPrueba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultaProductos;
    private javax.swing.JTextField txtEquipos;
    private javax.swing.JTextField txtEquiposMod;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdMod;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtLugarMod;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarcaMod;
    // End of variables declaration//GEN-END:variables
}
