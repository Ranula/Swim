/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @authorRanulaLiyadipita
 */
public class ScoreBoard  {
    long starttime;
    public static JTable table;
    
    
    public static void setnames(ArrayList<Swimmer> swimaray,JTable table){
        try{
            SwimGUI.setname(swimaray.get(0).getName(),0,table);
            SwimGUI.setname(swimaray.get(1).getName(),1,table);
            SwimGUI.setname(swimaray.get(2).getName(),2,table);
            SwimGUI.setname(swimaray.get(3).getName(),3,table);
            SwimGUI.setname(swimaray.get(4).getName(),4,table);
        }catch(IndexOutOfBoundsException e){
            
        }
    }
    public static void settime(long start,SwimLane l1,JTable table){
        if(table != null){
        long finish = l1.tpad.finishtime;
        long elapsed = (finish-start);
        float f =(float)elapsed;
        double d= 1000000000;
        float g= (float)d;
        float finaly =(f/g);
        SwimGUI.setTime(finaly,l1.lanenum, table);
        
        }else{
            System.out.println("saddet ekkma tynne oya");
        }
    }
    public static void setrank(int rank,SwimLane l1,JTable table){
        SwimGUI.setranks(rank, l1.lanenum, table);
    }
    public static float time(long start,SwimLane l1){
        long finish = l1.tpad.finishtime;
        long elapsed = (finish-start);
        float f =(float)elapsed;
        double d= 1000000000;
        float g= (float)d;
        float finaly =(f/g);
        return finaly;
    }
    
  
    
    public static void setcurenttime(long start,SwimLane l1,JTable table){
        if(table != null){
        long elapsed = (System.nanoTime()-start);
        float f =(float)elapsed;
        double d= 1000000000;
        float g= (float)d;
        float finaly =(f/g);
        SwimGUI.setTime(finaly,l1.lanenum, table);
        notifyspecs(Spectator.Spectators,finaly,l1);
        }else{
            System.out.println("TimeError");
        }
    }
   
    public static void notifyspecs(ArrayList<Spectator> a,float e,SwimLane l){
        for (Spectator s:a){
            s.notified(e,l);
        }
    }
    
}
