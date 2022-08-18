import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mail Id :");
		String mailid=sc.nextLine();
		try
		{
		  if(!mailid.contains("."))
			 throw new InvalildMailIdException("Mail id should have .");
		  if(!mailid.contains("@"))
				 throw new InvalildMailIdException("Mail id should have @");
		  System.out.println("Correct Mail Id...");
		}
		catch(InvalildMailIdException ie)
		{
			
			System.out.println(ie);
		}
		   
		
	
   }

}
