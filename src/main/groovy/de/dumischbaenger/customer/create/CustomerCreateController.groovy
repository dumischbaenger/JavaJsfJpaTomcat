package de.dumischbaenger.customer.create;

import javax.enterprise.context.SessionScoped
import javax.inject.Inject
import javax.inject.Named
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

import de.dumischbaenger.customer.Pages
import de.dumischbaenger.dbtools.DbAccess
import de.dumischbaenger.domainmodel.Customer

@SessionScoped
@Named("customerCreateController")
public class CustomerCreateController implements Serializable {
  
  @Inject
  DbAccess dbAccess;

  Customer customer
  
  public CustomerCreateController() {
    super();
  }
  
  public String doCreate() {
	
	println("\n\nCreate new customer\n\n")
	
	customer=new Customer()
	
//    EntityManager em=dbAccess.getEntityManager()
	
	return Pages.CUSTOMER_CREATE
  }

 }
