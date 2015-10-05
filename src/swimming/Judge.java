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
    public static int NumofJudges;
    public Judge(String name) {
        super(name);
        incrementjudges();
        People.add(this);
    }
    public static void incrementjudges(){
        NumofJudges++;
        NumofPeople++;
    }
}
