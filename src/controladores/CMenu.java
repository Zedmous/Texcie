
package controladores;

import generales.Mensajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.VMenu;

public class CMenu implements ActionListener {

    private VMenu vmenu;
    private CPlanilla cplanilla;
    private Mensajes msj=new Mensajes();
    public CMenu(){
        vmenu=new VMenu();
        vmenu.setVisible(true);
        vmenu.agregarListener(this);
        vmenu.setTitle("MENU");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("nueva")){
            cplanilla=new CPlanilla(this);
        }
        if(e.getActionCommand().equalsIgnoreCase("denuncias procesadas")){
            msj.minformando("Accion no implementada aun");
        }
    }

    
    public VMenu getVmenu() {
        return vmenu;
    }

    public void setVmenu(VMenu vmenu) {
        this.vmenu = vmenu;
    }
    
}
