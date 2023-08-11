package app.identifier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering basic functional testing criterion.
 */
public class IdentifierInitialTest {
    @Test
    public void validateIdentifier01() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("a1");
        assertEquals(true, result);
    }
}