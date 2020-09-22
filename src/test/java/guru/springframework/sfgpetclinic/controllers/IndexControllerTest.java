package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
        //message is shown only  if test fails
        assertEquals("index", controller.index(), "Wrong view returned");
        assertEquals("index", controller.index(), () -> "Error message shown only in case of test failure");
    }

    @Test
    void oupsHandler() {
        //lambda expression getting evaluated only if test fails
        assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive " + "message to build" +
                " for my test.");
    }
}