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
@Table(name = "banners")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banners.findAll", query = "SELECT b FROM Banners b"),
    @NamedQuery(name = "Banners.findByBannerId", query = "SELECT b FROM Banners b WHERE b.bannerId = :bannerId"),
    @NamedQuery(name = "Banners.findByTitle", query = "SELECT b FROM Banners b WHERE b.title = :title"),
    @NamedQuery(name = "Banners.findByImage", query = "SELECT b FROM Banners b WHERE b.image = :image"),
    @NamedQuery(name = "Banners.findByDescription", query = "SELECT b FROM Banners b WHERE b.description = :description")})
public class Banners implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "banner_id")
    private Integer bannerId;
    @Size(max = 45)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image")
    private String image;
    @Size(max = 45)
    @Column(name = "description")
    private String description;

    public Banners() {
    }

    public Banners(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Banners(Integer bannerId, String image) {
        this.bannerId = bannerId;
        this.image = image;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bannerId != null ? bannerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banners)) {
            return false;
        }
        Banners other = (Banners) object;
        if ((this.bannerId == null && other.bannerId != null) || (this.bannerId != null && !this.bannerId.equals(other.bannerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hxt.pojo.Banners[ bannerId=" + bannerId + " ]";
    }
    
}
