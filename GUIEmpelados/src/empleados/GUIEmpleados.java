package empleados;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class GUIEmpleados extends javax.swing.JFrame {
    
    //Esto.. no le pares bola solo es para añadir una imagen de fondo...
    ImageIcon fondoEmpleado, imagenEmpleado;
    ImageIcon fondoRegistro, imagenRegistro;

    //Desde squi voy a trabajar con las pestañas:
    int contadorEmpleados = 0; //Un contador para saber cuantos empleados voy registrando
    String [][] empleados;
    DefaultTableModel modeloTablaEmpleado;
    ArrayList<Empleados> listaEmpleados = new ArrayList(); //Mis empleados irán creciendo conforme se vayan registrando, y tendrán cada uno un nombre, un apellido y un cargo
    DefaultComboBoxModel modeloComboBoxEmpleados = new DefaultComboBoxModel(listaEmpleados.toArray());
        
    int contadorGerentes, contadorSecretarios, contadorVendedores, contadorChoferes = 0;
    String[][] registros;
    DefaultTableModel modeloTablaRegistro; 
    //No necesito hacr un arreglo dinamico para los cargos, los voy a mandar estáticos.
    //No necesito un combobox para los registros, el combo box de filtrado será el mismo combo box de cargos (De la pestaña empleados)
   
    public GUIEmpleados() {
        initComponents();
        
        //Esto... no le pares bola, solo es para añadir una imagen de fondo:
        fondoEmpleado = new ImageIcon(getClass().getResource("/imagenes/Inuyasha2.png"));
        imagenEmpleado = new ImageIcon(fondoEmpleado.getImage().getScaledInstance(labelFondoEmpleados.getWidth(), labelFondoEmpleados.getHeight(), Image.SCALE_DEFAULT));
        labelFondoEmpleados.setIcon(imagenEmpleado);
        
        fondoRegistro = new ImageIcon(getClass().getResource("/imagenes/Itachi.gif"));
        imagenRegistro = new ImageIcon(fondoRegistro.getImage().getScaledInstance(labelFondoRegistro.getWidth(), labelFondoRegistro.getHeight(), Image.SCALE_DEFAULT));
        labelFondoRegistro.setIcon(imagenRegistro);
        //Ya, listo, con eso ya le puse fondo a mis pestañas ^^ , ahora si vamos a trabajar 
        
        //Empleados
        String[] titulosTablaEmpleados = new String[]{"N#","Apellido","Nombre","Cargo"};
        modeloTablaEmpleado = new DefaultTableModel(empleados, titulosTablaEmpleados);
        tableEmpleados.setModel(modeloTablaEmpleado);
        
        //Voy a trabajar en los cargos... Para que me vaya añadiendo los cargos al combobox de la pestaña empleados...
        String[] listaCargos = new String[]{"Gerente","Secretario/a","Vendedor","Chofer"};
        for(int i=0; i<listaCargos.length; i++){
             modeloComboBoxEmpleados.addElement(listaCargos[i]);
        }
              
        comboBoxCargo.setModel(modeloComboBoxEmpleados);
        
        //Registros
        String[] titulosTablaRegistros = new String[]{"N#","Apellido","Nombre","Cargo"};
        modeloTablaRegistro = new DefaultTableModel(registros, titulosTablaRegistros);
        tableRegistro.setModel(modeloTablaRegistro);
        
        comboBoxFiltro.setModel(modeloComboBoxEmpleados); //Es el mismo comoBox para filtros,los cargos, por eso le paso el mismo modelo.
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestañas = new javax.swing.JTabbedPane();
        panelEmpleado = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        comboBoxCargo = new javax.swing.JComboBox();
        labelCargo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();
        buttonRegistrarEmpleado = new javax.swing.JButton();
        labelFondoEmpleados = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegistro = new javax.swing.JTable();
        labelFiltro = new javax.swing.JLabel();
        comboBoxFiltro = new javax.swing.JComboBox();
        buttonRegistrar = new javax.swing.JButton();
        labelFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setText("Nombre:");
        panelEmpleado.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 39, -1, -1));

        labelApellido.setText("Apellido:");
        panelEmpleado.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 82, -1, -1));
        panelEmpleado.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 36, 80, -1));
        panelEmpleado.add(textApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 79, 80, -1));

        panelEmpleado.add(comboBoxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 117, 80, -1));

        labelCargo.setText("Cargo:");
        panelEmpleado.add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 120, -1, -1));

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableEmpleados);

        panelEmpleado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, 276, 110));

        buttonRegistrarEmpleado.setText("Registrar");
        buttonRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarEmpleadoActionPerformed(evt);
            }
        });
        panelEmpleado.add(buttonRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 169, -1, -1));
        panelEmpleado.add(labelFondoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 340));

        pestañas.addTab("Empleado", panelEmpleado);

        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableRegistro);

        panelRegistro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, 276, 110));

        labelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        labelFiltro.setForeground(new java.awt.Color(255, 255, 255));
        labelFiltro.setText("Filtrar Cargo:");
        panelRegistro.add(labelFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 40, -1, -1));

        panelRegistro.add(comboBoxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 37, 80, -1));

        buttonRegistrar.setText("Aceptar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        panelRegistro.add(buttonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 131, -1, -1));
        panelRegistro.add(labelFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 340));

        pestañas.addTab("Registro", panelRegistro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestañas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarEmpleadoActionPerformed
        // TODO add your handling code here:
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String cargo = (String) comboBoxCargo.getSelectedItem(); //Me devuelve el item seleccionado como un String.    
        contadorEmpleados++;
        String contador = String.valueOf(contadorEmpleados);
        
        Empleados trabajadores = new Empleados(nombre, apellido, cargo); //Estos se irán sobreescribiendo cuando registre un emppelado
        listaEmpleados.add(trabajadores); //Mi empleado de nombre apellido y cargo tal, se añadio a mi lista... 
        modeloTablaEmpleado.addRow(new String[]{contador,apellido, nombre, cargo});
        
    }//GEN-LAST:event_buttonRegistrarEmpleadoActionPerformed

    
    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        // TODO add your handling code here:
        //Cuando presiones el boton acptar ese filtro, pasa esto:
      
        //Antes que nada voy a empezar eliminando las filas que ya fueron filtradas con cada vez que se aplaste el boton
        int numeroFilas = modeloTablaRegistro.getRowCount();
        for(int i= 0; i<numeroFilas; i++){
            modeloTablaRegistro.removeRow(0);
        }
             
        //Voy a filtrar el cargo de mi empleado.
        String cargoFiltrado = (String) comboBoxFiltro.getSelectedItem();
        System.out.println("Item seleccionado: "+cargoFiltrado);
       
        for(Empleados item: listaEmpleados){ //Para cada item de mi lista de empleados (item es un empleado de esa lista)
            //Si el cargo filtrado es:
            if(cargoFiltrado.equals("Gerente")){ //Entra aqui:
                //Si el empleado "X" tiene por cargo: 
                if(item.getCargo().equals("Gerente")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadorGerentes++;
                String contador = String.valueOf(contadorGerentes);
                 //...entonces añadelo a mi tabla de filtrado!
                modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }
             //Si el cargo filtrado es:
            if(cargoFiltrado.equals("Secretario/a")){
                
                if(item.getCargo().equals("Secretario/a")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadorSecretarios++;
                String contador = String.valueOf(contadorSecretarios);
                
                modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }
             //Si el cargo filtrado es:
            if(cargoFiltrado.equals("Vendedor")){
                
                if(item.getCargo().equals("Vendedor")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadorVendedores++;
                String contador = String.valueOf(contadorVendedores);
                        
                modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }
             //Si el cargo filtrado es:
             if(cargoFiltrado.equals("Chofer")){
                
                 if(item.getCargo().equals("Chofer")){
                System.out.println("Solo se han filtrado: "+item.getCargo());
                contadorChoferes++;
                String contador = String.valueOf(contadorChoferes);
                
                modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getApellido(), item.getCargo()});
                }
            }
            
        }

    
        
    }//GEN-LAST:event_buttonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonRegistrarEmpleado;
    private javax.swing.JComboBox comboBoxCargo;
    private javax.swing.JComboBox comboBoxFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelFiltro;
    private javax.swing.JLabel labelFondoEmpleados;
    private javax.swing.JLabel labelFondoRegistro;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTable tableRegistro;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
