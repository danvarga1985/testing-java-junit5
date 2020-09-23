package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "John", "Doe");
        owner.setCity("Key West");
        owner.setTelephone("12346324");

        assertAll("Properties test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("John", owner.getFirstName(), "First name did not match"),
                        () -> assertEquals("Doe", owner.getLastName(), "Last name did not match")),
                () -> assertAll("Owner properties",
                        () -> assertEquals("Key West", owner.getCity(), "City did not match"),
                        () -> assertEquals("12346324", owner.getTelephone(), "Telephone did not match"))
        );

        //Hamcrest assertion
        assertThat(owner.getCity(), is("Key West"));
    }
}