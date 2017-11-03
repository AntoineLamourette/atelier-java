/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class VehiculeTest {
    
    @Test
    public void testAvion(){
    
            Avion a = new Avion("boeing", false, "457", "blanc", 200, 0, 0, 0, 800);
            
            
            a.avancer();
            a.afficher();
    }
         

//    @Test

    public void testVehicule() {

        Vehicule vehic1 = new Vehicule("Ferrari", true, "F50", "rouge", 2, 0, 0, 0, 5);
        vehic1.avancer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.reculer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.reculer();
        vehic1.afficher();
    }

}
