/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author melo-
 */
@Entity
@NamedQuery(name = "Employee.deleteAllRows", query = "DELETE from Employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String address;
    private int salary;

    public Employee(Long id, String Name, String address, int salary) {
        this.id = id;
        this.Name = Name;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
