package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.School;

import java.util.List;

public interface SchoolService {

    Result add(School school);

    DataResult<List<School>> getAllBySchoolNameContainsAndDepartmentContains(String schoolName, String department);


    DataResult<List<School>> getAllBySchoolNameContainsOrDepartmentContains(String schoolName, String department);


    DataResult<List<School>> getAllBySchoolNameContains(String schoolName);


    DataResult<List<School>> getAllByDepartmentContains(String department);

}
