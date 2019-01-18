/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6_tehtävä1;

/**
 *
 * @author ett15084
 */
public class Account {
    
    protected String accountNumber = "";
    protected int amount = 0; //account has no money initially
    
    public Account (String an, int a){
        accountNumber = an;
        amount = a;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public int getMoney(){
        return amount;
    }
    
    
    /*
    rahaa = rahaa + (+x);
    rahaa = rahaa + (-x);
    
    
    */
    
    public void changeMoney(int a){
        amount = amount + a;
    }
}
    class regularAccount extends Account{
        
    public regularAccount(String an, int a) {
        super(an, a);
    }
    
    }

    
    
    class creditAccount extends Account{
        
    public creditAccount(String an, int a) {
        super(an, a);
    }
        
    }

    

