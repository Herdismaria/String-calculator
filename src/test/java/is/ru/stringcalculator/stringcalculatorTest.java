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

	@Test
	public void TestAddFourString()
	{
		assertEquals(7, StringCalculator.add("1,2,3,1"));
	}

	@Test
	public void TestAddManyString()
	{
		assertEquals(10, StringCalculator.add("1,1,1,1,1,1,1,1,1,1"));
	}

	@Test
	public void TestAddOneNewLineString()
	{
		assertEquals(3, StringCalculator.add("1\n2"));
	}

	@Test
	public void TestAddBothNewLineAndCommaString()
	{
		assertEquals(6, StringCalculator.add("1,2\n3"));
	}

	@Test
	public void TestAddMultipleNewLineString()
	{
		assertEquals(6, StringCalculator.add("1\n2\n3"));
	}

	@Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void TestAddExceptionOneNumber() {
        thrown.expect(IllegalArgumentException.class);
        StringCalculator.add("-1");
    }









}