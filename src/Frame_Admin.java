
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Frame_Admin extends javax.swing.JFrame {

    
    /**
     * Creates new form Frame_Admin
     */
    public Frame_Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin = new javax.swing.JPanel();
        Bagregar = new javax.swing.JButton();
        Bregresar = new javax.swing.JButton();
        admin = new javax.swing.JTextField();
        pasword = new javax.swing.JPasswordField();
        jLabelpasword = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        Admin.setBackground(new java.awt.Color(204, 204, 204));
        Admin.setLayout(null);

        Bagregar.setText("Agregar");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });
        Admin.add(Bagregar);
        Bagregar.setBounds(80, 240, 72, 22);

        Bregresar.setText("Regresar");
        Bregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregresarActionPerformed(evt);
            }
        });
        Admin.add(Bregresar);
        Bregresar.setBounds(270, 240, 75, 22);
        Admin.add(admin);
        admin.setBounds(60, 70, 140, 22);
        Admin.add(pasword);
        pasword.setBounds(60, 140, 140, 22);

        jLabelpasword.setText("Pasword");
        Admin.add(jLabelpasword);
        jLabelpasword.setBounds(60, 120, 70, 16);

        jLabel_usuario.setText("Usuario");
        Admin.add(jLabel_usuario);
        jLabel_usuario.setBounds(60, 50, 70, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
        // TODO add your handling code here:
        String usuario = "";
        String adm = "administrador";
        usuario = admin.getText();
        System.out.println(usuario);
        System.out.println(adm);

        for (int k = 0; k < usuario.length(); k++) {
            if (adm.equals(usuario)) {
                
                String pas = "";
                char[] password = pasword.getPassword();
                for (int i = 0; i < password.length; i++) {
                    pas += password[i];
                }
                int cui = 201903763;
                for (int j = 0; j < pas.length(); j++) {
                    int valor = Integer.valueOf(pas);
                    if (cui == valor) {

                        Crearclientes cambio = new Crearclientes();
                        cambio.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "nombre incorrecto");
                admin.setText("");
                pasword.setText("");
            }
            break;
            
            
        }
    }//GEN-LAST:event_BagregarActionPerformed

    private void BregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregresarActionPerformed
        // TODO add your handling code here:
        Frean_inicio cambio =new Frean_inicio();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BregresarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Bregresar;
    private javax.swing.JTextField admin;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JLabel jLabelpasword;
    private javax.swing.JPasswordField pasword;
    // End of variables declaration//GEN-END:variables
        }