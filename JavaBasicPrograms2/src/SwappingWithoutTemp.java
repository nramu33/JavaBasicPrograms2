
public class SwappingWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rajitha ";
		String s2="Kuppuru ";
		System.out.println("string values before swapping" + s1+"and"+s2);
		s1=s1+s2;//rajitha kuppuru 
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length(),s1.length());
		System.out.println("String values after swapping"+s1+"and"+s2);
		
		

	}

}
