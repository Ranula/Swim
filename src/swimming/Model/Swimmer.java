/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import swimming.Model.Person;
import java.io.Serializable;

/**
 *
 * @authorRanulaLiyadipita
 */
public abstract class Swimmer extends Person implements Serializable  {
   private float finishtime;
   public int rank;
 
    public  Swimmer(String name) {
        super(name);
    }
    public  void setrank(int r){
        this.rank=r;
    }
    public int getrank(){
        return rank;
    }
    public void setfinishtime(float t){
        this.finishtime=t;
    }
    public float gettime(){
        return finishtime;
    }
    //strokes
    public abstract void butterflystroke();
    public abstract void backstroke();
    public abstract void freestyle();
    public abstract void breastroke();
    
    /**
     * Simulate Kick
     * @return
     */
    public boolean kick(){
        return true;
    }
    
    /**
     *Simulate Left hand Movement
     */
    public void moveLeftHand(){
        
    }
    
    /**
     *Simulate Right hand Movement
     */
    public void moveRightHand(){
        
    }
    
    /**
     *Simulate Left and Right hand Movement at the Same time
     */
    public void moveBothHands(){
        
    }
    
    /**
     *Simulate Breath
     */
    public void breath(){
        
    }
}
