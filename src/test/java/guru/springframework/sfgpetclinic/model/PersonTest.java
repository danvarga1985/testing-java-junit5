package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest implements ModelTests {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(1L, "John", "Doe");
    }

    @Test
    void groupedAssertions() {
        assertAll("Test Props Set",
                () -> assertEquals( "John", person.getFirstName()),
                () -> assertEquals( "Doe", person.getLastName()));
    }

    @Test
    void groupedAssertionMsgs() {
        //assertAll lists all failures, not just the first one
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "John", "First Name failed"),
                () -> assertEquals(person.getLastName(), "Doe", "Last Name failed"));
    }

}