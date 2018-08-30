/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umls;

import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiantes
 */
public class Vista extends JFrame {
    
    
    JLabel labelClass= new JLabel ("Clase: ");
    JLabel labelAtr=new JLabel("Atributos: ");
    JLabel labelMet=new JLabel("Métodos: ");
    
    JTextField atri=new JTextField(20);
    JTextField meto2=new JTextField(20);
    JTextField nameClass= new JTextField(20);
    
    JButton atriButton= new JButton("Agregar Atributo");
    JButton met2Button= new JButton("Agregar Metodo");
    JButton diagButton=new JButton("Crear Diagrama");
    JButton newClassButton=new JButton("Empezar Nueva Clase");
    
    
    String[] Tipos= { "Public","Private","Protected"};
    JComboBox TipoAtributo= new JComboBox(Tipos);
    JComboBox TipoMeto2= new JComboBox(Tipos);
    
     void mostrar() {
        setSize(640,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Diagramas de Clase");
        setLocationRelativeTo(null);
            }
     Vista(){
     
     Container n = getContentPane();
        n.setLayout(null);
        
        
        n.add(labelClass);
        labelClass.setBounds(50,10,120,30);
        
        n.add(nameClass);
        nameClass.setBounds(120,15,100,20);
        
        n.add(newClassButton);
        newClassButton.setBounds(230,10,200,20); 
        newClassButton.setEnabled(false);
        newClassButton.setVisible(false);
        
        n.add(labelAtr);
        labelAtr.setBounds(50,50,120,30);
        
        n.add(atri);
        atri.setBounds(120,55,100,20);
        
        n.add(atriButton);
        atriButton.setBounds(370,55,130,20);
        
        n.add(TipoAtributo);
        TipoAtributo.setBounds(230,55,130,20);
        
        n.add(labelMet);
        labelMet.setBounds(50,90,120,30);
        
        n.add(meto2);
        meto2.setBounds(120,95,100,20);
        
        n.add(met2Button);
        met2Button.setBounds(370,95,130,20);
        
        n.add(TipoMeto2);
        TipoMeto2.setBounds(230,95,130,20);
        n.add(diagButton);
        diagButton.setBounds(200,200,130,20);  
   
       
     }
    
   void AsignaOyentes(Controlador h) {      
        atriButton.addActionListener((ActionListener) h); 
        met2Button.addActionListener((ActionListener)h); 
        diagButton.addActionListener((ActionListener)h); 
        newClassButton.addActionListener((ActionListener)h); 
    }
    
    
    
}
