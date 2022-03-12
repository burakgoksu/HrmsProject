package kodlamaio.hrms.DataAccess.abstracts;

import kodlamaio.hrms.Entities.concretes.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectorDao extends JpaRepository<Sector, Integer> {
}
