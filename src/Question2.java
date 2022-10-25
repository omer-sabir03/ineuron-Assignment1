
public class Question2 {

	public static void main(String[] args) {
		int i, j, N=5;
		
		for (i=0;i<N;i++) 
		{
			for(j=0;j<N;j++)
			{
				System.out.print(i+1+" ");
			}
			System.out.println();
		}

		System.out.println("===============================================");
		System.out.println();
		
		for(i=0;i<N;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===============================================");
		System.out.println();
		
		
		for (i=N;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("===============================================");
		System.out.println();
		
	
		
		
	}

}
