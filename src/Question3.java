
public class Question3 {

	public static void main(String[] args) {
		int i , j, N=19;
		
		for(i=0;i<=N-1;i++)
		{
			for(j=0;j<=N-1;j++)
			{
				if(i==N-1||j==0||j==N-1||i+j<=(N-1)/2 ||j-i>=(N-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
