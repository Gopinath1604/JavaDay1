class OneZeroPattern
{
		public static void test(int n) {
		for (int i=1;i<=n;i++)
		{
		   int a=0;
		   if(i%2==0)
		   {
		   	System.out.print(a + " ");
		   }
		   else
		   {
		   	a=1;
		   	System.out.print(a + " ");
		   }
           for (int j=1;j<n;j++ ) 
		   {
		   	 if(a==1)
		   	 {
		   	 	a=0;
		   	 }
		   	 else
		   	 {
		   	 	a=1;
		   	 }
		   	System.out.print(a + " ");
		   	 
		   }
		   System.out.println( );	
		}
	}
	public static void main(String[] args) {
		test(4);
	}
}