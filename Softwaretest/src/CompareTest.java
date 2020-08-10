import static org.junit.Assert.*;

import org.junit.Test;

public class CompareTest {
	public Compare comp=new Compare();
	public boolean answer;
	@Test
	public void testIsbigger() {
		answer=comp.isbigger(5, 6);
		assertEquals(false,answer);
	}

	@Test
	public void testIssmaller() {
		answer=comp.issmaller(5, 6);
		assertEquals(true,answer);
	}

	@Test
	public void testIsequal() {
		answer=comp.isequal(5, 6);
		assertEquals(false,answer);
	}

}
