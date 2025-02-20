public class Harvard extends Ivy
	{
		private String nameIt ; 
		
		public void admitApplicants()
		{
			;
			System.out.println("3 percent! Does anyone actually get in here?!");
			super.admitApplicants();
		}
		
		public void locate(String a)
		{
			nameIt = a;
			System.out.println(a + " is located in Cambridge, MA. Great city!");
		}
		
		public void tellHistory()
		{
			System.out.println("Harvard was founded in 1636! That's before the US was founded...");
		}
	}
