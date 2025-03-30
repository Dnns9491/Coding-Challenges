package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class stdInStdOut2Test {
    @Test
    public void testMainWithSampleInput2() {
        // Step 1: Simulate user input
        String simulatedInput = "24\n100.0\nHello World\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream); // Redirect System.in to use our simulated input

        // Step 2: Capture the program's output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Step 3: Run the main method
        stdInStdOut2.main(new String[]{});

        // Step 4: Define the expected output
        String expectedOutput = "String: Hello World\n" +
                "Double: 100.0\n" +
                "Int: 24\n";
        // Step 5: Compare actual output with expected output
        assertEquals(expectedOutput, outputStream.toString());
    }
}
