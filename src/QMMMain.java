import java.io.*;

public class QMMMain 
{
	public static void main(String[] args) 
	{
		// Print out greeting
		int maxNum = getInputs();
		
		//Create int array and read in ints
		int minTerms[];
		minTerms = gatherTerms();
		
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
		
		//Try to read in the number of inputs;
		try
		{
			System.out.print("Enter the number of inputs: ");
			BufferedReader bfRead = new BufferedReader(new InputStreamReader(System.in));
			String inputs = bfRead.readLine();
			numInputs = Integer.parseInt(inputs);
		}
			catch (NumberFormatException ex)
		{
			System.err.println("Not a valid number: " + numInputs);
		}
			catch (IOException e)
		{
			System.err.println("Unexpected IO Error: " + e);
		}
		
		return numInputs;
	}
	
	public static int[] gatherTerms()
	{
		int minReturn[] = new int[0];
		int i = 0;
		//use string type to hold input vars
		String minTerms = null;
		String tokens[];
		try
		{
			System.out.println("Please enter the min terms, seperated by a space");
			BufferedReader bfRead = new BufferedReader(new InputStreamReader(System.in));
			minTerms = bfRead.readLine();
			tokens = minTerms.split("[ ]+");
			
			minReturn = new int[tokens.length];
			for(i = 0; i < tokens.length; i++)
			{
				minReturn[i] = Integer.parseInt(tokens[i]);
			}
			
			//Echo inputs *testing only*
			for(i = 0; i < minReturn.length; i++)
			{
				System.out.print(minReturn[i] + " ");
			}
		} 
			catch (NumberFormatException ex)
		{
			System.err.println("Not a valid number: " + minTerms);
		}
			catch (IOException e)
		{
			System.err.println("Unexpected IO Error: " + e);
		}
		
		return minReturn;
	}
}
