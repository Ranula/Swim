/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SwimmingPool {
    public int numoflanes=0;
    public boolean HasPool=false;
    public static ArrayList<SwimLane> Lanes = new ArrayList<>();
    
    public void create(){
        HasPool=true;
    }
    public void addlane(int y){
        SwimLane l = new SwimLane();
        Lanes.add(l);
        l.setLaneNo(y);
    }
}
