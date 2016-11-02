package beblue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MrViking on 16/10/2016.
 */

@Service
public class EstablishmentService {

    @Autowired
    private EstablishmentRepository repository;

    public Establishment save(Establishment establishment){
        return repository.save(establishment);
    }

    public List<Establishment> list(){
        return repository.findAll();
    }
}
