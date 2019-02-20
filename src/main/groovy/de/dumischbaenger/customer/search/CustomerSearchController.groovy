package de.dumischbaenger.customer.search;

import javax.enterprise.context.SessionScoped
import javax.inject.Inject
import javax.inject.Named
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

import de.dumischbaenger.customer.Pages
import de.dumischbaenger.dbtools.DbAccess
import de.dumischbaenger.dbtools.DbCustomerService
import de.dumischbaenger.domainmodel.Customer

@SessionScoped
@Named("customerSearchController")
public class CustomerSearchController implements Serializable {
  String searchCustomerName=null

  @Inject
  DbCustomerService dbCustomerService;

  public CustomerSearchController() {
    super();
  }

  public List customerList() {

    println("\n\ncustomerList now \n\n")
    
    Map searchCriteria=[:]
    if (searchCustomerName != null && !searchCustomerName.trim().equals("")) {
      searchCriteria["name"]=searchCustomerName
    }
    println("\n\ncustomerList now $searchCriteria\n\n")
    
    if(searchCriteria) {
      dbCustomerService.searchCustomer(searchCriteria)
    }
  }
  
  
  public String doSearch() {
	
	println("\n\nSearch now\n\n")
	
//	Map searchCriteria=[:]
//	if (searchCustomerName != null && !searchCustomerName.trim().equals("")) {
//		searchCriteria["name"]=searchCustomerName
//	}
//
//  if(!searchCriteria.empty) {
//    dbCustomerService.searchCustomer(searchCriteria)
//  }
		
	return Pages.CUSTOMER_LIST
  }

  
 }
