import java.util.Scanner;

public class Armstrong {

	static void verifyArmstrong(){
		System.out.println("ENter a number :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0,rem;
		while(n>0){
			rem=n%10;
			sum=rem*rem*rem+sum;
			n=n/10;
		}
		if(temp==sum){
			System.out.println(temp+" is a armstrong number");
		}
		else{
			System.out.println(sum+" is not a armstrong number");
		}
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
verifyArmstrong();
	}

}
