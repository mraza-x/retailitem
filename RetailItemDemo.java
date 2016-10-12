import java.util.*;

/**
  Mohammed Raza
  CSC 162 - Lab6 # 3 (main)
*/

public class RetailItemDemo
{
   public static void main(String[] args)
   {

	   Scanner console = new Scanner(System.in);

	   String description;
	   int units = 0;
	   double price = 0.0;

	   boolean done;
	   String str1 = " ";
	   String str2 = " ";

	   done = false;



	   System.out.print("Item description: ");
	   description = console.nextLine();

	   do
	   {
		   try
		   {

	   			System.out.print("Units on hand: ");
	   			units = console.nextInt();

	   			done = true;

	   			if (units < 0)

	   				throw new NegativeUnitsException();

			}


		    catch (NegativeUnitsException ref1)
		    {

				System.out.println("Error: " + ref1.toString());
				System.out.print("Units on hand: ");
				str1 = console.next();

			}

		} while (!done);



	   do
	   {
		   try
		   {

	   			System.out.print("Item price: ");
	   			price = console.nextDouble();

	   			done = true;

	   			if (price < 0.0)

	   				throw new NegativePriceException();
			}


		    catch (NegativePriceException ref2)
		    {


				System.out.println("Error: " + ref2.toString());
				System.out.print("Item Price: ");
				str2 = console.next();
			}

		} while (!done);



		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Item description: " + description);
	    System.out.println("Units on hand: " + str1);
		System.out.println("Item price: " + str2);


   }
}
