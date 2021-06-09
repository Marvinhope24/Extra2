/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.sirsexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Mariaam
 */
public class ReadSerializedFile {
    private ObjectInputStream input;
    Account [] accountArray = new Account[5];
    
    public void populateArray(){
        accountArray[0]=new Account("Sam", "Savings", 1000.00);
        accountArray[1]=new Account("Kass", "Cheq", 150.00);
        accountArray[2]=new Account("kim", "Savings", 0.00);
        accountArray[3]=new Account("Luto", "Cheq", 2500.00);
        accountArray[4]=new Account("Mariam", "Savings", 21000.00);
        
    }
    
    public void openFile(){
        try {
            input = new ObjectInputStream(new FileInputStream("Client.ser"));
            System.out.println("ser file open for reading");
        }
       catch (IOException ioe){
           System.out.println("error opening ser file" + ioe.getMessage());
       } 
    }
    public void closeFile(){
        try{
            input.close();
        }
     catch (IOException ioe){
           System.out.println("error closing ser file" + ioe.getMessage());
}
}
    public void readFromFile(){
        try{
            for (int i = 0; i< accountArray.length; i++){
                accountArray[i]= (Account)input.readObject();
                System.out.println(accountArray[i]);
            }
        }
            catch (ClassNotFoundException ioe){
            System.out.println("class error reading ser file"+ ioe );    
                }
        
         catch (IOException ioe){
           System.out.println("error reading from ser file" + ioe);
    }

    finally{
    closeFile();
          System.out.println("File has been closed");
}
    }
}
