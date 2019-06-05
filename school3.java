class Results{
	private int physics, chemistry, math;
			
	public void physics(int p){
		if (p>=0 && p<=150){
			physics=p;
		}
		else{
			physics=-1;
			System.out.println("Invalid physics marks");
		}
}
	public void chemistry(int q){
		if (q>=0 && q<=150){
			chemistry=q;
		}
	else{
		chemistry=-1;
		System.out.println("Invalid chemistry marks");
		}
}


	public void math(int r){
		if (r>=0 && r<=150){
			math=r;
		}
		else{
			math=-1;
		System.out.println("Invalid Math marks");
		}
	}
		public void showResults(){
		int Total;
		if(physics==-1 || chemistry==-1 || math==-1){
			System.out.println("No Results");
		}
		else{
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
}


class school3{
	public static void main(String xyz[]){
		Results Peter;
		Peter=new Results();
		Peter.physics(50);
		Peter.chemistry(100);
		Peter.math(90);

		Peter.showResults();
	}
}