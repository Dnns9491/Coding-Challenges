package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ifElseProblemTest {

    @Test
    public void testMainWithSampleInput() {
        // Step 1: Simulate user input
        String simulatedInput = "10\n";
        ByteArrayInputStream inputStream;
        ByteArrayInputStream ByteArrayInputStream = inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Step 2: Capture the program's output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Step 3: Run the main method
        ifElseProblem.main(new String[]{});

        // Step 4: Define the expected output
        String expectedOutput = "10\n";

        // Step 5: Compare actual output with expected output
        assertEquals(expectedOutput, outputStream.toString());
    }

}
