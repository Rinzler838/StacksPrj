package stacks.controller;

import java.awt.Color;
import java.util.Scanner;
import java.util.Stack;
import stacks.model.Dish;

public class StackController
{
	private Stack<Dish> dishStack;
	private Scanner stackScanner;
	
	public StackController()
	{
		dishStack = new Stack<Dish>();
		stackScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("What would you like to do? Type \"push\", \"pop\", or \"peek\"...");
		String answer = stackScanner.next();
		if (answer.equalsIgnoreCase("push"))
		{
			System.out.println("Is your plate dirty? Type \"true\" or \"false\"...");
			boolean isDirty = stackScanner.nextBoolean();
			
			System.out.println("What color is your plate?");
			String userColor = (stackScanner.next());
			Color plateColor = Color.getColor(userColor);
			
			System.out.println("What is the radius of your plate? Type an integer...");
			int radius = stackScanner.nextInt();
			
			Dish newDish = new Dish(isDirty, plateColor, radius);
			dishStack.push(newDish);
			start();
		}
		else if (answer.equalsIgnoreCase("pop"))
		{
			dishStack.pop();
			start();
		}	
		else if (answer.equalsIgnoreCase("peek"))
		{
			System.out.println(dishStack.peek());
			start();
		}
		else if (answer.equalsIgnoreCase("exit"))
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Incorrect input");
		}
	}
}
