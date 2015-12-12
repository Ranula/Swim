/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import swimming.UI.SwimGUI;

/**
 *
 * @authorRanulaLiyadipita
 */
public class ScoreBoard   {
    long starttime;
    public static JTable table;
    
    
    public static void setnames(ArrayList<Swimmer> swimaray,JTable table){
        try{
            SwimGUI.setname(swimaray.get(0).getName(),0,table);
            SwimGUI.setname(swimaray.get(1).getName(),1,table);
            SwimGUI.setname(swimaray.get(2).getName(),2,table);
            SwimGUI.setname(swimaray.get(3).getName(),3,table);
            SwimGUI.setname(swimaray.get(4).getName(),4,table);
        }catch(IndexOutOfBoundsException e){// if less than 5 swimmers are given exception will be caught
            
        }
    }
    public static void settime(long start,SwimLane l1,JTable table){// displaying final time of swimers
        if(table != null){
        long finish = l1.tpad.finishtime;
        long elapsed = (finish-start);
        float f =(float)elapsed;
        double d= 1000000000;
        float g= (float)d;
        float finaly =(f/g);
        SwimGUI.setTime(finaly,l1.getLaneNo(), table);
        
        }else{
            System.out.println("");
        }
    }
    public static void setrank(int rank,SwimLane l1,JTable table){//displaying ranks on the table
        SwimGUI.setranks(rank, l1.getLaneNo(), table);
    }
    public static float time(long start,SwimLane l1){ // converting nanoseconds to seconds
        long finish = l1.tpad.finishtime;
        long elapsed = (finish-start);
        float f =(float)elapsed;
        double d= 1000000000;
        float g= (float)d;
        float finaly =(f/g);
        return finaly;
    }
    
  
    
    public static void setcurenttime(long start,SwimLane l1,JTable table){ // In time column current running second of the thread will be displayed
        if(table != null){
        long elapsed = (System.nanoTime()-start);
        float f =(float)elapsed;
        double d= 1000000000;
        float g= (float)d;
        float finaly =(f/g);
        SwimGUI.setTime(finaly,l1.getLaneNo(), table);
        notifyObservers(Spectator.Spectators,finaly,l1);
        }else{
            System.out.println("TimeError");
        }
    }
   
    public static void notifyObservers(ArrayList<Spectator> a,float e,SwimLane l){// all the spectators will know the current time of each swimmer
        for (Spectator s:a){
            s.update(e,l);
        }
    }
    
    public static void letssortnprint(ArrayList<SwimLane> a){ //method to print the places
        int r=1;
        float[] f = new float[a.size()];
        for(int y=0;y<a.size();y++){
        f[y]=a.get(y).swimer.gettime();
               }
        Arrays.sort(f);                                         //sorting the finishtimes
        for(float e: f){
            for(SwimLane q : a){                                //comparing the first sorted value with its according lane num
                if(q.swimer.gettime()==e){
                    q.swimer.rank=r;
                    setrank(r, q,ScoreBoard.table);
                    r++;
                    break;
                }
            }
        }
    }
    
}
