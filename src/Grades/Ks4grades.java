/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grades;

import java.util.HashMap;

/**
 *
 * @author Jermaine
 */
public class Ks4grades {
    private HashMap<String,Integer> grades = new HashMap<>();
    
    public Ks4grades()
    {
        grades.put("U", 0);
        grades.put("G", 1);
        grades.put("F", 2);
        grades.put("E", 3);
        grades.put("D", 4);
        grades.put("C", 5);
        grades.put("B", 6);
        grades.put("A", 7);
        grades.put("A*",8);   
    }
    public Boolean isGrade(String g)
    {
        if(grades.containsKey(g))
        {
            return true;
        }
        return false;
    }
    
    public Integer getValue(String g)
    {
        Integer d = grades.get(g);
        return d;
    }
}
