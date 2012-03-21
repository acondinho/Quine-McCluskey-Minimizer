import java.io.*;
import java.math.*;

public class QMMMain 
{
	public static void main(String[] args) 
	{
		// Print out greeting
		int maxNum = getInputs();
		
		//Create int array and read in ints
		int minTerms[];
		minTerms = gatherTerms(Math.pow(2.0, maxNum));
		
		//Create the tabData list and populate it
		tabData binList[] = new tabData[minTerms.length];
		for(int i = 0; i < minTerms.length; i++)
		{
			binList[i] = new tabData(maxNum, minTerms[i]);
		}
		
	}
	
	
	
	public static int getInputs()
	{
		int numInputs = 0;
		boolean validInput = false;
		
		while(!validInput)
		{
			//Try to read in the number of inputs;
			try
			{
				System.out.print("Enter the number of inputs: ");
				BufferedReader bfRead = new BufferedReader(new InputStreamReader(System.in));
				String inputs = bfRead.readLine();
				numInputs = Integer.parseInt(inputs);
				validInput = true;
				
				//validate integer
				if(numInputs < 1)
				{
					validInput = false;
				}
			}
				catch (NumberFormatException ex)
			{
				System.err.println("Not a valid number greater than 0");
				validInput = false;
			}
				catch (IOException e)
			{
				System.err.println("Unexpected IO Error: " + e);
				validInput = false;
			}
		}
		
		return numInputs;
	}
	
	public static int[] gatherTerms(double max)
	{
		int minReturn[] = new int[0];
		int i = 0;
		//use string type to hold input vars
		String minTerms = null;
		String tokens[];
		boolean validInput = false;
		
		while(!validInput)
		{
			try
			{
				System.out.println("Please enter the min terms, seperated by a space");
				BufferedReader bfRead = new BufferedReader(new InputStreamReader(System.in));
				minTerms = bfRead.readLine();
				tokens = minTerms.split("[ ]+");
				validInput = true;
				minReturn = new int[tokens.length];
				for(i = 0; i < tokens.length; i++)
				{
					minReturn[i] = Integer.parseInt(tokens[i]);
					if(minReturn[i] >= max)
					{
						System.out.println("Value out of range");
						validInput = false;
					}	
				}
			} 
				catch (NumberFormatException ex)
			{
				System.err.println("Not a valid number: " + minTerms);
				validInput = false;
			}
				catch (IOException e)
			{
				System.err.println("Unexpected IO Error: " + e);
				validInput = false;
			}
		}
		
		return minReturn;
	}
}
