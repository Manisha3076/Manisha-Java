import java.util.Scanner;

public class TestException {

	
	
	static void validateAge(int age) throws DemoException
	{
		
		 if(age<18)
			  throw new DemoException("Not eligible for voting");
		 else
			 System.out.println("Eligible for voting");
	}
	
	public static void main(String[] args)  {
		
		try
		{
			validateAge(10);
		}
		catch(DemoException de)
		{
			System.out.println(de);
		}
		finally
		{
			
			System.out.println("Finally....");
		}
		
	       
	}

}
