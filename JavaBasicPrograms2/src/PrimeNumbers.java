import java.util.Scanner;

//import javax.swing.plaf.synth.SynthSeparatorUI;

public class PrimeNumbers {

	/*public static void main(String[] args){
		System.out.println("Enter a positive integer");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int rem=0;
		int count=0;
		boolean isPrime=true;
		if(n<2){
			System.out.println(n+" is not a Prime Number");
		}
		else if (n==2){
			System.out.println("2 is a Even Prime Number");
		}
		else{
			for(int i=2;i<n;i++){
				rem=n%i;
				if (rem==0){
					count++;
					break;
				}				
			}
		if(count==0)
			System.out.println(n+"  is a Prime Number");
		else
			System.out.println(n+"  is a Prime Number");
			
		}
	
	}*/
	static void checkPrime(int n){
//		System.out.println("Enter a number : ");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
	int rem;
		rem=n/2;
		int flag=0;
		if(n==0 || n==1){
			//System.out.println(n+" is not a prime number");
			flag=1;
			
		}
		else{
		for(int i=2;i<=rem;i++){
			if(n%i==0){
				//System.out.println(n + " is not a prime number");
				flag=1;
				break;
				
			}
			
		}
			}
		if(flag==0){
			System.out.println(n + " is a prime number");
		}
	
		
	}
	public static void main(String[] args){
		System.out.println("Enter Starting number");
		Scanner sc=new Scanner(System.in);
		int start= sc.nextInt();
		System.out.println("Enter Ending number");
		Scanner sc1=new Scanner(System.in);
		int end=sc1.nextInt();
		for(int i=start;i<=end;i++){
		checkPrime(i);
		}
		sc.close();
		sc1.close();
	}

}
