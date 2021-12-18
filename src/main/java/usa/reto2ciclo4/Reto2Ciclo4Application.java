package usa.reto2ciclo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import usa.reto2ciclo4.repository.crud.ProductCrudRepository;
import usa.reto2ciclo4.repository.crud.UserCrudRepository;

@SpringBootApplication
public class Reto2Ciclo4Application implements CommandLineRunner {

    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    public static void main(String[] args) {
        SpringApplication.run(Reto2Ciclo4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    productCrudRepository.deleteAll();
    userCrudRepository.deleteAll();
    }
}
