package kodlamaio.hrms.DataAccess.abstracts;

import kodlamaio.hrms.Entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {

    List<JobPosition> getByJobPositionNameContains(String jobPositionName);

    void delete(JobPosition jobPosition);

}