package SpringBootWithDatabaseSchema.initializer;

import java.math.BigInteger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import SpringBootWithDatabaseSchema.entity.Account;
import SpringBootWithDatabaseSchema.repository.AccountRepository;

@Component
@ConditionalOnProperty(name = "app.db-init", havingValue = "true")
public class DatabaseInitializer  implements CommandLineRunner{
	
	private AccountRepository accountRepository;
	
	public DatabaseInitializer(AccountRepository accountRepository) {
		this.accountRepository=accountRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		this.accountRepository.deleteAll();
		
		Account acc1=new Account( "anna", "GB", 120000.00, 1200.00, "VISA");
		Account acc2=new Account( "john", "US", 20000.00, 2090.00, "MASTERCARD");
		Account acc3=new Account( "devid", "PO", 90000.00, 6200.00, "RUPAY");
		
		accountRepository.save(acc1);
		accountRepository.save(acc3);
		accountRepository.save(acc2);
	}

}
