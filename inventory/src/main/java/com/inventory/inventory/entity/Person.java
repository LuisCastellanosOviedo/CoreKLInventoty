package com.inventory.inventory.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luis on 6/12/2017.
 */
@Entity
@NamedQuery(
        name = "Person.isAuthenticated", query = "select p from Person p where p.userName = :userName2 and p.passwd = :passwd2"
)
public class Person {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPerson;
    private String name;
    private String lastName;
    private String userName;
    private String passwd;
  //  private List<Role> userRoles;


    public Person() {
    }

    public Person(Long idPerson, String name, String lastName, String userName, String passwd) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.passwd = passwd;
    }


    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
