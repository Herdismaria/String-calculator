package is.ru.stringcalculator;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class StringCalculatorTest
{
	public static void main (String args[])
	{
		org.junit.runner.JUnitCore.main("is.ru.stringcalculator.stringcalculatorTest");
	}
		
	@Test
	public void TestAddEmptyString()
	{
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void TestAddESingleNumber()
	{
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void TestAddTwoNumbers()
	{
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void TestAddThreeNumbers()
	{
		assertEquals(6, StringCalculator.add("1,2,3"));
	}

	@Test
	public void TestAddFourNumbers()
	{
		assertEquals(7, StringCalculator.add("1,2,3,1"));
	}

	@Test
	public void TestAddManyNumbers()
	{
		assertEquals(10, StringCalculator.add("1,1,1,1,1,1,1,1,1,1"));
	}

	@Test
	public void TestAddOneNewLine()
	{
		assertEquals(3, StringCalculator.add("1\n2"));
	}

	@Test
	public void TestAddBothNewLineAndComma()
	{
		assertEquals(6, StringCalculator.add("1,2\n3"));
	}

	@Test
	public void TestAddMultipleNewLine()
	{
		assertEquals(6, StringCalculator.add("1\n2\n3"));
	}

	@Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void TestAddExceptionOneNegNumber() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negatives not allowed: -1");
        StringCalculator.add("-1");
    }

    @Test
    public void TestAddExceptiontwoNegNumber() 
    {
    	thrown.expect(IllegalArgumentException.class);
    	thrown.expectMessage("Negatives not allowed: -1,-3");
        StringCalculator.add("-1,-3,3,2,3");
    }

    @Test
	public void TestAddNotLargeNumber()
	{
		assertEquals(1002, StringCalculator.add("1000,2"));
	}

	@Test
	public void TestAddLargeNumber()
	{
		assertEquals(2, StringCalculator.add("1001,2"));
	}

	@Test
	public void TestAddOneLargeNumber()
	{
		assertEquals(0, StringCalculator.add("1001"));
	}

	@Test
	public void TestAddDeilimiterOne()
	{
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}

	@Test
	public void TestAddDeilimiterTwo()
	{
		assertEquals(6, StringCalculator.add("//a\n1a2a3"));
	}

}