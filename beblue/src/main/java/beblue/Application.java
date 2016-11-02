package beblue;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, EstablishmentRepository establishmentRepository, RestTemplate restTemplate) {
        return (args) -> {
            Establishment establishment = new Establishment();
            establishment.setName("Estabelecimento de Teste​");
            establishment.setCb_sun(5);
            establishment.setCb_mon(10);
            establishment.setCb_tue(15);
            establishment.setCb_wed(20);
            establishment.setCb_thu(25);
            establishment.setCb_fri(30);
            establishment.setCb_sat(35);
            establishmentRepository.save(establishment);

            User[] users = restTemplate.getForObject(
                    "https://quarkbackend.com/getfile/vilibaldo-neto/json-javatest-users", User[].class);
            for(User user : users){
                userRepository.save(user);
            }
        };
    }

    public static void main (String[] args){
        SpringApplication.run(Application.class, args);
    }
}
