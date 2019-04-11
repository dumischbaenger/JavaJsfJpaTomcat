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
import groovy.util.logging.Slf4j

@Slf4j
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
    log.info("edit customer")

    customer=c

    return Pages.CUSTOMER_CREATE
  }

  public String doCreate() {
    log.info("create customer")
    
    customer=new Customer()

    return Pages.CUSTOMER_CREATE
  }
  
  public String doSave() {
    log.info("save customer")
    
    dbCustomerService.saveCustomer(customer)

    return Pages.CUSTOMER_LIST
  }
}
