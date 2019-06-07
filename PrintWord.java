class WordCount{
    public void Count(String msg){
        
        String word="";
        int i=0;
        while (i<msg.length()){

        if (msg.substring(i,i+1).equals(" "))
        {System.out.println(word);
        word="";}
else{ word=word+msg.substring(i,i+1);        
}
i+=1;
}
System.out.println(word);

}}

class PrintWord{

    public static void main(String xyz[]){
        WordCount S=new WordCount();
        S.Count("Shafeeq is Back");
    }}