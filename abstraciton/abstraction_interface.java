package abstraciton;


abstract class Electronics{
	public abstract void powerOn();
	
	public void powerOff() {
		System.out.println("Power Off");
	}
}

class Laptop extends Electronics{
	@Override
	public void powerOn() {
		System.out.println("Power On:Abstract class-lap");
	}
}

class SmartPhone extends Electronics{
	@Override
	public void powerOn() {
		System.out.println("Power On:Abstract class-phone");
	}
}
public class abstraction_interface {

	public static void main(String[] args) {
		
		Laptop lap=new Laptop();
		lap.powerOn();
		SmartPhone phone=new SmartPhone  ();
		phone.powerOn();
		
		lap.powerOff();
		phone.powerOff();
	
	}

}
