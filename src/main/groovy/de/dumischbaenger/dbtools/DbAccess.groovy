package de.dumischbaenger.dbtools;

import javax.enterprise.context.SessionScoped
import javax.inject.Named
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

import de.dumischbaenger.customer.Pages
import groovy.util.logging.Slf4j

@Slf4j
@SessionScoped
@Named("dbAccess")
public class DbAccess implements Serializable {

//  static EntityManagerFactory entityManagerFactory=null
  
  public DbAccess() {
    super();
  }
  
  EntityManagerFactory entityManagerFactory
  public EntityManager getEntityManager() {
    log.info("get entity manager")
    
    if(entityManagerFactory==null) {
      log.info("build entity manager factory")
      entityManagerFactory = Persistence.createEntityManagerFactory("exampledb");
    }
    EntityManager em = entityManagerFactory.createEntityManager();
  
    return em
  }

 }
