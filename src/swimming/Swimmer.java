/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.io.Serializable;

/**
 *
 * @authorRanulaLiyadipita
 */
public abstract class Swimmer extends Person implements Serializable  {
   public float finishtime;
   public int rank;
    //JLabel SwimLable;
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
    
//swimmingMoves
    
    protected void breath(){
    }
    protected boolean kick(){
        return true;
    }
    
 //butterflystroke moves
    protected void pull(){
    }
    protected void push(){
    }
    protected void recover(){
    }
    
//freestyle & backstroke moves
    
    protected void rightarmforward(){
    }
    protected void leftarmforward(){
    } 
    protected void rightarmbakward(){
    }
    protected void leftarmbakward(){
    }    
    
//breaststroke moves
    protected void glide(){
    }
    protected void outsweep(){
    } 
    protected void insweep(){
    }
}
