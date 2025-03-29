package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ifElseProblemTest {

    @Test
    public void testMainWithSampleInput1() {
        // Step 1: Simulate user input
        String simulatedInput = "10\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream); // Redirect System.in to use our simulated input

        // Step 2: Capture the program's output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Step 3: Run the main method
        ifElseProblem.main(new String[]{});

        // Step 4: Define the expected output
        String expectedOutput = "Weird\n";

        // Step 5: Compare actual output with expected output
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testMainWithSampleInput2(){
        // Step 1: Test with another input
        String simulatedInput2 = "4\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(simulatedInput2.getBytes());
        System.setIn(inputStream2);

        // Step 2: Capture the program's output
        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream2));

        // Step 3: Run the main method
        ifElseProblem.main(new String[]{});

        // Step 4: Define the expected output
        String expectedOutput2 = "Not Weird\n";

        // Step 5: Compare actual output with expected output
        assertEquals(expectedOutput2, outputStream2.toString());
    }

    @Test
    public void testMainWithSampleInput3(){
        // Step 1: Test with another input
        String simulatedInput3 = "0\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream inputStream3 = new ByteArrayInputStream(simulatedInput3.getBytes());
        System.setIn(inputStream3);

        // Step 2: Capture the program's output
        ByteArrayOutputStream outputStream3 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream3));

        // Step 3: Run the main method
        ifElseProblem.main(new String[]{});

        // Step 4: Define the expected output
        String expectedOutput3 = "undefined\n";

        // Step 5: Compare actual output with expected output
        assertEquals(expectedOutput3, outputStream3.toString());

        System.out.println("expected out put" + expectedOutput3);
        System.out.println("actual out put" + outputStream3.toString());
        System.out.println("this is a test");
    }
}
