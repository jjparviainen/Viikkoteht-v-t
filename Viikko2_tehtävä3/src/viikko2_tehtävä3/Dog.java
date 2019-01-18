/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko2_tehtävä3;

/**
 *
 * @author ett15084
 */
public class Dog {
    
    private String name = "";
    
    
    public Dog(String n){  //Tämä on rakentaja eli metodi jolla sama nimi kuin luokalla
        name = n;          //eli kun olio luodaan niin tehdään jotain ja tällä kertaa
    }                      //siis annetaan attribuutti nimi heti kun se luodaan pääfunktiossa
    
    public String getName() { //tällä saadaan palautettua arvo 
        return name;          //setName vastaavasti muuttaa sen attribuutin arvoa
    }
    
   
    public void name(String n) {
        System.out.println("Hei, nimeni on " + n + "!");
       
    }
    
    public void speak(String s) {
        System.out.println(s);
       
    }
    
  
}
