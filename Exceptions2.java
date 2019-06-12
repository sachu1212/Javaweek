class Exceptions2{

	public static void main(String data[]){

		int first, second, result;
		first=second=result=0;
		try{
			first=Integer.parseInt(data[0]);
			second=Integer.parseInt(data[1]);
			result=first/second;
			System.out.println("Result :"+result);
		}
		catch(NumberFormatException E){
			System.out.println("Digits only please");
		}
		catch(IndexOutOfBoundsException E){
			System.out.println("Not Enough values provided");
		}
		catch(ArithmeticException E){
			System.out.println("Cannot divide by Zero");
		}
		System.out.println("Bye");
	}}