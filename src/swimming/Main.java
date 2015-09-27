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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwimmingCompetition competition1 = new SwimmingCompetition();
        FemaleSwimmer s1 =new FemaleSwimmer("kate");
        MaleSwimmer s2 = new MaleSwimmer("William");
        Judge j1= new Judge("Sameera");
        Spectator sp1 = new Spectator("Kaushalya");
        SupStaff staff1= new SupStaff("Sajini");
        System.out.println(SupStaff.NumofSupStaff);
        
    }
    
}
