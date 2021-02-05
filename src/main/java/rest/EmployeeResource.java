/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.EmployeeDTO;
import entities.Employee;
import facades.EmployeeFacade;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import utils.EMF_Creator;

/**
 * REST Web Service
 *
 * @author melo-
 */
@Path("Employee")
public class EmployeeResource {
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final EmployeeFacade FACADE =  EmployeeFacade.getEmployeeFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
   
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EmployeeResource
     */
    public EmployeeResource() {
    }

    /**
     * Retrieves representation of an instance of dto.EmployeeResource
     * @param Name
     * @param address
     * @param id
     * @return an instance of java.lang.String
     */
    @GET
    @Path ("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EmployeeDTO> getAllEmployees(@PathParam("Name")String Name,@PathParam("address")String address,@PathParam("id")long id) {
       List<EmployeeDTO> Employees = FACADE.getAllEmployees(Name, address, (int) id);
        return Employees;
    }
    
    @GET
    @Path ("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeDTO getEmployeeByID(@QueryParam("id")long id) {
        EmployeeDTO employee = FACADE.getEmployeeByID((int) id);
        return employee;
    }
    
    @GET
    @Path ("/highestpaid")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EmployeeDTO> getJson(@PathParam("Name")String Name,@PathParam("address")String address,@PathParam("salary")int salary) {
        List<EmployeeDTO> Employees = FACADE.getEmployeesWithHighestSalary(Name, address, salary);
        return Employees;
    }
    
    @GET
    @Path ("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeDTO getJson2(@PathParam("Name")String Name) {
       EmployeeDTO employee = FACADE.getEmployeesByName(Name);
        return employee;
    }

    /**
     * PUT method for updating or creating an instance of EmployeeResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
