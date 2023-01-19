package csd;

class App {
	public static void main(String [] args)
	{
		SignumTest.run();
	}
}

class SignumTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.printf("signum(%d) = %d%n", a, NumberUtil.signum(a));
			
			if (a == 0) {
				System.out.println("Progrma sonu?");
				return;
			}
		}
	}
}

class NumberUtil {
	public static int signum(int a)
	{
		int result = -1;
		
		if (a > 0)
			result = 1;
		else if (a == 0)
			result = 0;
		
		return result;
	}
}