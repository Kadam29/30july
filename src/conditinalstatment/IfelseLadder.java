package conditinalstatment;

public class IfelseLadder {

	public static void main(String[] args)
	{
		int marks=45;
		
		if(marks>=91 && marks<=100)	
		{
			System.out.println(marks+"-->student achive grade A");
		}	
		else if (marks>=81 && marks<=90)	
		{
			System.out.println(marks+"-->student achive garde B");
		}
		else if (marks>=71 && marks<=80)	
		{
			System.out.println(marks+"-->student achive grade c");
		}
		else if (marks>=51 && marks<=70)
		{
			System.out.println(marks+"-->student achive garde D");
		}
	
		else
		{
			System.out.println("student is fail");
		}
	
	
	System.out.println("End of program");
	
	}

}
