
public class StringBufferMethods {

	  
		public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello");  
		sb.replace(1,5,"Java");  
		System.out.println(sb);//prints HJava 
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append(" Rajitha");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		sb1.insert(1,"java");
		System.out.println(sb1);
		sb1.delete(0, 5);
		System.out.println(sb1);
		sb1.capacity();
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(25);
		System.out.println(sb1.capacity());
		}  
		}  