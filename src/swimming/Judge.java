/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

/**
 *
 * @author User
 */
public class Judge extends Person{
  public static boolean whistle;
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
