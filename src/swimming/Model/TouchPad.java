/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import java.io.Serializable;

/**
 *
 * @author RanulaLiyadipita
 */
public class TouchPad implements Serializable{
    private boolean touched = false; //initialy touched will be false and once swimmer touch the pad it will set true
    protected long finishtime;      
    
    public void touch(){     //once swimmer touched it finsh time will be recorded
        touched=true;
        finishtime=System.nanoTime();
    }
    public boolean hastouched(){
        return touched;
    }
    public  long finishtime(){
        return finishtime;
    }
   
}
