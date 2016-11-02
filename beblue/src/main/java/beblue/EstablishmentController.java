package beblue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by MrViking on 16/10/2016.
 */
@RestController
//@RequestMapping("/user")
public class EstablishmentController {

    @Autowired
    private EstablishmentService service;

    @RequestMapping(value = "/establishments", method = RequestMethod.GET)
    public List<Establishment> listEstablishments(){

        return service.list();
    }

    @RequestMapping(value = "/establishment", method = RequestMethod.POST)
    public Establishment saveEstablishment(@RequestBody Establishment establishment){

        return service.save(establishment);
    }
}
