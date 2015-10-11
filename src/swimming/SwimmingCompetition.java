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
    
    public SwimmingPool pool= new SwimmingPool();
    public ScoreBoard sbord =new ScoreBoard();
    private boolean haspool;
    private boolean hasScorbord;
    private boolean haspavilion;
    
    public SwimmingCompetition(){
        
        haspool=true;
        hasScorbord=true;
        haspavilion=true;
    }
    public static ArrayList<Object> People = new ArrayList<>();
    public static ArrayList<Swimmer> Swimmers = new ArrayList<>();
    
    public void AddMaleSwimmer(String Name){
        MaleSwimmer swimmer= new MaleSwimmer(Name);
        MaleSwimmer.MSwimmers.add(swimmer);
        Swimmers.add(swimmer);
        People.add(swimmer);
    }
    
    public void AddFemaleSwimmer(String Name){
        FemaleSwimmer fswimmer= new FemaleSwimmer(Name);
        FemaleSwimmer.FSwimmers.add(fswimmer);
        Swimmers.add(fswimmer);
        People.add(fswimmer);
    }
    
    public void AddSpectator(String Name){
        Spectator spec= new Spectator(Name);
        Spectator.Spectators.add(spec);
        People.add(spec);
    }
    
    public void AddJudge(String Name){
        Judge jud=new Judge(Name);
        Judge.Judges.add(jud);
        People.add(jud);
    }
    
    public void AddSupstaff(String Name){
        SupStaff ss=new SupStaff(Name);
        SupStaff.SuportStaff.add(ss);
        People.add(ss);
    }
    //this will add given number(i) of lanes to swimminpool
    public void Addlanes(int i){
        int x=0;
        while(x<i){
            pool.addlane(x+1);
            x++;
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
        return (MaleSwimmer.MSwimmers.toArray().length);
    }
    
    //This will return NumofFemaleSwimmers
    public int NumofFemaleSwimmers(){
        return (FemaleSwimmer.FSwimmers.toArray().length);
    }
    
    //This will return NumbofJudges
    public int Numofjudges(){
        return (Judge.Judges.toArray().length);
    }
    
    //This will return NumofSpectators
    public int NumofSpectators(){
        return (Spectator.Spectators.toArray().length);
    }
    
    //This will return NumofSupStaff
    public int NumofSuportStaff(){
        return (SupStaff.SuportStaff.toArray().length);
    }
}
   
