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
public class SwimLane {
    private TouchPad t1;
    private int lanenum;
    
    public void setLaneNo(int num){
        lanenum=num;
    }
    
    public int getLaneNo(){
        return lanenum;
    }
    
}
