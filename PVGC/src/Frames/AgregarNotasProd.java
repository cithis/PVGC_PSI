/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Control.ControlDetalleOrden;
import Control.ControlProducto;
import Control.ControlOrden;
import Dominio.DetalleOrden;
import Dominio.Orden;
import Dominio.Producto;
import java.awt.Color;
import java.awt.Font;

import java.awt.Label;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

/**
 * Pantalla para poder agregar detalles de la orden.
 *
 * @author Citlali Orduño
 */
public class AgregarNotasProd extends FrmBase {

    ControlOrden ctrlOrden;
    ControlDetalleOrden ctrlDetOrden;
    Orden orden;

    Producto prod;
    int cant = 1;
    String numCantidad = "";
    ArrayList<String> notas;
    List<DetalleOrden> detOrdenes;
    List<Producto> pedidos;
    Label lblDescripcion;
    Font f;

    /**
     * Creates new form AgregarNotasProd
     */
    public AgregarNotasProd(List<Producto> pedido, List<DetalleOrden> detalles) {
        initComponents();
        adaptarPantalla();
        this.ctrlOrden = new ControlOrden();
        this.notas = new ArrayList<>();
        this.detOrdenes = detalles;
        this.pedidos = pedido;
        this.prod = pedido.get(pedido.size() - 1);
        this.orden = orden;
        this.lblDescripcion = new Label();
        this.f = new Font("Arial", Font.BOLD, 14);

        txtDescripcion.setForeground(Color.DARK_GRAY);
        txtDescripcion.setFont(f);

        this.txtCantidad.setText("" + cant);
        lblProducto.setText("Producto " + cant);

        mostrarProducto(prod);
    }

    public AgregarNotasProd() {
        initComponents();
    }

    public void mostrarProducto(Producto producto) {
        String nombre = producto.getNombre();
        lblNombreProducto.setText(nombre);

    }

    public String intAString(int cantidad) {
        cantidad = cant;
        numCantidad = String.valueOf(cantidad);
        return numCantidad;
    }

