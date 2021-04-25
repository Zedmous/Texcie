
package controladores;

import generales.MFecha;
import generales.Mensajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import vistas.VPlanilla;

public class CPlanilla implements ActionListener{

    private VPlanilla vplanilla;
    
    
    private Mensajes msj = new Mensajes();
    public CPlanilla(CMenu cmenu){
        vplanilla= new VPlanilla(cmenu.getVmenu(),false);
        vplanilla.setLocationRelativeTo(null);
        vplanilla.setResizable(false);
        vplanilla.setVisible(true);
        vplanilla.setTitle("PLANILLA");
        vplanilla.agregarListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Guardar")){
            if(vplanilla.getTxtnombresolicitante().getText().equalsIgnoreCase("")){
                msj.mvacio("Por favor ingrese un solicitante para guardar","SOLICITANTE VACIO",vplanilla.getTxtnombresolicitante());
            }else if(vplanilla.getTxtubicacion().getText().equalsIgnoreCase("")){
                msj.mvacio("Por favor especifique una ubicación para guardar","UBICACION VACIA",vplanilla.getTxtubicacion());
            }else if(vplanilla.getTxtreferencia().getText().equalsIgnoreCase("")){
                msj.mvacio("Por favor ingrese una referencia para guardar","REFERENCIA VACIA",vplanilla.getTxtreferencia());
            }else if(vplanilla.getTxtlink().getText().equalsIgnoreCase("")){
                msj.mvacio("Por favor ingrese un link para guardar","LINK VACIAO",vplanilla.getTxtlink());
            }else if(vplanilla.getTxtobservacion().getText().equalsIgnoreCase("")){
                msj.mvacio("Por favor ingrese una observacionpara guardar","OBSERVACION VACIA",vplanilla.getTxtobservacion());
            }else{
                guardar();
            }
        }
    }
    public void guardar(){
        JFileChooser fc = new JFileChooser();
        MFecha fecha= new MFecha();
        int seleccion = fc.showSaveDialog(fc);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            String fichero=fc.getSelectedFile().toString()+fecha.getFechaeuropea()+".txt";
            boolean enc=true;
            if (! (new File(fichero)).exists() ){
                try {
                    BufferedWriter fsalida=new BufferedWriter(new FileWriter(new File(fichero),enc));
                    fsalida.write("solicitante:"+vplanilla.getTxtnombresolicitante().getText());
                    fsalida.newLine();
                    fsalida.write("ubicacion:"+vplanilla.getTxtubicacion().getText());
                    fsalida.newLine();
                    fsalida.write("referencia:"+vplanilla.getTxtreferencia().getText());
                    fsalida.newLine();
                    fsalida.write("link:"+vplanilla.getTxtlink().getText());
                    fsalida.newLine();
                    fsalida.write("observacion:"+vplanilla.getTxtobservacion().getText());
                    fsalida.newLine();
                    fsalida.close();
                    msj = new Mensajes();
                        msj.minformando("Denuncia guardada!!!");
                } catch (IOException ef){
                    System.out.println("Ha habido problemas: " +ef.getMessage() );
                }
            }
        }
    }
    
    
}
