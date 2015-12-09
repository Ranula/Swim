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
public class ScoreBoard {
    long starttime;
    public static JTable table;
    
    
    public static void setnames(ArrayList<Swimmer> swimaray,JTable table){
        try{
            table.getModel().setValueAt(swimaray.get(0).getName(), 0, 1);
            table.getModel().setValueAt(swimaray.get(1).getName(), 1, 1);
            table.getModel().setValueAt(swimaray.get(2).getName(), 2, 1);
            table.getModel().setValueAt(swimaray.get(3).getName(), 3, 1);
            table.getModel().setValueAt(swimaray.get(4).getName(), 4, 1);
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
        table.getModel().setValueAt(finaly, l1.lanenum, 2);
        }else{
            System.out.println("saddet ekkma tynne oya");
        }
    }
    public static void setrank(int rank,SwimLane l1,JTable table){
        table.getModel().setValueAt(rank,l1.lanenum , 3);
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
        //long finish = l1.tpad.finishtime;
        long elapsed = (System.nanoTime()-start);
        float f =(float)elapsed;
        double d= 1000000000;
        float g= (float)d;
        float finaly =(f/g);
        table.getModel().setValueAt(finaly, l1.lanenum, 2);
        }else{
            System.out.println("saddet ekkma tynne oya");
        }
    }
    
}
