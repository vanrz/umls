/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umls;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Estudiantes
 */
public class Dibujo extends JFrame {
    
     void mostrar() {
        setSize(1080,720);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
     Dibujo(){
        Container n = getContentPane(); 
        n.setLayout(null);
    }
     
}
