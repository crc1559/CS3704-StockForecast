/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CS3704.sessionbeanpackage;

import com.CS3704.entitypackage.Transaction;
import java.util.List; // ADDED
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cody
 */
@Stateless
public class TransactionFacade extends AbstractFacade<Transaction> {

    @PersistenceContext(unitName = "CS3704-StockForecastPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransactionFacade() {
        super(Transaction.class);
    }
    
    public List<Transaction> findTransactionByEmail(String email) {
        return (List<Transaction>) em.createNamedQuery("Transaction.findByEmail").setParameter("email", email).getResultList();
    }
    
}
