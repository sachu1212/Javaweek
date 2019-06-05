abstract class calculation{

	abstract public void tax(int Salary);

	public void msg(){
		System.out.println("Hello my friends");
	}

}

class calculation2 extends calculation{

	public void tax(int Salary){
		float result;
		result=Salary*21/100;
		System.out.println("The tax is :"+result);
	}
}


class calculation3 extends calculation{

	public void tax(int Salary){
		float result;
		result=Salary*30/100;
		System.out.println("The tax is :"+result);
	}
}

class abstracttest{
	public static void main(String xyz[]){
		calculation2 X=new calculation2();
		X.tax(5000);
		calculation2 Y=new calculation2();
		Y.msg();
		calculation3 C=new calculation3();
		C.tax(5000);
		calculation3 Z=new calculation3();
		Z.msg();

	}


}