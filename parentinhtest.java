class one{
	public void msg1(){
		System.out.println("Hello");
	}
}

class two extends one{

	public void msg2(){
		System.out.println("Manchester");
	}
}

class parentinhtest{
	public static void main(String xyz[]){

		two ref;
		ref=new two();
		ref.msg1();
		ref.msg2();

	}
}