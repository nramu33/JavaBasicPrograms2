import java.util.Scanner;

public class PrimeNumbers2 {
	public static void main(String[] args){		
	System.out.println("Enter a positive integer");
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(isPrimeNumber(n)?n+" is a prime number":n+" is not a prime number");
	s.close();
	}
	public static boolean isPrimeNumber(int number) { 
		if (number == 2 || number == 3) { 
			return true; }
		if (number % 2 == 0) { 
			return false; 
			} 
		int sqrt = (int) Math.sqrt(number) + 1; 
		System.out.println(sqrt);
		for (int i = 3; i < sqrt; i += 2) {
			if (number % i == 0) {
				return false;
				} 
			}
		return true; 
		}
}
