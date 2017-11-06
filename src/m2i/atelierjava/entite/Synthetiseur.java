/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Synthetiseur {

    private boolean on;
    private String instrument;
    private int volume;

    public Synthetiseur(boolean on, String instrument, int volume) {
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
        
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    
   
    public void allumageOnOff() {

        if (on == true) {
            on=false;            
            instrument = "guitare";
            volume = 0;
        }
        else{
            on=true;}
        }
    
    public void volume(){
        this.volume=0;
        
   }
    public void volumePlus(){
        
        if (volume < 10){
            volume++;}
        else { System.out.println("Volume max atteint");
        }
    }
    public void volumeMoins(){
        
        if (volume > 0){
            volume--;}
        else { System.out.println("Volume min atteint");
        }
    }
    public void jouerNote(String noteAJouer) { 
        if ( this.on==true){
        System.out.println(noteAJouer + " " + instrument + " " + volume + " " + on);
        }else {System.out.println("le synthé est éteint");
        }
    }
    
}
   
        



