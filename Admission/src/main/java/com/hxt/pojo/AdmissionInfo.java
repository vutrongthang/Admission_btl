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
@Table(name = "admission_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdmissionInfo.findAll", query = "SELECT a FROM AdmissionInfo a"),
    @NamedQuery(name = "AdmissionInfo.findByAdmissionId", query = "SELECT a FROM AdmissionInfo a WHERE a.admissionId = :admissionId"),
    @NamedQuery(name = "AdmissionInfo.findByAdmissionType", query = "SELECT a FROM AdmissionInfo a WHERE a.admissionType = :admissionType"),
    @NamedQuery(name = "AdmissionInfo.findByTitle", query = "SELECT a FROM AdmissionInfo a WHERE a.title = :title"),
    @NamedQuery(name = "AdmissionInfo.findByContent", query = "SELECT a FROM AdmissionInfo a WHERE a.content = :content"),
    @NamedQuery(name = "AdmissionInfo.findByPublishDate", query = "SELECT a FROM AdmissionInfo a WHERE a.publishDate = :publishDate"),
    @NamedQuery(name = "AdmissionInfo.findByCommentCount", query = "SELECT a FROM AdmissionInfo a WHERE a.commentCount = :commentCount")})
public class AdmissionInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admission_id")
    private Integer admissionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "admission_type")
    private String admissionType;
    @Size(max = 45)
    @Column(name = "title")
    private String title;
    @Size(max = 255)
    @Column(name = "content")
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_date")
    @Temporal(TemporalType.DATE)
    private Date publishDate;
    @Column(name = "comment_count")
    private Integer commentCount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admissionId")
    private Set<Comment> commentSet;

    public AdmissionInfo() {
    }

    public AdmissionInfo(Integer admissionId) {
        this.admissionId = admissionId;
    }

    public AdmissionInfo(Integer admissionId, String admissionType, Date publishDate) {
        this.admissionId = admissionId;
        this.admissionType = admissionType;
        this.publishDate = publishDate;
    }

    public Integer getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(Integer admissionId) {
        this.admissionId = admissionId;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @XmlTransient
    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (admissionId != null ? admissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdmissionInfo)) {
            return false;
        }
        AdmissionInfo other = (AdmissionInfo) object;
        if ((this.admissionId == null && other.admissionId != null) || (this.admissionId != null && !this.admissionId.equals(other.admissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hxt.pojo.AdmissionInfo[ admissionId=" + admissionId + " ]";
    }
    
}
