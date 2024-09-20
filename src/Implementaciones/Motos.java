/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author stink
 */
public class Motos extends javax.swing.JFrame {
    public static int resto;
    Datos dt = new Datos();
    /**
     * Creates new form Motos
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Motos() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Imagen/Icono2E.png")).getImage();        
        setIconImage(icon);
        fecha2.setText(dt.anio()+")");
        this.setLocationRelativeTo(null);
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
        mod = new javax.swing.JTextField();
        op = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cil = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        prec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dis = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fecha2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Datos de las motos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo :");

        mod.setBackground(new java.awt.Color(0, 102, 102));
        mod.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        mod.setForeground(new java.awt.Color(255, 255, 255));
        mod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        mod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        mod.setPreferredSize(new java.awt.Dimension(100, 25));

        op.setBackground(new java.awt.Color(0, 102, 51));
        op.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        op.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "CD 00", "CD 01", "CD 02", "CD 03", "CD 04" }));
        op.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        op.setLightWeightPopupEnabled(false);
        op.setMaximumSize(new java.awt.Dimension(100, 25));
        op.setMinimumSize(new java.awt.Dimension(100, 25));
        op.setPreferredSize(new java.awt.Dimension(100, 25));
        op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo :");

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cilindrada :");

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año :");

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio :");

        cil.setBackground(new java.awt.Color(0, 102, 102));
        cil.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        cil.setForeground(new java.awt.Color(255, 255, 255));
        cil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cil.setPreferredSize(new java.awt.Dimension(100, 25));

        anio.setBackground(new java.awt.Color(0, 102, 102));
        anio.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        anio.setForeground(new java.awt.Color(255, 255, 255));
        anio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        anio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        anio.setPreferredSize(new java.awt.Dimension(100, 25));

        prec.setBackground(new java.awt.Color(0, 102, 102));
        prec.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        prec.setForeground(new java.awt.Color(255, 255, 255));
        prec.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        prec.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad:");

        dis.setBackground(new java.awt.Color(0, 102, 102));
        dis.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        dis.setForeground(new java.awt.Color(255, 255, 255));
        dis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        dis.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel14.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setText("(0 ~ 20 )");

        jLabel15.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setText("(0 ~ 150 000 )");

        jLabel16.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 51));
        jLabel16.setText("(0 ~ 1500 )");

        jLabel17.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 51));
        jLabel17.setText("(2000 ~ ");

        fecha2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        fecha2.setForeground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(prec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(89, 89, 89)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(fecha2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 400));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/guardar80.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cancelar80.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/regresar80.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Cancelar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Salir");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 0));
        jLabel13.setText("Guardar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/moto800.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opActionPerformed
        // TODO add your handling code here:
        int n = this.op.getSelectedIndex();
        this.mod.setText(dt.dG[n][1]);
        this.cil.setText(dt.dG[n][2]);
        this.anio.setText(dt.dG[n][3]);
        this.prec.setText(String.valueOf(dt.dG[n][4]));
        this.dis.setText(""+dt.cant[n][0]);
    }//GEN-LAST:event_opActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        Menu me = new Menu();
        this.dispose();
        me.setVisible(true);
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // Leer la opcion de moto
        int n = this.op.getSelectedIndex();
        //Modificacion
        try {
            // ---------Modelo---------
            //Se lee el nombre del modelo
            String art=this.mod.getText();
            //Si el nombre no fue ingresado ni e codigo elegido
            if (n==0) {
                //Ventana de error
                v_Error vE = new v_Error();
                vE.tmsj="Escoger";
                vE.tmsj2="Codigo de moto";
                vE.setVisible(true);
            }else if(art.equals("")) {
                //Sino si el codigo fue elegido pero no ingreso el nombre
                v_Error vE = new v_Error();
                vE.tmsj="Ingresar";
                vE.tmsj2="Nombre del modelo";
                vE.setVisible(true);
            }else{
                //Si se selecciono codigo y nombre
                //Si el modelo excede los caracteres per establecidos
                if (this.mod.getText().length()>7) {
                    v_Error vE = new v_Error();
                    vE.tmsj="Formato modelo";
                    vE.tmsj2="muy extenso!! ";
                    vE.setVisible(true);
                    //Limpiala caja de modelo
                    this.mod.setText("");
                }else{
                    //Si cumple los parametors 
                    //Se carga el modelo
                    dt.dG[n][1]=this.mod.getText().toUpperCase();
                    //---------Cilindrada------------
                    //Se lee la cilindrada
                    int ncil=Integer.parseInt(this.cil.getText());
                    //Si la cilindrada es negativa
                    if (ncil<1 || ncil>1500) {
                        v_Error ve = new v_Error();
                        ve.tmsj="Cilindrada";
                        ve.tmsj2="fuera de rango!!";
                        ve.setVisible(true);
                    }else{
                        //Si es correcto se carga la cilindrada
                        dt.dG[n][2]=String.valueOf(ncil);
                    }
                    //----------Año----------------                    
                    int anioA=Integer.parseInt(dt.anio());//Actual
                    int anioI=Integer.parseInt(this.anio.getText());
                    //Si el año es mayor que el actual o menor al 2000
                    if (anioI>anioA || anioI<2000) {
                        v_Error vE = new v_Error();
                        vE.tmsj="Año no";
                        vE.tmsj="Valido!!";
                        vE.setVisible(true);
                    }else if(anioI<(anioA-10)){
                        //Si el año de modelo es descontinuado
                        v_Error vE = new v_Error();
                        vE.tmsj="Modelo de año";
                        vE.tmsj2="Descontinuado!!";
                        vE.setVisible(true);
                    }else{
                        dt.dG[n][3]=String.valueOf(anioI);
                    }
                    //------ Precio ------
                    double pre = Double.parseDouble(this.prec.getText());
                    if (pre>0 && pre<15000){
                        dt.dG[n][4]=String.valueOf(pre);
                        //------ Disponibles -----
                        int cant=Integer.parseInt(this.dis.getText());
                        //Si la cantidad es negativa
                        if (cant<0) {
                            v_Error vE = new v_Error();
                            vE.tmsj="Cantidad fuera";
                            vE.tmsj2="de rango!!";
                            vE.setVisible(true);
                        }else if (cant>20) {
                            //Si la cantidad excede el modelo
                            v_Error vE = new v_Error();
                            vE.tmsj="Cantidad excesiva";
                            vE.tmsj2="20 por modelo!!";
                            vE.setVisible(true);
                        }else{
                            //Cantidad correcta
                            dt.cant[n][0]=cant;
                            v_Exito vEx = new v_Exito();
                            vEx.msj = "Exito al";
                            vEx.msj2 = "Modificar!!";
                            vEx.setVisible(true);
                            //Datoa correctos
                            this.mod.setText(dt.dG[n][1]);
                            this.cil.setText(dt.dG[n][2]);
                            this.anio.setText(dt.dG[n][3]);
                            this.prec.setText(dt.dG[n][4]);
                            this.dis.setText(""+dt.cant[n][0]);
                        }
                    }else{
                        v_Error vE = new v_Error();
                        vE.tmsj="Precio fuera";
                        vE.tmsj2="de rango!!";
                        vE.setVisible(true);
                    }
                    
                    
                    
                } 
            }
            
            
        } catch (NumberFormatException e) {
            //En el caso de que el numero tenga un formato string
            v_Error ve = new v_Error();
            ve.tmsj="Formato";
            ve.tmsj2="invalido!!";
            ve.setVisible(true);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // Limpieza de datos
        this.op.setSelectedIndex(0);        
        this.mod.setText("");        
        this.cil.setText("");
        this.anio.setText("");  
        this.dis.setText("");
        this.prec.setText("");
        
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Motos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Motos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio;
    private javax.swing.JTextField cil;
    private javax.swing.JTextField dis;
    private javax.swing.JLabel fecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mod;
    private javax.swing.JComboBox<String> op;
    private javax.swing.JTextField prec;
    // End of variables declaration//GEN-END:variables
}
