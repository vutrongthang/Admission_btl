package com.hxt.repository.impl;

import com.hxt.pojo.Users;
import com.hxt.repository.UserRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<Users> getUsers(String username) {
        Session session = sessionFactory.getObject().getCurrentSession();
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
        Session session = sessionFactory.getObject().getCurrentSession();
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
        Session session = this.sessionFactory.getObject().getCurrentSession();
        try{
            session.save(user);
            return true;
        }catch(HibernateException ex){
            System.err.println(ex.getMessage());
        }
        return false;
    }
}
