import java.text.DecimalFormat;
import java.util.Scanner;

public class memorySizeCalculator {

	public static String memorySize(String input)
	{
		String output = "";
		if(input.contains("GB"))
		{
			input = input.replaceAll("GB", "");
			double memoryAmount = Double.parseDouble(input);
			memoryAmount *= 0.93;
			DecimalFormat f = new DecimalFormat("##.00");
			output += f.format(memoryAmount);
			if(memoryAmount < 1.0)
			{
				output += "MB";
			}
			else
			{
			output += "GB";
			}
		}else if(input.contains("MB"))
		{
			input = input.replaceAll("MB", "");
			double memoryAmount = Double.parseDouble(input);
			memoryAmount *= 0.93;
			DecimalFormat f = new DecimalFormat("##.00");
			output += f.format(memoryAmount);
			output += "MB";
		}else
		{
			return "invalid input";
		}
		return output;
	}
	
	
	public static void main(String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input Memory Amount");
		System.out.println(memorySize(input.nextLine()));
		input.close();
		
		
	}
	
}
