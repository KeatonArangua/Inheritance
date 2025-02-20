public class Driver
	{

		public static void main(String[] args)
			{
				System.out.println("What is an Ivy?");
				Ivy x = new Harvard();
				System.out.println();
				
				System.out.println("What're the acceptance rates like?");
				x.admitApplicants();
				System.out.println();
				
				System.out.println("Where's Harvard located?");
				((Harvard)x).locate("Harvard");
				System.out.println();
				
				System.out.println("Tell me more...");
				x.tellHistory();
				x.graduateFamousPeople();
				x.listIvies(8, "Princeton");
				
			}

	}
