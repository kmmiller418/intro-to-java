import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MyNameIsTest {
    private ByteArrayOutputStream testOutput;

    @Test
    @DisplayName("Prints name to console")
    void main() {
        testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        MyNameIs.main(null);

        assertEquals("My name is\nKaneka\nMiller", testOutput.toString());
    }
}