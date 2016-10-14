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
		    if (Integer.parseInt(numbers) < 0)
		    {
		       throw new IllegalArgumentException(("Negatives not allowed: "+ Integer.parseInt(numbers)));
		    }
		    else if ( Integer.parseInt(numbers) > 1000)
		    {
		    	return 0;
		    }
		    else
		    {
				return Integer.parseInt(numbers);
		    }
		}
	}

	public static int GetSum(String numbers)
	{
		String[] nums = numbers.split(",|\\n");
		String msg = "Negatives not allowed: ";
		int msglength = msg.length();
		System.out.println(msglength);
		int count = 0;

		for (int i = 0; i < nums.length; i++)
		{
			if (Integer.parseInt(nums[i]) < 0)
			{
				if (count > 0)
				{
					msg += ",";
				}
				msg += (nums[i]);
				count++;
			}
		}

        System.out.println(msg.length());
		if (msg.length() > msglength)
		{
			throw new IllegalArgumentException(msg);
		}
		return Sum(nums);
	}

	public static int Sum(String[] numbers)
	{
		int sum = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if (Integer.parseInt(numbers[i]) < 1001)
			{
				sum += Integer.parseInt(numbers[i]);
			}
		}
		return sum;
	}

} 