class Bank{
	static int Dollar;
	public void setDollar(int A){
		Dollar=A;
		}
	public void Amount(int B){
		System.out.println("Amount is :"+(B*Dollar));
	}
}

class testbank{
	public static void main(String xyz[]){
		Bank HSBC, Natwest, NBS;
		HSBC=new Bank();
		Natwest=new Bank();
		NBS=new Bank();
		HSBC.setDollar(100);
		NBS.Amount(2);
		NBS.setDollar(50);
		Natwest.Amount(2);
	}

}