/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class VariablesTest {

//    @Test

    public void testConceneKingstonEtJamaique() {

        String a = "jamaïque";

        String b = "kingston";

        String c = b.toUpperCase() + ", " + a.toUpperCase();

        System.out.println(c);

    }

//    @Test

    public void testEx2() {

        int a = 123;
        String b = "coucou";
        String c = a + b;
        String d = b + a;

        System.out.println(c);
        System.out.println(d);
    }

//    @Test
    public void testEx3() {

        int a = 10;
        String b = "20";
        
        
        int c = a + Integer.parseInt(b);
        int d = Integer.parseInt(b) + a;
        

        System.out.println("a+b = " + c);
        System.out.println("b+a = " + d);
    }

    @Test
    public void test4() {
    
        System.out.println(carre (25) );
    }
        
    public int carre(int nb){
        return nb * nb;

    }
}
