class math46{
	int A;

	public void message(){
		int A;
		A=20;
		this.A=15;
		System.out.println("Result :"+this.A);
	}

	public void message2(){
		this.A=45;
		System.out.println(A);
	}

		public void message3(){
		System.out.println(A);
	}
}

class thistest{
	public static void main(String xyz[]){
	math46 X=new math46();
	X.message();
	X.message2();
	X.message3();
}
}
