package megha_java;

public class printprog {

	public static void main(String s[])
	{
		int a = 10; 
		int b = 20;
		int c,d,e;
		b = a-- - --a;
	    c = a--;
	    d = a>>2;
		e = a&b;
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		System.out.println("C is "+c);
		System.out.println("D is "+d);
		System.out.println("E is "+e);
	}
}
