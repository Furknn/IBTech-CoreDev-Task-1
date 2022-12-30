package com.coredev.tasks.Task1DBOps.repository;
import com.coredev.tasks.Task1DBOps.entity.Address;

public class AddressRepository extends BaseRepository<Address> {
	public AddressRepository() {
		super(Address.class);
	}	
}
