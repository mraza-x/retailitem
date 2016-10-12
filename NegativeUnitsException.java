/**
Mohammed Raza
CSC 162 - Lab6 # 3 (exception class 1)
*/

public class NegativeUnitsException extends Exception
{



	public NegativeUnitsException()
	{

		super("Error: Negative number given for the units");
	}

	public NegativeUnitsException(String strMessage)
	{
		super(strMessage);
	}


}
