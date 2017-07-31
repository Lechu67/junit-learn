import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junitFirst.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

	static StringHelper helper; 
	private String input;
	private String expectedOutput;
	
	public StringHelperParametrizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}



	@BeforeClass
	public static void beforeHelper(){
		helper = new StringHelper();
	}
	
	
	
	@Parameters
	public static Collection<String[]> param(){
		String[][] param = {
				{"AACD", "CD"},
				{"ACD","CD"},	
				{"CDEF", "CDEF"},
				{"CDAA", "CDAA"}
		};
		return Arrays.asList(param);
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPosition() {
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
	}
}
