import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junitFirst.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest2ndMethod {

	StringHelper helper = new StringHelper(); 
	private String input;
	private boolean expectedOutput;
	
	
	
	public StringHelperParametrizedTest2ndMethod(String input, boolean expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> paramForTest(){
		
		Object[][] param = {
				{"ABCD", false},
				{"AB", true},
				{"ABERETETEEREAB", true}
		};
		
		return Arrays.asList(param);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NotSame(){
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	 @Test
	    public void testAreFirstAndLastCharactersTheSame_basicTrueScenario() {
	        assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	    }
}
