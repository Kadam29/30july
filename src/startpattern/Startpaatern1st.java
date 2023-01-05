package startpattern;

public class Startpaatern1st {

	public static void main(String[] args)
	{
		
		for(int i=1; i<=5; i++)	//row
			{
		for(int j=1; j<=i; j++) //star
		{
			System.out.print("* ");
		}
		System.out.println();
		}

		//for reverse start pattern
		
		
		for(int i=1; i<=5; i++)	//row
		{
	for(int j=4; j>=i; j--) //star
	{
		System.out.print("* ");
	}
	System.out.println();
	}

		
		
		
		
		
		
		
		
		
		
		
	}

}
