/* Structure for holding data related to the tabular method
 * of QM minimizing
 */

public class tabData 
{
	//Variables
	public int inputs;
	public int decValue;
	public int binValue[];
	public int groupID;
	
	//tabData Constructor
	public tabData()
	{
		inputs = 0;
		decValue = 0;
		groupID = 0;
		binValue = new int[0];
	}
	
	public tabData(int numIn, int dec)
	{
		inputs = numIn;
		decValue = dec;
		groupID = 0;
		
		//Call binary conversion method to calculate binValue and store it
		binValue = new int[numIn];
		binConv();
	}
	
	//tabData methods
	private static void binConv()
	{
		
	}
	
	
}