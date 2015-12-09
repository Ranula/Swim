/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author RanulaLiyadipita
 */
public class SwimLane extends Thread implements Serializable {
    public TouchPad tpad= new TouchPad();
    int lanenum;
    int dist=0;
    static volatile int rank=0;
    Swimmer swimer;
    
    SwimLane(Swimmer s1,int a){
        this.swimer= s1;
        this.lanenum=a;
    }
   
    
    public void RunLable(final JLabel lable,final int val){
        final int current= lable.getX();
        new Thread(){
            @Override
            public void run(){
                lable.setVisible(true);
                while (lable.getX()<651){
                     if (lable.getX() < current + 650) {
                        dist++;
                        lable.setLocation(lable.getX()+1, lable.getY());
                        lable.repaint();
                        ScoreBoard.setcurenttime(Judge.starttime(), SwimLane.this, ScoreBoard.table);
                     }
                     if(lable.getX()==650){
                         SwimLane.this.tpad.touch();
                         rankup();
                         SwimLane.this.swimer.finishtime=ScoreBoard.time(Judge.starttime(), SwimLane.this);
                         SwimLane.this.swimer.rank=rank;
                         System.out.println("Completed"+SwimLane.this.tpad.time());
                         ScoreBoard.settime(Judge.starttime(),SwimLane.this, ScoreBoard.table);
                         ScoreBoard.setrank(rank, SwimLane.this, ScoreBoard.table);
                         //this.interrupt();
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
    public  void rankup(){
        synchronized(this){
        rank++;}
    }
    
public static void save(ArrayList<SwimLane> a) {
        try{
        FileOutputStream fileOut =
         new FileOutputStream("Result"+Long.toString(System.nanoTime())+".ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(a);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
}  
    
}
