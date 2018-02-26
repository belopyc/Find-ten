import java.util.Scanner;

public class FindTen{

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
 	System.out.println(" Find ten ");
	System.out.println("Enter first number: ");
        int first = in.nextInt();
	System.out.println("Enter second number: ");
        int second= in.nextInt();

	if(first > 10) 
	{
		first = first - 10;
	}
	if(first < 10) 
	{
		first = 10 - first;
	}


	if(second > 10) 
	{
		second = second - 10;
	}
	if(second < 10) 
	{
		second = 10 - second;
	}

	if( first > second) System.out.println("Second closer to ten ");
	if( first < second) System.out.println("First closer to ten ");
	if( first == second) System.out.println(" Both ");
	
	}
}