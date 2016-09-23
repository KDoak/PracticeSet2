package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isEvenTest() { //Tests all even methods.
		MyInteger aInt = new MyInteger(4);
		boolean EXPECTED1 = true;
		boolean ACTUAL1 = MyInteger.isEven(aInt);
		assertEquals(EXPECTED1,ACTUAL1);
		MyInteger aInt2 = new MyInteger(5);
		boolean EXPECTED2 = false;
		boolean ACTUAL2 = MyInteger.isEven(aInt2);
		assertEquals(EXPECTED2,ACTUAL2);
	}
	@Test
	public void isOddTest() { //Tests all odd methods.
		MyInteger bInt = new MyInteger(5);
		boolean EXPECTED1 = true;
		boolean ACTUAL1 = MyInteger.isOdd(bInt);
		assertEquals(EXPECTED1,ACTUAL1);
		MyInteger bInt2 = new MyInteger(4);
		boolean EXPECTED2 = false;
		boolean ACTUAL2 = MyInteger.isOdd(bInt2);
		assertEquals(EXPECTED2,ACTUAL2);
	}
	@Test
	public void isPrimeTest() { //Tests all prime methods.
		MyInteger cInt = new MyInteger(7);
		boolean EXPECTED1 = true;
		boolean ACTUAL1 = MyInteger.isPrime(cInt);
		assertEquals(EXPECTED1,ACTUAL1);
		MyInteger cInt2 = new MyInteger(6);
		boolean EXPECTED2 = false;
		boolean ACTUAL2 = MyInteger.isPrime(cInt2);
		assertEquals(EXPECTED2,ACTUAL2);
	}
	@Test
	public void isEqualsTest() { //Tests all equals methods.
		int EQUALS_TESTER = 7;
		MyInteger dInt = new MyInteger(7);
		int testForGetter = dInt.getiValue();
		boolean EXPECTED1 = true;
		boolean ACTUAL1 = dInt.equals(EQUALS_TESTER);
		assertEquals(EXPECTED1,ACTUAL1);
		MyInteger dInt2 = new MyInteger(6);
		boolean EXPECTED2 = false;
		boolean ACTUAL2 = dInt2.equals(EQUALS_TESTER);
		assertEquals(EXPECTED2,ACTUAL2);
		MyInteger dInt3 = new MyInteger(7);
		boolean ACTUAL3 = dInt3.equals(dInt.getiValue());
		assertEquals(EXPECTED1,ACTUAL3);
}
	
	
}