/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/**
 *
 * @author RanulaLiyadipita
 */
public class SwimmingPool {
    
    private int numoflanes=0;
    //arraylist to keep track of lanes
    public static ArrayList<SwimLane> Lanes = new ArrayList<>();
    
    public void addlane(int y){
        SwimLane l = new SwimLane();
        l.setLaneNo(y);
        Lanes.add(l);
    }
    public int numoflanes(){
        return (Lanes.toArray().length);
        
    }
}
