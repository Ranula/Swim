/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming.Model;

import swimming.Model.Person;
import java.util.ArrayList;

/**
 *
 * @authorRanulaLiyadipita
 */
public class SupStaff extends Person {
    private static ArrayList<SwimLane> finall;
    public static ArrayList<SupStaff> SuportStaff = new ArrayList<>();
    public SupStaff(String name) {
        super(name);
    }public static void getfinalresult(ArrayList<SwimLane> b){
       SupStaff.finall=b;
       System.out.println("Support staff recieved final result");
    }
   
}
