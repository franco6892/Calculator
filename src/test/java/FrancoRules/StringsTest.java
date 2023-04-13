package FrancoRules;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {
    private final Strings  strings = new Strings();

    @Test
    public void noSpacesShouldRemoveSpacesFromString() {
        String expected = "FrancoRules";
        assertEquals(expected, strings.noSpaces("Franco Rules "));
    }

    @Test
    public void emailMakerShouldReturnExpectedFormat() {
        String expected = "Franco.Manassero@best.dev";
        assertEquals(expected, strings.emailMaker("Franco", "Manassero", "best.dev"));
    }
}