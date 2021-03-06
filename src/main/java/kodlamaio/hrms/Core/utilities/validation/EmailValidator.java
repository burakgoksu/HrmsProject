package kodlamaio.hrms.Core.utilities.validation;

import lombok.NoArgsConstructor;
import kodlamaio.hrms.Business.abstracts.UserService;
import kodlamaio.hrms.Core.entities.concretes.User;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class EmailValidator implements ValidationService<User> {

    private UserService userService;

    public EmailValidator(UserService userService){
        super();
        this.userService=userService;
    }


    @Override
    public void Validate(User user) {
        var result = this.userService.getUserByEmail(user.getEmail()).getData().getEmail();

        if (result!=null){
            user.setStatus(false);
        }else {
            user.setStatus(true);
        }
    }
}