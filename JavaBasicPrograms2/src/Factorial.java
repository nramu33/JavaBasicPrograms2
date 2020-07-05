
public class Factorial {
	static void factorial(int n){
		int sum=1;
		while(n>0){
			sum=sum*n;
			n=n-1;
			
		}
		System.out.println("factorial: "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
factorial(5);
	}

}
