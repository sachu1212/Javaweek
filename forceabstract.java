abstract class draw{

	abstract public void drawing();
}

class line extends draw{

	public void drawing(){
		System.out.println("Drawing Lines");
	}
}

class circle extends draw{

	public void drawing(){
		System.out.println("Drawing Circles");
	}
}



class forceabstract{
	public static void main(String xyz[]){
		line X=new line();
		letsdraw(X);
		circle C=new circle();
		letsdraw(C);
	}

	public static void letsdraw(draw D){
	D.drawing();
}

}