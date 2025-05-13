package org.lessons.java.oop;

public class ContenutoMultimediale {
    private String titolo;
    private String[] attori;

    public ContenutoMultimediale(String titolo){
        this.titolo = titolo;
        this.attori = new String[]{};
    }

    public ContenutoMultimediale(String titolo, String[] attori){
        this.titolo = titolo;
        this.attori = attori;
    }

    public String riproduci(){
        return "Sto riproducendo il contenuto con titolo " + this.titolo;
    };

    public void setAttori(String[] nuoviAttori){
        if (nuoviAttori != null){
            this.attori = nuoviAttori;
        }
    }

    public String[] getAttori(){
        // % aggiungo logica
        return this.attori;
    } 

    public void setTitolo(String titolo){
        if (titolo.trim().length() > 0){
            this.titolo = titolo;
        }
    }

    public String getTitolo(){
        return this.titolo;
    } 

    private void metodoACaso(){
        System.out.println("Sono un metodo a caso");
    }

}
