package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.UserService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.Core.dataAccess.UserDao;
import kodlamaio.hrms.Core.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    //private ValidationService emailValidator;
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao/*, ValidationService<User> validationService*/) {
        super();
        //this.emailValidator=validationService;
        this.userDao = userDao;
    }


    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Kullanıcılar listelendi") ;
    }

    @Override
    public Result add(User user) {
        //this.emailValidator.Validate(user);
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> getUserByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.getUserByEmail(email),email + " e-postasına ait kullanıcı sistemimizde mevcuttur.");
    }

    @Override
    public Result delete(User user) {
        this.userDao.delete(user);
        return new SuccessResult("Kullanıcı silindi");
    }

}