package kodlamaio.hrms.DataAccess.abstracts;

import kodlamaio.hrms.Entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LanguageDao extends JpaRepository<Language, Integer> {

    public List<Language> getByOrderByLevelAsc();

}
