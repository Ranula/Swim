/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.io.Serializable;

/**
 *
 * @author RanulaLiyadipita
 */
public class TouchPad implements Serializable{
    private boolean touched = false;
    long finishtime;
    public void touch(){
        touched=true;
        finishtime=System.nanoTime();
    }
    public boolean hastouched(){
        return touched;
    }
    public long time(){
        return finishtime;
    }
   
}
