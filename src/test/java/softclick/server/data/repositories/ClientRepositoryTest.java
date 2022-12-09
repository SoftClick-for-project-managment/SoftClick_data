package softclick.server.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import softclick.server.data.entities.Client;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@DataJpaTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository underTest;

    @AfterEach
    void  tearDown() {
        underTest.deleteAll();
    }


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

    @Test
    void itShouldNotFindByClientFirstName() {
        // Given
        Client client = new Client(
                "Nixon" ,
                "wafae",
                "tigernixon@gmail.com",
                "+2120065354675",
                "Keebler, Satterfield and Bernier",
                "Carterfurt",
                "BY");
        underTest.save(client);

        // When
        Client capturedClient = underTest.findByNom("Nixon2");

        // Then
        assertThat(capturedClient).isEqualTo(null);
    }

    @Test
    void itShouldCheckIfClientEmailExists(){
        // given
         String email = "tigernixon@gmail.com";
        Client client = new Client(
                "Nixon" ,
                "wafae",
                email,
                "+2120065354675",
                "Keebler, Satterfield and Bernier",
                "Carterfurt",
                "BY");
        underTest.save(client);

        //when
       boolean expected =  underTest.selectExistsEmail(email);

        //then
        assertThat(expected).isTrue();
    }

    @Test
    void itShouldCheckIfClientEmailDoesNotExistsExists(){
        // given
        String email = "tigernixon@gmail.com";
        //when
        boolean expected =  underTest.selectExistsEmail(email);

        //then
        assertThat(expected).isFalse();
    }




}
