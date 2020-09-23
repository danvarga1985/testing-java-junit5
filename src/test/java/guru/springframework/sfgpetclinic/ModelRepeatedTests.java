package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeated")
public interface ModelRepeatedTests {

    /*
    Need to separate repeated test from the regular ones, otherwise every test is going to fail that is not annotated
    with @RepeatedTest, because there is no parameter-resolver for RepetitionInfo
*/
    @BeforeEach
    default void beforeEachConsoleOutputter(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running tests - " + testInfo.getDisplayName() + " - "
                + repetitionInfo.getCurrentRepetition() + " | " + repetitionInfo.getTotalRepetitions());
    }
}
