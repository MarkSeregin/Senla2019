import java.util.Scanner;

public class one {
	public static void main(String[] args)
    {  
    	Scanner in = new Scanner (System.in);
    	float n;
    	System.out.println("Введите целое число : ");	
    	n = in.nextFloat();
		if (n != (int)n) 
		{
			System.out.println("Вы ввели некорректные данные");
		}
		else 
		{
	    	if (simple(n) == true)
	    	{
	    		System.out.println("Простое");
	    	} 
	    	else
	    		System.out.println("Составное");
	    	if (chet(n) == true) 
	    	{
	    		System.out.println("Четное");
	    	}
	    	else
	    		System.out.println("Нечетное");
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