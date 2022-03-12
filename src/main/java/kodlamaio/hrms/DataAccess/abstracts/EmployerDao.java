package kodlamaio.hrms.DataAccess.abstracts;

import kodlamaio.hrms.Entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}