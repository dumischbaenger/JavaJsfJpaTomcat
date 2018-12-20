package de.dumischbaenger.customer.search;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped
import javax.faces.context.FacesContext
import javax.inject.Named
import javax.servlet.http.HttpSession

import de.dumischbaenger.customer.Pages

@SessionScoped
@Named("csc")
public class CustomerSearchController implements Serializable {

  public CustomerSearchController() {
    super();
  }
  
  public String doSearch() {
    
    println("I do my search now!")
    return Pages.CUSTOMER_LIST
  }

 }
