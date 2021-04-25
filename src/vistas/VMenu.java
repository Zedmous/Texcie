
package vistas;

import controladores.CPlanilla;
import java.awt.event.ActionListener;

public class VMenu extends javax.swing.JFrame {

   
    private CPlanilla cplanilla;
   
    public VMenu() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(6);
    }

    public void agregarListener(ActionListener accion) {
        btndenuncia.addActionListener(accion);
        btndenuncias.addActionListener(accion);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btndenuncia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btndenuncias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Denuncia");

        btndenuncia.setText("Nueva");
        jMenu1.add(btndenuncia);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listado");

        btndenuncias.setText("Denuncias Procesadas");
        jMenu2.add(btndenuncias);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btndenuncia;
    private javax.swing.JMenuItem btndenuncias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btndenuncia
     */
    public javax.swing.JMenuItem getBtndenuncia() {
        return btndenuncia;
    }

    /**
     * @param btndenuncia the btndenuncia to set
     */
    public void setBtndenuncia(javax.swing.JMenuItem btndenuncia) {
        this.btndenuncia = btndenuncia;
    }
}
