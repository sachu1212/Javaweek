class first{

	public first(){
		System.out.println(9);
	}
}


class second extends first{

	public second(){
		System.out.println(6);
	}
}


class one extends second{

	public one(){
		System.out.println(1);
	}

public one(int A){
		System.out.println(920);
	}
}


class two extends one{
	public two(int A){
		super(1);
		System.out.println(2);
	}

	public two(){
		
		System.out.println(3);
	}
}

class supertest{
	public static void main(String xyz[]){
		two X=new two(2);
	}
}