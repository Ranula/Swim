/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import swimming.Model.Person;
import java.io.Serializable;
import java.util.ArrayList;
import swimming.control.SwimmingCompetition;

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
    
  public static void save(ArrayList<Swimmer> a) { // saving the object array list with the result
      //String time =Long.toString(System.nanoTime());
      SwimmingCompetition.compnum++;
        try{
            try (FileOutputStream fileOut = new FileOutputStream("Result"+Integer.toString(SwimmingCompetition.compnum)+".ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(a);
            }
         System.out.printf("Serialized data is saved in Result############.ser");
      }catch(IOException i)
      {
      } }
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
