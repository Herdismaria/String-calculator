package is.ru.stringcalculator;

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
	public void TestAddESingleString()
	{
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void TestAddTwoString()
	{
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void TestAddThreeString()
	{
		assertEquals(6, StringCalculator.add("1,2,3"));
	}
}