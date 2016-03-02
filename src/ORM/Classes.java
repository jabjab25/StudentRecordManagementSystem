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

/**
 *
 * @author jermaine
 */
@Entity
@Table(name = "CLASSES", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c"),
    @NamedQuery(name = "Classes.findByClassId", query = "SELECT c FROM Classes c WHERE c.classId = :classId"),
    @NamedQuery(name = "Classes.findByClassName", query = "SELECT c FROM Classes c WHERE c.className = :className"),
    @NamedQuery(name = "Classes.findByKeyStage", query = "SELECT c FROM Classes c WHERE c.keyStage = :keyStage")})
public class Classes implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Integer currentId = 1;
    @Id
    @Basic(optional = false)
    @Column(name = "CLASS_ID", nullable = false, length = 8)
    private String classId;
    @Column(name = "CLASS_NAME", length = 4)
    private String className;
    @Column(name = "KEY_STAGE", length = 4)
    private String keyStage;
    @OneToMany(mappedBy = "classId", fetch = FetchType.LAZY)
    private List<Students> studentsList;
    @OneToMany(mappedBy = "classId", fetch = FetchType.LAZY)
    private List<Markedworks> markedworksList;
    @OneToMany(mappedBy = "classId", fetch = FetchType.LAZY)
    private List<Teachers> teachersList;
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "TEACHER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Teachers teacherId;
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "STUDENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Students studentId;
    @JoinColumn(name = "MARKED_WORK_ID", referencedColumnName = "MARKED_WORK_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Markedworks markedWorkId;

    public Classes() {
        //currentId++;
        //this.classId = currentId.toString();
    }

    public Classes(String kStage,String cName) {
        this.classId = currentId.toString();
        currentId++;
        this.className = cName;
        if(isKeyStage(kStage)==true)
        {
           this.keyStage = kStage; 
        }
        }

    public String getClassId() {
        return classId;
    }

    public void setClassId() {
      
        this.classId = currentId.toString();
        currentId++;
        //this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getKeyStage() {
        return keyStage;
    }

    public void setKeyStage(String keyStage) {
        
        if(isKeyStage(keyStage)==true)
        {
            this.keyStage = keyStage;
        }
        else{
            System.out.println("This is not a valid key stage");
        }
        }
    
    private boolean isKeyStage(String keyStage){
    if(keyStage.contains("ks3")){
            return true;
        }
        else if(keyStage.contains("ks4")){
            return true;
        }
        else if(keyStage.contains("ks5")){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @XmlTransient
    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @XmlTransient
    public List<Markedworks> getMarkedworksList() {
        return markedworksList;
    }

    public void setMarkedworksList(List<Markedworks> markedworksList) {
        this.markedworksList = markedworksList;
    }

    @XmlTransient
    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teachers> teachersList) {
        this.teachersList = teachersList;
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

    public Markedworks getMarkedWorkId() {
        return markedWorkId;
    }

    public void setMarkedWorkId(Markedworks markedWorkId) {
        this.markedWorkId = markedWorkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classId != null ? classId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.classId == null && other.classId != null) || (this.classId != null && !this.classId.equals(other.classId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ORM.Classes[ classId=" + classId + " ]";
    }
    
}
