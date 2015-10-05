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
public class Spectator extends Person {
    public static int NumofSpectators;

    public Spectator(String name) {
        super(name);
        incrementSpectators();
        People.add(this);
    }
    public static void incrementSpectators(){
        NumofSpectators++;
        NumofPeople++;
    }
}
