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
public class SwimLane  {
    TouchPad touch1;
    int lanenum;
    Swimmer swimer;
    SwimLane(Swimmer s1){
        this.swimer= s1;
    }
    

    public void setLaneNo(int num){
        lanenum=num;
    }
    
    public int getLaneNo(){
        return lanenum;
    }
    
}
