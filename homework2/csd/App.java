package csd;

class App {
	public static void main(String [] args)
	{
		MidTest.run();
	}
}

class MidTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Birinci sayıyı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("İkinci sayıyı giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			
			System.out.print("Üçüncü sayıyı giriniz:");
			int c = Integer.parseInt(kb.nextLine());
			
			System.out.printf("mid(%d, %d, %d) = %d%n", a, b, c, NumberUtil.mid(a, b, c));
			
			if (a == 0 && b == 0 && c == 0) {
				return;
			}
		}
	}
}

class NumberUtil {
	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if (b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
	}
}