package abstraciton;

interface ElectronicsInterface{
	public void powerOn();
	
}

class Lap implements ElectronicsInterface{
	@Override
	public void powerOn() {
		System.out.println("Power On:interface class-lap");
	}
}

class Phone implements ElectronicsInterface{
	@Override
	public void powerOn() {
		System.out.println("Power On:interface class-phone");
	}
}
public class Interface {

	public static void main(String[] args) {
		
			Lap lap=new Lap();
			lap.powerOn();
			Phone phone=new Phone();
		    phone.powerOn();
		}

	}



