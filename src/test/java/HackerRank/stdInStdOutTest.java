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

/*
If you have a class called MyClass, the test class should be names MyClassTest, similar to how we did above.

When you use @Test, it tells JUnit that the method below is a test case.
When you run the test, JUnit automatically executes all methods annotated with @Test

@BeforeClass → Runs once before all tests (used for expensive setup, like database connections) and you don’t want to repeat it before every test.
@Before → Runs before each test method (ensures each test starts with a clean slate.).

Steps for a `JUnit test:
1. Arrange -> prepare inputs
2. Act -> execute the method
3. Assert -> checks if the result matches expectations.

@After → Runs after each test (clean up objects) avoiding memory leaks.
@AfterClass → Runs once after all tests (close database, release resources) and ensures clean state for each test.

If you want to run the same test with multiple inputs, you can use parameterized tests.
Use @ParameterizedTest for this.
 */