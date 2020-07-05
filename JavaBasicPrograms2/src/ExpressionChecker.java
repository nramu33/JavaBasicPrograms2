import java.util.Stack;

public class ExpressionChecker 
{
	public static void main(String[] args) 
	{
		String str="((a+b)+d*3)/((e+f)-(a-b))";
		if (isValidExpression(str))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced "); 
	}
  
	static boolean isValidExpression(String s)
	{
		char[] exp=s.toCharArray();

	Stack<Character> st=new Stack<Character>();
	for(int i=0;i<exp.length;i++)
	{
		if (exp[i] == '(') 
			st.push(exp[i]);
		
		if (exp[i] == ')')
		{
			if (st.isEmpty())
				return false;
			else if ( !isMatchingPair(st.pop(), exp[i]) ) 
				return false;
		}
		
	}
	
	if (st.isEmpty()) 
		return true; 
	else 
		return false;
		}  
	
	static boolean isMatchingPair(char ch1, char ch2)
	{
	if (ch1 == '(' && ch2 == ')')
		return true;
	else
		return false;
	}


}
