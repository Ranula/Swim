/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import java.util.ArrayList;

/**
 *
 * @author RanulaLiyadipita
 */
public  class MaleSwimmer extends Swimmer{
    public final String suitecolor ="Blue";
    public static ArrayList<MaleSwimmer> MSwimmers = new ArrayList<>();
    

    public MaleSwimmer(String name) {
        super(name);
    }
  
    //defining swimming methods for male swimmers
    

    /**
     *Simulate FreeStyle
     */
    @Override
    public void freestyle() {
        while(kick()){
            moveRightHand();
            breath();
            moveLeftHand();
            breath();
        }
    }

    /**
     *Simulate Butterfly Stroke
     */
    @Override
    public void butterflystroke() {
        
        while(true){
            kick();
            moveBothHands();
            kick();
            breath();
        }
    }

    /**
     *Simulate Back Stroke
     */
    @Override
    public void backstroke() {
        while(kick()){
            moveRightHand();
            moveLeftHand();
            breath();
        }
    }

    /**
     *Simulate Breast Stroke
     */
    @Override
    public void breastroke() {
        while(true){
            kick();
            moveBothHands();
            breath();
        }
    }
    
 

}
