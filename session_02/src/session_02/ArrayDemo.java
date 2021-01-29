package session_02;

public class ArrayDemo {
	
	public static void main(String[] args) 
	{
//		 int arr[] = new int[5];
//		 arr[0] = 10;
//		 arr[1] = 20;
//		 
//		 int[] a = {1,2,3,4,5};
//		 
//		 for(int i: a )
//		 {
//			 System.out.println(i);
//		 }
		
		int[][]arr = new int[2][2] ;
		for(int i =0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				arr[i][j] =i+j+1;
			}
		}
		System.out.print("Arrays Elements are ");
		
//		for(int i =0; i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++) 
//			{
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		for(int a[]:arr) {
			for(int i:a)
			{
				System.out.print(i+"\t");
			}
			System.out.println();

		}

	}
	
}
