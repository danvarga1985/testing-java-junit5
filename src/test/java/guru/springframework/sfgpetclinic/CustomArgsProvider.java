package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CustomArgsProvider implements ArgumentsProvider {
    /**
     * Provide a {@link Stream} of {@link Arguments} to be passed to a
     * {@code @ParameterizedTest} method.
     *
     * @param context the current extension context; never {@code null}
     * @return a stream of arguments; never {@code null}
     */
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of
                (Arguments.of("FL", 42, 1),
                        Arguments.of("OH", 14, 2),
                        Arguments.of("MI", 3, 5));
    }
}
