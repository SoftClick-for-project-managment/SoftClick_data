package softclick.server.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import softclick.server.data.entities.Employee;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository underTest;

    @AfterEach
    void  tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldFindByEmployeeFirstName() {
        // Given
        String firstName = "Tiger";
        String lastName = "Nixon";
        Employee employee = new Employee(
                null,
                firstName,
                lastName ,
                "Talent Acquisition Specialist",
                "tigernixon@gmail.com",
                "+2120065354675");
        underTest.save(employee);

        // When
        Employee capturedEmployee = underTest.findByEmployeeFirstName(firstName);

        // Then
        assertThat(capturedEmployee).isEqualTo(employee);
    }

    @Test
    void itShouldFindByEmployeeLastName() {
        // Given
        String firstName = "Tiger";
        String lastName = "Nixon";
        Employee employee = new Employee(
                null,
                firstName,
                lastName ,
                "Talent Acquisition Specialist",
                "tigernixon@gmail.com",
                "+2120065354675");
        underTest.save(employee);

        // When
        Employee capturedEmployee = underTest.findByEmployeeLastName(lastName);

        // Then
        assertThat(capturedEmployee).isEqualTo(employee);
    }

    @Test
    void itShouldNotFindByEmployeeFirstName() {
        // Given
        Employee employee = new Employee(
                null,
                "Tiger",
                "Nixon" ,
                "Talent Acquisition Specialist",
                "tigernixon@gmail.com",
                "+2120065354675");
        underTest.save(employee);

        // When
        Employee capturedEmployee = underTest.findByEmployeeFirstName("Tiger2");

        // Then
        assertThat(capturedEmployee).isEqualTo(null);
    }

    @Test
    void itShouldNotFindByEmployeeLastName() {
        // Given
        Employee employee = new Employee(
                null,
                "Tiger",
                "Nixon" ,
                "Talent Acquisition Specialist",
                "tigernixon@gmail.com",
                "+2120065354675");
        underTest.save(employee);

        // When
        Employee capturedEmployee = underTest.findByEmployeeLastName("Nixon2");

        // Then
        assertThat(capturedEmployee).isEqualTo(null);
    }
}