public class Driver
	{

		public static void main(String[] args)
			{
				System.out.println("What is an Ivy?");
				Ivy x = new Harvard();
				System.out.println();
				x.admitApplicants();
				System.out.println();
				((Harvard)x).locate();
				x.tellHistory();
				x.graduateFamousPeople();
				
			}

	}
