package de.dumischbaenger.customer.search;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped
import javax.faces.context.FacesContext
import javax.inject.Named
import javax.servlet.http.HttpSession

import de.dumischbaenger.customer.Pages

@SessionScoped
@Named
public class CustomerSearchController implements Serializable {

  public CustomerSearchController() {
    super();
  }
  
  public String doSearch() {
    return Pages.CUSTOMER_LIST
  }

 }
