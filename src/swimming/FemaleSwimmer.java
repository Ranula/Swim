/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

/**
 *
 * @authorRanulLiyadipita
 */
public class FemaleSwimmer extends Swimmer{
    public final String Suitecolor="Red";
    public FemaleSwimmer(String name) {
        super(name);
        //incrementSwimmers();
    }
    
    //defining swimming methods for femaleswimmers
    @Override
    public void butterflystroke(){
        while( kick()){
            breath();
            pull();
            push();
            breath();
            recover();
        }
    }
    @Override
    public void backstroke(){
        while(kick()){
            leftarmbakward();
            breath();
            rightarmbakward();
            breath();
        }
        
    }
    @Override
    public void freestyle(){
        while(kick()){
            leftarmforward();
            breath();
            rightarmforward();
            breath();
        }
        
    }
    @Override
    public void breastroke(){
        while(kick()){
            breath();
            glide();
            outsweep();
            insweep();
        }
        
    }
}
