package conditinalstatment;

public class NestedIf {

	public static void main(String[] args)
	{
	int age = 25;
	int weight = 76;
	
   if (age> 18)
     {
	System.out.println(" Age verified Check for the weight now ");
	
	  if (weight>=45)
	    {
		 System.out.println("Weight verified eligible for donate blood");
	      }
	     else 
	      {
		  System.out.println("not eligible for blood donationdue to weight criteria");
	        }
      }
   else
   {
	   System.out.println("Not eligble for blood donation due to age criteria");
   }
}

}
