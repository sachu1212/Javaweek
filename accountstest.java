class Accounts{
	public void tax(){
		System.out.println("Tax Rate is:"+22.7);
	}

	public void tax(int salary){
		float T;
		T=salary*22.7f/100;
		System.out.println("Your Tax is :"+T);
	}

	public void tax(int salary,float tax_rate){
		float T;
		T=salary*tax_rate/100;
		System.out.println("Your Tax is :"+T);
	}
}

class Accountstest{
	public static void main(String xyz[]){
		Accounts Ref=new Accounts();
		Ref.tax();
		Ref.tax(2130);
		Ref.tax(2000,19);
	}
}