package SpringBootWithDatabaseSchema.repository;

import java.math.BigInteger;
import org.springframework.data.repository.CrudRepository;
import SpringBootWithDatabaseSchema.entity.Account;

public interface AccountRepository extends CrudRepository<Account, BigInteger> {

}
