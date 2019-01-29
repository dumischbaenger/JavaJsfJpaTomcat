package de.dumischbaenger.dbtools;

import javax.enterprise.context.SessionScoped
import javax.inject.Named
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

import de.dumischbaenger.customer.Pages

@SessionScoped
@Named("dbAccess")
public class DbAccess implements Serializable {

//  static EntityManagerFactory entityManagerFactory=null
  
  public DbAccess() {
    super();
  }
  
  EntityManagerFactory entityManagerFactory
  public EntityManager getEntityManager() {
    println("\n\nget entity manager 1\n\n")
    
    if(entityManagerFactory==null) {
      println("\n\nbuild factory\n\n")
      entityManagerFactory = Persistence.createEntityManagerFactory("exampledb");
    }
    EntityManager em = entityManagerFactory.createEntityManager();
  
    return em
  }

 }
