/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class CollectionTest {
    
    
//    @Test
    
//    public void testList() {
//        
//        List<String> listeFilms = new ArrayList<>();
//        
//        listeFilms.add("Dracula");
//        listeFilms.add("Matrix");
//        listeFilms.add("Winnie l'ourson");
//        
//        
//        for (String film : listeFilms) {
//            
//            System.out.println(listeFilms);
//        }
//    }
    
    @Test
    
    public void TestSomme(){
        List<String> listeFrBe = new ArrayList<>();
        
        listeFrBe.add("Belgique");
        listeFrBe.add("France" );
        
//        for (String pays : listePays) {
//            System.out.println(pays);
//        }
        List<String> listeEsIt = new ArrayList<>();
        listeEsIt.add("Espage");
        listeEsIt.add("Italie");
        
//        for (String pays : listePays) {
      List<String> listeTotale = new ArrayList<>();
      listeTotale.addAll(listeFrBe);
      listeTotale.addAll(listeEsIt);
           
            
//        }
      int nbElem = listeTotale.size();
      Assert.assertEquals(4, nbElem);
}
}

    
    

