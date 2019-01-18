/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6_tehtävä1;

import java.util.ArrayList;


/**
 *
 * @author ett15084
 */
public class Bank {
    
    //Tiliolioita olisi tarkoitus tänne tallennella
    ArrayList<Account> list = new ArrayList();
    
    
    public void addRegularAccount(String an, int a){
        System.out.println("Tili luotu.");
        Account account = new regularAccount(an,a);
        list.add(account);
            
    }
    
    public void addCreditAccount(String an, int a, int l){
        System.out.println("Pankkiin lisätään: " + an + "," + a + "," + l);
        
    }
      
    public void removeAccount(String an){
        for (Account i : list) {
            if(i.getAccountNumber().equals(an)){
            list.remove(i);
            System.out.println("Tili poistettu.");
            //System.out.println(list);
            break;
            }
            
            else{
                System.out.println("Ei pelitä");
                
            }
            }
        
    }
    
    public void findAccount(String an){
        for (Account i : list) {
            
            if(i.getAccountNumber().equals(an))
            System.out.println("Tilinumero: " + an + " Tilillä rahaa: " + i.getMoney());
            
            else{
                System.out.println("Ei pelitä");
                
            }
            }
        }
                
     
    public void takeMoney(String an, int a){
        for(Account i : list){
            if(i.getAccountNumber().equals(an)){
            i.changeMoney(-a);
            //System.out.println("Nostetaan tililtä: " + an + " rahaa " + a);
            }
            else{
                 System.out.println("Ei pelitä");   
            }
        }
        
    }
    
    public void saveMoney(String an, int a){
        for(Account i : list){
            if(i.getAccountNumber().equals(an)){
            i.changeMoney(a);
            //System.out.println("Talletetaan tilille: " + an + " rahaa " + a);
            }
            else{
                 System.out.println("Ei pelitä");   
            }
        }
        
    }
    
    public void showAll(){
        System.out.println("Kaikki tilit:");
        for(Account i : list){
            System.out.println("Tilinumero: " + i.getAccountNumber() + " Tilillä rahaa: " + i.getMoney());
        }
        
    }
    
}

