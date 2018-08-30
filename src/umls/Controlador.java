/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umls;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Estudiantes
 */
public class Controlador {
    Vista vis;
    Modelo mod;
   Dibujo dib= new Dibujo();

    Controlador(Vista vis, Modelo mod) {
        this.vis=vis;
        this.mod=mod;
    }
     public void actionPerformed(ActionEvent e1) {
        if(e1.getSource().equals(vis.atriButton)){
            mod.agregarAtr(vis.atri.getText(), vis.TipoAtributo.getSelectedIndex());
        } 
       else if(e1.getSource().equals(vis.met2Button)){
            mod.agregarMet(vis.meto2.getText(), vis.TipoMeto2.getSelectedIndex());
        }
       else if(e1.getSource().equals(vis.diagButton)){
            //mod.PonerNombre(vis.nameClass.getText());
            dib.mostrar();
            vis.newClassButton.setEnabled(true);
            vis.newClassButton.setVisible(true);
            vis.atriButton.setEnabled(false);
            vis.met2Button.setEnabled(false);
            vis.diagButton.setEnabled(false);
            vis.nameClass.setEditable(false);
            vis.atri.setEditable(false);
            vis.meto2.setEditable(false);
            vis.TipoAtributo.setEnabled(false);
            vis.TipoMeto2.setEnabled(false);
            vis.nameClass.setText("");
            vis.atri.setText("");
            vis.meto2.setText("");
        }
        else if(e1.getSource().equals(vis.newClassButton)){
            mod.Atr.clear();
            mod.Mod.clear();
            mod.TipoAtr.clear();
            mod.TipoMeto2.clear();
            vis.atriButton.setEnabled(true);
            vis.met2Button.setEnabled(true);
            vis.diagButton.setEnabled(true);
            vis.nameClass.setEditable(true);
            vis.atri.setEditable(true);
            vis.meto2.setEditable(true);
            vis.TipoAtributo.setEnabled(true);
            vis.TipoMeto2.setEnabled(true);
        }
    }
}

