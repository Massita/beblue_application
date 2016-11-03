package beblue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

/**
 * Created by MrViking on 02/11/2016.
 */
@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EstablishmentRepository establishmentRepository;

    public Transaction save(Transaction transaction){
        User user = userRepository.findOne(transaction.getUserCpf());

        if(transaction.getTransactionType().equals("TP_1")){
            user.setBalance(user.getBalance() - transaction.getTransactionValue());
        } else{
            Establishment establishment = establishmentRepository.findOne(transaction.getMerchantId());
            Calendar c = Calendar.getInstance();
            int now = c.get(Calendar.DAY_OF_WEEK);
            switch (now){
                case 1:
                    user.setBalance(user.getBalance() + ((transaction.getTransactionValue() / 100) * establishment.getCb_sun()));
                    break;
                case 2:
                    user.setBalance(user.getBalance() + ((transaction.getTransactionValue() / 100) * establishment.getCb_mon()));
                    break;
                case 3:
                    user.setBalance(user.getBalance() + ((transaction.getTransactionValue() / 100) * establishment.getCb_tue()));
                    break;
                case 4:
                    user.setBalance(user.getBalance() + ((transaction.getTransactionValue() / 100) * establishment.getCb_wed()));
                    break;
                case 5:
                    user.setBalance(user.getBalance() + ((transaction.getTransactionValue() / 100) * establishment.getCb_thu()));
                    break;
                case 6:
                    user.setBalance(user.getBalance() + ((transaction.getTransactionValue() / 100) * establishment.getCb_fri()));
                    break;
                case 7:
                    user.setBalance(user.getBalance() + ((transaction.getTransactionValue() / 100) * establishment.getCb_sat()));
                    break;
                default:
                    break;
            }
        }
        return transactionRepository.save(transaction);
    }

    public List<Transaction> list(){
        return transactionRepository.findAll();
    }
}
