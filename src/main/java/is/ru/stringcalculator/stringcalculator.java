package is.ru.stringcalculator;

public class StringCalculator 
{
	public static int add(String numbers)
	{
		if (numbers == "")
		{
			return 0;
		}
		else 
		{
			return GetSum(numbers);
		}
	}

	public static int GetSum(String numbers)
	{
		String delim;
		String[] nums; 
		if (numbers.charAt(0) == '/')
		{
			delim = Character.toString(numbers.charAt(2));
			nums = numbers.substring(4).split(delim);
		}
		else 
		{
			delim = ",|\\n";
			nums = numbers.split(delim);
		}

		CheckForNegatives(nums);
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

	public static void CheckForNegatives(String[] numbers)
	{
		String msg = "Negatives not allowed: ";
		int msglength = msg.length();
		System.out.println(msglength);
		int count = 0;

		for (int i = 0; i < numbers.length; i++)
		{
			if (Integer.parseInt(numbers[i]) < 0)
			{
				if (count > 0)
				{
					msg += ",";
				}
				msg += (numbers[i]);
				count++;
			}
		}

        System.out.println(msg.length());
		if (msg.length() > msglength)
		{
			throw new IllegalArgumentException(msg);
		}
		else return;
	}

} 