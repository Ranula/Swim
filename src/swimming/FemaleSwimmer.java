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
public class FemaleSwimmer extends Swimmer {
    private String Suitecolor="Red";
    public FemaleSwimmer(String name) {
        super(name);
        incrementSwimmers();
    }
    
}
