import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort() {
		int [] a = {1,2,4,3};
		int [] expected = {1,2,3,4};
		Arrays.sort(a);
		assertArrayEquals(expected, a);
		
	}
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullException() {
		int [] a = null;
		int [] expected = {1,2,3,4};
		Arrays.sort(a);
		assertArrayEquals(expected, a);
		
	}
	@Test(timeout=1000)
	public void testArraySort_Performance() {
		int [] a = {12,45,43};
		for(int i = 1; i<=10000000; i++)
		{
			a[0]=i;
			Arrays.sort(a);
		}
		
		
	}

}
