/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;/**
 *
 * @author User
 */
public abstract class SwimmingCompetition {
    
    
    //public static ArrayList<Object> objects = new ArrayList<Object>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        //SwimmingCompetition competition1 = new SwimmingCompetition();
        
        FemaleSwimmer s1 =new FemaleSwimmer("kate");
        //objects.add(s1);
        MaleSwimmer s2 = new MaleSwimmer("William");
        //objects.add(s2);
        Judge j1= new Judge("Sameera");
        Spectator sp1 = new Spectator("Kaushalya");
        SupStaff staff1= new SupStaff("Sajini");
        //objects.add(staff1);
        System.out.println(Swimmer.NumofPeople);
        System.out.println(Person.People.toString());
        
    } 
    
}
