package kodlamaio.hrms.Core.dataAccess;

import kodlamaio.hrms.Core.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    User getUserByEmail(String email);

    void delete(User user);
}