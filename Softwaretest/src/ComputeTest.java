import static org.junit.Assert.*;

import org.junit.Test;

public class ComputeTest {
	public Compute test=new Compute();
	public int answer;
	@Test
	public void testSum() {
		answer=test.sum(2,3);
		assertEquals(5,answer);
	}

	@Test
	public void testMinus() {
		answer=test.minus(2,3);
		assertEquals(-1,answer);
	}

	@Test
	public void testMultiply() {
		answer=test.multiply(2,3);
		assertEquals(6,answer);
	}

	@Test
	public void testDivide() {
		answer=test.divide(9,3);
		assertEquals(3,answer);
	}

}
