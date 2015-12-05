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
public class SwimLane extends Thread {
    private TouchPad tpad= new TouchPad();
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
                System.out.println(lable.getX());
                while (lable.getX()<670){
                    //System.out.println(this.getName());
                     if (lable.getX() < current + 650) {
                        dist++;
                        lable.setLocation(lable.getX()+1, lable.getY());
                        //System.out.println(dist);
                        lable.repaint();
                     }
                     if(lable.getX()==650){
                         SwimLane.this.tpad.touch();
                         System.out.println("Completed"+SwimLane.this.tpad.time());
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
