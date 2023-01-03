package com.coredev.tasks.Task1DBOps;



import java.util.List;

import com.coredev.tasks.Task1DBOps.entity.Account;
import com.coredev.tasks.Task1DBOps.entity.Address;
import com.coredev.tasks.Task1DBOps.entity.Customer;
import com.coredev.tasks.Task1DBOps.entity.Phone;
import com.coredev.tasks.Task1DBOps.repository.AccountRepository;
import com.coredev.tasks.Task1DBOps.repository.AddressRepository;
import com.coredev.tasks.Task1DBOps.repository.CustomerRepository;
import com.coredev.tasks.Task1DBOps.repository.PhoneRepository;

public class TestList {
	public static void main(String[] args) {
		// list accounts
		AccountRepository accountRepository = new AccountRepository();
		List<Account> accounts = accountRepository.list();
		System.out.println("---------------");
		System.out.println("Accounts: ");
		for (Account account : accounts) {
			System.out.println(account.getId());
			System.out.println(account.getBalance());
			System.out.println(account.getAccountType());
			System.out.println("---------------");
		}

		// List customers
		CustomerRepository customerRepository = new CustomerRepository();
		List<Customer> customers = customerRepository.list();
		System.out.println("---------------");
		System.out.println("Customers: ");
		for (Customer customer : customers) {
			System.out.println(customer.getId());
			System.out.println(customer.getName());
			System.out.println(customer.getPhone().getNumber());
			System.out.println("---------------");
		}

		// List addresses
		AddressRepository addressRepository = new AddressRepository();
		List<Address> addresses = addressRepository.list();
		System.out.println("---------------");
		System.out.println("Addresses: ");
		for (Address address : addresses) {
			System.out.println(address.getId());
			System.out.println(address.getCity());
			System.out.println(address.getStreet());
			System.out.println(address.getZipCode());
			System.err.println(address.getState());
			System.out.println("---------------");
		}

		// List phones
		PhoneRepository phoneRepository = new PhoneRepository();
		List<Phone> phones = phoneRepository.list();
		System.out.println("---------------");
		System.out.println("Phones: ");		
		for (Phone phone : phones) {
			System.out.println(phone.getId());
			System.out.println(phone.getAreaCode());
			System.out.println(phone.getNumber());
			System.out.println("---------------");
		}
		
		  
		accountRepository.close();
        customerRepository.close();
        phoneRepository.close();
        addressRepository.close();

	}
}
