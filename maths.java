class maths{
	public void Add(int A, int B){
		int Result=A+B;
		System.out.println("Result :"+Result);
	}

	public void Sub(int A, int B){
		System.out.println(A-B);
	}
}


class math2 extends maths{
	public void multiply(int X*Y){
		System.out.println("Result :"+X*Y);
	}

	public void sub(int X, int Y){
		System.out.println("Result :"+(X-Y));
	}
}

class mathstest{

	public static void main(String xyz[]){
		mths2 X=new math2();
		X.Add(12,45);
	}
}