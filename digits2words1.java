class digits{

	private String ones(int Num){
		String Word="";

		switch(Num){
			case 1:Word="One";break;
			case 2:Word="Two";break;
			case 3:Word="Three";break;
			case 4:Word="Four";break;
			case 5:Word="Five";break;
			case 6:Word="Six";break;
			case 7:Word="Seven";break;
			case 8:Word="Eight";break;
			case 9:Word="Nine";break;
			case 10:Word="Ten";break;
			case 11:Word="Eleven";break;
			case 12:Word="Twelve";break;
			case 13:Word="Thirteen";break;
			case 14:Word="Fourteen";break;
			case 15:Word="Fifteen";break;
			case 16:Word="Sixteen";break;
			case 17:Word="Seventeen";break;
			case 18:Word="Eighteen";break;
			case 19:Word="Nineteen";break;
		}
		return Word;
	}


	private String tens(int Num){
		String Word="";

		switch(Num){
			case 20: Word="Twenty";break;
			case 30: Word="Thirty";break;
			case 40: Word="Forty";break;
			case 50: Word="Fifty";break;
			case 60: Word="Sixty";break;
			case 70: Word="Seventy";break;
			case 80: Word="Eighty";break;
			case 90: Word="Ninty";break;
		}

		return Word;
	}

	public String convert(int Num){

		String Answer="";

		if (Num>=1000 && Num<=9999){
		Answer+=ones(Num/1000)+" Thousand ";
		Num=Num%1000;
		}

		if (Num>=100) {
		Answer+=ones(Num/100)+" Hundred ";
		Num=Num%100;
		}

		if (Num>19){
		Answer+=tens(Num/10*10);
		Num=Num%10;
		}

		if (Num>0 && Num<=19){
		Answer+=ones(Num);

		}

		return Answer;
	}

}


class digits2words1{

	public static void main(String xyz[]){

		digits C=new digits();

		System.out.println(C.convert(3873));
	}
}