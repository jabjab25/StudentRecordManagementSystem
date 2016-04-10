/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import Grades.*;

/**
 *
 * @author jermaine
 */
@Entity
@Table(name = "MARKEDWORKS", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Markedworks.findAll", query = "SELECT m FROM Markedworks m"),
    @NamedQuery(name = "Markedworks.findByMarkedWorkId", query = "SELECT m FROM Markedworks m WHERE m.markedWorkId = :markedWorkId"),
    @NamedQuery(name = "Markedworks.findByTask1", query = "SELECT m FROM Markedworks m WHERE m.task1 = :task1"),
    @NamedQuery(name = "Markedworks.findByTask2", query = "SELECT m FROM Markedworks m WHERE m.task2 = :task2"),
    @NamedQuery(name = "Markedworks.findByTask3", query = "SELECT m FROM Markedworks m WHERE m.task3 = :task3"),
    @NamedQuery(name = "Markedworks.findByTask4", query = "SELECT m FROM Markedworks m WHERE m.task4 = :task4"),
    @NamedQuery(name = "Markedworks.findByTask5", query = "SELECT m FROM Markedworks m WHERE m.task5 = :task5"),
    @NamedQuery(name = "Markedworks.findByTask6", query = "SELECT m FROM Markedworks m WHERE m.task6 = :task6"),
    @NamedQuery(name = "Markedworks.findByTask7", query = "SELECT m FROM Markedworks m WHERE m.task7 = :task7"),
    @NamedQuery(name = "Markedworks.findByTask8", query = "SELECT m FROM Markedworks m WHERE m.task8 = :task8"),
    @NamedQuery(name = "Markedworks.findByTask9", query = "SELECT m FROM Markedworks m WHERE m.task9 = :task9"),
    @NamedQuery(name = "Markedworks.findByTask10", query = "SELECT m FROM Markedworks m WHERE m.task10 = :task10")})
public class Markedworks implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Integer currentId = 1;
    @Id
    @Basic(optional = false)
    @Column(name = "MARKED_WORK_ID", nullable = false, length = 8)
    private String markedWorkId;
    @Column(name = "TASK_1", length = 2)
    private String task1;
    @Column(name = "TASK_2", length = 2)
    private String task2;
    @Column(name = "TASK_3", length = 2)
    private String task3;
    @Column(name = "TASK_4", length = 2)
    private String task4;
    @Column(name = "TASK_5", length = 2)
    private String task5;
    @Column(name = "TASK_6", length = 2)
    private String task6;
    @Column(name = "TASK_7", length = 2)
    private String task7;
    @Column(name = "TASK_8", length = 2)
    private String task8;
    @Column(name = "TASK_9", length = 2)
    private String task9;
    @Column(name = "TASK_10", length = 2)
    private String task10;
    @OneToMany(mappedBy = "markedWorkId", fetch = FetchType.LAZY)
    private List<Students> studentsList;
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "TEACHER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Teachers teacherId;
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "STUDENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Students studentId;
    @JoinColumn(name = "CLASS_ID", referencedColumnName = "CLASS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classId;
    @OneToMany(mappedBy = "markedWorkId", fetch = FetchType.LAZY)
    private List<Teachers> teachersList;
    @OneToMany(mappedBy = "markedWorkId", fetch = FetchType.LAZY)
    private List<Classes> classesList;
    
    private Ks3grades kg3 = new Ks3grades();
    private Ks4grades kg4 = new Ks4grades();
    private Ks5grades kg5 = new Ks5grades();

    public Markedworks() {
        //currentId++;
        //this.markedWorkId = currentId.toString();
    }

    //public Markedworks(String markedWorkId) {
        //this.markedWorkId = markedWorkId;
        //this.markedWorkId = currentId.toString();
        //currentId++;
    //}

    public String getMarkedWorkId() {
        return markedWorkId;
    }

    public void setMarkedWorkId() {
        this.markedWorkId = currentId.toString();
        currentId++;
    }

    public String getTask1() {
        return task1;
    }

    public void setTask1(String task1) {
        this.task1 = task1;
    }

    public String getTask2() {
        return task2;
    }

    public void setTask2(String task2) {
        this.task2 = task2;
    }

    public String getTask3() {
        return task3;
    }

    public void setTask3(String task3) {
        this.task3 = task3;
    }

    public String getTask4() {
        return task4;
    }

    public void setTask4(String task4) {
        this.task4 = task4;
    }

    public String getTask5() {
        return task5;
    }

    public void setTask5(String task5) {
        this.task5 = task5;
    }

    public String getTask6() {
        return task6;
    }

    public void setTask6(String task6) {
        this.task6 = task6;
    }

    public String getTask7() {
        return task7;
    }

    public void setTask7(String task7) {
        this.task7 = task7;
    }

    public String getTask8() {
        return task8;
    }

    public void setTask8(String task8) {
        this.task8 = task8;
    }

    public String getTask9() {
        return task9;
    }

    public void setTask9(String task9) {
        this.task9 = task9;
    }

    public String getTask10() {
        return task10;
    }

    public void setTask10(String task10) {
        this.task10 = task10;
    }

    @XmlTransient
    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public Teachers getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teachers teacherId) {
        this.teacherId = teacherId;
    }

    public Students getStudentId() {
        return studentId;
    }

    public void setStudentId(Students studentId) {
        this.studentId = studentId;
    }

    public Classes getClassId() {
        return classId;
    }

    public void setClassId(Classes classId) {
        this.classId = classId;
    }
    
    private Boolean isGrade(String g)
    {
        if(getKeyStage().equals("ks3"))
        {
            return kg3.isGrade(g);
        }
        else if (getKeyStage().equals("ks4"))
        {
            return kg4.isGrade(g);
        }
        else if(getKeyStage().equals("ks5"))
        {
            return kg5.isGrade(g);
        }
        return false;
        
    }

    private String getKeyStage()
    {
        String s ="";
        if(classId ==null)
        {
            s = "please assign class";
        }
        else if(classId.getKeyStage().equals("ks3"))
        {
            s = "ks3";
        }
        else if(classId.getKeyStage().equals("ks4"))
        {
            s = "ks4";
        }
        else if(classId.getKeyStage().equals("ks5"))
        {
            s = "ks5";
        }
        return s;
    }
    @XmlTransient
    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teachers> teachersList) {
        this.teachersList = teachersList;
    }

    @XmlTransient
    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (markedWorkId != null ? markedWorkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Markedworks)) {
            return false;
        }
        Markedworks other = (Markedworks) object;
        if ((this.markedWorkId == null && other.markedWorkId != null) || (this.markedWorkId != null && !this.markedWorkId.equals(other.markedWorkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ORM.Markedworks[ markedWorkId=" + markedWorkId + " ]";
    }
    
}
