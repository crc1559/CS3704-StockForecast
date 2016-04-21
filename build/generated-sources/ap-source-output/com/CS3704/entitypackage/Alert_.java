package com.CS3704.entitypackage;

import com.CS3704.entitypackage.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T03:05:04")
@StaticMetamodel(Alert.class)
public class Alert_ { 

    public static volatile SingularAttribute<Alert, String> stockName;
    public static volatile SingularAttribute<Alert, Integer> id;
    public static volatile SingularAttribute<Alert, Integer> factor;
    public static volatile SingularAttribute<Alert, User> email;

}