import static org.junit.Assert.*;

import org.junit.Test;

public class KtoMServiceTest {

	KtoMService conversion = new KtoMService();
	Double result= conversion.convertKtoMfromInput1(20.0);
	Double testResult = 32.18849583158979;

	@Test
	public void testKtoMService() {
		System.out.println("@Test sum(): " + result + " = " + testResult);
		assertEquals(result, testResult);
	}

}
