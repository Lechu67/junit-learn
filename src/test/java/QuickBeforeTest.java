import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeTest {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
	}
	@Before
	public void setUp(){
		System.out.println("Before");
	}
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}
	
	@After
	public void tearDown(){
		System.out.println("After");
	}

}
