package com.coredev.tasks.Task1DBOps;

import com.coredev.tasks.Task1DBOps.entity.Account;
import com.coredev.tasks.Task1DBOps.entity.Address;
import com.coredev.tasks.Task1DBOps.entity.Customer;
import com.coredev.tasks.Task1DBOps.entity.Phone;
import com.coredev.tasks.Task1DBOps.repository.AccountRepository;
import com.coredev.tasks.Task1DBOps.repository.AddressRepository;
import com.coredev.tasks.Task1DBOps.repository.CustomerRepository;
import com.coredev.tasks.Task1DBOps.repository.PhoneRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestInsert 
{
    public static void main( String[] args )
    {
        // Insert a new address
        Address address = new Address();
        address.setStreet("123 Main Street");
        address.setCity("New York");
        address.setState("NY");    
        address.setZipCode("234235");
        AddressRepository addressRepo= new AddressRepository();
        addressRepo.insert(address);
        

        // Insert a new phone
        Phone phone = new Phone();
        phone.setNumber("843382573");
        phone.setAreaCode("+90");
        PhoneRepository phoneRepo = new PhoneRepository();
        phoneRepo.insert(phone);;

        // Insert a new customer
        Customer customer = new Customer();
        customer.setName("John Doe");
        CustomerRepository customerRepo = new CustomerRepository();
        customerRepo.insert(customer);       

        customer.setPhone(phone);
        customer.setAddress(address);
        customerRepo.update(customer);

        // Insert a new account
        Account account = new Account();
        account.setAccountType("Savings");
        account.setAccountNumber("2312342421");
        account.setBalance(10550.0);        
        AccountRepository accountRepo= new AccountRepository();
        accountRepo.insert(account);
        
        account.setCustomer(customer);
        accountRepo.update(account);
        
        accountRepo.close();
        customerRepo.close();
        phoneRepo.close();
        addressRepo.close();

        
    }
}
