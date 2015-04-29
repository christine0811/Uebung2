
package at.ac.fh_kufstein.uebung_02.Classes;


public class Auto extends Fahrzeug implements Comparable<Auto>{
    
    
    private boolean klimaanlage;
    private short airgbags;
    private color farbe;

    
    
    public enum color{
        silver, red, black, blue, white
    }

    public Auto(boolean klimaanlage, short airgbags, color farbe) {
        this.klimaanlage = klimaanlage;
        this.airgbags = airgbags;
        this.farbe = farbe;
    }

    public Auto(short airgbags, short reifen, short ps, short tueren, short geschwindigkeit, color farbe) {
        super(reifen, ps, tueren, false, geschwindigkeit, color.black);
        this.klimaanlage = false;
        this.airgbags = airgbags;
        this.farbe = farbe;
        
        anzahl++;
    }
    
    public color getFarbe(){
        return farbe;
    }
    
    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirgbags() {
        return airgbags;
    }

    public void setAirgbags(short airgbags) {
        this.airgbags = airgbags;
    }
    
    public void klimaanlageAn(){
     
        if (klimaanlage = false){
            klimaanlage = true;
        }
        else{
            System.out.println("Klimaanlage läuft bereits");
        }
    }
     public void klimaanlageAus(){
     
        if (klimaanlage = true)
        {
            klimaanlage = false;
        }
        else
        {
            System.out.println("Klimaanlage bereits aus");
        }
        
        
        
    }

    @Override
    public String toString() {
        return "Mein Auto hat " +getPs()+ " PS und fährt mit " +getGeschwindigkeit()+ " km/h";
    }

    @Override
    public int compareTo(Auto o) {
        if(this.getPs() < o.getPs())
        {
            return -1;
        }
        else if (this.getPs()> o.getPs())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
     
    
    
    
    
}
