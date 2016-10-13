package is.ru.stringcalculator;

public class StringCalculator 
{
	public static int add(String numbers)
	{
		if (numbers == "")
		{
			return 0;
		}
		else if (numbers.contains(",") || numbers.contains("\n"))
		{
			return GetSum(numbers);
		}
		else
		{
			return Integer.parseInt(numbers);
		}
	}

	public static int GetSum(String numbers)
	{
		String[] nums = numbers.split(",|\\n");
		return Sum(nums);
	}

	public static int Sum(String[] numbers)
	{
		int sum = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			sum += Integer.parseInt(numbers[i]);
		}
		return sum;
	}

} 