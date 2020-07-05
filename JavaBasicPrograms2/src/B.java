import java.io.IOException;

public class B extends A {
	void methodA() throws IOException{
		System.out.println("method A from Class B");
		}
	void methodB(){
		System.out.println("method B");
		}
	static void s(){
		System.out.println("static method  from Class B");
	}
	private void p(){
		System.out.println("private method  from Class A");
	}
	public static void main(String[] args) throws Exception {
	A a1=new B();
	}

}
