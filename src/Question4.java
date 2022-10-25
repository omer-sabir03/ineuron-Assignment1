
public class Question4 {

	public static void main(String[] args) {
		int i, j, N=19;
		
		for (i=0;i<N;i++)
		{
			for (j=0; j<N; j++)
			{
				if(i==N-1|| i-j>=(N-2)/2 || i+j>=(N-1)+((N-2)/2))
						System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
