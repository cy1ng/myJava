package com.cying.testSecur.dao;

import com.cying.testSecur.domain.User;

public class MyUserDao {
     public User getUserByName(String username){
    	 Session session = HibernateUtil.getSessionFactory().getCurrentSession();  
         session.beginTransaction();  
   
         User user = new User();  
          
         session.save(theEvent);  
   
         session.getTransaction().commit();
     }
}
