import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class VacationTest {
    private ByteArrayOutputStream testOutput;

    @Test
    @DisplayName("Prints vacation message to console")
    void main() {
        testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        Vacation.main(null);

        assertEquals("I'd like to visit\nKyoto\nJapan", testOutput.toString());

    }
}