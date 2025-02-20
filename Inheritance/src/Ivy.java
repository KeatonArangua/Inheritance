public abstract class Ivy
	{
	private int countIvies;
	private String nameBest;
	
		public Ivy()
		{
			System.out.println("An Ivy is an elite college assocatied with academic excellence and social elitism!");
		}
		
		public void listIvies(int c, String n)
		{
			countIvies = c;
			nameBest = n;
			System.out.print("There are " + c + " Ivies; the best is said to be " + n + "!");
		}
		
		public void admitApplicants()
		{
			System.out.println("Wow these are low!");
		}
		
		public void graduateFamousPeople()
		{
			System.out.println("They produce a ton of CEO's!");
		}
		
		public abstract void tellHistory();
	}
