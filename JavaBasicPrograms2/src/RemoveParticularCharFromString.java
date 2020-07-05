
public class RemoveParticularCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rajitha ";
		System.out.println(CharRemoveAt(4,s1));
	}
	public static String CharRemoveAt(int p,String s) {
		s=s.substring(0,p)+s.substring(p+1,s.length());
		return s;
		
	}
}
