package mockquestion;

public class additionarray1
{
	public static void main(String[] args) 
	{
		int a[][]= {{1,3,8},{3,4,8}};
		int b[][]= {{1,3,4},{3,4,4}};
		
		for(int i=0;i<=1;i++) //no of row is 2(0,1)
		{
			for( int j=0;j<=2;j++)  //no of column is 3(0,1,2)
			{
				System.out.print(a[i][j]/b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
