/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import swimming.Model.SwimLane;
import java.util.ArrayList;

/**
 *
 * @author RanulaLiyadipita
 */
public class SwimmingPool {
    private int numoflanes;
    public static ArrayList<SwimLane> Lanes = new ArrayList<>(); // to store Swimlanes in the swimmingpool
    public SwimmingPool(){
    }
    public int numoflanes(){
        return (Lanes.size());
        
    }
}
