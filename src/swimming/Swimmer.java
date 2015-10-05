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
        People.add(this);
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
   
    //swimmingMoves
    public void breath(){
        
    }
    public boolean kick(){
        return false;
    }
    //butterfly
    public void pull(){
        
    }
    public void push(){
        
    }
    public void recover(){
        
    }
    //freestyle & backstroke
    
    public void rightarmforward(){
    }
    public void moveleftarmforward(){
    } 
     public void rightarmbakward(){
    }
    public void moveleftarmbakward(){
    }    
    //breaststroke
    public void glide(){
    }
    public void outsweep(){
    } 
    public void insweep(){
    }
}
