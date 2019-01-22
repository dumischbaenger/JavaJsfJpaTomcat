package de.dumischbaenger.domainmodel

import javax.persistence.Access
import javax.persistence.AccessType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator

@Entity
@Access(AccessType.PROPERTY)  
class Customer {

  @Id 
  @GeneratedValue(generator = "customer_seq", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize=2,initialValue=1)
  Integer id
  String name
  Integer age 
  Integer gender

  String toString() { "$id $name : age $age, gender $gender" }
}
