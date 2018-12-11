package de.dumischbaenger;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "userView")
public class UserView implements Serializable { 

  private String  name  = "Java John";

  public UserView() {
    super();
  }

  @PostConstruct
  public void init() {
  }

  public String getName() {
    return name + " " + new Date();
  }

  public void setName(String name) {
    this.name = name;
  }

}
