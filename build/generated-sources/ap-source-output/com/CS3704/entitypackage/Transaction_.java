package com.CS3704.entitypackage;

import com.CS3704.entitypackage.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T03:05:04")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, String> stockName;
    public static volatile SingularAttribute<Transaction, Integer> quantity;
    public static volatile SingularAttribute<Transaction, Integer> id;
    public static volatile SingularAttribute<Transaction, String> type;
    public static volatile SingularAttribute<Transaction, Double> stockPrice;
    public static volatile SingularAttribute<Transaction, User> email;
    public static volatile SingularAttribute<Transaction, String> timestamp;

}