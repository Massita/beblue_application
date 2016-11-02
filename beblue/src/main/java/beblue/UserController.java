package beblue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by MrViking on 16/10/2016.
 */
@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listUsers(){

        return service.list();
    }

}
