package de.dumischbaenger.dbtools;

import javax.enterprise.context.SessionScoped
import javax.inject.Named
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence
import javax.persistence.PersistenceUnit

import groovy.util.logging.Slf4j

@Slf4j
@SessionScoped
@Named("dbAccess")
public class DbAccess implements Serializable {

  Integer references=0
  
  @PersistenceUnit(unitName="exampledb")
  EntityManagerFactory entityManagerFactory
  
  public DbAccess() {
    super();
  }
  
  
  public EntityManager getEntityManager() {
    log.info("get entity manager")
    
    references++
    
    if(entityManagerFactory==null) {
      log.info("build entity manager factory $references")
      entityManagerFactory = Persistence.createEntityManagerFactory("exampledb");
    } else {
      log.info(" entity manager factory exists $references")
    }
    EntityManager em = entityManagerFactory.createEntityManager();
  
    return em
  }

 }
