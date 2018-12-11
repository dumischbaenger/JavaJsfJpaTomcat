package de.dumischbaenger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped
import javax.faces.bean.SessionScoped
import javax.faces.context.FacesContext
import javax.servlet.http.HttpSession

@RequestScoped
@ManagedBean(name = "UserData")
public class UserData implements Serializable {

  private count=0;

  public UserData() {
    super();
  }

  @PostConstruct
  public void init() {
  }

  public String getName() {
    //    HttpServletRequest request = (HttpServletRequest) (FacesContext.getCurrentInstance().getExternalContext().getRequest());
    //    Object username=request.getAttribute("de.dumischbaenger.jetty.username");
    //    Object password=request.getAttribute("de.dumischbaenger.jetty.password");

    HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    Object username=session.getAttribute("de.dumischbaenger.jetty.username");
    Object password=session.getAttribute("de.dumischbaenger.jetty.password");

    //String result= count++ + " " +  username + " " + new Date() + " " + password.toString().charAt(0);
	String result=username;
	
    return result;
  }

  public void setName(String name) {
    this.name = name;
  }
}
