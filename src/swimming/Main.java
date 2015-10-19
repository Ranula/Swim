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
public class Main {
     public static void main(String[] args) {
       
        SwimmingCompetition comp1 = new SwimmingCompetition();
        comp1.AddMaleSwimmer("Ran");
        comp1.AddFemaleSwimmer("Saj");
        comp1.AddSpectator("Sam");
        comp1.AddSupstaff("a");
        comp1.Addlanes(5);
        System.out.println(comp1.pool.numoflanes());
        System.out.println(comp1.pool.Lanes.get(1).getLaneNo());
        System.out.println(comp1.NumofPeople());
        System.out.println(comp1.Swimmers.get(1).getName());
        System.out.println(FemaleSwimmer.FSwimmers.get(0).Suitecolor);
        
    }
}
