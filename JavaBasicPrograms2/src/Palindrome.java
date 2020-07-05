import java.util.Scanner;

public class Palindrome {
	static void checkPalindrome(){
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int temp=number;
	int sum=0,rem;
	while(number>0){
				rem=number%10;
				sum=(sum*10)+rem;
				number=number/10;
	}
	if(temp==sum){
		System.out.println(sum+ " is a palindrome");
	}
	else{
		System.out.println(sum+ " is  not apalindrome");
	}
	sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindrome();
	

	}

}
