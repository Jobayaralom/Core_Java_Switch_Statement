package Exercise_2;

import java.util.Scanner;

public class Day_of_the_week {

	public static void main(String[] args) {
	
		System.out.println("Input a valid Integer (1-7) PLEASE!!! :-");
		
		Scanner userInput = new Scanner (System.in);
		int dayName = userInput.nextInt();
		userInput.close();
		
		dayOfTheWeek (dayName);
			
	}
	static void dayOfTheWeek (int dayName) {
		String nameOfTheDay = "";
		switch(dayName) {
		
		case 1: 
			nameOfTheDay = "Monday";
			break;
		case 2: 
			nameOfTheDay = "Tuesday";
			break;
		case 3: 
			nameOfTheDay = "Wednesday";
			break;
		case 4: 
			nameOfTheDay = "Thursdday";
			break;
		case 5: nameOfTheDay = "Friday";
			break;
		case 6: 
			nameOfTheDay = "Saturday";
			break;
		case 7: 
			nameOfTheDay = "Sunday";
			break;
		default:
			nameOfTheDay = "Invalid Input, Enter a Correcct Number of the Day ( 1 - 7)";
			
	}
		
		System.out.println(nameOfTheDay);
	}
	
	
	
	
}
