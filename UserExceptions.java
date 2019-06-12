class AbsentiesException extends Exception{}

class AccountsNBS{

	public float tax(int Salary, int Absenties) throws AbsentiesException{
	float T;

	if(Absenties>=7){
		AbsentiesException E =new AbsentiesException();
		throw E;
	}
	else{
		T=Salary*21/100;
	}
	return T;
}}



class UserExceptions{
	public static void main(String xyz[]){
	AccountsNBS X=new AccountsNBS();
	try{
		float Netsalary=2000-X.tax(2000,9);
	}
catch(AbsentiesException E){
	System.out.println("Sorry too many Absenties");
}

}}