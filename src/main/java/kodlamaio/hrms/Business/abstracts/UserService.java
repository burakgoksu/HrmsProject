package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.entities.concretes.User;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();

    Result add(User user);

    DataResult<User> getUserByEmail(String email);

    Result delete(User user);
}