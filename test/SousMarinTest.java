/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m2i.atelierjava.entite.SousMarin;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SousMarinTest {
    
    @Test
    
    public void SousMarinTest() {
        
        SousMarin s1 = new SousMarin("Barracua", true, "nucléaire", "noir", 100, 0, 0, 0, 0);
        s1.setVitesse(10);
        s1.avancer();
        s1.setPlonge(false);
        s1.afficher();
        
    }
    
}
