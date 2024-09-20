package Implementaciones;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
/**
 *
 * @author stink
 */
public class Entrada extends javax.swing.JFrame {    
    Datos dt = new Datos();
    v_Bienvenida bi = new v_Bienvenida();
    v_Error er = new v_Error();
    v_Error er2 = new v_Error();
    private static int error=1;
    /**
     * Creates new form Entrada
     */
    private final String user[][]={{"Jose","1234"}
                                  ,{"Jorge","1234"}
                                  ,{"Mabel","joset"}};
    
    public Entrada() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Imagen/Icono2E.png")).getImage();        
        setIconImage(icon);
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jPas = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 500));
        setMinimumSize(new java.awt.Dimension(300, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 6, 19));
        jButton1.setText(" Salir ");
        jButton1.setToolTipText("Salida del programa");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 6, 19)));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(90, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(90, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(90, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 90, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(115, 6, 19));
        jButton2.setText(" Ingresar ");
        jButton2.setToolTipText("Inicio de sesión");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 6, 19)));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setMaximumSize(new java.awt.Dimension(90, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(90, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(90, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 6, 19));
        jLabel1.setText("MOTOS"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jId.setBackground(new java.awt.Color(0, 0, 0));
        jId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jId.setForeground(new java.awt.Color(255, 255, 255));
        jId.setToolTipText("Ingrese su id");
        jId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 6, 19)));
        jId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jIdKeyReleased(evt);
            }
        });
        getContentPane().add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 150, 30));

        jPas.setBackground(new java.awt.Color(0, 0, 0));
        jPas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPas.setForeground(new java.awt.Color(255, 255, 255));
        jPas.setToolTipText("Ingrese su Clave");
        jPas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 6, 19)));
        jPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasActionPerformed(evt);
            }
        });
        jPas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasKeyReleased(evt);
            }
        });
        getContentPane().add(jPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 150, 30));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(115, 6, 19));
        jLabel3.setText("ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(115, 6, 19));
        jLabel4.setText("CLAVE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 218, 154));
        jLabel7.setText("Versión 1.0");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 60, 20));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(115, 6, 19));
        jLabel5.setText("TURBO"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Ingreso.jpg"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean acceso=false;
        for (int i=0 ;i<user.length; i++) {
            if (user[i][0].equals(jId.getText()) && user[i][1].equals(jPas.getText())) {
                acceso = true;
                             
            } 
        }
        if (acceso==true) {
            String mensaje="\n***********************"
                        + "******************"
                        + "******************\n";
                mensaje+="           TURBO MOTOS S.A.";
                mensaje+="\n***********************"
                        + "******************"
                        + "******************\n";
                mensaje+="Sesion Iniciada por : "+jId.getText()+"\n";
                mensaje+="Fecha : "+dt.Fecha()+" Hora : "+dt.hora()+"\n";
                mensaje+="\n......................."
                        + ".................."
                        + "..................\n";            
            dt.Reporte(mensaje);   
            this.dispose();
            bi.setVisible(true);
        } else {
            if (error>4) {                
                er2.tmsj="Muchos intentos";
                er2.tmsj2="fallidos. Reinicio!!";
                er2.setVisible(true);
                error=0;
                jId.setText("");
                jPas.setText("");  
            }else{
                er.tmsj="ID o Clave";
                er.setVisible(true);
                error++;
            }            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIdKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            jPas.requestFocus();
        }
    }//GEN-LAST:event_jIdKeyReleased

    private void jPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasActionPerformed

    private void jPasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            
            boolean acceso=false;
            for (int i=0 ;i<user.length; i++) {
                if (user[i][0].equals(jId.getText()) && user[i][1].equals(jPas.getText())) {
                    acceso = true;
                } 
            }
            if (acceso==true) {
                String mensaje="\n***********************"
                        + "******************"
                        + "******************\n";
                mensaje+="           TURBO MOTOS S.A.";
                mensaje+="\n***********************"
                        + "******************"
                        + "******************\n";
                mensaje+="Sesion Iniciada por : "+jId.getText()+"\n";
                mensaje+="Fecha : "+dt.Fecha()+" Hora : "+dt.hora()+"\n";
                mensaje+="\n......................."
                        + ".................."
                        + "..................\n";
                dt.Reporte(mensaje);
                this.dispose();
                bi.setVisible(true); 
            } else {
                if (error==4) {
                    er2.tmsj="Muchos intentos";
                    er2.tmsj2="fallidos. Reinicio!!";
                    er2.setVisible(true);
                    error=0;
                    jId.setText("");
                    jPas.setText("");
                }else{
                    er.tmsj="ID o Clave";
                    er.setVisible(true);
                    error++;
                    System.out.println(""+error);
                }
            }
        }
    }//GEN-LAST:event_jPasKeyReleased

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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPas;
    // End of variables declaration//GEN-END:variables
}
