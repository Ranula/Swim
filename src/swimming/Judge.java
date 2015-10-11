/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/**
 *
 * @author RanulaLiyadipita
 */
public class Judge extends Person{
  public static boolean whistle;
  public static ArrayList<Judge> Judges = new ArrayList<>();
    public Judge(String name) {
        super(name);
    }
   
    public void blowwhistle(){
       whistle=setwhistle();
    }
    private boolean setwhistle(){
        return true;
    }
}
