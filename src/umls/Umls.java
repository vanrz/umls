/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umls;

/**
 *
 * @author Estudiantes
 */
public class Umls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod=new Modelo();
        Vista vis=new Vista();
        Controlador u = new Controlador (vis,mod);
       // vis.AsignaOyentes(u);
        vis.mostrar();
    }
    
}
