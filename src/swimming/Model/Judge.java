/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import java.util.ArrayList;

/**
 *
 * @author RanulaLiyadipita
 */
public class Judge extends Person{
  private static boolean whistle;
  private static long starttime;
  private static ArrayList<SwimLane> finall;
  
    public Judge(String name) {
        super(name);
    }
   
    public void blowwhistle(){  //starting signal of the competition and start time will be recorded
       Judge.whistle=setwhistle();
       Judge.starttime= System.nanoTime();
    }
    private boolean setwhistle(){
        return true;
    }
    public static long starttime(){
        return starttime;
    }
    public static void getfinalresult(ArrayList<SwimLane> b){
        Judge.finall=b;
        System.out.println("Judge recieved final result");
    }
}
