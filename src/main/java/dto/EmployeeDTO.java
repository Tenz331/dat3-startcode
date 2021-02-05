/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import dtos.RenameMeDTO;
import entities.Employee;
import entities.RenameMe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melo-
 */
public class EmployeeDTO {
private long id;
private String name;
private String address;

    public EmployeeDTO(Employee rm) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public static List<EmployeeDTO> getDtos(List<Employee> rms){
        List<EmployeeDTO> Employeedtos = new ArrayList();
        rms.forEach(rm->Employeedtos.add(new EmployeeDTO(rm)));
        return Employeedtos;
    }

    public EmployeeDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }
   

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }




}