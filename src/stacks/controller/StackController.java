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
		if (stackScanner.nextLine() == "push")
		{
			System.out.println("Is your plate dirty? Type \"true\" or \"false\"...");
			boolean isDirty = stackScanner.nextBoolean();
			
			System.out.println("What color is your plate?");
			String userColor = (stackScanner.nextLine());
			Color plateColor = null;
			try
			{
				plateColor = (Color) Color.class.getField(userColor).get(null);
			}
			catch (IllegalArgumentException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IllegalAccessException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (NoSuchFieldException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SecurityException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("What is the radius of your plate? Type an integer...");
			int radius = stackScanner.nextInt();
			
			Dish newDish = new Dish(isDirty, plateColor, radius);
			dishStack.push(newDish);
		}
		else if (stackScanner.nextLine() == "pop")
		{
			dishStack.pop();
		}	
		else if (stackScanner.nextLine() == "peek")
		{
			System.out.println(dishStack.peek());
		}
	}
}
