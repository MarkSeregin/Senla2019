import java.util.Scanner;

public class one {
	public static void main(String[] args)
    {  
    	Scanner in = new Scanner (System.in);
    	float n;
    	System.out.println("������� ����� ����� : ");	
    	n = in.nextFloat();
		if (n != (int)n) 
		{
			System.out.println("�� ����� ������������ ������");
		}
		else 
		{
	    	if (simple(n) == true)
	    	{
	    		System.out.println("�������");
	    	} 
	    	else
	    		System.out.println("���������");
	    	if (chet(n) == true) 
	    	{
	    		System.out.println("������");
	    	}
	    	else
	    		System.out.println("��������");
		}
    }

	public static boolean simple(float n)  
	{ 
		Boolean f = true;
		for (int i = 2; Math.pow(i,2) <= n; i++)
		{
			for (int j = i; j <= n; j += i)
			{
					if (j == n) 
					{
						f = false;
						break;
					}
			}
		}
	 return f;
	}
	
	public static boolean chet(float n)  
	{ 
		Boolean f = true;
		if (n % 2 == 0) 
		{
			f = true;
		} 
		else 
		{
			f = false;
		}
	 return f;
	}
}