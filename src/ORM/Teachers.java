/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jermaine
 */
@Entity
@Table(name = "TEACHERS", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teachers.findAll", query = "SELECT t FROM Teachers t"),
    @NamedQuery(name = "Teachers.findByTeacherId", query = "SELECT t FROM Teachers t WHERE t.teacherId = :teacherId"),
    @NamedQuery(name = "Teachers.findByFirstName", query = "SELECT t FROM Teachers t WHERE t.firstName = :firstName"),
    @NamedQuery(name = "Teachers.findByLastName", query = "SELECT t FROM Teachers t WHERE t.lastName = :lastName"),
    @NamedQuery(name = "Teachers.findByEmailAddress", query = "SELECT t FROM Teachers t WHERE t.emailAddress = :emailAddress")})
public class Teachers implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Integer currentId = 1000;
    @Id
    @Basic(optional = false)
    @Column(name = "TEACHER_ID", nullable = false, length = 8)
    private String teacherId;
    @Column(name = "FIRST_NAME", length = 32)
    private String firstName;
    @Column(name = "LAST_NAME", length = 32)
    private String lastName;
    @Column(name = "EMAIL_ADDRESS", length = 64)
    private String emailAddress;
    @OneToMany(mappedBy = "teacherId", fetch = FetchType.LAZY)
    private List<Markedworks> markedworksList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "teachers", fetch = FetchType.LAZY)
    private Users users;
    @JoinColumn(name = "MARKED_WORK_ID", referencedColumnName = "MARKED_WORK_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Markedworks markedWorkId;
    @JoinColumn(name = "CLASS_ID", referencedColumnName = "CLASS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classId;
    @OneToMany(mappedBy = "teacherId", fetch = FetchType.LAZY)
    private List<Classes> classesList;

    public Teachers() {
        currentId++;
        this.teacherId = currentId.toString();
    }

    public Teachers(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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

    @XmlTransient
    public List<Markedworks> getMarkedworksList() {
        return markedworksList;
    }

    public void setMarkedworksList(List<Markedworks> markedworksList) {
        this.markedworksList = markedworksList;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
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
    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherId != null ? teacherId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teachers)) {
            return false;
        }
        Teachers other = (Teachers) object;
        if ((this.teacherId == null && other.teacherId != null) || (this.teacherId != null && !this.teacherId.equals(other.teacherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ORM.Teachers[ teacherId=" + teacherId + " ]";
    }
    
}
