
package pkg911;

import java.io.*;
import javax.swing.DefaultListModel;

public class VPlanilla extends javax.swing.JFrame {

    private DefaultListModel datos;
    public VPlanilla() {
        initComponents();
    }
    public VPlanilla(DefaultListModel datos) {
        initComponents();
        this.datos=datos;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar);
        btnguardar.setBounds(10, 340, 500, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        String fichero="Denuncias.txt";
        boolean enc=true;
        if (! (new File("fichero.txt")).exists() )
        {
            enc=false;
        }
        try
        {
            int lineas=0;
            if(enc){
                BufferedReader ficheroEntrada = new BufferedReader(
                    new FileReader(new File("fichero.txt")));
                String linea=null;
                while ((linea=ficheroEntrada.readLine()) != null) {
                    lineas++;
                }
                ficheroEntrada.close();
            }
            lineas++;
            BufferedWriter ficheroSalida;
            ficheroSalida= new BufferedWriter(new FileWriter(new File("fichero.txt"),enc));
            ficheroSalida.write(String.valueOf(lineas));
            ficheroSalida.write(";");
            ficheroSalida.write(txtnombresolicitante.getText());
            ficheroSalida.write(";");
            ficheroSalida.write(txtubicacion.getText());
            ficheroSalida.write(";");
            ficheroSalida.write(txtreferencia.getText());
            ficheroSalida.write(";");
            ficheroSalida.write(txtlink.getText());
            ficheroSalida.write(";");
            ficheroSalida.write(txtobservacion.getText());
            ficheroSalida.write(";");
            ficheroSalida.newLine();
            
            ficheroSalida.close();
        }
        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    
    /*public static void main(String args[]) {
        
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
                new VPlanilla().setVisible(true);
            }
        });
    }*/

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
}
