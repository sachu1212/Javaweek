
class WordCount{
    public void Count(String msg){
        
        String word="";
        int i=msg.length()-1;
        while (i>=0){

        if (msg.substring(i,i+1).equals(" "))
        {System.out.println(word);
        word="";}
else{ word=msg.substring(i,i+1)+word;        
}
i-=1;
}
System.out.println(word);

}}

class WordRevDown{

    public static void main(String xyz[]){
        WordCount S=new WordCount();
        S.Count("Shafeeq is Back");
    }}