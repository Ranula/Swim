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
public abstract class Person   {
    private final String Name;
    
    public Person(String name){
        this.Name=name;
    }
    
    public String getName(){
        return Name;
    }
    
}
