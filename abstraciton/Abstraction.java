package abstraciton;


abstract class Bank{
	abstract public void credit();
	
	public void customerDetails() {
		System.out.println("hi Mani");
	}
}

class Child extends Bank{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
	

	}

}
