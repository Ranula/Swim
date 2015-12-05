/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import javax.swing.JLabel;

/**
 *
 * @authorRanulaLiyadipita
 */
public abstract class Swimmer extends Person implements Runnable  {
   // public static int NumofSwimmers;
    JLabel SwimLable;
    public  Swimmer(String name) {
        super(name);
    }
    
    public void RunLable(final JLabel lable,final int val){
        final int current= lable.getX();
        new Thread(){
            @Override
            public void run(){
                while (lable.getX()<300){
                     if (lable.getX() < current + 300) {
                        lable.setLocation(lable.getX() + 1, lable.getY());

                        lable.repaint();
                     }
                     try{
                         Thread.sleep(val);
                     }catch(InterruptedException ex){
                         ex.printStackTrace();
                     }
                }
            }
        }.start();
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
