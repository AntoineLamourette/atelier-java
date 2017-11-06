package m2i.atelierjava.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m2i.atelierjava.entite.Serie;
import org.junit.Test;


public class SerieTest {
    @Test
     
            public void testAffichage() {
    Serie s1 = new Serie();
    s1.initialise("Dexter", 2008, "baleze", 8);
//    s1.setTitre("Dexter");
//    s1.setAnneeDeSortie(2008);
//    s1.setNombreDeSaison(8);
//    s1.setSynopsis("baleze");
    s1.affiche();
    
    Serie s2 = new Serie();
    s2.setTitre("Game of thrones");
    s2.setAnneeDeSortie(2011);
    s2.setNombreDeSaison(7);
    s2.setSynopsis("Super baleze");
    s2.affiche();
    
    
    
    
            }
}
