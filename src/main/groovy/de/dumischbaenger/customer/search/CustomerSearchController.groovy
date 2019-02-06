package de.dumischbaenger.customer.search;

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
@Named("customerSearchController")
public class CustomerSearchController implements Serializable {
  String searchCustomerName="searchName"
	
  @Inject
  DbAccess dbAccess
  

  public CustomerSearchController() {
    super();
  }
 
  
  public String doSearch() {
	
	println("\n\nSearch now\n\n")

	EntityManager em=dbAccess.getEntityManager()
	
	return Pages.CUSTOMER_LIST
  }

 }
