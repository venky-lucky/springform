package ai.jobiak.bootforms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ai.jobiak.bootforms.model.Account;
@Repository
public interface UserRepository extends JpaRepository<Account, Long> 
{

}