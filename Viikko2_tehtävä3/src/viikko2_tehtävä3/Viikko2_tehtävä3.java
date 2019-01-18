/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko2_tehtävä3;

import java.util.Scanner;

/**
 *
 * @author ett15084
 */
public class Viikko2_tehtävä3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input1 = "";
        String input2 = "";
        
        Dog dog1 = new Dog("Rekku");
        Dog dog2 = new Dog("Musti");
        
        
        
        System.out.print("Anna koiralle nimi: ");
        Scanner scan = new Scanner(System.in);
        input1 = scan.nextLine();
        dog1.name(input1);
                
        System.out.print("Mitä koira sanoo: ");
        Scanner scan1 = new Scanner(System.in);
        input2 = scan1.nextLine();
        System.out.println(input1 + ": " + input2 );
        //dog1.speak(input2);
        
        
    }
    
    
}
