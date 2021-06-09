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
public class RunSerializedFile {
    public static void main (String[]orgs){
    ReadSerializedFile obj = new ReadSerializedFile();
    obj.openFile();
    obj.readFromFile();
}
}