package clients.dao;

import clients.beans.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface CustomersDAO {

    public boolean isCustomerExist(String name, String password);

    public void addCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void deleteCustomer(int customerID);

    public List<Customer> getAllCustomers();

    public Customer getOneCustomer(int customerID);
}
