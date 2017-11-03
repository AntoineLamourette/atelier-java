/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Synthetiseur;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SynthetiseurTest {
////    @Test
//    public void SynthetiseurTest() {
//      Synthetiseur a = new Synthetiseur(true, "Piano", 0, 0, 0);
//      a.isOn();
      
    
    @Test
    
    public void testNoteAJouerOk () {
        Synthetiseur synth = new Synthetiseur(true, "guitare", 0, 0, 0);
        synth.allumageOnOff();
        synth.jouerNote("FA#3");
}
}
//    @Test
    
//    public void testVolumePlusOk(){
//        Synthetiseur a = new Synthetiseur(true, "guitare", 0, 0, 0);
//        System.out.println( a.getVolume());
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        a.volumePlus();
//        System.out.println(a.getVolume());
//        
//        
//    }
//      
//      
//      
//      
      
//        }

   
    

