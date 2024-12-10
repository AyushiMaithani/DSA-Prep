import java.util.*;
public class demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         String input;
         input=sc.nextLine();
         String[] wordList=input.split(" ");
         String[] answer = new String[wordList.length];
         
         HashMap <String, Integer> wordCount = new HashMap<>();
        for (String word : wordList) {
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            else{
                wordCount.put(word, 1);
            }
        }  
        int index=0;
 for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if(entry.getValue()>1){
                answer[index++]=entry.getKey();
            }
         }

         if (index == 0) {
            System.out.println("NA");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.print(answer[i] + " ");
            }
        }

         
        }
}

