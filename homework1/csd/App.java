package csd;

class App {
	public static void main(String [] args)
	{
		PrintRelationsApp.run();
	}
}

class PrintRelationsApp {
	public static void printRelations(int a, int b, int c)
	{
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - min - max;
		
		if (min < mid)
			System.out.printf("%d < %d ", min, mid);
		else
			System.out.printf("%d = %d ", min, mid);
		
		if (mid < max)
			System.out.printf("< %d%n", max);
		else
			System.out.printf("= %d%n", max);
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Üç tane sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		printRelations(a, b, c);	
	}
}