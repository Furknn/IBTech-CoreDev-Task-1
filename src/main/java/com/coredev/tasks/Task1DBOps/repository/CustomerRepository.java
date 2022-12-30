package com.coredev.tasks.Task1DBOps.repository;
import com.coredev.tasks.Task1DBOps.entity.Customer;

public class CustomerRepository extends BaseRepository<Customer>{
	public CustomerRepository() {
		super(Customer.class);
	}
}
