class maths{
	public void Addition(int A, int B){
		int Result;
		Result=A+B;
		System.out.println("Result :" +Result);
		}
	public int Subtraction(int A, int B){
		int Answer;
		Answer=A-B;
		return Answer;
	}
}

class test3{
	public static void main(String xyz[]){
		maths X;
		X=new maths();
		X.Addition(2,10);
		System.out.println("Result is :" +X.Subtraction(100,5));
	}
}