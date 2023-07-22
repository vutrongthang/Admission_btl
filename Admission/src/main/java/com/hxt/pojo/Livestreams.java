/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vutrongthang
 */
@Entity
@Table(name = "livestreams")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livestreams.findAll", query = "SELECT l FROM Livestreams l"),
    @NamedQuery(name = "Livestreams.findByLivestreamId", query = "SELECT l FROM Livestreams l WHERE l.livestreamId = :livestreamId"),
    @NamedQuery(name = "Livestreams.findByTitle", query = "SELECT l FROM Livestreams l WHERE l.title = :title"),
    @NamedQuery(name = "Livestreams.findByStartTime", query = "SELECT l FROM Livestreams l WHERE l.startTime = :startTime"),
    @NamedQuery(name = "Livestreams.findByEndTime", query = "SELECT l FROM Livestreams l WHERE l.endTime = :endTime")})
public class Livestreams implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "livestream_id")
    private Integer livestreamId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "livestreamId")
    private Set<Questions> questionsSet;

    public Livestreams() {
    }

    public Livestreams(Integer livestreamId) {
        this.livestreamId = livestreamId;
    }

    public Livestreams(Integer livestreamId, String title, Date startTime, Date endTime) {
        this.livestreamId = livestreamId;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getLivestreamId() {
        return livestreamId;
    }

    public void setLivestreamId(Integer livestreamId) {
        this.livestreamId = livestreamId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @XmlTransient
    public Set<Questions> getQuestionsSet() {
        return questionsSet;
    }

    public void setQuestionsSet(Set<Questions> questionsSet) {
        this.questionsSet = questionsSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (livestreamId != null ? livestreamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livestreams)) {
            return false;
        }
        Livestreams other = (Livestreams) object;
        if ((this.livestreamId == null && other.livestreamId != null) || (this.livestreamId != null && !this.livestreamId.equals(other.livestreamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hxt.pojo.Livestreams[ livestreamId=" + livestreamId + " ]";
    }
    
}
