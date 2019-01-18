/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko2_tehtävä2;

import java.util.Scanner;

/**
 *
 * @author ett15084
 */
public class Viikko2_tehtävä2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input1 = "";
        String input2 = "";
        
        Dog dog1 = new Dog("Rekku", "Hau!");
        Dog dog2 = new Dog("Musti", "Vuh!");
        
        
        System.out.println("Hei, nimeni on " + dog1.getName() + "!");
        
        System.out.println("Hei, nimeni on " + dog2.getName() + "!");
        
        System.out.println(dog1.getName() + ": " + dog1.getSpeak());
        
        System.out.println(dog2.getName() + ": " + dog2.getSpeak());
        
        
    }
    
    
}
