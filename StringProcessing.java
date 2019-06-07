class WordCount{
	public void Count(String msg){
		
		int word=1;
		int i=0;
		while (i<msg.length()){

		if (msg.substring(i,i+1).equals(" "))
		{word++;}
		i++;}
		System.out.println("number of words are :" +word);
}
}



class StringProcessing{

    public static void main(String xyz[]){
        WordCount S=new WordCount();
        S.Count("Shafeeq is Back");
	}}