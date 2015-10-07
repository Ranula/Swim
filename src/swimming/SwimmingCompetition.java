/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SwimmingCompetition {
    SwimmingPool pool;
    ScoreBoard sb;
    public SwimmingCompetition(){
        pool= new SwimmingPool();
        pool.create();
        sb= new ScoreBoard();
        sb.create();
    }
    //Arraylist for all human objects
    public static ArrayList<Object> People = new ArrayList<>();
    //Arraylists for different objects
    public static ArrayList<Swimmer> Swimmers = new ArrayList<>();
    public static ArrayList<Judge> Judges = new ArrayList<>();
    public static ArrayList<SupStaff> SuportStaff = new ArrayList<>();
    public static ArrayList<Spectator> Spectators = new ArrayList<>();
    
    public void AddMaleSwimmer(String Name){
        MaleSwimmer swimmer= new MaleSwimmer(Name);
        Swimmers.add(swimmer);
        People.add(swimmer);
    }
    
    public void AddFemaleSwimmer(String Name){
        FemaleSwimmer fswimmer= new FemaleSwimmer(Name);
        Swimmers.add(fswimmer);
        People.add(fswimmer);
    }
    
    public void AddSpectator(String Name){
        Spectator spec= new Spectator(Name);
        Spectators.add(spec);
        People.add(spec);
    }
    
    public void AddJudge(String Name){
        Judge jud=new Judge(Name);
        Judges.add(jud);
        People.add(jud);
    }
    
    public void AddSupstaff(String Name){
        SupStaff ss=new SupStaff(Name);
        SuportStaff.add(ss);
        People.add(ss);
    }
    //this will add given number of lanes to swimminpool
    public void Addlanes(int i){
        
        for(int x=0;x<i;x++){
            pool.addlane(x+1);
        }
    }
       
    //This will return NumofPeople
    public int NumofPeople(){
        return (People.toArray().length);
    }
    //This will return NumofSwimmers
    public int NumofSwimmers(){
        return (Swimmers.toArray().length);
    }
    //This will return NumofJudges
    public int Numofjudges(){
        return (Judges.toArray().length);
    }
    //This will return NumofSpectators
    public int NumofSpectators(){
        return (Spectators.toArray().length);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwimmingCompetition comp1 = new SwimmingCompetition();
        comp1.AddMaleSwimmer("Ranula");
        comp1.AddFemaleSwimmer("Sajini");
        comp1.AddSpectator("Sameera");
        comp1.Addlanes(5);
        System.out.println(SwimmingPool.Lanes.get(1).getLaneNo());
        //System.out.println(comp1.sp.HasPool);
        //System.out.println(comp1.NumofSwimmers());
        //System.out.println(Swimmers.get(1).getName());
    }
}