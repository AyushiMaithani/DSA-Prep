import java.util.ArrayList;

public class ShiftingLettersTwo {
    public static void main(String[] args) {
        String s = "dztz";
        int[][] shifts = {{0,0,0},{1,1,1}};
        ArrayList<Character> arr = new ArrayList<>();

        for (Character character : s.toCharArray()) {
            arr.add(character);
        }
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        for(int j=0;j<shifts.length;j++){
            int start = shifts[j][0];
            int end = shifts[j][1];
            int dir = shifts[j][2];

            for(int k=start;k<=end;k++){
                if(dir==0){ 
                    //backwards
                    if(arr.get(k)=='a')
                    arr.set(k, 'z');    
                    else
                    arr.set(k, (char) (arr.get(k)-1));
                }else{ 
                    //forwards
                    if(arr.get(k)=='z')
                    arr.set(k, 'a');
                    else
                    arr.set(k, (char) (arr.get(k)+1));
                }
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
      
        String sNew="";
        for (Character c : arr) {
            sNew += c;  // Concatenate each character
        }
        
        System.out.println(sNew); 
        

    }
}
