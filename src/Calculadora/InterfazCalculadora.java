/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Aaron Alfonseca
 */
public class InterfazCalculadora extends javax.swing.JFrame {

    public InterfazCalculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    double num01;
    double num02;
    double igual;
    String operador;
    int union;

    public void suma() {
        num01 = Double.parseDouble(pantalla.getText());
        pantalla.setText(pantalla.getText() + "+");
        union = pantalla.getText().indexOf("+");
        operador = "+";
    }

    public void resta() {
        operador = "-";
        num01 = Double.parseDouble(pantalla.getText());
        pantalla.setText(pantalla.getText() + "-");
        union = pantalla.getText().indexOf("-");
    }

    public void multiplicacion() {
        operador = "*";
        num01 = Double.parseDouble(pantalla.getText());
        pantalla.setText(pantalla.getText() + "*");
        union = pantalla.getText().indexOf("*");
    }

    public void division() {
        operador = "/";
        num01 = Double.parseDouble(pantalla.getText());
        pantalla.setText(pantalla.getText() + "/");
        union = pantalla.getText().indexOf("/");
    }

    public void igual() {
        String resultado = pantalla.getText().substring(union + 1);
        num02 = Double.parseDouble(resultado);

        switch (operador) {
            case "+":
                igual = num01 + num02;
                break;

            case "-":
                igual = num01 - num02;
                break;

            case "*":
                igual = num01 * num02;
                break;

            case "/":
                igual = num01 / num02;
                break;
        }
        pantalla.setText(pantalla.getText() + "=" + igual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setFont(new java.awt.Font("Century Gothic", 1, 35)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 0, 0));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 69));

        btn1.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, 59));

        btn3.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, 59));

        btnsuma.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 59));

        btn2.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 60, 59));

        btnresta.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 59));

        btn4.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 60, 59));

        btn5.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 60, 59));

        btn6.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 60, 59));

        btnmultiplicacion.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btnmultiplicacion.setText("x");
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 59));

        btn7.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 59));

        btn8.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, 59));

        btn9.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 60, 59));

        btndivision.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btndivision.setText("÷");
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });
        getContentPane().add(btndivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 59));

        btnpunto.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 60, 59));

        btn0.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 60, 59));

        btnigual.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        getContentPane().add(btnigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 80, 50));

        btnborrar.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnborrar.setText("CE");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 60, 59));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        suma();
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        pantalla.setText(pantalla.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        pantalla.setText(pantalla.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        pantalla.setText(pantalla.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        resta();
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        pantalla.setText(pantalla.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        pantalla.setText(pantalla.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        pantalla.setText(pantalla.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        multiplicacion();
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        pantalla.setText(pantalla.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        pantalla.setText(pantalla.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        pantalla.setText(pantalla.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        division();
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        pantalla.setText(pantalla.getText() + ".");
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        pantalla.setText(pantalla.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        pantalla.setText("");
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        igual();
    }//GEN-LAST:event_btnigualActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
