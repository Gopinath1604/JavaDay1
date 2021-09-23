import java.util.Scanner;
public class N_And_M {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of m and n");
				int m=3;
				int n=10;
				while(m<n-1)
				{
					m++;
					if(m%3==0)
					{
						System.out.println(m);
					}
				}
				sc.close();
	}
	

}