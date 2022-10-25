
public class Question5 {

	public static void main(String[] args) {
		int i, j, N=19;
		for (i=0;i<N;i++)
		{
			for (j=0;j<N;j++)
			{
				if( i+j<=(N-1)/2|| i-j>=(N-1/2)/2 ||j>(N-1)/2 && i==0||i==N-1 && j>N/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
