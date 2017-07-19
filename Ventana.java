/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoH;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Ventana extends javax.swing.JFrame {
    Fichero f1=new Fichero();
    Date hoy=new Date();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
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

        jLabel2 = new javax.swing.JLabel();
        Ingreso = new javax.swing.JButton();
        IngresoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Conceptotxt = new javax.swing.JTextField();
        Importetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GuardarGasto = new javax.swing.JButton();
        Grafica = new javax.swing.JButton();
        CerrarMes = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESOS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Ingreso.setText("Ingresar");
        Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoActionPerformed(evt);
            }
        });
        getContentPane().add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        IngresoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoTextActionPerformed(evt);
            }
        });
        getContentPane().add(IngresoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EUR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 30, -1));

        jButton2.setText("Tabla de Ingresos");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GASTOS: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Concepto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        getContentPane().add(Conceptotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));
        getContentPane().add(Importetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Importe:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EUR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        GuardarGasto.setText("Guardar");
        getContentPane().add(GuardarGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        Grafica.setText("Grafica de gastos");
        getContentPane().add(Grafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        CerrarMes.setText("Cerrar Mes");
        getContentPane().add(CerrarMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        Modificar.setText("Modificar/Eliminar");
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sebastian L Souto Robles  Version 2.0");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 421, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoTextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoActionPerformed
        // TODO add your handling code here:
       
	Ingreso in=Ingreso.ingreso(hoy,IngresoText.getText());
	try{
		f1.Guardar(BoH.fichero, in.getImporte(), BoH.lista);
	}catch(Exception d){
		JOptionPane.showMessageDialog(null,"Error al guardar el ingreso.");
				
	}
		Gasto.gasto_total=Gasto.dame_gasto();
		BoH.saldo_actual=BoH.dame_saldo();
			
    }//GEN-LAST:event_IngresoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarMes;
    private javax.swing.JTextField Conceptotxt;
    private javax.swing.JButton Grafica;
    private javax.swing.JButton GuardarGasto;
    private javax.swing.JTextField Importetxt;
    private javax.swing.JButton Ingreso;
    private javax.swing.JTextField IngresoText;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}