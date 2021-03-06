package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTests implements ModelRepeatedTests {

    //@Test is not needed because of @RepeatedTest
    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} : {totalRepetitions}")
    @DisplayName("My repeated test")
    void myRepeatedTest() {
        //TODO - impl
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} : {totalRepetitions}")
    @DisplayName("My assignment test")
    void assignmentRepeated() {
        //TODO - impl
    }
}
