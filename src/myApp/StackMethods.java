package myApp;
import java.util.*;

public class StackMethods 
{
	int maxSize; //to see maximum size of stack
	int top; //see where the last element of the stack is 
	String arr[]; // String array to store the data
	
	public StackMethods(int n)  //size of the stack 
	{
		maxSize = n;
		arr = new String[maxSize];
		top = 0; //index for putting elements in the array

	}
	
	
	public boolean empty() //check if stack is empty as we move through the array
	{
		if (top == 0)
		{
			return true; //more elements in stack
		}
		else {
			return false; //no elements in stack
		}
	}
	
	
	public void push(String str) //push element
	{
		if (top < maxSize) //make sure not to go outside the stack size
		{arr[top] = str; //
		top ++; //increase elements dynamically by one to index
		}
	else 
	{
		
	System.out.println("Bummer, stack overflow!");
	}
		
	}
		
	public String pop()	//pop elements until last
	{	
		if (!this.empty()) //can only retrieve if stack is empty, so check
		{
		String temp = this.peek(); //create temp var. same code as peek
		arr[top -1] = null; //access array at last element. Top -1 == null
		top --; //decrease by 1
		return temp; //return temp var. Can now see what last element in stack was.
		}
		else {
			return null;
		}
	}
	
	public String peek() //see element at top of stack
	{	
		if (!this.empty())
		{
		return arr[top -1];  //return last element added to stack. Because 1 -1 is the 1st index 0
	
	}else {
		return null;
	}
	
	}
	
}//end class
