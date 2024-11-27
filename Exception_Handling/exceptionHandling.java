package Exception_Handling;

public class exceptionHandling {

	public static void main(String[] args) {
		int number1 =10;
		int number2= 0;
		int result =0;
		
		try {
		   result = number1/number2;
		}
		catch(Exception error) {
			System.err.println("It's me Error");
		}
		
	
		System.out.println("Result: "+result);
		System.out.println("End of execution");
	}

}

