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
	public void multiply(int X, int Y){
		System.out.println("Result :"+X*Y);
	}

	public void sub(int X, int Y){
		System.out.println("Result :"+(X-Y));
	}
}

class mathstest{

	public static void main(String xyz[]){
		maths X=new maths();
		X.Add(12,45);
		math2 Y=new math2();
		Y.sub(23,21);
		math2 Z=new math2();
		Z.multiply(30,30);
		maths J=new maths();
		J.Sub(23,10);
	}
}