/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.sirsexample;

/**
 *
 * @author Mariaam
 */
public class Account {
    private String accountHolder;
    private String accountType;
    private double accountBalance;

    @Override
    public String toString() {
        return "Account{" + "accountHolder=" + accountHolder + ", accountType=" + accountType + ", accountBalance=" + accountBalance + '}';
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Account(String accountHolder, String accountType, double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    
}
