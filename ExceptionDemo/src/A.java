import java.io.IOException;

public class A {
	
	public void msg()  throws ArithmeticException
	{
		System.out.println("In class A...");
	}

}

class B extends A
{
    public void msg() throws ArithmeticException
    {
    	System.out.println("In class A...");
    	
    }
}
