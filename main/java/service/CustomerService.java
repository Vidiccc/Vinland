package service;

import dao.CustomerDAO;
import java.util.ArrayList;
import model.Customer;

public class CustomerService {
    
    public CustomerService() {
        
    }
    
    public ArrayList<Customer> selectAll(){
        return CustomerDAO.getInstance().selectAll();         
    }
    
    public void insert(Customer cus){
        CustomerDAO.getInstance().insert(cus);
    }
    
    public void update(Customer cus) {
        CustomerDAO.getInstance().update(cus);
    }
    
    public void delete(Customer cus){
        CustomerDAO.getInstance().delete(cus);
    }
    
    public Customer selectById(Customer cus) {
        return CustomerDAO.getInstance().selectById(cus);
    }
    
    
}
