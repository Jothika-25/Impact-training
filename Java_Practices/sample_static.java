package Java_Practices;

public class sample_static {
	static int count=0;
	static {
		System.out.println("Sample static ");
	}
	public sample_static() {
		count++;
	}

	public static void main(String[] args) {
	
		String StringInteger = "250";
        Integer parsedInt = Integer.parseInt(StringInteger);  
        System.out.println("Parsed integer: " + parsedInt);
	}
}
