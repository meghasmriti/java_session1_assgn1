package megha_java;

public class addnumber {
	public static void main(String s[])
	{
		int a =10, b =20, sum;
		add ad = new add();
		sum =ad.addnum(a, b);
		System.out.println("The sum is " +sum);
		
	}

}

class add
{
	int addnum(int x, int y)
	{
	while(y>0)
	{
		x++;
		y--;
	}
	return x;
	}
	
}
