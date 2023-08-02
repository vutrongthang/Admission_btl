package com.hxt.repository.impl;

import com.hxt.pojo.Users;
import com.hxt.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Users> getUsers(String username) {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Users> criteriaQuery = criteriaBuilder.createQuery(Users.class);
        Root<Users> root = criteriaQuery.from(Users.class);
        criteriaQuery.select(root);

        if (username != null && !username.isEmpty()) {
            Predicate predicate = criteriaBuilder.equal(root.get("name"), username.trim());
            criteriaQuery.where(predicate);
        }

        return session.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Users getUserByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Users> criteriaQuery = criteriaBuilder.createQuery(Users.class);
        Root<Users> root = criteriaQuery.from(Users.class);
        criteriaQuery.select(root);

        if (username != null && !username.isEmpty()) {
            Predicate predicate = criteriaBuilder.equal(root.get("name"), username.trim());
            criteriaQuery.where(predicate);
        }

        return session.createQuery(criteriaQuery).uniqueResult();
    }

    @Override
    public boolean saveUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(user);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
