/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CS3704.sessionbeanpackage;

import com.CS3704.entitypackage.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cody
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "CS3704-StockForecastPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
    public User getUser(int id) { 
        return em.find(User.class, id);
    }
    
    public User findByUsername(String username) {
        if (em.createQuery("SELECT u FROM User u WHERE u.username = :uname").setParameter("uname", username).getResultList().isEmpty()) { return null;
        }
        else {
            return (User) (em.createQuery("SELECT u FROM User u WHERE u.username = :uname").setParameter("uname", username).getSingleResult());
        }
    }
    
        
    public User findByEmail(String email) {
        if (em.createQuery("SELECT u FROM User u WHERE u.email = :em").setParameter("em", email).getResultList().isEmpty()) { return null;
        }
        else {
            return (User) (em.createQuery("SELECT u FROM User u WHERE u.email = :em").setParameter("em", email).getResultList());
        }
    }
}
