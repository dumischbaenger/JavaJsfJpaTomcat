package de.dumischbaenger.customer.create;

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
@Named("customerCreateController")
public class CustomerCreateController implements Serializable {

  @Inject
  DbCustomerService dbCustomerService;

  Customer customer

  public CustomerCreateController() {
    super();
  }
  
  public String doEdit(Customer c) {

    println("\n\nCreate new customer\n\n")

    customer=c

    return Pages.CUSTOMER_CREATE
  }

  public String doCreate() {

    println("\n\nCreate new customer\n\n")

    customer=new Customer()

    return Pages.CUSTOMER_CREATE
  }
  
  public String doSave() {

    println("\n\nSave customer\n\n")

    dbCustomerService.saveCustomer(customer)

    return Pages.CUSTOMER_LIST
  }
}
