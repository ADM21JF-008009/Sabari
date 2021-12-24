
import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
	
		Usd us = new Price();
		Euro usdAdapter = new UsdAdapterImpl(us);

		assertNotEquals(usdAdapter.getCurr(), 46.24835, 0.00001);
		assertEquals(usdAdapter.getCurr(), 92.4967, 0.00001);
	}
}
