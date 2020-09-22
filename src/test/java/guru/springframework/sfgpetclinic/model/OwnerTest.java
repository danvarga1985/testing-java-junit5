package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

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
                        () -> assertEquals("12346324", owner.getTelephone(), "Telephone did not match")));
    }
}