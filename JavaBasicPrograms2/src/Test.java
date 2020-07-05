public class Test extends A {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class cls=Class.forName("Test");
		Test t= (Test) cls.newInstance();
		System.out.println(t.getClass());
			}
	public static String reverse(String st){
		String sb= new StringBuilder(st).reverse().toString();
		return sb;
		
	}
	  public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	            return str;
	        }

	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }

}