    public void disminuirCantidad() {
        cant--;

        if (cant < 1) {
            JOptionPane.showConfirmDialog(this, "Cuidado, va para menos 0",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }
        String cantidad = intAString(cant);
        txtCantidad.setText("" + cant);
        lblProducto.setText("Producto " + cantidad);

    }

    public void agregarNotas() {
        String nota = txtNota.getText();
        String prod = lblProducto.getText();
        lblDescripcion.setText("" + prod + " " + nota);
        String desc = lblDescripcion.getText();
        notas.add(desc);
        txtNota.setText("");
    }

    public void mostrarNotas() {
        for (String nota : notas) {
            txtDescripcion.append(nota + "\n");

        }
    }

    /*Guarda las notas en una lista*/
    public void guardarNotas() {
        if (cant == notas.size()) {
            mostrarNotas();
            int dialogo = JOptionPane.showConfirmDialog(this, "¿Desea finalizar su orden?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);

            if (dialogo == JOptionPane.YES_OPTION) {
               // Orden ords = this.guardarDetalleEnOrden();

                /*manda la orden con solo los detalles de ordenes seteados*/
                DetalladoOrden detOrd = new DetalladoOrden();
                detOrd.setVisible(true);
                this.setVisible(false);

            } else if (dialogo == JOptionPane.NO_OPTION) {
                 Categoriasv2 cat = new Categoriasv2(pedidos, detOrdenes);
                cat.setVisible(true);
                this.setVisible(false);

            }
        } else if (cant > notas.size()) {
            int cantAux = (notas.size() + 1);
            lblProducto.setText("Producto " + cantAux);

        }
    }

    /*Este metodo guarda el detalle de la orden y retorna la orden*/
//    public Orden guardarDetalleEnOrden() {
//        orden = new Orden();
//        this.guardaDetalles();
//        orden.setDetalleOrdenes(detOrdenes);
//        return orden;
//    }

    /*Este metodo guarda pero no regresa la orden*/
    public void guardaDetalles() {
        DetalleOrden detOrden = detOrdenes.get(detOrdenes.size()-1);
        detOrden.setCantidad(cant);
        detOrden.setNotas(notas);

        double precio= prod.getPrecio();
        double total = cant* precio;
        detOrden.setTotal(total);
    }

    public void finalizarDetalle() {
        int dlg = JOptionPane.showConfirmDialog(this, "¿Desea ordenar más?",
                "Confirmación", JOptionPane.YES_NO_OPTION);

        if (dlg == JOptionPane.YES_OPTION) {
            guardaDetalles();
            Categoriasv2 cat = new Categoriasv2(pedidos, detOrdenes);
            cat.setVisible(true);
            this.dispose();
        } else if (dlg == JOptionPane.NO_OPTION) {
            //Orden ords = this.guardarDetalleEnOrden();
            /*manda la orden con solo los detalles de ordenes seteados*/
            //DetalladoOrden detOrd = new DetalladoOrden(ords);
           // detOrd.setVisible(true);
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        pnlCantidad = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();
        pnlAgregarNota = new javax.swing.JPanel();
        lblnotas1 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        btnGuardarNota = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlNotas = new javax.swing.JPanel();
        lblnotas2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnFinalizarDetallado = new javax.swing.JButton();
        btnEliminarNota = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 900));

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProducto.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        lblNombreProducto.setText("Café Americano");
        pnlFondo.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        btnMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenuPrincipal.setText("Menu principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        pnlFondo.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, -1, -1));

        pnlCantidad.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblCantidad.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(51, 51, 51));
        lblCantidad.setText("Cantidad");

        btnMenos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        btnMas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCantidadLayout = new javax.swing.GroupLayout(pnlCantidad);
        pnlCantidad.setLayout(pnlCantidadLayout);
        pnlCantidadLayout.setHorizontalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addGroup(pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCantidadLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCantidadLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblCantidad)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlCantidadLayout.setVerticalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblCantidad)
                .addGap(28, 28, 28)
                .addGroup(pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenos)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMas))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 360, 310));

        pnlAgregarNota.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblnotas1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblnotas1.setForeground(new java.awt.Color(51, 51, 51));
        lblnotas1.setText("Agregar nota");

        lblProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(51, 51, 51));
        lblProducto.setText("Producto ");

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane2.setViewportView(txtNota);

        btnGuardarNota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarNota.setText("Guardar nota");
        btnGuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNotaActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");

        javax.swing.GroupLayout pnlAgregarNotaLayout = new javax.swing.GroupLayout(pnlAgregarNota);
        pnlAgregarNota.setLayout(pnlAgregarNotaLayout);
        pnlAgregarNotaLayout.setHorizontalGroup(
            pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarNotaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblnotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarNotaLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(btnGuardarNota)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addGap(30, 30, 30))
            .addGroup(pnlAgregarNotaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProducto)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAgregarNotaLayout.setVerticalGroup(
            pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarNotaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblnotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNota)
                    .addComponent(btnRegresar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlAgregarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 480, 310));

        pnlNotas.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblnotas2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblnotas2.setForeground(new java.awt.Color(51, 51, 51));
        lblnotas2.setText("Notas del producto");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        btnFinalizarDetallado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFinalizarDetallado.setText("Finalizar detallado");
        btnFinalizarDetallado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarDetalladoActionPerformed(evt);
            }
        });

        btnEliminarNota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarNota.setText("Eliminar nota");
        btnEliminarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNotasLayout = new javax.swing.GroupLayout(pnlNotas);
        pnlNotas.setLayout(pnlNotasLayout);
        pnlNotasLayout.setHorizontalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFinalizarDetallado)
                .addGap(29, 29, 29)
                .addComponent(btnEliminarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNotasLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblnotas2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNotasLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnlNotasLayout.setVerticalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblnotas2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarDetallado)
                    .addComponent(btnEliminarNota))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 520, 310));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1590, 950));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        cant++;
        String cantidad = intAString(cant);
        txtCantidad.setText(cantidad);
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
        this.disminuirCantidad();
    }//GEN-LAST:event_btnMenosMouseClicked

    private void btnGuardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNotaActionPerformed
        this.agregarNotas();
        this.guardarNotas();
    }//GEN-LAST:event_btnGuardarNotaActionPerformed

    private void btnEliminarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarNotaActionPerformed
        notas.get(notas.size() - 1);
        this.mostrarNotas();
        this.disminuirCantidad();

    }//GEN-LAST:event_btnEliminarNotaActionPerformed

    private void btnFinalizarDetalladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarDetalladoActionPerformed
        this.finalizarDetalle();
    }//GEN-LAST:event_btnFinalizarDetalladoActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        MenuAdministarVenta jFrm = new MenuAdministarVenta();
        this.setVisible(false);
        jFrm.setVisible(true);
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarNotasProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarNota;
    private javax.swing.JButton btnFinalizarDetallado;
    private javax.swing.JButton btnGuardarNota;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblnotas1;
    private javax.swing.JLabel lblnotas2;
    private javax.swing.JPanel pnlAgregarNota;
    private javax.swing.JPanel pnlCantidad;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtNota;
    // End of variables declaration//GEN-END:variables

}
