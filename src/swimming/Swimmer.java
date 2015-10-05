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
public abstract class Swimmer extends Person implements Strokes {
    public static int NumofSwimmers;
    //private String stroke;
    
    public  Swimmer(String name) {
        super(name);
        People.add(this);
    }
  
    public static void incrementSwimmers(){
        NumofSwimmers++;
        NumofPeople++;
        
    }
    
    //swimmingMoves
    protected void breath(){
        
    }
    protected boolean kick(){
        return false;
    }
    //butterfly
    protected void pull(){
        
    }
   protected void push(){
        
    }
    protected void recover(){
        
    }
    //freestyle & backstroke
    
    protected void rightarmforward(){
    }
    protected void leftarmforward(){
    } 
     protected void rightarmbakward(){
    }
    protected void leftarmbakward(){
    }    
    //breaststroke
    protected void glide(){
    }
    protected void outsweep(){
    } 
    protected void insweep(){
    }
}
