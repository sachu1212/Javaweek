
package testcases;
public class DuplicateWords{
    
    public static void main(String xyz[]){
        String names();={"Shafeeq","is", "Shafeeq", "is", "is", "is", "back", "here", "back"};

        for (int i=0; i<names.length; i++){
            for(int j = i+1; j<names.length; j++){

                if(names(i).equals(names(j))){
                    System.out.println("duplicate word is :" +names(i));
                }
            }
        }}}


