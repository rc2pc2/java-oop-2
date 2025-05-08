package org.lessons.java.testing;

import org.lessons.java.oop.ContenutoMultimediale;
import org.lessons.java.oop.Film;
import org.lessons.java.oop.Serie;

public class Main {

    public static void main(String[] args) {
        Film ilSignoreDegliAnelli = new Film("Il signore degli anelli", 
                    new String[]{ "Gina", "Gino", "Gandalf" },
                    182);
                    
        System.out.println(ilSignoreDegliAnelli.getTitolo());
        ilSignoreDegliAnelli.setTitolo("");
        System.out.println(ilSignoreDegliAnelli.getTitolo());
        System.out.println(ilSignoreDegliAnelli.getAttori()[2]);
        System.out.println(ilSignoreDegliAnelli.getDurata());

        Serie theLastOfUs = new Serie("The last of us", new String[]{"Ginetta", "Ginone", "Pedro Pascal"}, 9);
        System.out.println(theLastOfUs.getTitolo());
        System.out.println(theLastOfUs.getAttori()[2]);
        System.out.println(theLastOfUs.getNumeroDiEpisodi());

        ContenutoMultimediale documentario = new ContenutoMultimediale("Planet Earth");
        System.out.println(documentario.getTitolo()); 
        System.out.println(documentario.getAttori().length); 

    }
    
}
