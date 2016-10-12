/**
Mohammed Raza
CSC 162 - Lab6 # 3 (exception class 2)
*/

public class NegativePriceException extends Exception
{



	public NegativePriceException()
	{

		super("Error: Negative number given for the price");
	}

	public NegativePriceException(String strMessage)
	{
		super(strMessage);
	}


}
