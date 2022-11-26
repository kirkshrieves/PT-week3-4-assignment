package week03;

public class Assignment {

	public static void main(String[] args) {
						
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93..
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
							System.out.println("Question 1a ------------------------------------------------------------------------------");
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
			System.out.println(ages[0] - ages[ages.length - 1]);
							System.out.println("Question 2b ------------------------------------------------------------------------------");
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93, 42};
			System.out.println(ages[0] - ages1[ages1.length - 1]);
							System.out.println("Question 3c ------------------------------------------------------------------------------");
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			double ageSum = 0;
			for(int a : ages)
			{
				ageSum += a;
			}
			System.out.println(ageSum/ages.length);
							System.out.println("Question 2a ------------------------------------------------------------------------------");
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			double lettersAvg = 0;
			for(int i = 0; i < names.length; i++)
			{
				lettersAvg += names[i].length();
			}
			System.out.println(lettersAvg/names.length);
							System.out.println("Question 2b ------------------------------------------------------------------------------");
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String printNames = "";
			for(int i = 0; i < names.length; i++)
			{
				printNames = printNames.concat(names[i] + " ");
			}
			System.out.println(printNames);
							System.out.println("Question 3 ------------------------------------------------------------------------------");
//		3.	How do you access the last element of any array?
			System.out.println(names[names.length - 1]);
							System.out.println("Question 4 ------------------------------------------------------------------------------");
//		4.	How do you access the first element of any array?
			System.out.println(names[0]);
							System.out.println("Question 5 ------------------------------------------------------------------------------");
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			int [] nameLengths = new int [names.length];
			
			for(int i = 0; i < names.length; i++)
			{
				nameLengths[i] = names[i].length();
			}
			for(int i : nameLengths)
			{
				System.out.println(i);
			}
							System.out.println("Question 6 ------------------------------------------------------------------------------");
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			int letters = 0;
			for(int i : nameLengths)
			{
				letters += i;
			}
			System.out.println(letters);
							System.out.println("Question 7 ------------------------------------------------------------------------------");
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			System.out.println(together("Hello", 3));
							System.out.println("Question 8 ------------------------------------------------------------------------------");
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			String firstName = "Steve";
			String lastName = "Carell";
			System.out.println(fullName(firstName, lastName));
							System.out.println("Question 9 ------------------------------------------------------------------------------");
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			int [] numbers = {12, 25, 6, 32, 22, 39, 10};
			System.out.println(greaterThan100(numbers));
							System.out.println("Question 10 ------------------------------------------------------------------------------");
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
			double [] numberArr = {9, 15, 20, 33, 98, 54};
			System.out.println(averageNumber(numberArr));
							System.out.println("Question 11 ------------------------------------------------------------------------------");
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			double[] sum1 = {5, 9, 12, 4, 19, 32};
			double[] sum2 = {9, 5, 7, 2, 15, 10};
			System.out.println(averageOfTwoArrays(sum1, sum2));		
							System.out.println("Question 12 ------------------------------------------------------------------------------");
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			boolean hotOutside = true;
			double cashOnHand = 11.10;
			System.out.println(willBuyDrink(hotOutside, cashOnHand));
							System.out.println("Question 13 ------------------------------------------------------------------------------");
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			//This is a fairly common repair question I run into in my job and creating this method (final result would be a Scanner type) would quickly allow my service advisor to answer
			//a clients question about whether it's absolutely necessary to replace their brakes if the brake pad measurements are above the legal limit and if their budget allows it
			System.out.println("True or false, can I repair my car?");
			int brakePadDepth = 2; //measured in millimeters
			double [] partsAndLaborCostsEach = {56.45, 320.00, 265.78, 15.45, 120.50}; //currency in USD
			boolean healthyCar = fixCar(brakePadDepth, partsAndLaborCostsEach);
			System.out.println(healthyCar);
			double sum = 0;
			for(double i : partsAndLaborCostsEach) {
				sum += i;
			}
			if(healthyCar == true){
				System.out.println("Your total bill is $" + sum);
				}

	}
	//question 7 method
	public static String together(String x, int y)
	{
		return x.repeat(y);
	}
	//question 8 method
	public static String fullName(String x, String y)
	{
		return x + " " + y;
	}
	//question 9 method
	public static boolean greaterThan100(int[]x)
	{
		int sum = 0;
		for(int i : x)
		{
			sum += i;
		}
		if(sum >= 100)
		{
			return true;
		}
		
		return false;
	}
	//question 10 method
	public static double averageNumber(double[]x)
	{
		double sum = 0;
		for(double i : x)
		{
			sum += i;
		}
		return sum/x.length;
	}
	//question 11 method
	public static boolean averageOfTwoArrays(double[]x, double[]y)
	{
		double sum1 = 0;
		double sum2 = 0;
		for(double i : x)
		{
			sum1 += i;
		}
		for(double i : y)
		{
			sum2 += i;
		}
		if(sum1/x.length > sum2/y.length)
		{
			return true;
		}
		return false;
	}
	//question 12 method
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket)
	{
		if(isHotOutside == true && moneyInPocket >= 10.50)
		{
			return true;
		}
		return false;
	}
	//question 13 method
	public static boolean fixCar(int brakePadDepth, double [] itemizedCosts) {
		
		double sum = 0;
		for(double a : itemizedCosts) {
			sum += a;
			}
		if(brakePadDepth <=3 && sum <=1000.00) {
			return true;
			}
		else if (brakePadDepth > 3) {
			System.out.println("You have good enough pad life to not need brake pads and rotors this visit.");
			return false;
			}
		else if (sum >1000.00) {
			System.out.println("You need $" + (sum - 1000.00) + " more to afford your repairs.");
			return false;
		}
		return false;
	}
}


