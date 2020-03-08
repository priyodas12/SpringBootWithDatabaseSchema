package SpringBootWithDatabaseSchema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootWithDatabaseSchema.entity.Account;
import SpringBootWithDatabaseSchema.repository.AccountRepository;

@RestController
@RequestMapping("/testbank")
public class AccountController {
	
	private AccountRepository accountRepository;
	
	public AccountController(AccountRepository accountRepository) {
		this.accountRepository=accountRepository;
	}
	
	@GetMapping("/accounts/allInfo")
	public Iterable<Account> getAll(){
		return this.accountRepository.findAll();
	}

}
