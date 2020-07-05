import java.util.Scanner;

public class Fibanocci {

	/*public static void main(String[] args) {
		System.out.println("Enter the range: ");
		Scanner s= new Scanner(System.in);
		int r=s.nextInt();
		int sum=0,num1=0,num2=1;
		if (r>0){
			System.out.println("Super ra Bobjy");
			System.out.println(sum);
		for (int i=1;i<r;i++){	
			sum=num1+num2;
			num1=num2;
			num2=sum;			
	//		System.out.println("num1="+num1);
			System.out.println(num1);
		}
	}
		else
			System.out.println("Zero kante ekkuva range ivvu be");
			
	}*/
	
	public static void main(String[] args){
		int a1=0;
		int a2=1;
		int sum;
		System.out.println("Enter Range:");
		Scanner sc= new Scanner(System.in);
		int range=sc.nextInt();
		System.out.print(a1+" "+a2);
		for(int i=2;i<range;++i){
			sum=a1+a2;
			a1=a2;
			a2=sum;
			System.out.print(" "+a2);
			
		}
		sc.close();
	}

}
