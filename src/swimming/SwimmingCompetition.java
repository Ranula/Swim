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
    private SwimmingPool pool;
    private ScoreBoard sbord;
    private boolean haspool;
    private boolean hasScorbord;
    private boolean haspavilion;
    
    public SwimmingCompetition(){
        haspool=true;
        hasScorbord=true;
        haspavilion=true;
    }
    
    //Arraylist for all human objects
    public static ArrayList<Object> People = new ArrayList<>();
    //Arraylists for different objects
    public static ArrayList<Swimmer> Swimmers = new ArrayList<>();
    public static ArrayList<MaleSwimmer> MSwimmers = new ArrayList<>();
    public static ArrayList<FemaleSwimmer> FSwimmers = new ArrayList<>();
    public static ArrayList<Judge> Judges = new ArrayList<>();
    public static ArrayList<SupStaff> SuportStaff = new ArrayList<>();
    public static ArrayList<Spectator> Spectators = new ArrayList<>();
    
    public void AddMaleSwimmer(String Name){
        MaleSwimmer swimmer= new MaleSwimmer(Name);
        MSwimmers.add(swimmer);
        Swimmers.add(swimmer);
        People.add(swimmer);
    }
    
    public void AddFemaleSwimmer(String Name){
        FemaleSwimmer fswimmer= new FemaleSwimmer(Name);
        FSwimmers.add(fswimmer);
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
    //this will add given number(i) of lanes to swimminpool
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
    
    //This will return NumofMaleSwimmers
    public int NumofMaleSwimmers(){
        return (MSwimmers.toArray().length);
    }
    
    //This will return NumofFemaleSwimmers
    public int NumofFemaleSwimmers(){
        return (FSwimmers.toArray().length);
    }
    
    //This will return NumbofJudges
    public int Numofjudges(){
        return (Judges.toArray().length);
    }
    
    //This will return NumofSpectators
    public int NumofSpectators(){
        return (Spectators.toArray().length);
    }
    
    //This will return NumofSupStaff
    public int NumofSuportStaff(){
        return (SuportStaff.toArray().length);
    }
    
    public static void main(String[] args) {
       
        SwimmingCompetition comp1 = new SwimmingCompetition();
        comp1.AddMaleSwimmer("Ran");
        comp1.AddFemaleSwimmer("Saj");
        comp1.AddSpectator("Sam");
        comp1.AddSupstaff("a");
        comp1.Addlanes(3);
        System.out.println(comp1.pool.numoflanes());
        System.out.println(SwimmingPool.Lanes.get(1).getLaneNo());
        System.out.println();
        System.out.println(comp1.NumofPeople());
        System.out.println(Swimmers.get(1).getName());
        System.out.println(FSwimmers.get(0).Suitecolor);
    }
}