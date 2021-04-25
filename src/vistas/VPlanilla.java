/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.event.ActionListener;

public class VPlanilla extends javax.swing.JDialog {

    
    public VPlanilla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public void agregarListener(ActionListener accion) {
        btnguardar.addActionListener(accion);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnombresolicitante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtubicacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtreferencia = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtobservacion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtlink = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(txtnombresolicitante);
        txtnombresolicitante.setBounds(10, 50, 500, 24);

        txtubicacion.setColumns(20);
        txtubicacion.setRows(5);
        jScrollPane1.setViewportView(txtubicacion);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(13, 110, 230, 83);

        txtreferencia.setColumns(20);
        txtreferencia.setRows(5);
        jScrollPane2.setViewportView(txtreferencia);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(273, 110, 240, 83);

        txtobservacion.setColumns(20);
        txtobservacion.setRows(5);
        jScrollPane3.setViewportView(txtobservacion);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(273, 240, 240, 83);

        txtlink.setColumns(20);
        txtlink.setRows(5);
        jScrollPane4.setViewportView(txtlink);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(13, 240, 230, 83);

        jLabel1.setText("Observación");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 210, 240, 16);

        jLabel2.setText("Nombre del Solicitante");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 500, 16);

        jLabel3.setText("Ubicación");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 80, 230, 16);

        jLabel4.setText("Punto de Referencia");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 80, 240, 16);

        jLabel5.setText("Link de la publicación");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 210, 230, 16);

        btnguardar.setText("Guardar");
        jPanel1.add(btnguardar);
        btnguardar.setBounds(10, 340, 500, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VPlanilla dialog = new VPlanilla(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    /**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtlink;
    private javax.swing.JTextField txtnombresolicitante;
    private javax.swing.JTextArea txtobservacion;
    private javax.swing.JTextArea txtreferencia;
    private javax.swing.JTextArea txtubicacion;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnguardar
     */
    public javax.swing.JButton getBtnguardar() {
        return btnguardar;
    }

    /**
     * @param btnguardar the btnguardar to set
     */
    public void setBtnguardar(javax.swing.JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    /**
     * @return the txtlink
     */
    public javax.swing.JTextArea getTxtlink() {
        return txtlink;
    }

    /**
     * @param txtlink the txtlink to set
     */
    public void setTxtlink(javax.swing.JTextArea txtlink) {
        this.txtlink = txtlink;
    }

    /**
     * @return the txtnombresolicitante
     */
    public javax.swing.JTextField getTxtnombresolicitante() {
        return txtnombresolicitante;
    }

    /**
     * @param txtnombresolicitante the txtnombresolicitante to set
     */
    public void setTxtnombresolicitante(javax.swing.JTextField txtnombresolicitante) {
        this.txtnombresolicitante = txtnombresolicitante;
    }

    /**
     * @return the txtobservacion
     */
    public javax.swing.JTextArea getTxtobservacion() {
        return txtobservacion;
    }

    /**
     * @param txtobservacion the txtobservacion to set
     */
    public void setTxtobservacion(javax.swing.JTextArea txtobservacion) {
        this.txtobservacion = txtobservacion;
    }

    /**
     * @return the txtreferencia
     */
    public javax.swing.JTextArea getTxtreferencia() {
        return txtreferencia;
    }

    /**
     * @param txtreferencia the txtreferencia to set
     */
    public void setTxtreferencia(javax.swing.JTextArea txtreferencia) {
        this.txtreferencia = txtreferencia;
    }

    /**
     * @return the txtubicacion
     */
    public javax.swing.JTextArea getTxtubicacion() {
        return txtubicacion;
    }

    /**
     * @param txtubicacion the txtubicacion to set
     */
    public void setTxtubicacion(javax.swing.JTextArea txtubicacion) {
        this.txtubicacion = txtubicacion;
    }
}
