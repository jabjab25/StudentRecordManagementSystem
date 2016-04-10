/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grades;

/**
 *
 * @author Jermaine
 */
import java.util.*;
import java.io.Serializable;
public class Ks3grades implements Serializable {
    private HashMap<String,Double> grade = new HashMap<>();
    
    public Ks3grades()
    {
       grade.put("3c", 3.3);
       grade.put("3b", 3.6);
       grade.put("3a", 3.9);
       grade.put("4c", 4.3);
       grade.put("4b", 4.6);
       grade.put("4a", 4.9);
       grade.put("5c", 5.3);
       grade.put("5b", 5.6);
       grade.put("5a", 5.9);
       grade.put("6c", 6.3);
       grade.put("6b", 6.6);
       grade.put("6a", 6.9);
       grade.put("7c", 7.3);
       grade.put("7b", 7.6);
       grade.put("7a", 7.9);
    }
    
    public Boolean isGrade(String g)
    {
        if(grade.containsKey(g))
        {
            return true;
        }
        return false;
    }
    
    public Double getValue(String g)
    {
        Double d = grade.get(g);
        return d;
    }
}
