/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import Grades.*;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jermaine
 */
@Entity
@Table(name = "STUDENTS", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s"),
    @NamedQuery(name = "Students.findByStudentId", query = "SELECT s FROM Students s WHERE s.studentId = :studentId"),
    @NamedQuery(name = "Students.findByFirstName", query = "SELECT s FROM Students s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "Students.findByLastName", query = "SELECT s FROM Students s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "Students.findByEmailAddress", query = "SELECT s FROM Students s WHERE s.emailAddress = :emailAddress"),
    @NamedQuery(name = "Students.findByDateOfBirth", query = "SELECT s FROM Students s WHERE s.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "Students.findByAddressLine1", query = "SELECT s FROM Students s WHERE s.addressLine1 = :addressLine1"),
    @NamedQuery(name = "Students.findByPostCode", query = "SELECT s FROM Students s WHERE s.postCode = :postCode"),
    @NamedQuery(name = "Students.findByTargetGrade", query = "SELECT s FROM Students s WHERE s.targetGrade = :targetGrade")})
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Integer currentId = 1000;
    @Id
    @Basic(optional = false)
    @Column(name = "STUDENT_ID", nullable = false, length = 8)
    private String studentId;
    @Column(name = "FIRST_NAME", length = 32)
    private String firstName;
    @Column(name = "LAST_NAME", length = 32)
    private String lastName;
    @Column(name = "EMAIL_ADDRESS", length = 64)
    private String emailAddress;
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "ADDRESS_LINE1", length = 64)
    private String addressLine1;
    @Column(name = "POST_CODE", length = 8)
    private String postCode;
    @Column(name = "TARGET_GRADE", length = 2)
    private String targetGrade;
    @JoinColumn(name = "MARKED_WORK_ID", referencedColumnName = "MARKED_WORK_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Markedworks markedWorkId;
    @JoinColumn(name = "CLASS_ID", referencedColumnName = "CLASS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classId;
    @OneToMany(mappedBy = "studentId", fetch = FetchType.LAZY)
    private List<Markedworks> markedworksList;
    @OneToMany(mappedBy = "studentId", fetch = FetchType.LAZY)
    private List<Classes> classesList;

    //private Classes c;

    public Students() {
        //currentId++;
        //this.studentId = currentId.toString();
    }

    public Students(String fn, String ln, String email, Date dob, String al1, String pCode, String tGrade, Classes cl) {
        this.studentId = currentId.toString();
        currentId++;
        this.firstName = fn;
        this.lastName = ln;
        this.emailAddress = email;
        this.dateOfBirth = dob;
        this.addressLine1 = al1;
        if (checkPostcode(pCode) == true) {
            this.postCode = pCode;
        }
        this.classId = cl;
        if (isGrade(tGrade) == true) {
            this.targetGrade = tGrade;
        }

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId() {

        this.studentId = currentId.toString();
        currentId++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDob(int day, int month, int year) {
        Date dob = new Date(year, month, day);
        this.dateOfBirth = dob;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        if (checkPostcode(postCode) == true) {
            this.postCode = postCode;
        } else {
            System.out.println("this is not a valid postcode");
        }
    }

    public boolean checkPostcode(String postCode) {
        if (postCode.length() <= 8) {
            return true;
        }
        return false;
    }

    private String getKeyStage() {
        String s = "";
        if (classId == null) {
            System.out.println("Please set the class for the student");
        } else if (classId.getKeyStage().equals("ks3")) {
            s = "ks3";
        } else if (classId.getKeyStage().equals("ks4")) {
            s = "ks4";
        } else if (classId.getKeyStage().equals("ks5")) {
            s = "ks5";
        }
        return s;
    }

    private boolean isGrade(String g) {
        Ks3grades kg3 = new Ks3grades();
        Ks4grades kg4 = new Ks4grades();
        Ks5grades kg5 = new Ks5grades();

        if (getKeyStage().equals("ks3")) {
            return kg3.isGrade(g);
        } else if (getKeyStage().equals("ks4")) {
            return kg4.isGrade(g);
        } else if (getKeyStage().equals("ks5")) {
            return kg5.isGrade(g);
        }
        return false;
    }

    public String getTargetGrade() {
        return targetGrade;
    }

    public void setTargetGrade(String targetGrade) {
        if (isGrade(targetGrade) == true) {
            this.targetGrade = targetGrade;
        } else {
            System.out.println("This is not a valid grade");
        }

    }

    public Markedworks getMarkedWorkId() {
        return markedWorkId;
    }

    public void setMarkedWorkId(Markedworks markedWorkId) {
        this.markedWorkId = markedWorkId;
    }

//    public void setClass(Classes cl) {
//        this.c = cl;
//    }

    public Classes getClassId() {
        return classId;
    }

//    public void setClassId2()
//    {
//        if(c == null)
//        {
//            System.out.println("Please set class for the student");
//        }
//        else
//        {
//           this.classId = c.getClassId(); 
//        }
//        
//    }
    public void setClassId(Classes classId) {
        this.classId = classId;
    }

    @XmlTransient
    public List<Markedworks> getMarkedworksList() {
        return markedworksList;
    }

    public void setMarkedworksList(List<Markedworks> markedworksList) {
        this.markedworksList = markedworksList;
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
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ORM.Students[ studentId=" + studentId + " ]";
    }

}
