/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author RanulaLiyadipita
 */
public class SwimLane extends Thread {
    public TouchPad tpad= new TouchPad();
     int lanenum;
    int dist=0;
    int rank=0;
    Swimmer swimer;
    //static JTable table ;
    //static SwimGUI cat;
    
    SwimLane(Swimmer s1,int a){
        this.swimer= s1;
        this.lanenum=a;
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
                         rank++;
                         System.out.println("Completed"+SwimLane.this.tpad.time());
                         ScoreBoard.settime(Judge.starttime(),SwimLane.this, ScoreBoard.table);
                         ScoreBoard.setrank(rank, SwimLane.this, ScoreBoard.table);
                         //cat.setTime(ScoreBoard.settime(Judge.starttime(),SwimLane.this),SwimLane.this.lanenum);
                         
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
