/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.repository.impl;

import com.hxt.pojo.Faculties;
import com.hxt.repository.FacultiesRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vutrongthang
 */
@Repository
@Transactional
public class FacultiesRepositoryImpl implements FacultiesRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<Faculties> getFacultieses() {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Faculties> criteriaQuery = criteriaBuilder.createQuery(Faculties.class);
        Root<Faculties> root = criteriaQuery.from(Faculties.class);
        criteriaQuery.select(root);

        String queryString = "SELECT f FROM Faculties f";
        Query query = session.createQuery(queryString);
        return query.getResultList(); 
}

    @Override
    public Faculties getFacultiesId(int id) {

        Session s = sessionFactory.getObject().getCurrentSession();
        return s.get(Faculties.class, id);

    }

    @Override
    public boolean addOrUpdateFaculties(Faculties f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
