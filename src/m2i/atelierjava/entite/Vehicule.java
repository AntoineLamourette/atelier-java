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
public class Vehicule {
    
    protected String marque;
    protected boolean utilitaire;
    protected  String modèle;
    protected String couleur;
    protected int nbPlaces;
    protected int x, y, z;
    protected int vitesse;
    
    public Vehicule(){
        
        
    }

    public Vehicule(String marque, boolean utilitaire, String modèle, String couleur, int nbPlaces, int x, int y, int z, int vts) {
        this.marque = marque;
        this.utilitaire = utilitaire;
        this.modèle = modèle;
        this.couleur = couleur;
        this.nbPlaces = nbPlaces;
        this.x = x;
        this.y = y;
        this.z = z;
        this.vitesse = vts;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
    
    

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean isUtilitaire() {
        return utilitaire;
    }

    public void setUtilitaire(boolean utilitaire) {
        this.utilitaire = utilitaire;
    }

    public String getModèle() {
        return modèle;
    }

    public void setModèle(String modèle) {
        this.modèle = modèle;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
    public void afficher(){
    
            String txt = String.format("véhicule: marque=%s utilitaire=%s modele=%s couleur=%s nbPlaces=%d [%d, %d, %d] vitesse=%d", marque, utilitaire, modèle, couleur, nbPlaces, x, y, z, vitesse );
             
            System.out.println(txt);
    }
    public void avancer(){
        
//        x = x + 1;
//        y++;// y = y +1 (++ est dans la base)
//        z++;
        z = z + vitesse;
    }
    public void reculer(){
//        z--;
        z = z - vitesse;
    }
    
}


