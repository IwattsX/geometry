package geometry;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void integrationTest_AddAndFindShapes() {
        String simulatedInput = """
                1
                1
                5.0
                3
                1
                4
                """; // Add a Circle, Find a Circle, then Exit
        String expectedOutputPart = "2D Shape Circle: Area = 78.54, Perimeter = 31.42";

        String output = runAppWithInput(simulatedInput);

        assertTrue(output.contains(expectedOutputPart), "Circle details should appear in output.");
    }

    @Test
    void integrationTest_InvalidMenuOption() {
        String simulatedInput = """
                9
                4
                """; // Invalid menu choice, then Exit
        String expectedOutputPart = "Invalid option. Please try again.";

        String output = runAppWithInput(simulatedInput);

        assertTrue(output.contains(expectedOutputPart), "Error message for invalid menu option should appear.");
    }

    @Test
    void integrationTest_RemoveShape() {
        String simulatedInput = """
                1
                2
                4.0 6.0
                2
                2
                y
                4
                """; // Add a Rectangle, Remove it, then Exit
        String expectedOutputPart = "Removing Rectangle...";

        String output = runAppWithInput(simulatedInput);

        assertTrue(output.contains(expectedOutputPart), "Rectangle removal confirmation should appear in output.");
    }

    private String runAppWithInput(String simulatedInput) {
        ByteArrayInputStream testInput = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();

        // Set System.in and System.out to simulate input and capture output
        System.setIn(testInput);
        System.setOut(new PrintStream(testOutput));

        // Run the application
        App.main(null);

        // Reset System.in and System.out to their original values (optional)
        System.setIn(System.in);
        System.setOut(System.out);

        return testOutput.toString();
    }
}
