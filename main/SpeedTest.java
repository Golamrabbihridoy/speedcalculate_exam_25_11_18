package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpeedTest {

	@Test
	void test() {
         Speed obj = new Speed();
		
		//System.out.println(AssertEquals(obj.SpeedCalculate(1), 10.0));
		assertEquals(obj.SpeedCalculate(1), 10.0);
		assertEquals(obj.SpeedCalculate(6), 1.0);
		assertEquals(obj.SpeedCalculate(0.25), 20.0);
	}

}
