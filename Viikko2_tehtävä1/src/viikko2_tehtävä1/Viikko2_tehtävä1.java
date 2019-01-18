/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko2_tehtävä1;

import java.util.Scanner;

/**
 *
 * @author ett15084
 */
public class Viikko2_tehtävä1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog dog1 = new Dog("Rekku");
        Dog dog2 = new Dog("Musti");
        
        
        System.out.println("Hei, nimeni on " + dog1.getName() + "!");
        
        System.out.println("Hei, nimeni on " + dog2.getName() + "!");
        
        dog1.speak("");
    }
    
}
