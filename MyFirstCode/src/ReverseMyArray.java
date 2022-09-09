
public class ReverseMyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1= {8,7,6,5,4,3,2,1};
		int [] arr2= new int[arr1.length];
		
		System.out.println(arr1.length);
		
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]+ " ");
		}
//		System.out.println(arr2.length);
//		
//		for(int i=0;i<=arr2.length-1;i++)
//		{
//			System.out.print(arr2[i] +" ");
//		}

	}

}
