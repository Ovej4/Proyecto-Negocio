package Grafico;

import Codigo.Cliente;
import Codigo.Clientela;
import Codigo.Item;
import Codigo.Stock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUsuario
     */
    public AgregarUsuario() {
        this.setLocationRelativeTo(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGuardarNC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txbNombreNC = new javax.swing.JTextField();
        txbTelefonoNC = new javax.swing.JTextField();
        txbDeudaNC = new javax.swing.JTextField();
        txbDireccionNC = new javax.swing.JTextField();
        btCancelarNC = new javax.swing.JButton();

        setTitle("Agregar Cliente");
        setResizable(false);

        btGuardarNC.setText("Guardar");
        btGuardarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarNCActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Telefono:");

        jLabel3.setText("Deuda:");

        jLabel4.setText("Direccion:");

        btCancelarNC.setText("Cancelar");
        btCancelarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarNCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelarNC, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addGap(95, 95, 95)
                        .addComponent(btGuardarNC, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbTelefonoNC)
                            .addComponent(txbNombreNC, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txbDireccionNC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txbDeudaNC, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbNombreNC)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbTelefonoNC)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbDeudaNC)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbDireccionNC)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardarNC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelarNC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarNCActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Ventana.tablaAgenda.getModel();
        Cliente clientito = new Cliente();
        boolean completadas = false;
        if (!txbNombreNC.getText().equals("")) {
            clientito.setNombre(txbNombreNC.getText());
            completadas = true;
            if (!txbDireccionNC.getText().equals("")) {
                clientito.setDireccion(txbDireccionNC.getText());
            }
            if (!txbTelefonoNC.getText().equals("")) {
                clientito.setTel(Integer.parseInt(txbTelefonoNC.getText()));
            }
            if (!txbDeudaNC.getText().equals("")) {
                clientito.setDeuda(Float.parseFloat(txbDeudaNC.getText()));
            }
        }
        if (completadas) {
            boolean seCargo = Clientela.addCliente(clientito);
            if (seCargo == false) {
                JOptionPane.showMessageDialog(this, "Ya existe un cliente con ese nombre", "Error", 0);
            } else {
                modelo.setRowCount(0);
                for (int i = 0; i < Clientela.clientitos.length; i++) {
                    if (Clientela.clientitos[i].getTel() == 0) {
                        modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "", Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
                    } else {
                        modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "" + Clientela.clientitos[i].getTel(), Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
                    }
                }
                txbNombreNC.setText("");
                txbDireccionNC.setText("");
                txbDeudaNC.setText("");
                txbTelefonoNC.setText("");
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "El cliente se cargó con éxito", "Informacion", 1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete el nombre del cliente", "Error", 0);
        }
    }//GEN-LAST:event_btGuardarNCActionPerformed

    private void btCancelarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarNCActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarNCActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarNC;
    private javax.swing.JButton btGuardarNC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txbDeudaNC;
    private javax.swing.JTextField txbDireccionNC;
    private javax.swing.JTextField txbNombreNC;
    private javax.swing.JTextField txbTelefonoNC;
    // End of variables declaration//GEN-END:variables
}
