
public class MyStudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyStudent obj=new MyStudent("Mradul",new int[] {23,45,23,56,78}) ;
		System.out.println(obj.getNumberOfMarks());
		System.out.println(obj.TotalSumOfMarks());
		System.out.println(obj.getMaxMarks());
		System.out.println(obj.getMinMarks());

	}

}
