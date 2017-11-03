/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Serie {
    
        private String titre;
        private int anneeDeSortie;
        private int nombreDeSaison;
        private String synopsis;

        public void initialise(String titre, int anneeDeSortie, String synopsis, int nombreDeSaison){
            
            this.titre = titre;
            this.synopsis = synopsis;
            this.anneeDeSortie = anneeDeSortie;
            this.nombreDeSaison = nombreDeSaison;
        
        }
        public void affiche (){
            System.out.println(titre + " " + anneeDeSortie + " " + synopsis + " " + nombreDeSaison);
        }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(int anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public int getNombreDeSaison() {
        return nombreDeSaison;
    }

    public void setNombreDeSaison(int nombreDeSaison) {
        this.nombreDeSaison = nombreDeSaison;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

}