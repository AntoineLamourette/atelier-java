/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import junit.framework.Assert;
import m2i.atelierjava.entite.Synthetiseur;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SynthetiseurTest {

      
    
    
    
    
//}
    @Test
//    
    public void testVolumePlusOk(){
        Synthetiseur synth = new Synthetiseur(false, "guitare", 5);
        synth.allumageOnOff();
        
        synth.volumeMoins();
        synth.volumeMoins();
        Assert.assertEquals(3, synth.getVolume());
        Assert.assertTrue(synth.isOn());
        System.out.println(synth.getVolume());
        
//        
    }
    @Test
    
    public void testVolumeMoinsOk (){
        Synthetiseur synth = new Synthetiseur(false, "guitare", 6);
        synth.allumageOnOff();
        Assert.assertTrue(synth.isOn());
        synth.volumeMoins();
        synth.volumeMoins();
       
        Assert.assertEquals(4, synth.getVolume());
        System.out.println(synth.getVolume());
                
        
//       
//        
//        
    }
//        
           @Test
           
           public void testAllumageOnOffOK () {
               
               Synthetiseur synth = new Synthetiseur(false, "guitare", 0);
               Assert.assertFalse("eteint", synth.isOn());
               
              
               synth.allumageOnOff();
               
               Assert.assertTrue(synth.isOn());
               
               synth.allumageOnOff();
               
               Assert.assertFalse(synth.isOn());
               
                             
           }
           
           @Test
        public void testNoteAJouerOk () {
        Synthetiseur synth = new Synthetiseur(false, "guitare", 0);
        synth.allumageOnOff();
        
        synth.volumePlus();
        synth.volumePlus();
        synth.volumePlus();
        synth.volumeMoins();
        synth.volumePlus();
        synth.jouerNote("do mi");
}
        }

   
    

