/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

/**
 *
 * @author RanulaLiyadipita
 */
public class MaleSwimmer extends Swimmer{
    public final String suitecolor ="Blue";

    public MaleSwimmer(String name) {
        super(name);
    }
    //defining swimming methods for male swimmers
    
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
