package app.identifier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class IdentifierInitialTest {
    @Test
    public void validateIdentifier01() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("a1");
        assertEquals(true, result);
    }
}