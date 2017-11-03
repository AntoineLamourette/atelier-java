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
public class Film {

    private String titre;
    private String synopsis;
    private int anneeDeProduction;
    private Date dateCreation;

    public void initialise(String titre, String synopsis, int anneeDeProduction, Date dateCreation) {

        this.titre = titre;
        this.synopsis = synopsis;
        this.dateCreation = dateCreation;
        this.anneeDeProduction = anneeDeProduction;
        
    }

    public void affiche() {
        System.out.println(titre + " " + synopsis + " " + anneeDeProduction + " " + dateCreation);
        //Equivalent (String.format("Film:%s %s %d %s, this.titre, this.synopsis, this.anneeDeProduction, this.dateCreation)
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneeDeProduction(int anneeDeProduction) {
        this.anneeDeProduction = anneeDeProduction;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    

    
}
