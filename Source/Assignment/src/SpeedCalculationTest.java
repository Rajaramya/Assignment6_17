import static org.junit.Assert.*;

import org.junit.Test;

public class SpeedCalculationTest {

	SpeedCalculation calculation = new SpeedCalculation();
	Double result= calculation.speedCalculatefromInput1(120.0,2.0);
	Double testResult = 60.0;

	@Test
	public void testSpeedCalculation() {
		System.out.println("@Test sum(): " + result + " = " + testResult);
		assertEquals(result, testResult);
	}

}

