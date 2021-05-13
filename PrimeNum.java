
public class LJG {

	public static void main(String[] args) {
	

		int n = 2;
		int set = 30;
		int v = 2;
		boolean inPrimeNum = true;
		
		for(int a = 0; a < 30; a++ )
		{
			
			for(int i = 0; i < set-2; i++)
			{
				
				if(0 == n % v)
				{
					inPrimeNum = false;
					
				}
				
				v++;
			}
				
			if(inPrimeNum == true)
			{
				System.out.println(n + "은 소수이다.");
			}
			
			v = 0;
			n++;
		}
	
	
		
		
		
		
		
		
		
		
		
	}

}