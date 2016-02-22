/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

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

    public Students() {
    }

    public Students(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
        this.postCode = postCode;
    }

    public String getTargetGrade() {
        return targetGrade;
    }

    public void setTargetGrade(String targetGrade) {
        this.targetGrade = targetGrade;
    }

    public Markedworks getMarkedWorkId() {
        return markedWorkId;
    }

    public void setMarkedWorkId(Markedworks markedWorkId) {
        this.markedWorkId = markedWorkId;
    }

    public Classes getClassId() {
        return classId;
    }

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
