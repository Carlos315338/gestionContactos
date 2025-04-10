/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ContactoController;
import dao.ContactoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Contacto;

/**
 *
 * @author carlos
 */
public class ContactoForm extends javax.swing.JFrame {

    //Este metodo listar permite mostrar la lista de contactos almacenados en la base de datos
    private void listar() {
        String[] columnas = {"Id", "Nombre", "Apellido", "Teléfono", "Correo", "Dirección"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);

        ContactoController controller = new ContactoController();
        //Crea una instancia del contactoController y obtiene la lista de contactos 
        List<Contacto> lista = controller.listarContactos();

        //El ciclo for itera sobre la lista retornada por el controlador y muestra los valores en las filas de la tabla
        for (Contacto c : lista) {
            Object[] fila = new Object[6];
            fila[0] = c.getId();
            fila[1] = c.getNombre();
            fila[2] = c.getApellido();
            fila[3] = c.getTelefono();
            fila[4] = c.getCorreo();
            fila[5] = c.getDireccion();
            modelo.addRow(fila);
        }

        //Pasa los datos obtenidos a la tabla modelo
        tbContactos.setModel(modelo);
    }

    /**
     * Creates new form ContactoForm
     */
    public ContactoForm() {

        //Inicializa todos los componentes del Jframe y muestra de manera automatica la lista de contactos
        initComponents();
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContactos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btnMenuPrincipal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(4, 51, 191));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefono:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo Electronico:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");

