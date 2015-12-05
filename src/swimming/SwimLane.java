/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import javax.swing.JLabel;

/**
 *
 * @author RanulaLiyadipita
 */
public class SwimLane  {
    private TouchPad tpad;
    int lanenum;
    int dist=0;
    Swimmer swimer;
    SwimLane(Swimmer s1){
        this.swimer= s1;
    }
    public void RunLable(final JLabel lable,final int val){
        final int current= lable.getX();
        new Thread(){
            @Override
            public void run(){
                while (lable.getX()<500){
                    System.out.println(this.getName());
                     if (lable.getX() < current + 500) {
                         dist+=5;
                        lable.setLocation(lable.getX() + 5, lable.getY());
                        System.out.println(dist);
                        lable.repaint();
                        
                     }
                     if(lable.getX()==295){
                         SwimLane.this.tpad.touch();
                         System.out.println("Completed");
                     }
                     try{
                         Thread.sleep(val);
                     }catch(InterruptedException ex){
                         ex.printStackTrace();
                     }
                }
            }
        }.start();
    }

    public void setLaneNo(int num){
        lanenum=num;
    }
    
    public int getLaneNo(){
        return lanenum;
    }
    
}
