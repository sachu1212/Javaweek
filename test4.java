class college{
	private int physics, chemistry, total;
	private float percentage;

	private void calculations(){
		total=physics+chemistry;
		percentage=total*100/300;
	}

	public void physics(int p){
		if (p>=0 && p<=150){
			physics=p;
		}
	else{ physics=-1;
		System.out.println("invalid physics marks");
	}}

	public void chemistry(int c){
		if (c>=0 && c<=150){
			chemistry=c;
		}
	else{
		chemistry=-1;
		System.out.println("invalid chemistry marks");
	}
	}

	public void showresults(){
		if (chemistry==-1 || physics==-1){
			System.out.println("No Results");
		}
	else{
		calculations();
		System.out.println("Total Marks :"+total);
		System.out.println("Percentage:"+percentage);
	}
	}
}


class test4{
	public static void main(String xyz[]){
		college ABC;

		ABC=new college();
		ABC.physics(70);
		ABC.chemistry(80);

		ABC.showresults();
	}
}