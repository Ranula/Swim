/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import swimming.Model.SwimLane;
import swimming.Model.Person;
import java.util.ArrayList;

/**
 *
 * @authorRanulaLiyadipita
 */
public class Spectator extends Person{
    protected float curenttime;
    public static ArrayList<Spectator> Spectators = new ArrayList<>();
    public Spectator(String name) {
        super(name);
    }
    public void update(float a,SwimLane l){
        this.curenttime=a;
        System.out.println(this.getName()+
                " i know the time");
    }

   
   
}
