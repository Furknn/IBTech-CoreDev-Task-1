package com.coredev.tasks.Task1DBOps;

import com.coredev.tasks.Task1DBOps.entity.Account;
import com.coredev.tasks.Task1DBOps.entity.Address;
import com.coredev.tasks.Task1DBOps.entity.Customer;
import com.coredev.tasks.Task1DBOps.entity.Phone;
import com.coredev.tasks.Task1DBOps.repository.AccountRepository;
import com.coredev.tasks.Task1DBOps.repository.AddressRepository;
import com.coredev.tasks.Task1DBOps.repository.CustomerRepository;
import com.coredev.tasks.Task1DBOps.repository.PhoneRepository;

public class TestDelete {
    public static void main(String[] args) {
        // delete account
        AccountRepository accountRepository = new AccountRepository();
        Account account = accountRepository.find(1);
        accountRepository.delete(account);
        accountRepository.close();

        // delete customer
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = customerRepository.find(1);
        customerRepository.delete(customer);
        customerRepository.close();

        // delete address
        AddressRepository addressRepository = new AddressRepository();
        Address address = addressRepository.find(1);
        addressRepository.delete(address);
        addressRepository.close();
        
        // delete phone
        PhoneRepository phoneRepository = new PhoneRepository();
        Phone phone = phoneRepository.find(1);
        phoneRepository.delete(phone);
        phoneRepository.close();
    }
}