        btnGuardar.setBackground(new java.awt.Color(167, 200, 242));
        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(167, 200, 242));
        btnActualizar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(167, 200, 242));
        btnLimpiar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tbContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Telefono", "Correo", "Direccion"
            }
        ));
        tbContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbContactos);

        btnBuscar.setBackground(new java.awt.Color(167, 200, 242));
        btnBuscar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(167, 200, 242));
        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(167, 200, 242));
        btnEditar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        btnMenuPrincipal.setBackground(new java.awt.Color(167, 200, 242));
        btnMenuPrincipal.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnMenuPrincipal.setText("Menú Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Identificación:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingresar el numero de identificación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdentificacion)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTelefono)
                                        .addGap(38, 38, 38))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel3)))))
                        .addGap(43, 43, 43)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnMenuPrincipal))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este metodo nos permite retornar al menu principal por medio del evento click en el boton principal
    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        //Oculta la interfaz ContactoForm
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Obtiene del textField el id ingresado para la consulta
        String id = txtBuscar.getText();
        //Convierte id ingresado en el buscador a un entero
        Integer identificacion = Integer.valueOf(id);

        //Encabezados de las columnas
        String[] columnas = {"Id", "Nombre", "Apellido", "Teléfono", "Correo", "Dirección"};

        DefaultTableModel modelo = new DefaultTableModel(null, columnas);

        //Pasa la identificacion ingresada al metodo consultar del contactoController y obtiene los contactos
        ContactoController controller = new ContactoController();
        List<Contacto> lista = controller.consultarIndentificacion(identificacion);

        for (Contacto c : lista) {
            Object[] fila = new Object[6];
            fila[0] = c.getId();
            fila[1] = c.getNombre();
            fila[2] = c.getApellido();
            fila[3] = c.getTelefono();
            fila[4] = c.getCorreo();
            fila[5] = c.getDireccion();
            modelo.addRow(fila);
        }
        //Pasa los contactos recibidos a la tabla modelo.
        tbContactos.setModel(modelo);

        //Si la lista esta vacia genera una alerta con el mensaje No se encontraron contactos con el numero de identificación.
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron contactos con el numero de identificación: " + identificacion, "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }
        //Limpia todos los campos despues de realizar la busqueda
        limpiarCampos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Este boton se encarga de limpiar todos los campos por medio de un String vacio.
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Este evento se encarga de guardar los datos en la base de datos al realizar click en el boton guardar.
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            //Obtiene los valores ingresados en los campos y los asigna a las variables identificación, nombre, apellido, correo, telefono y dirección.
            int identificacion = Integer.parseInt(txtIdentificacion.getText().trim());
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String correo = txtCorreo.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String direccion = txtDireccion.getText().trim();
            
            //Valida si los campos estan vacios, si los campos estan vacios muestra una alerta con el mensaje Por favor complete todos los campos
            if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Crea un nuevo objeto contacto y le pasa los datos de las variables identificación, nombre, apellido, correo, telefono y dirección
            Contacto contacto = new Contacto();
            contacto.setId(identificacion);
            contacto.setNombre(nombre);
            contacto.setApellido(apellido);
            contacto.setCorreo(correo);
            contacto.setTelefono(telefono);
            contacto.setDireccion(direccion);

            //Pasa el nuevo contacto al metodo insertar del ContactoController y me retorna un boolean            
            ContactoController controller = new ContactoController();
            boolean guardado = controller.agregarContacto(contacto);
            
            //Si el valor de guardado es true muestra un mensaje de exito, de lo contrario muestra un mensaje de error.
            if (guardado) {
                JOptionPane.showMessageDialog(this, "Contacto guardado de manera exitosa.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el contacto.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            //Limpia los campos
            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo Identificación debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarCampos();
        listar();
    }

    private void limpiarCampos() {
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtBuscar.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed
//Este evento se encarga de actualizar la tabla y limpiar los campos
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        limpiarCampos();
        listar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    //Este evento se encarga de eliminar un registro de la tabla 
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //Obtiene la fila seleccionada para su eliminación, en caso de no estar seleccionada muestra una alerta Por favor seleccione un contacto para eliminar
        int filaSeleccionada = tbContactos.getSelectedRow();
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un contacto para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Obtiene la identificación que esta almacenada en la columna 0
        String identificacion = tbContactos.getValueAt(filaSeleccionada, 0).toString(); // Primera columna: ID
        int id = Integer.parseInt(identificacion);

        //Muestra una alerta para confirmar el usuario a eliminar
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar el contacto con ID: " + id + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        //Si la eliminación fue confirmada se pasa el id al metodo eliminar contacto de contactoController y me retorna un boolean
        if (confirmacion == JOptionPane.YES_OPTION) {
            ContactoController controller = new ContactoController();
            boolean eliminado = controller.eliminarContacto(id);

            //Si el boolean retornado es true muestra un mensaje de exito, si no un error
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Contacto eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el contacto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Limpia los campos del formulario
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //
    private void tbContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbContactosMouseClicked
        int fila = tbContactos.getSelectedRow();

        txtIdentificacion.setText(tbContactos.getValueAt(fila, 0).toString());
        txtNombre.setText(tbContactos.getValueAt(fila, 1).toString());
        txtApellido.setText(tbContactos.getValueAt(fila, 2).toString());
        txtTelefono.setText(tbContactos.getValueAt(fila, 3).toString());
        txtCorreo.setText(tbContactos.getValueAt(fila, 4).toString());
        txtDireccion.setText(tbContactos.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_tbContactosMouseClicked

    //Este evento permite editar la fila seleccionada y almacenar en la base de datos su modificación
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            //Obtiene las datos del formulario y los asigna a las variables correspondientes
            int identificacion = Integer.parseInt(txtIdentificacion.getText().trim());
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String correo = txtCorreo.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String direccion = txtDireccion.getText().trim();
            

            //Evalua que el telefono no exceda la longitud de 15 caracteres.
            if (telefono.length() > 15) {
                JOptionPane.showMessageDialog(this, "El número de teléfono no puede exceder 15 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Evalua que los campos del formulario no esten vacios.
            if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            //Crea un nuevo objeto contacto y le asigna las variables que obtenieron la información del formulario.
            Contacto contacto = new Contacto();
            contacto.setId(identificacion);
            contacto.setNombre(nombre);
            contacto.setApellido(apellido);
            contacto.setCorreo(correo);
            contacto.setTelefono(telefono);
            contacto.setDireccion(direccion);

            //Le pasa el contacto al metodo actualizar del ContactoController y me tetorna un boolean
            ContactoController controller = new ContactoController();
            boolean actualizado = controller.actualizarContacto(contacto);

            //Si el boolean retornado es true muestra un mensaje de exito, si no un error
            if (actualizado) {
                JOptionPane.showMessageDialog(this, "Contacto actualizado de manera exitosa.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el contacto.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo Identificación debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ContactoForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbContactos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
