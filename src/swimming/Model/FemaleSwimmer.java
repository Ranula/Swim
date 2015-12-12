/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import java.util.ArrayList;

/**
 *
 * @authorRanulLiyadipita
 */
public class FemaleSwimmer extends Swimmer{
    public final String Suitecolor="Red";
    public static ArrayList<FemaleSwimmer> FSwimmers = new ArrayList<>();
    public FemaleSwimmer(String name) {
        super(name);
    }
  
    
   @Override
    public void freestyle() {
        while(kick()){
            moveLeftHand();
            breath();
            moveRightHand();
            breath();
        }
    }

    @Override
    public void butterflystroke() {
        
        while(true){
            kick();
            moveBothHands();
            breath();
            kick();
        }
    }

    @Override
    public void backstroke() {
        while(kick()){
            moveLeftHand();
            moveRightHand();
            breath();
        }
    }

    @Override
    public void breastroke() {
        while(true){
            moveBothHands();
            kick();
            breath();
        }
    }
    
}
