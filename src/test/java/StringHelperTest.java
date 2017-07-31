import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junitFirst.StringHelper;

public class StringHelperTest {

	static StringHelper helper; 
	
	@BeforeClass
	public static void beforeHelper(){
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPosition() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void testTruncateAInFirst2PositionsAFirstPosition(){
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_NoAInFirstPositions(){
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	@Test
	public void testTruncateAInFirst2Positions_AInLastPositions(){
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NotSame(){
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Positive(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
}
