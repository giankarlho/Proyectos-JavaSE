/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

/**
 *
 * @author Giancarlo
 */
public class Carreras extends javax.swing.JFrame {

    /**
     * Creates new form Carreras
     */
    public Carreras() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        lblMeta = new javax.swing.JLabel();
        btnEmpezar = new javax.swing.JButton();
        lblCoche4 = new javax.swing.JLabel();
        lblCoche3 = new javax.swing.JLabel();
        lblCoche2 = new javax.swing.JLabel();
        lblCoche1 = new javax.swing.JLabel();
        lblPista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Carreras");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("7");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, -1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("8");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, -1));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("6");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, -1));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("10");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        lblMeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/meta.png"))); // NOI18N
        getContentPane().add(lblMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 80, -1));

        btnEmpezar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/empezar.png"))); // NOI18N
        btnEmpezar.setBorderPainted(false);
        btnEmpezar.setContentAreaFilled(false);
        getContentPane().add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 160, -1));

        lblCoche4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/coche4_120.png"))); // NOI18N
        getContentPane().add(lblCoche4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        lblCoche3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/coche3_200.png"))); // NOI18N
        getContentPane().add(lblCoche3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lblCoche2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/coche2_100.png"))); // NOI18N
        getContentPane().add(lblCoche2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblCoche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/coche1_200.png"))); // NOI18N
        getContentPane().add(lblCoche1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 60));

        lblPista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pista.jpg"))); // NOI18N
        lblPista.setText("jLabel1");
        getContentPane().add(lblPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblCoche1;
    private javax.swing.JLabel lblCoche2;
    private javax.swing.JLabel lblCoche3;
    private javax.swing.JLabel lblCoche4;
    private javax.swing.JLabel lblMeta;
    private javax.swing.JLabel lblPista;
    // End of variables declaration//GEN-END:variables
}
