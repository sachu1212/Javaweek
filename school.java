class Results{
	int physics, chemistry, math;

	public void showResults(){
		int total;
		total=physics+chemistry+math;
		System.out.println("Total Score :"+total);
		if(total>=150){
			System.out.println("Passed");
		}
		else  {
			System.out.println("Failed");
		}
	}
}


class school{
	public static void main(String xyz[]){
		Results Peter, James;
		Peter=new Results();
		James=new Results();

		Peter.math=50;
		Peter.physics=100;
		Peter.chemistry=100;

		James.math=50;
		James.chemistry=30;
		James.physics=60;

		Peter.showResults();
		James.showResults();

	}
}