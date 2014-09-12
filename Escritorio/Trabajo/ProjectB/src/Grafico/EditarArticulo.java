package Grafico;

import Codigo.Item;
import Codigo.Stock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarArticulo extends javax.swing.JFrame {

    public EditarArticulo() {
        this.setLocationRelativeTo(this);
        initComponents();
        int seleccionada=Ventana.tablaStock.getSelectedRow();
        txbArticuloEA.setText(Stock.baseItems[seleccionada].getNombre());
        txbCantidadEA.setText(Stock.baseItems[seleccionada].getCantidad()+""); 
        txbPrecioCEA.setText(Stock.baseItems[seleccionada].getPrecioCompra()+"");
        txbPrecioVEA.setText(Stock.baseItems[seleccionada].getPrecioVenta()+"");
        txbTipoBEA.setText(Stock.baseItems[seleccionada].getTipoBulto());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGuardarEA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txbArticuloEA = new javax.swing.JTextField();
        txbCantidadEA = new javax.swing.JTextField();
        txbTipoBEA = new javax.swing.JTextField();
        txbPrecioCEA = new javax.swing.JTextField();
        btCancelarEA = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txbPrecioVEA = new javax.swing.JTextField();

        setTitle("Agregar Cliente");
        setResizable(false);

        btGuardarEA.setText("Guardar");
        btGuardarEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarEAActionPerformed(evt);
            }
        });

        jLabel1.setText("Articulo");

        jLabel2.setText("Cantidad Actual:");

        jLabel3.setText("Tipo de Bulto:");

        jLabel4.setText("Precio Compra:");

        btCancelarEA.setText("Cancelar");
        btCancelarEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarEAActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio Venta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelarEA, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addGap(108, 108, 108)
                        .addComponent(btGuardarEA, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
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
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbPrecioVEA)
                            .addComponent(txbCantidadEA)
                            .addComponent(txbArticuloEA, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txbPrecioCEA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txbTipoBEA, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbArticuloEA)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbCantidadEA)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbTipoBEA)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbPrecioCEA)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbPrecioVEA)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarEA)
                    .addComponent(btGuardarEA))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarEAActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Ventana.tablaStock.getModel();
        int posicion=Ventana.tablaStock.getSelectedRow();
        int corroborar = 0;
        if("".equals(txbArticuloEA.getText())){
            JOptionPane.showMessageDialog(this, "Complete el nombre", "Error", 0);
        }else{
        corroborar=JOptionPane.showOptionDialog(this, "Seguro que desea realizar estas modificaciones a ´´" + Stock.baseItems[posicion].getNombre() + "´´?" + "\n Articulo: " + txbArticuloEA.getText() + "\n Cantidad actual: " + txbCantidadEA.getText() + "\n Bulto: " + txbTipoBEA.getText() + "\n Precio de Compra: " + txbPrecioCEA.getText() + "\n Precio de Venta: " + txbPrecioVEA.getText(), "Confirmar edición", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "opcion 1");
        if(corroborar==0){
        Stock.baseItems[posicion].setNombre(txbArticuloEA.getText());
        Stock.baseItems[posicion].setTipoBulto(txbTipoBEA.getText());
        Stock.baseItems[posicion].setCantidad(Integer.parseInt(txbCantidadEA.getText()));
        Stock.baseItems[posicion].setPrecioCompra(Float.parseFloat(txbPrecioCEA.getText()));
        Stock.baseItems[posicion].setPrecioVenta(Float.parseFloat(txbPrecioVEA.getText()));
        modelo.setRowCount(0);
        for(int i=0; i < Stock.baseItems.length;i++){
        modelo.addRow(new Object[]{Stock.baseItems[i].getNombre(),""+Stock.baseItems[i].getCantidad() + " " + Stock.baseItems[i].getTipoBulto(),"$" + Stock.baseItems[i].getPrecioCompra(),"$" + Stock.baseItems[i].getPrecioVenta()});
}
        this.setVisible(false);
        }}
    }//GEN-LAST:event_btGuardarEAActionPerformed

    private void btCancelarEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarEAActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarEAActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarEA;
    private javax.swing.JButton btGuardarEA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txbArticuloEA;
    private javax.swing.JTextField txbCantidadEA;
    private javax.swing.JTextField txbPrecioCEA;
    private javax.swing.JTextField txbPrecioVEA;
    private javax.swing.JTextField txbTipoBEA;
    // End of variables declaration//GEN-END:variables

}
