/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import swimming.Model.ScoreBoard;
import swimming.Model.TouchPad;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;
import swimming.UI.SwimGUI;

/**
 *
 * @author RanulaLiyadipita
 */
public class SwimLane extends Thread implements Serializable {
    protected TouchPad tpad= new TouchPad();
    private int lanenum;         
    protected Swimmer swimer;  //swimlane should contain aswimmer
    
    SwimLane(Swimmer s1,int a){
        this.swimer= s1;
        this.lanenum=a;
    }
   
    
    public void RunLable(final JLabel lable,final int val){// this method will move labels on the GUI
       
        new Thread(){
            @Override
            public void run(){
                lable.setVisible(true);
                while (SwimGUI.getLabelX(lable)<651){
                        SwimGUI.setlablenew(lable);
                        ScoreBoard.setcurenttime(Judge.starttime(), SwimLane.this, ScoreBoard.table);
                     synchronized(this){ // to avoid thread interference while updating the score board
                        if(SwimGUI.getLabelX(lable)==650){
                         SwimLane.this.tpad.touch();
                         SwimLane.this.swimer.setfinishtime(ScoreBoard.time(Judge.starttime(), SwimLane.this));
                         ScoreBoard.settime(Judge.starttime(),SwimLane.this, ScoreBoard.table);
                         System.out.println("Completed"+SwimLane.this.tpad.finishtime());
                         }
                     }
                     try{
                         Thread.sleep(val);
                     }catch(InterruptedException ex){
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
  
    
public static void save(ArrayList<SwimLane> a) { // saving the object array list with the result
        try{
            try (FileOutputStream fileOut = new FileOutputStream("Result"+Long.toString(System.nanoTime())+".ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(a);
            }
         System.out.printf("Serialized data is saved in Result############.ser");
      }catch(IOException i)
      {
      }
}  
    
}