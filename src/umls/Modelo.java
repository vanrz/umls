/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umls;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Modelo {
    ArrayList <String> Atr=new ArrayList <>();
    ArrayList <String> Mod=new ArrayList <>();
    ArrayList <String> TipoAtr=new ArrayList <>();
    ArrayList <String> TipoMeto2=new ArrayList <>();
    String NombreClass= new String();
    
    void agregarAtr(String Atributo, int TipoAt){
        
        Atr.add(Atributo);
            
        switch (TipoAt) {
            case 1:
                TipoAtr.add("Private");
                break;
            case 0:
                TipoAtr.add("Public");
                break;
            case 2:
                TipoAtr.add("Protected");
                break;
            default:
                break;
        }
        System.out.println(Atr);
        System.out.println(TipoAtr);
    }
     void agregarMet(String Modelo, int TipMod){
        Mod.add(Modelo);
        switch (TipMod) {
            case 1:
                TipoMeto2.add("Private");
                break;
            case 0:
                TipoMeto2.add("Public");
                break;
            case 2:
                TipoMeto2.add("Protected");
                break;
            default:
                break;
        }
        System.out.println(Mod);
        System.out.println(TipoMeto2);
    }
    /*void PonerNombre(String Nombre){
        NombreClass=Nombre;
        System.out.println(NombreClass);
        System.out.println(Atr);
        System.out.println(TipoAtr);
        System.out.println(Mod);
        System.out.println(TipoMeto2);
    }*/
}
