package com.coredev.tasks.Task1DBOps.repository;
import com.coredev.tasks.Task1DBOps.entity.Account;

public class AccountRepository extends BaseRepository<Account>{
	public AccountRepository() {
		super(Account.class);
	}
}
