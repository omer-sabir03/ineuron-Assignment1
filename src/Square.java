
public class Square {

	public static void main(String[] args) {
		int i,j;
		int N=14;
	
		//Filled Square
	
		for(i=0;i<N;i++) {
			for(j=0;j<N;j++)
			{
				
			System.out.print("* ");
		}
			System.out.println();
		}
		
		System.out.println("=======================================================");
		System.out.println();
		//Empty Square
		
		for(i=0;i<N;i++)
		{
			for(j=0;j<N;j++)
			{  
				if(i==0||i==N-1||j==0||j==N-1)
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		
		System.out.println("=======================================================");
		System.out.println();
		
		
//		Right Angled Triangle
		
		for(i=0;i<N;i++)
		{
			for(j=0;j<N;j++)
			{
				if(j==0||i==N-1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			
			System.out.print("  ");
//			Filled Right Angled Triangle
			
			for(j=0;j<N;j++)
			{
				if(i==N-1||j==0||i==j|| i>j)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}

			System.out.println();
		}
		
		System.out.println("=======================================================");
		System.out.println();
		
		
//		INEURON
		for(i=0;i<N;i++) {
			for(j=0;j<N;j++) {
				if( i==0 && j<(N)/2 ||  i==(N)/2 && j<N/2 ||j==N/4 && i< (N)/2)
						System.out.print("* ");
				
						
				else if(j==N/2 && i>=(N)/2 && i< N|| j==(N-1) && i>=(N)/2 && i<N||  i==j && i>=N/2)
					System.out.print("||");
				else
					System.out.print("  ");
			}
			
			System.out.print(" ");
			
			for(j=0;j<N;j++) {
				if(j==0 && i<(N-1)/2|| i==0 && j<N/2 || i==(N-1)/2 && j<N/2 || i==(N)/4 && j<N/2||
						j==N/2 && i>(N-1)/2 && i<N-1 || j== (N-1)  && i>(N-1)/2 && i<N-1|| i==(N-1) && j<(N-1) && j>N/2 )
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			
			for (j=0;j<N;j++)
			{
				if(

						 j==0 && i<N/2|| i==0 && j>0&& j<N/2 || i==N/4 && j>=0 && j<N/2
						|| j==N/2 && i>0 && i<N/4 || i==j && i<N/2 && i>N/4
						|| j==(N+1)/2 && i>(N)/2 && i<N-1|| i== (N+1)/2  && j<(N-1) && j>(N+1)/2|| i==(N-1) && j<(N-1) && j>(N+1)/2||
						j==N-1 && i>(N)/2 && i<N-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			for(j=0;j<N;j++) {
				
				if(j==0|| j==N-1 || i==j)
				{
					System.out.print("#");
				}
				else
					System.out.print(" ");
				
			}
			
			
			
			System.out.println();
		}
		
		

}
}
