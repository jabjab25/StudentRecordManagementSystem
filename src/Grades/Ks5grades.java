/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grades;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Jermaine
 */
public class Ks5grades implements Serializable{

    private HashMap<String, Integer> grades = new HashMap<>();

    public Ks5grades() {
        grades.put("U", 0);
        grades.put("E", 1);
        grades.put("D", 2);
        grades.put("C", 3);
        grades.put("B", 4);
        grades.put("A", 5);
    }

    public Boolean isGrade(String g) {
        if (grades.containsKey(g)) {
            return true;
        }
        return false;
    }

    public Integer getValue(String g) {
        Integer d = grades.get(g);
        return d;
    }
}
