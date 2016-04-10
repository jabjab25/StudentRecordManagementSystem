/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageGrade;

import Grades.Ks4grades;
import ORM.Markedworks;
import ORM.Students;
import java.util.ArrayList;
/**
 *
 * @author Jermaine
 */
public class Ks4AverageGrade {
    private Ks4grades kg4 = new Ks4grades();
    private Markedworks mw;
    private Students s;
    
    public Ks4AverageGrade()
    {
    
    }
    
    public Ks4AverageGrade(Markedworks m, Students s1){
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
                double d = kg4.getValue(check);
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
                double d = kg4.getValue(check);
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
    
    private int getTargetGradeValue()
    {
       String tg = s.getTargetGrade();
       int d = kg4.getValue(tg);
       return d;
    }
    
    private String getGrade(Double d)
    {
        String s = "";
        if(d>=0&& d<1 )
        {
            s="U";
        }
        else if(d>=1&&d<2)
        {
            s="G";
        }
         else if(d>=2&&d<3)
        {
            s="F";
        }
         else if(d>=3&&d<4)
        {
            s="E";
        }
         else if(d>=4&&d<5)
        {
            s="D";
        }
         else if(d>=5&&d<6)
        {
            s="C";
        }
         else if(d>=6&&d<7)
        {
            s="B";
        }
         else if(d>=7&&d<8)
        {
            s="A";
        }
         else if(d>=8&&d<9)
        {
            s="A*";
        }
        return s;
    }
    
}
