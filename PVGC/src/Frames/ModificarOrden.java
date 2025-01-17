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
import Enums.Estado;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

/**
 *
 * @author R2
 */
public class ModificarOrden extends FrmBase {

    DefaultListModel modeloLista;
    ControlOrden controlOrden;
    Orden ultimaOrdenSeleccionada;
    ControlDetalleOrden controlDO;

    /**
     * Creates new form ModificarOrden
     */
    public ModificarOrden() {
        initComponents();
        controlOrden = new ControlOrden();
        controlDO = new ControlDetalleOrden();
        adaptarPantalla();
        cargarCbModel();

        try {
            cargarOrdenes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSeparacion = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();
        lblListaOrdenes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOrdenes = new javax.swing.JList<>();
        JPModificar = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalleOrdenList = new javax.swing.JList<>();
        tfNumOrdenes = new javax.swing.JTextField();
        tfNumMesa = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        cbEstado = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Modificar Orden");
        JPPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        lblSeparacion.setForeground(new java.awt.Color(255, 255, 255));
        lblSeparacion.setText("___________________________________________________________________________________________________________________________________________________________________________");
        JPPrincipal.add(lblSeparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 86, 1420, -1));

        lblBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        lblBusqueda.setText("Ingrese el numero de la Orden que desea Modificar:");
        JPPrincipal.add(lblBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 177, 370, 32));

        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyTyped(evt);
            }
        });
        JPPrincipal.add(tfBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 370, 32));

        lblListaOrdenes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblListaOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        lblListaOrdenes.setText("Lista de Ordenes:");
        JPPrincipal.add(lblListaOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 222, -1, -1));

        ListOrdenes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListOrdenes);

        JPPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 224, 606));

        JPModificar.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo1.setText("Detalles");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Número de orden:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Número de mesa:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Estado:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Detalle de orden:");

        detalleOrdenList.setEnabled(false);
        jScrollPane2.setViewportView(detalleOrdenList);

        tfNumOrdenes.setEnabled(false);

        tfNumMesa.setEnabled(false);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        cbEstado.setEnabled(false);

        javax.swing.GroupLayout JPModificarLayout = new javax.swing.GroupLayout(JPModificar);
        JPModificar.setLayout(JPModificarLayout);
        JPModificarLayout.setHorizontalGroup(
            JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPModificarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfNumOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addComponent(tfNumMesa)
                        .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPModificarLayout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPModificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        JPModificarLayout.setVerticalGroup(
            JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNumOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        JPPrincipal.add(JPModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 250, 580, -1));

        btnCancelar.setText("Volver al menu");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        JPPrincipal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, 43));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        JPPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1200, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new MenuAdministrarProductos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
        tfBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {

                tfBusqueda.setText(tfBusqueda.getText().replaceAll("\\p{javaSpaceChar}{2,}", " "));

                if (!tfBusqueda.getText().equals("")) {
                    Orden ordenes = controlOrden.consultarOrdenPorNumOrden(Integer.parseInt(tfBusqueda.getText()));
                    if (ordenes != null) {
                        modeloLista = new DefaultListModel();

                        modeloLista.addElement("Orden: " + ordenes.getId() + "       estado: " + ordenes.getEstado().toString());
                        ListOrdenes.setModel(modeloLista);

                    }
                } else {

                    try {
                        cargarOrdenes();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }

            }
        });
    }//GEN-LAST:event_tfBusquedaKeyTyped

    private void ListOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListOrdenesMouseClicked
        listOrdenesMethod();
    }//GEN-LAST:event_ListOrdenesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (ultimaOrdenSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una orden para poder modificarla");
            return;
        }
        
        if (ultimaOrdenSeleccionada.getEstado().equals(Estado.ESPERA)) {
            this.dispose();
            new Categoriasv2(ultimaOrdenSeleccionada).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "La orden actual no se puede modificar porque su estado esta concluido o se esta procesando");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void cargarOrdenes() throws SQLException {
        List<Orden> ordenes = this.controlOrden.consultarOrdenes();
        if (ordenes != null) {
            modeloLista = new DefaultListModel();
            for (Orden orden : ordenes) {
                modeloLista.addElement("Orden: " + orden.getId() + "       estado: " + orden.getEstado().toString());
            }
            ListOrdenes.setModel(modeloLista);
        }
    }

    private void listOrdenesMethod() {
        String index = ListOrdenes.getSelectedValue();
        int numOrden = Integer.parseInt(index.charAt(7) + "");

        Orden orden = controlOrden.consultarOrdenPorNumOrden(numOrden);
        ultimaOrdenSeleccionada = orden;
        lblTitulo1.setText("Detalles de orden " + orden.getId());
        tfNumMesa.setText(orden.getNumMesa() + "");
        tfNumOrdenes.setText(orden.getId() + "");
        cbEstado.setSelectedItem(orden.getEstado());
        List<DetalleOrden> detalles = orden.getDetalleOrdenes();

        DefaultListModel modelo2 = new DefaultListModel();

        for (DetalleOrden detalle : detalles) {
            modelo2.addElement(detalle.getProducto().getNombre());
        }
        detalleOrdenList.setModel(modelo2);
    }

    private void cargarCbModel() {
        cbEstado.setModel(new DefaultComboBoxModel(Estado.values()));
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPModificar;
    private javax.swing.JPanel JPPrincipal;
    private javax.swing.JList<String> ListOrdenes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JList<String> detalleOrdenList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblListaOrdenes;
    private javax.swing.JLabel lblSeparacion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfNumMesa;
    private javax.swing.JTextField tfNumOrdenes;
    // End of variables declaration//GEN-END:variables
}
