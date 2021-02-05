/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dto.EmployeeDTO;
import entities.Employee;
import entities.RenameMe;
import static facades.FacadeExample.getFacadeExample;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import utils.EMF_Creator;

/**
 *
 * @author melo-
 */
public class EmployeeFacade {
private static EntityManagerFactory emf;
private static EmployeeFacade instance;

    private EmployeeFacade() {}

    public static EmployeeFacade getEmployeeFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new EmployeeFacade();
        }
        return instance;
    }
    
    public EmployeeDTO createEmployee(EmployeeDTO rm){
        Employee employee = new Employee();
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
        return new EmployeeDTO(employee);
    }
    
    public EmployeeDTO getEmployeeByID(long id){
         EntityManager em = emf.createEntityManager();
          return new EmployeeDTO (em.find(Employee.class,id));    
    }
   
    public EmployeeDTO getEmployeesByName(String Name){
         EntityManager em = emf.createEntityManager();
       
            return new EmployeeDTO(em.find(Employee.class,Name));  
    }
    
    public List<EmployeeDTO> getAllEmployees(String Name, String address, int salary){
         EntityManager em = emf.createEntityManager();
        
        TypedQuery<Employee> query = em.createQuery("Select e from Employee e",Employee.class);
        List<Employee> rms = query.getResultList();
        return EmployeeDTO.getDtos(rms);
       
    }
      public List<EmployeeDTO> getEmployeesWithHighestSalary(String Name, String address, int salary){
         EntityManager em = emf.createEntityManager();
        TypedQuery<Employee> query = em.createQuery("Select MAX(e.salry) from Employee e",Employee.class);
         List<Employee> rms = query.getResultList();
        return EmployeeDTO.getDtos(rms);
    }
    public static void main(String[] args) {
         emf = EMF_Creator.createEntityManagerFactory();
        FacadeExample fe = getFacadeExample(emf);
        fe.getAll().forEach(dto->System.out.println(dto));
    }
    }

