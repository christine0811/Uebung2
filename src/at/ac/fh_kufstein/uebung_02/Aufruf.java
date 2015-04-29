
package at.ac.fh_kufstein.uebung_02;

import at.ac.fh_kufstein.uebung_02.Classes.Auto;
import at.ac.fh_kufstein.uebung_02.Classes.Auto.color;
import java.util.ArrayList;
import java.util.Collections;


public class Aufruf {

    
    public static void main(String[] args) {
        
        Auto audi = new Auto ((short)4, (short)4, (short)220, (short)5, (short)0, color.black);
        Auto bmw = new Auto ((short)4, (short)4, (short)205, (short)5, (short)0, color.silver);
      //  Wasserfahrzeug titanic = new Wasserfahrzeug ((short)0, "blau", (short)51000, (short)0, (short)10.54, (short)3, 100000);
        Auto audi2 = new Auto ((short)4, (short)4, (short)260, (short)5, (short)0, color.red);
        Auto audi3 = new Auto ((short)4, (short)4, (short)190, (short)5, (short)0, color.blue);
        Auto audi4 = new Auto ((short)4, (short)4, (short)110, (short)5, (short)0, color.white);
        
        ArrayList<Auto> liste = new ArrayList<Auto>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);
        
        for (Auto a : liste)
        {
            System.out.println(a.getPs());
        }
        
        
    }
        
    }