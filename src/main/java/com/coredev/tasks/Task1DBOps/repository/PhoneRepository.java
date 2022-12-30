package com.coredev.tasks.Task1DBOps.repository;
import com.coredev.tasks.Task1DBOps.entity.Phone;

public class PhoneRepository extends BaseRepository<Phone>{
	public PhoneRepository() {
		super(Phone.class);
	}	
}
