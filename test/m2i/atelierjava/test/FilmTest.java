/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;



/**
 *
 * @author Formation
 */
public class FilmTest {

    @Test

    public void nouveauFilm() {

        Film f1 = new Film();
        Date date = new Date();
        f1.initialise("Dracula,", "sanglant", 2010, date);
        f1.affiche();
//        f1.setTitre ("dracula");
//        f1.setanneeDeProduction(2001);
        Film f2 = new Film();
        f2.initialise("Kung fu panda", "marrant", 2007, date);
        f2.affiche();
//        f2.setTitre("kung fu panda");
//        f2.setanneeDeProduction(2010);
//        
//        System.out.println(f1.getTitre() + " " +f1.getanneeDeProduction());
//        System.out.println(f2.getTitre() + " " +f2.getanneeDeProduction());
    }
        

        
      }