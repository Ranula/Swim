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
public class MaleSwimmer extends Swimmer  {
    private final String suitecolor ="Blue";

    public MaleSwimmer(String name) {
        super(name);
        incrementSwimmers();
        
    }
    
    //defining swimming methods for maleswimmers
    
    @Override
    public void butterflystroke(){
        while (kick()){
            pull();
            breath();
            push();
            recover();
        }
        
    }
    @Override
    public void backstroke(){
        while(kick()){
            breath();
            leftarmbakward();
            rightarmbakward();
            
        }
    }
    @Override
    public void freestyle(){
        while(kick()){
            breath();
            leftarmforward();
            rightarmforward();
            
        }
        
    }
    @Override
    public void breastroke(){
        while(kick()){
            glide();
            outsweep();
            insweep();
            breath();
        }
    }
}
