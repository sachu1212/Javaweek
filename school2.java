class Results{
	private int physics, chemistry, math;

	public void physics(int p){
		if (p>=0 && p<=150){
			physics=p;
		}
		else{
			System.out.println("Invalid physics marks");
		}
}
	public void chemistry(int q){
		if (q>=0 && q<=150){
			chemistry=q;
		}
	else{
		System.out.println("Invalid chemistry marks");
		}}

	public void math(int r){
		if (r>=0 && r<=150){
			math=r;
		}
		else{
		System.out.println("Invalid Math marks");
		}
	}

		public void showResults(){
		int Total;
		Total=physics+chemistry+math;
		System.out.println("Total Score :"+Total);
		if(Total>=150){
			System.out.println("Passed");
		}
		else  {
			System.out.println("Failed");
		}
	}
}


class school2{
	public static void main(String xyz[]){
		Results Peter;
		Peter=new Results();
		Peter.physics(50);
		Peter.chemistry(1000);
		Peter.math(90);

		Peter.showResults();
	}
}