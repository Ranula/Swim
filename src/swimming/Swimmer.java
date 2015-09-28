/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

/**
 *
 * @author User
 */
public abstract class Swimmer extends Person {
    public static int NumofSwimmers;
    
    public  Swimmer(String name) {
        super(name);
        //NumofSwimmers++;
        
    }
    public boolean startswim(){
        return false;
        
    }
    public void swim(){
        
    }
    public static void incrementSwimmers(){
        NumofSwimmers++;
        NumofPeople++;
    }
    public void butterflystroke(){
        
    }
    public void backstroke(){
        
    }
    public void freestyle(){
        
    }
    public void breastroke(){
        
    }
}
