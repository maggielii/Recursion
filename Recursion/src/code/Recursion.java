package code;

public class Recursion {

	public static void sayHello(int number)
	{
		System.out.println("Hello");
		if(number > 1)
			sayHello(number - 1);
	}
	public static void main(String[] args) {
		
		sayHello(5);

	}

}
