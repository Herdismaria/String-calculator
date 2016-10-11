package is.ru.stringcalculator;

public class StringCalculator 
{
	public static int add(String numbers)
	{
		if (numbers == "")
		{
			return 0;
		}
		else if (numbers.contains(","))
		{
			return getsum(numbers);
		}
		else
		{
			return Integer.parseInt(numbers);
		}
	}

	public static int getsum(String numbers)
	{
		String[] num = numbers.split(",");
		int sum = 0;

		for (int i = 0; i < num.length; i++)
		{
			sum += Integer.parseInt(num[i]);
		}

		return sum;
	}
} 