package com.coredev.tasks.Task1DBOps;

import com.coredev.tasks.Task1DBOps.entity.Account;
import com.coredev.tasks.Task1DBOps.entity.Address;
import com.coredev.tasks.Task1DBOps.entity.Customer;
import com.coredev.tasks.Task1DBOps.entity.Phone;
import com.coredev.tasks.Task1DBOps.repository.AccountRepository;
import com.coredev.tasks.Task1DBOps.repository.AddressRepository;
import com.coredev.tasks.Task1DBOps.repository.CustomerRepository;
import com.coredev.tasks.Task1DBOps.repository.PhoneRepository;

public class TestUpdate {
    public static void main(String[] args) {
        // update account
        AccountRepository accountRepository = new AccountRepository();
        Account account = accountRepository.find(1);
        account.setBalance(10.00);
        accountRepository.update(account);
        System.out.println("---------------");
        System.out.println("Account updated: ");
        System.out.println(account.getId());
        System.out.println(account.getBalance());
        System.out.println(account.getAccountType());
        System.out.println("---------------");

        // update customer
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = customerRepository.find(1);
        customer.setName("Furkan Sevgili");
        customerRepository.update(customer);
        System.out.println("---------------");
        System.out.println("Customer updated: ");
        System.out.println(customer.getId());
        System.out.println(customer.getName());
        System.out.println(customer.getPhone().getNumber());
        System.out.println("---------------");

        // update address
        AddressRepository addressRepository = new AddressRepository();
        Address address = addressRepository.find(1);
        address.setCity("İstanbul");
        addressRepository.update(address);
        System.out.println("---------------");
        System.out.println("Address updated: ");
        System.out.println(address.getId());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getZipCode());
        System.err.println(address.getState());
        System.out.println("---------------");

        // update phone
        PhoneRepository phoneRepository = new PhoneRepository();
        Phone phone = phoneRepository.find(1);
        phone.setNumber("5055555555");
        phoneRepository.update(phone);
        System.out.println("---------------");
        System.out.println("Phone updated: ");
        System.out.println(phone.getId());
        System.out.println(phone.getNumber());
        System.out.println("---------------");
        
        phoneRepository.close();
        addressRepository.close();
        customerRepository.close();
        accountRepository.close();
        
    }
}
