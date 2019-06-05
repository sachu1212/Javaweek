class Second{
		int Physics, chemisty;
		public void message(){
		System.out.println("Your Score");
		System.out.println("is displayed");
		}
}

class test2{
		public static void main(String xyz[]){
		Second X;
		X=new Second();
		X.Physics=75;
		X.chemisty=85;
		System.out.println(X.Physics+X.chemisty);
		X.message();
		}
}