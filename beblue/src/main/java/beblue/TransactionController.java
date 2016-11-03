package beblue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by MrViking on 02/11/2016.
 */
@RestController
public class TransactionController {

    @Autowired
    private TransactionService service;

    @RequestMapping(value = "/register-transaction", method = RequestMethod.POST)
    public void registerTransaction(@RequestBody Transaction transaction){

        service.save(transaction);
    }
}
