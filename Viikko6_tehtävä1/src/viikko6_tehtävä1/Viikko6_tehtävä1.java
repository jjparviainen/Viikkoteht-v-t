/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6_tehtävä1;

import java.util.Scanner;

/**
 *
 * @author ett15084
 */
public class Viikko6_tehtävä1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Valikko pankkijärjestelmälle:
        
        Bank bank = new Bank();
        
        while(true){
            
            System.out.println("\n*** PANKKIJÄRJESTELMÄ ***");
            System.out.println("1) Lisää tavallinen tili");
            System.out.println("2) Lisää luotollinen tili");
            System.out.println("3) Tallenna tilille rahaa");
            System.out.println("4) Nosta tililtä");
            System.out.println("5) Poista tili");
            System.out.println("6) Tulosta tili");
            System.out.println("7) Tulosta kaikki tilit");
            System.out.println("0) Lopeta");

            System.out.print("Valintasi: ");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            
            if("1".equals(choice)){
                System.out.print("Syötä tilinumero: ");
                Scanner scan1 = new Scanner(System.in);
                String an = scan1.nextLine();
                
                System.out.print("Syötä rahamäärä: ");
                Scanner scan2 = new Scanner(System.in);
                String line = scan2.nextLine();
                int money = Integer.parseInt(line);
                
                bank.addRegularAccount(an, money);
                
            }
            
            else if("2".equals(choice)){
                System.out.print("Syötä tilinumero: ");
                Scanner scan1 = new Scanner(System.in);
                String an = scan1.nextLine();
                
                System.out.print("Syötä rahamäärä: ");
                Scanner scan2 = new Scanner(System.in);
                String money = scan2.nextLine();
                int amount = Integer.parseInt(money);
                
                System.out.print("Syötä luottoraja: ");
                Scanner scan3 = new Scanner(System.in);
                String line = scan3.nextLine();
                int limit = Integer.parseInt(line);
                
                bank.addCreditAccount(an, amount, limit);
        
            }
            
            else if("3".equals(choice)){
                System.out.print("Syötä tilinumero: ");
                Scanner scan1 = new Scanner(System.in);
                String an = scan1.nextLine();
                
                System.out.print("Syötä rahamäärä: ");
                Scanner scan2 = new Scanner(System.in);
                String moneyIn = scan2.nextLine();
                int amount = Integer.parseInt(moneyIn);
                
                bank.saveMoney(an, amount);
        
            }
            
            else if("4".equals(choice)){
                System.out.print("Syötä tilinumero: ");
                Scanner scan1 = new Scanner(System.in);
                String an = scan1.nextLine();
                
                System.out.print("Syötä rahamäärä: ");
                Scanner scan2 = new Scanner(System.in);
                String moneyOut = scan2.nextLine();
                int amount = Integer.parseInt(moneyOut);
                
                bank.takeMoney(an, amount);
        
            }
            
            else if("5".equals(choice)){
                System.out.print("Syötä poistettava tilinumero: ");
                Scanner scan1 = new Scanner(System.in);
                String removedAccount = scan1.nextLine();
                
                bank.removeAccount(removedAccount);
                
                
            }
            
            else if("6".equals(choice)){
                System.out.print("Syötä tulostettava tilinumero: ");
                Scanner scan1 = new Scanner(System.in);
                String accountToPrint = scan1.nextLine();
                
                bank.findAccount(accountToPrint);
                
            }
            
            else if("7".equals(choice)){
                bank.showAll();
                
            }
            
            
            else if("0".equals(choice)){
            break;
            }
            
            else{
                System.out.println("Valinta ei kelpaa.");
            }
        
        }

    }
}