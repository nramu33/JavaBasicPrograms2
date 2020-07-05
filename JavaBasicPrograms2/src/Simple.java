import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;  
  
class Simple{  
	
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21)); 

TreeSet ts = new TreeSet();
ts.add("Raja");
ts.add("Anil");
ts.add("Animesh");
ts.add("Amit");
  System.out.println(ts);
System.out.println("Sorting by Name...");  
  try {
	Simple s = (Simple) Class.forName("Simple").newInstance();
} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Collections.sort(al,new NameComparator());  
Iterator itr=al.iterator();
while(itr.hasNext()){
Student st=(Student)itr.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("sorting by age...");  
  
Collections.sort(al,new AgeComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student st=(Student)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
  
}  
}  