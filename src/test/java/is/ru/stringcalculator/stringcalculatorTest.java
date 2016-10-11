package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test

public class StringCalculatorTest
{
	public static void main (String args[])
	{
		org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
	}
		
	@Test
	public void TestAddEmptyString()
	{
		assertEquals(0, stringcalculator.add(""));
	}

	@Test
	public void TestAddEmptyString()
	{
		assertEquals(1, stringcalculator.add("1"));
	}

	@Test
	public void TestAddEmptyString()
	{
		assertEquals(3, stringcalculator.add("1,2"));
	}

	@Test
	public void TestAddEmptyString()
	{
		assertEquals(-1, stringcalculator.add("xxx"));
	}

}