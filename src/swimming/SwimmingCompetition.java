/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/*
 * @author RanulaLiyadipita
 * 140345A
 */
public class SwimmingCompetition {
    
    public SwimmingPool pool;
    public ScoreBoard sbord;
    public static Judge headjudge;
    public static ArrayList<Object> People = new ArrayList<>();
    public static ArrayList<Swimmer> Swimmers = new ArrayList<>();
    public static ArrayList<Judge> Judges = new ArrayList<>();
    public static int numofSpecs;
    public static String CompType;
    public static String stroke;
    public SwimmingCompetition(){
        
    }
    public static void Restart(){
        SwimmingCompetition.Swimmers.clear();
        SwimmingCompetition.Judges.clear();
        SwimmingCompetition.People.clear();
        MaleSwimmer.MSwimmers.clear();
        FemaleSwimmer.FSwimmers.clear();
        SupStaff.SuportStaff.clear();
        Spectator.Spectators.clear();
        SwimLane.rank=0;
    }
    
    public static void AddMaleSwimmer(String Name){
        MaleSwimmer swimmer= new MaleSwimmer(Name);
        SwimLane l1= new SwimLane(swimmer,SwimmingPool.Lanes.size());
        SwimmingPool.Lanes.add(l1);
        MaleSwimmer.MSwimmers.add(swimmer);
        Swimmers.add(swimmer);
        People.add(swimmer);
    }
    
    public static void AddFemaleSwimmer(String Name){
        FemaleSwimmer fswimmer= new FemaleSwimmer(Name);
        SwimLane l1= new SwimLane(fswimmer,SwimmingPool.Lanes.size());
        SwimmingPool.Lanes.add(l1);
        FemaleSwimmer.FSwimmers.add(fswimmer);
        Swimmers.add(fswimmer);
        People.add(fswimmer);
    }
    
    public static void AddSpectator(String Name){
        Spectator spec= new Spectator(Name);
        Spectator.Spectators.add(spec);
        People.add(spec);
    }
    
    public static void AddJudge(String Name){
        Judge jud=new Judge(Name);
        Judges.add(jud);
        People.add(jud);
    }
    
    public static void AddSupstaff(String Name){
        SupStaff ss=new SupStaff(Name);
        SupStaff.SuportStaff.add(ss);
        People.add(ss);
    }
    
    //This will return NumofPeople
    public static int NumofPeople(){
        return (People.size());
    }
    
    //This will return NumofSwimmers
    public static int NumofSwimmers(){
        return (Swimmers.size());
    }
    
    //This will return NumofMaleSwimmers
    public static int NumofMaleSwimmers(){
        return (MaleSwimmer.MSwimmers.size());
    }
    
    //This will return NumofFemaleSwimmers
    public static int NumofFemaleSwimmers(){
        return (FemaleSwimmer.FSwimmers.size());
    }
    
    //This will return NumbofJudges
    public static int Numofjudges(){
        return (Judges.size());
    }
    
    //This will return NumofSpectators
    public static int NumofSpectators(){
        return (Spectator.Spectators.size());
    }
    
    //This will return NumofSupStaff
    public static int NumofSuportStaff(){
        return (SupStaff.SuportStaff.size());
    }
}
   
