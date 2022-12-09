package softclick.server.data.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import softclick.server.data.entities.Client;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@DataJpaTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository underTest;


    @Test
    void itShouldFindByClientFirstName() {
        // Given
        String nom = "Nixon";
        Client client = new Client(
                nom ,
                "wafae",
                "tigernixon@gmail.com",
                "+2120065354675",
                "Keebler, Satterfield and Bernier",
                "Carterfurt",
                "BY");
        underTest.save(client);

        // When
        Client capturedClient = underTest.findByNom(nom);

        // Then
        assertThat(capturedClient).isEqualTo(client);
    }

}
