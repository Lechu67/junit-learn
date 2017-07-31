import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayCompareTest.class, QuickBeforeTest.class, StringHelperParametrizedTest.class,
		StringHelperTest.class })
public class AllTests {

}
