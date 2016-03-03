import static org.junit.Assert.*;

import org.junit.Test;

public class GpaCalculationTest {

	GpaCalculation calculation = new GpaCalculation();
	Double result= calculation.gpaCalculatefromInput1(500.0,54.0);
	Double testResult = 9.25925925925926;

	@Test
	public void testGpaCalculation() {
		System.out.println("@Test sum(): " + result + " = " + testResult);
		assertEquals(result, testResult);
	}

}

