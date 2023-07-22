/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vutrongthang
 */
@Entity
@Table(name = "profiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profiles.findAll", query = "SELECT p FROM Profiles p"),
    @NamedQuery(name = "Profiles.findByStudentId", query = "SELECT p FROM Profiles p WHERE p.studentId = :studentId"),
    @NamedQuery(name = "Profiles.findByStudentCode", query = "SELECT p FROM Profiles p WHERE p.studentCode = :studentCode"),
    @NamedQuery(name = "Profiles.findByDateBirth", query = "SELECT p FROM Profiles p WHERE p.dateBirth = :dateBirth"),
    @NamedQuery(name = "Profiles.findByAddress", query = "SELECT p FROM Profiles p WHERE p.address = :address")})
public class Profiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "student_id")
    private Integer studentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "student_code")
    private int studentCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_birth")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
    @Size(max = 255)
    @Column(name = "address")
    private String address;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @OneToOne(optional = false)
    private Users userId;

    public Profiles() {
    }

    public Profiles(Integer studentId) {
        this.studentId = studentId;
    }

    public Profiles(Integer studentId, int studentCode, Date dateBirth) {
        this.studentId = studentId;
        this.studentCode = studentCode;
        this.dateBirth = dateBirth;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
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
        if (!(object instanceof Profiles)) {
            return false;
        }
        Profiles other = (Profiles) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hxt.pojo.Profiles[ studentId=" + studentId + " ]";
    }
    
}
