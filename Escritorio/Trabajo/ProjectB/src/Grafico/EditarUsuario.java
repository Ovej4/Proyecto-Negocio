package Grafico;

import Codigo.Cliente;
import Codigo.Clientela;
import Codigo.Item;
import Codigo.Stock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarUsuario extends javax.swing.JFrame {

    public EditarUsuario() {
        this.setLocationRelativeTo(this);
        initComponents();
        int seleccionada=Ventana.tablaAgenda.getSelectedRow();
        txbNombreEC.setText(Clientela.clientitos[seleccionada].getNombre());
        txbTelefonoEC.setText(Clientela.clientitos[seleccionada].getTel()+""); 
        txbDeudaEC.setText(Clientela.clientitos[seleccionada].getDeuda()+"");
        txbDireccionEC.setText(Clientela.clientitos[seleccionada].getDireccion());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGuardarNC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txbNombreEC = new javax.swing.JTextField();
        txbTelefonoEC = new javax.swing.JTextField();
        txbDeudaEC = new javax.swing.JTextField();
        txbDireccionEC = new javax.swing.JTextField();
        btCancelarNC = new javax.swing.JButton();

        setTitle("Editar Cliente");
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
                            .addComponent(txbTelefonoEC)
                            .addComponent(txbNombreEC, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txbDireccionEC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txbDeudaEC, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbNombreEC)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbTelefonoEC)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbDeudaEC)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbDireccionEC)
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
        int posicion=Ventana.tablaAgenda.getSelectedRow();
        int corroborar = 0;
        if("".equals(txbNombreEC.getText())){
            JOptionPane.showMessageDialog(this, "Complete el nombre", "Error", 0);
        }else{
        corroborar=JOptionPane.showOptionDialog(this, "Seguro que desea realizar estas modificaciones a ´´" + Clientela.clientitos[posicion].getNombre() + "´´?" + "\n Nombre: " + txbNombreEC.getText() + "\n Telefono: " + txbTelefonoEC.getText() + "\n Dirección: " + txbDireccionEC.getText() + "\n Deuda: " + txbDeudaEC.getText(), "Confirmar edición", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "opcion 1");
        if(corroborar==0){
            Clientela.clientitos[posicion].setNombre(txbNombreEC.getText());
            Clientela.clientitos[posicion].setDireccion(txbDireccionEC.getText());
            Clientela.clientitos[posicion].setTel(Integer.parseInt(txbTelefonoEC.getText()));
            Clientela.clientitos[posicion].setDeuda(Float.parseFloat(txbDeudaEC.getText()));
        modelo.setRowCount(0);
        for(int i=0; i < Clientela.clientitos.length;i++){
            if(Clientela.clientitos[i].getTel()==0){
                modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(),"",Clientela.clientitos[i].getDireccion(),"$" + Clientela.clientitos[i].getDeuda()});
            }else{
                modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(),""+Clientela.clientitos[i].getTel(),Clientela.clientitos[i].getDireccion(),"$" + Clientela.clientitos[i].getDeuda()});       
            }
    }this.setVisible(false);
        }}
    }//GEN-LAST:event_btGuardarNCActionPerformed

    private void btCancelarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarNCActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarNCActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
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
    private javax.swing.JTextField txbDeudaEC;
    private javax.swing.JTextField txbDireccionEC;
    private javax.swing.JTextField txbNombreEC;
    private javax.swing.JTextField txbTelefonoEC;
    // End of variables declaration//GEN-END:variables

}
