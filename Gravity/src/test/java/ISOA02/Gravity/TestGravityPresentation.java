package ISOA02.Gravity;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestGravityPresentation {

    private final InputStream originalSystemIn = System.in;

	private final String input = "1\n1\n1\n";

	private final ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());

	private final StringBuilder output = new StringBuilder();

	@Before
	public void setUpStreams() {
		System.setIn(inputStream);
		System.setOut(new java.io.PrintStream(System.out) {
			public void println(String message) {
				output.append(message).append("\n");
			}
		});
	}

	@After
	public void restoreStreams() {
		System.setIn(originalSystemIn);
		System.setOut(System.out);
	}

	@Test
    public void testAppMain() {

        App.main(new String[] {});

        String expectedOutput = "Introduce the mass value for Body1 (Kg):\n"
        		+ "Introduce the mass value for Body2 (Kg):\n"
        		+ "Introduce the distance value between Body1 and Body2 (Meters):\n"
        		+ "The total force is 6.67E-11 Newtons.\n";
        
        assertEquals(expectedOutput, output.toString());
    }

   
}
