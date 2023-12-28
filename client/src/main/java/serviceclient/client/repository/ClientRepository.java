package serviceclient.client.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serviceclient.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Bean
    static CommandLineRunner initializeBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(1L, "Rabab SELIMANI", 23));
            clientRepository.save(new Client(2L, "Amal RAMI", 22));
            clientRepository.save(new Client(3L, "Samir SAFI", 22));
        };
    }
}
