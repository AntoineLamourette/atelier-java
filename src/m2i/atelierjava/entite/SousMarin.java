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
public class SousMarin extends Vehicule{
    
    private boolean plonge;

    public SousMarin(boolean plonge, String marque, boolean utilitaire, String modèle, String couleur, int nbPlaces, int x, int y, int z, int vts) {
        super(marque, utilitaire, modèle, couleur, nbPlaces, x, y, z, vts);
        this.plonge = plonge;
    }

    public boolean isPlonge() {
        return plonge;
    }

    public void setPlonge(boolean plonge) {
        this.plonge = plonge;
    }

    

    
    
        
    public SousMarin(String marque, boolean utilitaire, String modèle, String couleur, int nbPlaces, int x, int y, int z, int vts) {
        super(marque, utilitaire, modèle, couleur, nbPlaces, x, y, z, vts);
    }
    

    
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        if(plonge==true){
            y=y-2;
        }
        else {
            y=y+2;
        }
        
        z=z+2;
            
}
}