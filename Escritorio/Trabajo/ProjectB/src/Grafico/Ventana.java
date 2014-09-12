package Grafico;

import Codigo.Reloj;
import Codigo.CajaD;
import Codigo.CajaGeneral;
import Codigo.Clientela;
import Codigo.GuardaCargador;
import Codigo.Stock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        System.out.println(Reloj.getYear());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        initComponents();
        Reloj relojito = new Reloj(0, 0, 300, 20);
        pnlReloj.add(relojito);
        Clientela.clientitos = GuardaCargador.cargadorC();
        DefaultTableModel modelo = (DefaultTableModel) Ventana.tablaAgenda.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < Clientela.clientitos.length; i++) {
            if (Clientela.clientitos[i].getTel() == 0) {
                modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "", Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
            } else {
                modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "" + Clientela.clientitos[i].getTel(), Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
            }
        }
        Stock.baseItems = GuardaCargador.cargadorS();
        modelo = (DefaultTableModel) Ventana.tablaStock.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < Stock.baseItems.length; i++) {
            modelo.addRow(new Object[]{Stock.baseItems[i].getNombre(), "" + Stock.baseItems[i].getCantidad() + " " + Stock.baseItems[i].getTipoBulto(), "$" + Stock.baseItems[i].getPrecioCompra(), "$" + Stock.baseItems[i].getPrecioVenta()});
        }
        for (int i = 1990; i < Integer.parseInt(Reloj.getYear()) + 1; i++) {
            cbxAño.addItem(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txbNombreEncontrado3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAgenda = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txbBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btBuscarUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txbNombreEncontrado = new javax.swing.JTextField();
        txbTelefonoEncontrado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txbDeudaEncontrada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btLimpiarBusqueda = new javax.swing.JButton();
        txbDireccionEncontrada = new javax.swing.JTextField();
        Boton_EditarUsuario = new javax.swing.JButton();
        Boton_CrearUsuario = new javax.swing.JButton();
        Boton_BorrarUsuario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaStock = new javax.swing.JTable();
        Boton_CrearItem = new javax.swing.JButton();
        Boton_EditarItem = new javax.swing.JButton();
        Boton_BorrarItem = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txbArticuloEncontrado = new javax.swing.JTextField();
        txbCantidadEncontrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txbPrecioVEncontrado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btLimpiarBusqueda1 = new javax.swing.JButton();
        txbPrecioCEncontrado = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txbBuscarItem = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btBuscarItem = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tbxPersonales = new javax.swing.JTextField();
        tbxRetiros = new javax.swing.JTextField();
        tbxGastos = new javax.swing.JTextField();
        tbxCajaIni = new javax.swing.JTextField();
        tbxVenta = new javax.swing.JTextField();
        tbxCajaFin = new javax.swing.JTextField();
        btGuardarCaja = new javax.swing.JButton();
        btActualizarCaja = new javax.swing.JButton();
        cbxMes = new javax.swing.JComboBox();
        cbxDia = new javax.swing.JComboBox();
        cbxAño = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlReloj = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Guardar = new javax.swing.JMenuItem();
        Cargar = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        AgregarC = new javax.swing.JMenuItem();
        Inventario = new javax.swing.JMenu();
        AgregarI = new javax.swing.JMenuItem();

        jLabel6.setText("Direccion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WeCSIt");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        tablaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Telefono", "Direccion", "Deuda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAgenda);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("Nombre o Telefono:");

        btBuscarUsuario.setText("Buscar");
        btBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(btBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.CENTER))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setText("Nombre");

        txbNombreEncontrado.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbNombreEncontrado.setEnabled(false);

        txbTelefonoEncontrado.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbTelefonoEncontrado.setEnabled(false);

        jLabel4.setText("Telefono");

        jLabel5.setText("Direccion");

        txbDeudaEncontrada.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbDeudaEncontrada.setEnabled(false);

        jLabel7.setText("Deuda");

        btLimpiarBusqueda.setText("Limpiar");
        btLimpiarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarBusquedaActionPerformed(evt);
            }
        });

        txbDireccionEncontrada.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbDireccionEncontrada.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbNombreEncontrado, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbTelefonoEncontrado, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbDeudaEncontrada, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(btLimpiarBusqueda, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbDireccionEncontrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbNombreEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbTelefonoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbDireccionEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbDeudaEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLimpiarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        Boton_EditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit_User.png"))); // NOI18N
        Boton_EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarUsuarioActionPerformed(evt);
            }
        });

        Boton_CrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add_User.png"))); // NOI18N
        Boton_CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CrearUsuarioActionPerformed(evt);
            }
        });

        Boton_BorrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_User.png"))); // NOI18N
        Boton_BorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BorrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Boton_CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_EditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_BorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_EditarUsuario)
                            .addComponent(Boton_CrearUsuario)
                            .addComponent(Boton_BorrarUsuario))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agenda", jPanel1);

        tablaStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Cantidad Actual", "Precio Compra", "Precio Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaStock);

        Boton_CrearItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add_Item.png"))); // NOI18N
        Boton_CrearItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CrearItemActionPerformed(evt);
            }
        });

        Boton_EditarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit_Item.png"))); // NOI18N
        Boton_EditarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarItemActionPerformed(evt);
            }
        });

        Boton_BorrarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Item.png"))); // NOI18N
        Boton_BorrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BorrarItemActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel8.setText("Nombre del Articulo");

        txbArticuloEncontrado.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbArticuloEncontrado.setEnabled(false);

        txbCantidadEncontrada.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbCantidadEncontrada.setEnabled(false);

        jLabel9.setText("Cantidad Actual");

        jLabel10.setText("Precio Compra");

        txbPrecioVEncontrado.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbPrecioVEncontrado.setEnabled(false);

        jLabel11.setText("Precio Venta");

        btLimpiarBusqueda1.setText("Limpiar");
        btLimpiarBusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarBusqueda1ActionPerformed(evt);
            }
        });

        txbPrecioCEncontrado.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txbPrecioCEncontrado.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbArticuloEncontrado, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbCantidadEncontrada, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbPrecioVEncontrado, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btLimpiarBusqueda1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbPrecioCEncontrado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbArticuloEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbCantidadEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbPrecioCEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbPrecioVEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLimpiarBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel12.setText("Articulo");

        btBuscarItem.setText("Buscar");
        btBuscarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txbBuscarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(btBuscarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.CENTER))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbBuscarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBuscarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Boton_CrearItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_EditarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_BorrarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_EditarItem)
                            .addComponent(Boton_CrearItem)
                            .addComponent(Boton_BorrarItem))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Control de Stock", jPanel4);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Caja Diaria"));

        jLabel13.setText("Caja Inicial:");

        jLabel14.setText("Gastos:");

        jLabel15.setText("Retiros:");

        jLabel16.setText("Personales:");

        jLabel17.setText("Caja Final:");

        jLabel18.setText("Venta:");

        tbxRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxRetirosActionPerformed(evt);
            }
        });

        tbxCajaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxCajaIniActionPerformed(evt);
            }
        });

        tbxVenta.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        tbxVenta.setEnabled(false);

        tbxCajaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxCajaFinActionPerformed(evt);
            }
        });

        btGuardarCaja.setText("Guardar");
        btGuardarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarCajaActionPerformed(evt);
            }
        });

        btActualizarCaja.setText("Actualizar");
        btActualizarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarCajaActionPerformed(evt);
            }
        });

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbxMes.setEnabled(false);
        cbxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMesActionPerformed(evt);
            }
        });

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia" }));
        cbxDia.setEnabled(false);

        cbxAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año" }));
        cbxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tbxCajaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tbxPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tbxRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbxCajaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbxGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(217, 217, 217))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(tbxVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btActualizarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btGuardarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 89, 89))))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxCajaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(tbxRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxCajaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbxVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btActualizarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btGuardarCaja)
                        .addGap(33, 33, 33))))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensual"));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(435, 435, 435))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Control General", jPanel7);

        jLabel1.setText("We Can Sell It");

        javax.swing.GroupLayout pnlRelojLayout = new javax.swing.GroupLayout(pnlReloj);
        pnlReloj.setLayout(pnlRelojLayout);
        pnlRelojLayout.setHorizontalGroup(
            pnlRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        pnlRelojLayout.setVerticalGroup(
            pnlRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        Archivo.setText("Archivo");

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Archivo.add(Guardar);

        Cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Load.png"))); // NOI18N
        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        Archivo.add(Cargar);

        jMenuBar1.add(Archivo);

        Clientes.setText("Clientes");

        AgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add_User.png"))); // NOI18N
        AgregarC.setText("Agregar");
        AgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCActionPerformed(evt);
            }
        });
        Clientes.add(AgregarC);

        jMenuBar1.add(Clientes);

        Inventario.setText("Stock");

        AgregarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add_Item.png"))); // NOI18N
        AgregarI.setText("Agregar Articulo");
        AgregarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarIActionPerformed(evt);
            }
        });
        Inventario.add(AgregarI);

        jMenuBar1.add(Inventario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CrearUsuarioActionPerformed
        new AgregarUsuario().setVisible(true);
}//GEN-LAST:event_Boton_CrearUsuarioActionPerformed

    private void btLimpiarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarBusquedaActionPerformed
        txbDeudaEncontrada.setText("");
        txbDireccionEncontrada.setText("");
        txbNombreEncontrado.setText("");
        txbTelefonoEncontrado.setText("");

}//GEN-LAST:event_btLimpiarBusquedaActionPerformed

    private void btBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarUsuarioActionPerformed
        if (!txbBuscar.getText().equals("")) {
            try {
                int telefono = Integer.parseInt(txbBuscar.getText());
                String nombre = " ";
                Clientela.BuscarPorTelefono(telefono);
                if (Clientela.BuscarExistencia(nombre, telefono) == false) {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado un cliente con ese telefono", "Informacion", 1);
                } else {
                    if (Clientela.BuscarDireccion(Clientela.BuscarPorTelefono(telefono)) == null) {
                        txbDireccionEncontrada.setText("Desconocida");
                    } else {
                        txbDireccionEncontrada.setText("" + Clientela.BuscarDireccion(Clientela.BuscarPorTelefono(telefono)));
                    }
                    if (Clientela.BuscarPorTelefono(telefono) == null) {
                        txbNombreEncontrado.setText("Desconocido");
                    } else {
                        txbNombreEncontrado.setText("" + Clientela.BuscarPorTelefono(telefono));
                    }
                    txbDeudaEncontrada.setText("" + Clientela.BuscarDeuda(Clientela.BuscarPorTelefono(telefono)));
                    txbTelefonoEncontrado.setText("" + telefono);
                }
            } catch (java.lang.NumberFormatException e) {
                String nombre = txbBuscar.getText();
                int telefono = 0;
                Clientela.BuscarPorNombre(nombre);
                if (Clientela.BuscarExistencia(nombre, telefono) == false) {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado un cliente con ese nombre", "Informacion", 1);
                } else {
                    if (Clientela.BuscarDireccion(nombre).equals("")) {
                        txbDireccionEncontrada.setText("Desconocida");
                    } else {
                        txbDireccionEncontrada.setText("" + Clientela.BuscarDireccion(nombre));
                    }
                    if (Clientela.BuscarPorNombre(nombre) == 0) {
                        txbTelefonoEncontrado.setText("Desconocido");
                    } else {
                        txbTelefonoEncontrado.setText("" + Clientela.BuscarPorNombre(nombre));
                    }
                    txbDeudaEncontrada.setText("" + Clientela.BuscarDeuda(nombre));
                    txbNombreEncontrado.setText("" + nombre);

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un Nombre o Telefono para buscar", "Error", 0);
        }
}//GEN-LAST:event_btBuscarUsuarioActionPerformed

    private void Boton_EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarUsuarioActionPerformed
        int seleccionada = Ventana.tablaAgenda.getSelectedRow();
        if (seleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione el cliente a editar en la tabla primero", "Error", 0);
        } else {
            new EditarUsuario().setVisible(true);
        }
    }//GEN-LAST:event_Boton_EditarUsuarioActionPerformed

    private void Boton_BorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BorrarUsuarioActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Ventana.tablaAgenda.getModel();
        int seleccionada = Ventana.tablaAgenda.getSelectedRow();
        if (seleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione el cliente a eliminar en la tabla primero", "Error", 0);
        } else {
            int corroborar = JOptionPane.showOptionDialog(this, "Seguro que desea eliminar el Cliente ´´" + Clientela.clientitos[seleccionada].getNombre() + "´´?", "Confirmar eliminacion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "opcion 1");
            if (corroborar == 0) {
                Clientela.BorrarCliente(seleccionada);
                modelo.setRowCount(0);
                for (int i = 0; i < Clientela.clientitos.length; i++) {
                    if (Clientela.clientitos[i].getTel() == 0) {
                        modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "", Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
                    } else {
                        modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "" + Clientela.clientitos[i].getTel(), Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
                    }
                }
            }
        }
    }//GEN-LAST:event_Boton_BorrarUsuarioActionPerformed

    private void Boton_CrearItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CrearItemActionPerformed
        new AgregarArticulo().setVisible(true);
    }//GEN-LAST:event_Boton_CrearItemActionPerformed

    private void Boton_EditarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarItemActionPerformed
        int seleccionada = Ventana.tablaStock.getSelectedRow();
        if (seleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione el articulo a editar en la tabla primero", "Error", 0);
        } else {
            new EditarArticulo().setVisible(true);
        }
    }//GEN-LAST:event_Boton_EditarItemActionPerformed

    private void Boton_BorrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BorrarItemActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Ventana.tablaStock.getModel();
        int seleccionada = Ventana.tablaStock.getSelectedRow();
        if (seleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione el articulo a eliminar en la tabla primero", "Error", 0);
        } else {
            int corroborar = JOptionPane.showOptionDialog(this, "Seguro que desea eliminar el Articulo ´´" + Stock.baseItems[seleccionada].getNombre() + "´´?", "Confirmar eliminacion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "opcion 1");
            if (corroborar == 0) {
                Stock.BorrarArticulo(seleccionada);
                modelo.setRowCount(0);
                modelo.setRowCount(0);
                for (int i = 0; i < Stock.baseItems.length; i++) {
                    modelo.addRow(new Object[]{Stock.baseItems[i].getNombre(), "" + Stock.baseItems[i].getCantidad() + " " + Stock.baseItems[i].getTipoBulto(), "$" + Stock.baseItems[i].getPrecioCompra(), "$" + Stock.baseItems[i].getPrecioVenta()});
                }
            }
        }
    }//GEN-LAST:event_Boton_BorrarItemActionPerformed

    private void btLimpiarBusqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarBusqueda1ActionPerformed
        txbArticuloEncontrado.setText("");
        txbCantidadEncontrada.setText("");
        txbPrecioCEncontrado.setText("");
        txbPrecioVEncontrado.setText("");
    }//GEN-LAST:event_btLimpiarBusqueda1ActionPerformed

    private void btBuscarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarItemActionPerformed
        if (Stock.BuscarExistencia(txbBuscarItem.getText()) == false) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado un articulo con ese nombre", "Informacion", 1);
        } else {
            int posicion = Stock.Buscar(txbBuscarItem.getText());
            txbArticuloEncontrado.setText(Stock.baseItems[posicion].getNombre());
            txbCantidadEncontrada.setText(Stock.baseItems[posicion].getCantidad() + " " + Stock.baseItems[posicion].getTipoBulto());
            txbPrecioCEncontrado.setText(Stock.baseItems[posicion].getPrecioCompra() + "");
            txbPrecioVEncontrado.setText(Stock.baseItems[posicion].getPrecioVenta() + "");

        }
    }//GEN-LAST:event_btBuscarItemActionPerformed

    private void tbxCajaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxCajaIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxCajaIniActionPerformed

    private void btActualizarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarCajaActionPerformed

        if ("".equals(tbxCajaIni.getText())) {
            tbxCajaIni.setText("0");
        }
        CajaD.setCinicial(Float.parseFloat(tbxCajaIni.getText()));
        if ("".equals(tbxGastos.getText())) {
            tbxGastos.setText("0");
        }
        CajaD.setGastos(Float.parseFloat(tbxGastos.getText()));
        if ("".equals(tbxRetiros.getText())) {
            tbxRetiros.setText("0");
        }
        CajaD.setRetiros(Float.parseFloat(tbxRetiros.getText()));
        if ("".equals(tbxPersonales.getText())) {
            tbxPersonales.setText("0");
        }
        CajaD.setPersonales(Float.parseFloat(tbxPersonales.getText()));
        if ("".equals(tbxCajaFin.getText())) {
            tbxCajaFin.setText("0");
        }
        CajaD.setCfinal(Float.parseFloat(tbxCajaFin.getText()));
        tbxVenta.setText("$ " + CajaD.CalcularVenta());

    }//GEN-LAST:event_btActualizarCajaActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        GuardaCargador.guardador(Clientela.clientitos, Stock.baseItems);
    }//GEN-LAST:event_GuardarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        Clientela.clientitos = GuardaCargador.cargadorC();
        DefaultTableModel modelo = (DefaultTableModel) Ventana.tablaAgenda.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < Clientela.clientitos.length; i++) {
            if (Clientela.clientitos[i].getTel() == 0) {
                modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "", Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
            } else {
                modelo.addRow(new Object[]{Clientela.clientitos[i].getNombre(), "" + Clientela.clientitos[i].getTel(), Clientela.clientitos[i].getDireccion(), "$" + Clientela.clientitos[i].getDeuda()});
            }
        }

        Stock.baseItems = GuardaCargador.cargadorS();
        modelo = (DefaultTableModel) Ventana.tablaStock.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < Stock.baseItems.length; i++) {
            modelo.addRow(new Object[]{Stock.baseItems[i].getNombre(), "" + Stock.baseItems[i].getCantidad() + " " + Stock.baseItems[i].getTipoBulto(), "$" + Stock.baseItems[i].getPrecioCompra(), "$" + Stock.baseItems[i].getPrecioVenta()});
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void AgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCActionPerformed
        new AgregarUsuario().setVisible(true);
    }//GEN-LAST:event_AgregarCActionPerformed

    private void AgregarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarIActionPerformed
        new AgregarArticulo().setVisible(true);
    }//GEN-LAST:event_AgregarIActionPerformed

    private void btGuardarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarCajaActionPerformed

        if ("".equals(tbxCajaIni.getText())) {
            tbxCajaIni.setText("0");
        }
        CajaD.setCinicial(Float.parseFloat(tbxCajaIni.getText()));
        if ("".equals(tbxGastos.getText())) {
            tbxGastos.setText("0");
        }
        CajaD.setGastos(Float.parseFloat(tbxGastos.getText()));
        if ("".equals(tbxRetiros.getText())) {
            tbxRetiros.setText("0");
        }
        CajaD.setRetiros(Float.parseFloat(tbxRetiros.getText()));
        if ("".equals(tbxPersonales.getText())) {
            tbxPersonales.setText("0");
        }
        CajaD.setPersonales(Float.parseFloat(tbxPersonales.getText()));
        if ("".equals(tbxCajaFin.getText())) {
            tbxCajaFin.setText("0");
        }
        CajaD.setCfinal(Float.parseFloat(tbxCajaFin.getText()));
        tbxVenta.setText("$ " + CajaD.CalcularVenta());
        CajaD ncaja = new CajaD();
        if (cbxAño.getSelectedIndex() != 0) {
            if (cbxMes.getSelectedIndex() != 0) {
                if (cbxDia.getSelectedIndex() != 0) {
                    CajaD.setCfinal(Integer.parseInt(tbxCajaFin.getText()));
                    CajaD.setCinicial(Integer.parseInt(tbxCajaIni.getText()));
                    CajaD.setGastos(Integer.parseInt(tbxGastos.getText()));
                    CajaD.setPersonales(Integer.parseInt(tbxPersonales.getText()));
                    CajaD.setRetiros(Integer.parseInt(tbxRetiros.getText()));
                    CajaD.setVenta(CajaD.CalcularVenta());
                    String mes = "";
                    if (1 == cbxMes.getSelectedIndex()) {
                        mes = "Enero";
                    }
                    if (2 == cbxMes.getSelectedIndex()) {
                        mes = "Febrero";
                    }
                    if (3 == cbxMes.getSelectedIndex()) {
                        mes = "Marzo";
                    }
                    if (4 == cbxMes.getSelectedIndex()) {
                        mes = "Abril";
                    }
                    if (5 == cbxMes.getSelectedIndex()) {
                        mes = "Mayo";
                    }
                    if (6 == cbxMes.getSelectedIndex()) {
                        mes = "Junio";
                    }
                    if (7 == cbxMes.getSelectedIndex()) {
                        mes = "Julio";
                    }
                    if (8 == cbxMes.getSelectedIndex()) {
                        mes = "Agosto";
                    }
                    if (9 == cbxMes.getSelectedIndex()) {
                        mes = "Septiembre";
                    }
                    if (10 == cbxMes.getSelectedIndex()) {
                        mes = "Octubre";
                    }
                    if (11 == cbxMes.getSelectedIndex()) {
                        mes = "Noviembre";
                    }
                    if (12 == cbxMes.getSelectedIndex()) {
                        mes = "Diciembre";
                    }
                    String dia = cbxDia.getSelectedIndex() + "";
                    int añito = cbxAño.getSelectedIndex() - 1 + 1990;
                    String año = añito + "";
                    int corroborar = 0;
                    CajaD.setFecha(dia, mes, año);
                    CajaD.setMes(mes);
                    corroborar = JOptionPane.showOptionDialog(this, "Desea guardar la siguiente caja al dia ´´" + CajaD.getFecha() + "´´?" + "\n Caja Inicial: $" + CajaD.getCinicial() + "\n Gastos: $" + CajaD.getGastos() + "\n Retiros: $" + CajaD.getRetiros() + "\n Personales: $" + +CajaD.getPersonales() + "\n Caja Final: $" + CajaD.getCfinal() + "\n Ventas: $" + +CajaD.getVenta(), "Confirmar edición", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "opcion 1");
                    if (corroborar == 0) {
                        boolean seCargo = CajaGeneral.addCajaDiaria(ncaja);
                        if (seCargo == false) {
                            JOptionPane.showMessageDialog(this, "Ya existe una caja con esa fecha", "Error", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Complete la fecha por favor", "Error", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Complete la fecha por favor", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Complete la fecha por favor", "Error", 0);
            }
        }
    }//GEN-LAST:event_btGuardarCajaActionPerformed

    private void cbxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMesActionPerformed
        int itemCount = cbxDia.getItemCount();
        boolean bisiesto = false;
        if (cbxMes.getSelectedIndex() != 0) {
            for (int i = 0; i < itemCount; i++) {
                cbxDia.removeItemAt(0);
            }
            cbxDia.addItem("Dia");
            cbxDia.setEnabled(true);
            if (cbxMes.getSelectedIndex() == 1 || cbxMes.getSelectedIndex() == 3 || cbxMes.getSelectedIndex() == 5 || cbxMes.getSelectedIndex() == 7 || cbxMes.getSelectedIndex() == 8 || cbxMes.getSelectedIndex() == 10 || cbxMes.getSelectedIndex() == 12) {
                for (int i = 1; i < 31 + 1; i++) {
                    cbxDia.addItem(i);
                }
            }
            if (cbxMes.getSelectedIndex() == 4 || cbxMes.getSelectedIndex() == 6 || cbxMes.getSelectedIndex() == 9 || cbxMes.getSelectedIndex() == 11) {
                for (int i = 1; i < 30 + 1; i++) {
                    cbxDia.addItem(i);
                }
            }
            if (cbxMes.getSelectedIndex() == 2) {
                for (int o = 1992; o < Integer.parseInt(Reloj.getYear()) + 1; o = o + 4) {
                    if (cbxAño.getSelectedIndex() - 1 + 1990 == o) {
                        bisiesto = true;
                    }
                }
                if (bisiesto == false) {
                    for (int i = 1; i < 28 + 1; i++) {
                        cbxDia.addItem(i);
                    }
                } else {
                    for (int i = 1; i < 29 + 1; i++) {
                        cbxDia.addItem(i);
                    }
                }
            }
        } else {
            cbxDia.setSelectedIndex(0);
            cbxDia.setEnabled(false);
        }

    }//GEN-LAST:event_cbxMesActionPerformed

    private void tbxCajaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxCajaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxCajaFinActionPerformed

    private void tbxRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxRetirosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxRetirosActionPerformed

    private void cbxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAñoActionPerformed
        int diasel = cbxDia.getSelectedIndex();
        int mesel = cbxMes.getSelectedIndex();
        if (cbxAño.getSelectedIndex() != 0) {
            cbxMes.setEnabled(rootPaneCheckingEnabled);
            cbxMes.actionPerformed(evt);
            cbxMes.setSelectedIndex(mesel);
            cbxDia.actionPerformed(evt);
            cbxDia.setSelectedIndex(diasel);
        } else {
            cbxMes.setEnabled(false);
            cbxMes.actionPerformed(evt);
            cbxMes.setSelectedIndex(mesel);
            cbxDia.actionPerformed(evt);
            cbxDia.setSelectedIndex(diasel);
        }
    }//GEN-LAST:event_cbxAñoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarC;
    private javax.swing.JMenuItem AgregarI;
    private javax.swing.JMenu Archivo;
    private javax.swing.JButton Boton_BorrarItem;
    private javax.swing.JButton Boton_BorrarUsuario;
    private javax.swing.JButton Boton_CrearItem;
    private javax.swing.JButton Boton_CrearUsuario;
    private javax.swing.JButton Boton_EditarItem;
    private javax.swing.JButton Boton_EditarUsuario;
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenu Inventario;
    private javax.swing.JButton btActualizarCaja;
    private javax.swing.JButton btBuscarItem;
    private javax.swing.JButton btBuscarUsuario;
    private javax.swing.JButton btGuardarCaja;
    private javax.swing.JButton btLimpiarBusqueda;
    private javax.swing.JButton btLimpiarBusqueda1;
    private javax.swing.JComboBox cbxAño;
    private javax.swing.JComboBox cbxDia;
    private javax.swing.JComboBox cbxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlReloj;
    public static javax.swing.JTable tablaAgenda;
    public static javax.swing.JTable tablaStock;
    private javax.swing.JTextField tbxCajaFin;
    private javax.swing.JTextField tbxCajaIni;
    private javax.swing.JTextField tbxGastos;
    private javax.swing.JTextField tbxPersonales;
    private javax.swing.JTextField tbxRetiros;
    private javax.swing.JTextField tbxVenta;
    private javax.swing.JTextField txbArticuloEncontrado;
    private javax.swing.JTextField txbBuscar;
    private javax.swing.JTextField txbBuscarItem;
    private javax.swing.JTextField txbCantidadEncontrada;
    private javax.swing.JTextField txbDeudaEncontrada;
    private javax.swing.JTextField txbDireccionEncontrada;
    private javax.swing.JTextField txbNombreEncontrado;
    private javax.swing.JTextField txbNombreEncontrado3;
    private javax.swing.JTextField txbPrecioCEncontrado;
    private javax.swing.JTextField txbPrecioVEncontrado;
    private javax.swing.JTextField txbTelefonoEncontrado;
    // End of variables declaration//GEN-END:variables
}
