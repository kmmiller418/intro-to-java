import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HiFriendTest {
    private ByteArrayOutputStream testOutput;

    @Test
    @DisplayName("Prints a greeting message to the terminal")
    void main() {
        testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        HiFriend.main(null);
        assertEquals("Hi friendo-wiendo", testOutput.toString());
    }
}