/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public abstract class Person   {
    private String Name;
    public static int NumofPeople;
    public static ArrayList<Object> People = new ArrayList<Object>();
        
    public Person(String name){
        this.Name=name;
        
        
    }
    public String getName(){
        return Name;
    }
    //public static void incrementPeople(){
       // NumofPeople++;
    //}
    
}
