/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Control.ControlDetalleOrden;
import Control.ControlOrden;
import Dominio.DetalleOrden;
import Dominio.Orden;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Citlali Orduño
 */
public class DetalladoOrden extends FrmBase {

    public ControlDetalleOrden ctrlDetOrden;
    public Orden orden;
    public ControlOrden ctrlOrden;
    public DetalleOrden detOrden;
    public List<DetalleOrden> detOrdenes;

    //En este constructor debe de recibir la orden para poder plasmar los productos
    public DetalladoOrden() {
        adaptarPantalla();
        this.detOrdenes = new ArrayList<>();
       
        initComponents(); 
       

    }

    

    public void mostrarIndicadores() {
       
      
    }

    public void mostrarProductos() {
        double total = 0;
        detOrdenes = ctrlDetOrden.consultarOrdenes(detOrden);

        for (DetalleOrden detOrdene : detOrdenes) {
            String nombre = detOrdene.getProducto().getNombre();
            int cantidad = detOrdene.getCantidad();
            double precio = detOrdene.getTotal();
            total = (precio * cantidad);

            String cantString = String.valueOf(cantidad);
            String totalString = String.valueOf(total);

            String cadena = "      " + nombre + "     " + cantString + "       " + totalString;

            JTextField txtDetOrden = new JTextField(20);
            
            txtDetOrden.setText(cadena);
            txtDetOrden.setEditable(false);

           
        }
        total++;
//        txtTotal.setText("" + total);
//        txtTotal.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        TituloMenuTomarPedido = new javax.swing.JLabel();
        pnlCantidad1 = new javax.swing.JPanel();
        lblNumMesa = new javax.swing.JLabel();
        txtNumOrden = new javax.swing.JTextField();
        lblNumOrden1 = new javax.swing.JLabel();
        btnCobrarOrden = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        brnPrincipal = new javax.swing.JButton();
        scrllDetalleOrdenes = new javax.swing.JScrollPane();
        pnlCantidad2 = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloMenuTomarPedido.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 60)); // NOI18N
        TituloMenuTomarPedido.setForeground(new java.awt.Color(206, 215, 231));
        TituloMenuTomarPedido.setText("Detallado de orden");
        pnlFondo.add(TituloMenuTomarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        pnlCantidad1.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblNumMesa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNumMesa.setForeground(new java.awt.Color(153, 153, 153));
        lblNumMesa.setText("Num. Mesa: ");

        txtNumOrden.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        lblNumOrden1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNumOrden1.setForeground(new java.awt.Color(153, 153, 153));
        lblNumOrden1.setText("Num. Orden");

        javax.swing.GroupLayout pnlCantidad1Layout = new javax.swing.GroupLayout(pnlCantidad1);
        pnlCantidad1.setLayout(pnlCantidad1Layout);
        pnlCantidad1Layout.setHorizontalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNumMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(lblNumOrden1)
                .addGap(128, 128, 128))
        );
        pnlCantidad1Layout.setVerticalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCantidad1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNumMesa))
                    .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrden1)
                        .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 880, 110));

        btnCobrarOrden.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCobrarOrden.setText("Cobrar Orden");
        pnlFondo.add(btnCobrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 770, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 770, -1, -1));

        brnPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        brnPrincipal.setText("Menu principal");
        brnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnPrincipalActionPerformed(evt);
            }
        });
        pnlFondo.add(brnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 870, -1, -1));

        pnlCantidad2.setBackground(new java.awt.Color(206, 215, 231, 200));

        javax.swing.GroupLayout pnlCantidad2Layout = new javax.swing.GroupLayout(pnlCantidad2);
        pnlCantidad2.setLayout(pnlCantidad2Layout);
        pnlCantidad2Layout.setHorizontalGroup(
            pnlCantidad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
        );
        pnlCantidad2Layout.setVerticalGroup(
            pnlCantidad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        scrllDetalleOrdenes.setViewportView(pnlCantidad2);

        pnlFondo.add(scrllDetalleOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 868, 370));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 950));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editotxtNumMesaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalladoOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloMenuTomarPedido;
    private javax.swing.JButton brnPrincipal;
    private javax.swing.JButton btnCobrarOrden;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblNumOrden1;
    private javax.swing.JPanel pnlCantidad1;
    private javax.swing.JPanel pnlCantidad2;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JScrollPane scrllDetalleOrdenes;
    private javax.swing.JTextField txtNumOrden;
    // End of variables declaration//GEN-END:variables
}
