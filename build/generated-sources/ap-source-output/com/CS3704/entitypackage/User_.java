package com.CS3704.entitypackage;

import com.CS3704.entitypackage.Alert;
import com.CS3704.entitypackage.Transaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T03:05:04")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile CollectionAttribute<User, Transaction> transactionCollection;
    public static volatile CollectionAttribute<User, Alert> alertCollection;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}