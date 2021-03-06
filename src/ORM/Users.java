/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import Encryption.Encrypt;
/**
 *
 * @author jermaine
 */
@Entity
@Table(name = "USERS", catalog = "", schema = "APP", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"USERNAME"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByTeacherId", query = "SELECT u FROM Users u WHERE u.teacherId = :teacherId"),
    @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TEACHER_ID", nullable = false, length = 8)
    private String teacherId;
    @Basic(optional = false)
    @Column(name = "USERNAME", nullable = false, length = 8)
    private String username;
    @Basic(optional = false)
    @Column(name = "PASSWORD", nullable = false, length = 16)
    private String password;
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "TEACHER_ID", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Teachers teachers;

    public Users() {
        //this.teacherId = teachers.getTeacherId();
    }

//    public Users(String teacherId) {
//        this.teacherId = teacherId;
//    }

    public Users(String password) {
        this.teacherId = teachers.getTeacherId();
        //this.username = username;
        this.password = password;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId() {
        this.teacherId = teachers.getTeacherId();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        //this.username = username;
        String fName = teachers.getFirstName().substring(0, 3);
        String lName = teachers.getLastName().substring(0, 2);
        int num = (int) (Math.random()*50+1);
        String uName = fName+lName+num;
        this.username = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        String encP = Encryption.Encrypt.encrypt(password);
        this.password = encP;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.teacherId == null && other.teacherId != null) || (this.teacherId != null && !this.teacherId.equals(other.teacherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ORM.Users[ teacherId=" + teacherId + " ]";
    }
    
}
