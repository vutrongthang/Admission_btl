/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vutrongthang
 */
@Entity
@Table(name = "faculties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Faculties.findAll", query = "SELECT f FROM Faculties f"),
    @NamedQuery(name = "Faculties.findByFacultiesId", query = "SELECT f FROM Faculties f WHERE f.facultiesId = :facultiesId"),
    @NamedQuery(name = "Faculties.findByName", query = "SELECT f FROM Faculties f WHERE f.name = :name"),
    @NamedQuery(name = "Faculties.findByDescription", query = "SELECT f FROM Faculties f WHERE f.description = :description"),
    @NamedQuery(name = "Faculties.findByWebsite", query = "SELECT f FROM Faculties f WHERE f.website = :website"),
    @NamedQuery(name = "Faculties.findByScore", query = "SELECT f FROM Faculties f WHERE f.score = :score")})
public class Faculties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "faculties_id")
    private Integer facultiesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 100)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "website")
    private String website;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "score")
    private String score;

    public Faculties() {
    }

    public Faculties(Integer facultiesId) {
        this.facultiesId = facultiesId;
    }

    public Faculties(Integer facultiesId, String name, String website, String score) {
        this.facultiesId = facultiesId;
        this.name = name;
        this.website = website;
        this.score = score;
    }

    public Integer getFacultiesId() {
        return facultiesId;
    }

    public void setFacultiesId(Integer facultiesId) {
        this.facultiesId = facultiesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facultiesId != null ? facultiesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculties)) {
            return false;
        }
        Faculties other = (Faculties) object;
        if ((this.facultiesId == null && other.facultiesId != null) || (this.facultiesId != null && !this.facultiesId.equals(other.facultiesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hxt.pojo.Faculties[ facultiesId=" + facultiesId + " ]";
    }
    
}
