import java.util.Scanner;
class factorial {


    public static int factorialsol(int num)
    {
        if (num!=0) 
        {
            long fact = 1;
            int i = 1;
            while(i<=num)
            {
                fact = fact * i;
                i++;
            }
        System.out.println("Factorial of "+num+" is: "+fact);
        }
       return 1; 
    
    }

            

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        factorialsol(n);

    	
    }
}