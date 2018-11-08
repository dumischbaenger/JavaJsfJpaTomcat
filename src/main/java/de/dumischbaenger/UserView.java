package de.dumischbaenger;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userView")
public class UserView implements Serializable {

  private String  name  = "Johnvvvvvvvvvvvvv";

  public UserView() {
    super();
    System.out.println("------------------------> userView");
  }

  @PostConstruct
  public void init() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
