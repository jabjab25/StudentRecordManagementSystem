/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageGrade;

import Grades.Ks3grades;
import ORM.Markedworks;
import ORM.Students;
import java.util.ArrayList;

/**
 *
 * @author Jermaine
 */


public class Ks3AverageGrade {
    private Ks3grades kg3 = new Ks3grades();
    private Markedworks mw;
    private Students s;
    
    public Ks3AverageGrade()
    {
    
    }
    
    public Ks3AverageGrade(Markedworks m, Students s1){
        this.mw=m;
        this.s = s1;
    }
    
    public void setStudnent(Students s1)
    {
        this.s = s1;
    }
    
    public void setMarkedWork (Markedworks m)
    {
        this.mw = m;
    }
    
    public void calcAverageGrade()
    {
        ArrayList<String> gw = getGradedWork();
        //int index = 0;
        int no = 0;
        double count = 0;
        double value;
        
        for(int index = 0; index<gw.size();index++)
        {
            String check = gw.get(index);
            if(!check.equals(""))
            {
                double d = kg3.getValue(check);
                count = count + d;
                no++;
            }
        }
        value = count/no;
        //System.out.println(value);
        String grade = getGrade(value);
        System.out.println(grade);
    }
    
    public double calcValueAdded()
    {
        ArrayList<String> gw = getGradedWork();
        //int index = 0;
        int no = 0;
        double count = 0;
        double value;
        
        for(int index = 0; index<gw.size();index++)
        {
            String check = gw.get(index);
            if(!check.equals(""))
            {
                double d = kg3.getValue(check);
                count = count + d;
                no++;
            }
        }
        value = count/no;
        //System.out.println(value);
        double va = value - getTargetGradeValue();
        //System.out.println(va);
        return va;
    }
    private ArrayList getGradedWork()
    {
        ArrayList<String> gw = new ArrayList<String>();
        
        String g1 = mw.getTask1();
        String g2 = mw.getTask2();
        String g3 = mw.getTask3();
        String g4 = mw.getTask4();
        String g5 = mw.getTask5();
        String g6 = mw.getTask6();
        String g7 = mw.getTask7();
        String g8 = mw.getTask8();
        String g9 = mw.getTask9();
        String g10 = mw.getTask10();
        
        gw.add(g1);
        gw.add(g2);
        gw.add(g3);
        gw.add(g4);
        gw.add(g5);
        gw.add(g6);
        gw.add(g7);
        gw.add(g8);
        gw.add(g9);
        gw.add(g10);
        
        return gw;
    }
    
    private double getTargetGradeValue()
    {
       String tg = s.getTargetGrade();
       double d = kg3.getValue(tg);
       return d;
    }
    
    private String getGrade(Double d)
    {
        String s = "";
        if(d>=3.0&& d<3.6 )
        {
            s="3c";
        }
        else if(d>=3.6&&d<3.9)
        {
            s="3b";
        }
         else if(d>=3.9&&d<4.3)
        {
            s="3a";
        }
         else if(d>=4.3&&d<4.6)
        {
            s="4c";
        }
         else if(d>=4.6&&d<4.9)
        {
            s="4b";
        }
         else if(d>=4.9&&d<5.3)
        {
            s="4a";
        }
         else if(d>=5.3&&d<5.6)
        {
            s="5a";
        }
         else if(d>=5.6&&d<5.9)
        {
            s="5b";
        }
         else if(d>=5.9&&d<6.3)
        {
            s="5a";
        }
         else if(d>=6.3&&d<6.6)
        {
            s="6c";
        }
         else if(d>=6.6&&d<6.9)
        {
            s="6b";
        }
         else if(d>=6.9&&d<7.3)
        {
            s="6a";
        }
         else if(d>=7.3&&d<7.6)
        {
            s="7c";
        }
         else if(d>=7.6&&d<7.9)
        {
            s="7b";
        }
         else if(d>=7.9&&d<8.3)
        {
            s="7a";
        }
        return s;
    }
}
