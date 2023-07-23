/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.repository.impl;

import com.hxt.pojo.Banners;
import com.hxt.repository.BannerRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import javax.persistence.Query;

@Repository
@Transactional
public class BannerRepositoryImpl implements BannerRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<Banners> getBannerses() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Banners ");

        return q.getResultList();
    }

}
