package kodlamaio.hrms.DataAccess.abstracts;

import kodlamaio.hrms.Entities.concretes.Ability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbilityDao extends JpaRepository<Ability, Integer> {

    public List<Ability> getAllByDescriptionContains(String descrpition);
}
