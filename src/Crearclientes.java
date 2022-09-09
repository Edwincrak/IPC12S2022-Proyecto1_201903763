
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Crearclientes extends javax.swing.JFrame {
    static Clase_principal[] client=new Clase_principal[5];
    Crear_cuentas cc=new Crear_cuentas();
     mostrar_clientes kl=new mostrar_clientes();
    /**
     * Creates new form Crearclientes
     */
    public Crearclientes() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregar_cliente = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_cui = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        jLabel2.setText("CUI");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 60, 40, 16);

        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 150, 70, 16);

        jLabel4.setText("APELLIDO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 240, 60, 16);

        agregar_cliente.setText("Agregar");
        agregar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(agregar_cliente);
        agregar_cliente.setBounds(210, 350, 75, 22);
        jPanel1.add(txt_nombre);
        txt_nombre.setBounds(160, 180, 200, 20);
        jPanel1.add(txt_cui);
        txt_cui.setBounds(190, 100, 130, 20);
        jPanel1.add(txt_apellido);
        txt_apellido.setBounds(160, 280, 200, 30);

        jButton1.setText("Crear cuentas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 450, 110, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_clienteActionPerformed

        boolean bandera = false;

        for (int i = 0; i < client.length; i++) {
            if (client[i] == null) {
             
              Clase_principal re = new Clase_principal(txt_nombre.getText(), txt_apellido.getText(), txt_cui.getText());
                
              client[i] = re;
                bandera = true;
                
                txt_nombre.setText("");
                txt_cui.setText("");
                txt_apellido.setText("");
                break;
             }
             
               
            
        }
        if (!bandera) {
            JOptionPane.showMessageDialog(null, "Solo se pueden agregar 5 clientes");
        }
        for (Clase_principal cliente1 : client) {
            if (cliente1 != null) {
                System.out.println(cliente1.apellido + " " + cliente1.cui);
            }
        }
    }//GEN-LAST:event_agregar_clienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Crearclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crearclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crearclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crearclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crearclientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cui;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
