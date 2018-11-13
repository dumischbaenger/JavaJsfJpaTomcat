package de.dumischbaenger;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "groovyUserView")
public class GroovyUserView implements Serializable {

  private String  name  = "Groovy xxxx John";

  public GroovyUserView() {
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
