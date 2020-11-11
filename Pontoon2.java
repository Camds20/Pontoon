package week5;

import java.util.Scanner;

public class Pontoon2 
{

	public static void main(String[] args) 
	{
		Scanner kboard = new Scanner(System.in);
		
		String choice;
		int card1 = 0;
		int card2 = 0;
		int newcard = 0;
		int total = 0;
		
		card1 = (int)(Math.random()*10) + 1;
		card2 = (int)(Math.random()*10) + 1;
		
		total = card1+card2;
		System.out.println("Player has drawn "+card1+" and "+card2+". Total value of cards is "+total+"");	
		
		System.out.println("Do you wish to draw another card? Y/N");
		choice = kboard.nextLine();
		
		while (choice.equalsIgnoreCase("y"))
		{
			newcard = (int)(Math.random()*10) + 1;
			System.out.println("Player has drawn a " +newcard);
			total = total + newcard;
			
			System.out.println("The total value of cards is " +total);
			
			System.out.println("Do you wish to draw another card? Y/N");
			choice = kboard.nextLine();
		}			
		if ( total >= 18 && total <= 21)
		{
			System.out.println("You have beaten the house and win nothing but pride!");
		}
		else
		{
			System.out.println("The House has won. Better luck next time!");
		}
		kboard.close();
	}
}
