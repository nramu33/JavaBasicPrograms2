import java.util.*;
class StringImmutable{  
 public static void main(String args[]) throws ClassNotFoundException{  
	 ArrayList<String> al=new ArrayList<String>();  
	 al.add("Viru");  
	 al.add("Saurav");  
	 al.add("Mukesh");  
	 al.add("Tahir");  
	   
	 Collections.sort(al);  
	 Iterator itr=al.iterator();  
	 while(itr.hasNext()){  
	 System.out.println(itr.next());  
	  }  
 }  
}  