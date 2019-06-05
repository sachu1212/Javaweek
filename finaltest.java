class HSBC{
	public void msg(){
		System.out.println("Hello");
		}

	final public void message(){
		System.out.println("ABC");
	}
}

class london_branch extends HSBC{
	public void msg(){
		System.out.println("1234");
	}
}

class finaltest{
	public static void main(String xyz[]){
		london_branch X=new london_branch();
		X.msg();

		london_branch Y=new london_branch();
		Y.message();

		}
	}