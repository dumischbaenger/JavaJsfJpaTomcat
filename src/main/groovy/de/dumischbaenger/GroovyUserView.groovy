package de.dumischbaenger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped
import javax.faces.context.FacesContext
import javax.servlet.http.HttpSession

@SessionScoped
@ManagedBean(name = "groovyUserView")
public class GroovyUserView implements Serializable {

  private count=0;

  public GroovyUserView() {
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

    String result= count++ + " " +  username + " " + new Date() + " " + password.toString().charAt(0);

    return result;
  }

  public void setName(String name) {
    this.name = name;
  }
}
