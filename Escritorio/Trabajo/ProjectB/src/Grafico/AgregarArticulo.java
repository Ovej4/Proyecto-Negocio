package Grafico;

import Codigo.Item;
import Codigo.Stock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarArticulo extends javax.swing.JFrame {

    public AgregarArticulo() {
        this.setLocationRelativeTo(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGuardarNA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txbArticuloNA = new javax.swing.JTextField();
        txbCantidadNA = new javax.swing.JTextField();
        txbTipoBNA = new javax.swing.JTextField();
        txbPrecioCNA = new javax.swing.JTextField();
        btCancelarNA = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txbPrecioVNA = new javax.swing.JTextField();

        setTitle("Agregar Cliente");
        setResizable(false);

        btGuardarNA.setText("Guardar");
        btGuardarNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarNAActionPerformed(evt);
            }
        });

        jLabel1.setText("Articulo");

        jLabel2.setText("Cantidad Actual:");

        jLabel3.setText("Tipo de Bulto:");

        jLabel4.setText("Precio Compra:");

        btCancelarNA.setText("Cancelar");
        btCancelarNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarNAActionPerformed(evt);
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
                        .addComponent(btCancelarNA, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addGap(108, 108, 108)
                        .addComponent(btGuardarNA, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
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
                            .addComponent(txbPrecioVNA)
                            .addComponent(txbCantidadNA)
                            .addComponent(txbArticuloNA, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txbPrecioCNA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txbTipoBNA, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbArticuloNA)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbCantidadNA)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbTipoBNA)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbPrecioCNA)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbPrecioVNA)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarNA)
                    .addComponent(btGuardarNA))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarNAActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Ventana.tablaStock.getModel();
        Item itemsito = new Item();
        boolean completadas = false;
        if(!txbArticuloNA.getText().equals("")){
             itemsito.setNombre(txbArticuloNA.getText());
             completadas=true;
        
        if(!txbPrecioVNA.getText().equals("")){
             itemsito.setPrecioVenta(Float.parseFloat(txbPrecioVNA.getText()));
        }
        if(!txbCantidadNA.getText().equals("")){
             itemsito.setCantidad(Integer.parseInt(txbCantidadNA.getText()));
        }
        if(!txbPrecioCNA.getText().equals("")){
            itemsito.setPrecioCompra(Float.parseFloat(txbPrecioCNA.getText()));
        }
        if(!txbTipoBNA.getText().equals("")){
            itemsito.setTipoBulto(txbTipoBNA.getText());
        }
        }
        if(completadas){
            boolean seCargo = Stock.addItem(itemsito);
            if(seCargo==false){
            JOptionPane.showMessageDialog(this, "Ya existe un articulo con ese nombre", "Error", 0);
        }else{
            modelo.setRowCount(0);
            for(int i=0; i < Stock.baseItems.length;i++){
                    modelo.addRow(new Object[]{Stock.baseItems[i].getNombre(),""+Stock.baseItems[i].getCantidad() + " " + Stock.baseItems[i].getTipoBulto(),"$" + Stock.baseItems[i].getPrecioCompra(),"$" + Stock.baseItems[i].getPrecioVenta()});
            }
            txbArticuloNA.setText("");
            txbPrecioCNA.setText("");
            txbTipoBNA.setText("");
            txbCantidadNA.setText("");
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "El articulo se cargó con éxito", "Informacion", 1);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Complete el nombre del articulo", "Error", 0);
        }
    }//GEN-LAST:event_btGuardarNAActionPerformed

    private void btCancelarNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarNAActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarNAActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarNA;
    private javax.swing.JButton btGuardarNA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txbArticuloNA;
    private javax.swing.JTextField txbCantidadNA;
    private javax.swing.JTextField txbPrecioCNA;
    private javax.swing.JTextField txbPrecioVNA;
    private javax.swing.JTextField txbTipoBNA;
    // End of variables declaration//GEN-END:variables

}
