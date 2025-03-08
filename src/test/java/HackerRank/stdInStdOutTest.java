package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class stdInStdOutTest {

    @Test
    public void testMainWithSampleInput(){
        //Step 1: Simulate user input
        String simulatedInput = "10\n99999999999\nHello World\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream); //Redirect System.in to use our simulated input

        //Step 2: Capture the programmes output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); //Redirect System.out to capture the output

        //Step 3: Run the main method
        stdInStdOut.main(new String[]{}); //Execute the program

        //Step 4: Define the expected output
        String expectedOuput = "10\n99999999999\nHello World\n";

        //Step 5: Compare actual output with expected output
        assertEquals(expectedOuput, outputStream.toString());
    }
}
