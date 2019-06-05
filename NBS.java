class Bank{
	private int Amount;

	public void Deposit(int money){
		Amount+=money;
	}

	public void Withdraw(int money){
		if(money<Amount){
			Amount-=money;
		}
	else{
		System.out.println("not enough funds");
	}
	}

	public void Balance(){
		System.out.println("Your Balance is :"+Amount);
	}

	public Bank(){
		System.out.println("Hello My Friend");
	}
}

class NBS{
	public static void main(String xyz[]){
		Bank Ref;
		Ref=new Bank();
		
	}
}