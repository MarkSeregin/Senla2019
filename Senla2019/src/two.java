import java.util.Scanner;

public class two {
	public static void main(String[] args)
    {  
		Scanner in = new Scanner (System.in);
		float a, b;
		System.out.println("������� 2 ����� �����: ");
		a = in.nextFloat();
		b = in.nextFloat();	
		if (a != (int)a || b != (int)b) 
		{
			System.out.println("�� ����� ����������� ������");
		} 
		else
		{
			System.out.printf("���������� ����� �������� = " + "%.0f",NOD(a,b));
			System.out.println();
			System.out.printf("����������� ����� ������� = " +"%.0f", NOK(a,b));
		}
    }

	static float NOD (float a, float b) 
	{
		while (a != b) 
		{
			if (a > b) 
			{
				a -= b;
			} 
			else 
			{
				b -=a;
			}
		}
	return a;
	}
	
	static float NOK (float a, float b) 
	{
		return Math.abs(a * b)/NOD(a,b);
	}
}
