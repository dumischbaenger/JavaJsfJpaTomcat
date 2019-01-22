package de.dumischbaenger.customer.search;

import javax.enterprise.context.SessionScoped
import javax.inject.Named
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

import de.dumischbaenger.customer.Pages

@SessionScoped
@Named("customerSearchController")
public class CustomerSearchController implements Serializable {
  String searchCustomerName="searchName"

  public CustomerSearchController() {
    super();
  }
  
  public String doSearch() {
    
    println("I do my search now!")
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exampledb");
    EntityManager em = emf.createEntityManager();

    return Pages.CUSTOMER_LIST
  }

 }
