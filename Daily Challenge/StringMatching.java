import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public static void main(String[] args) {
        
        String[] words={"leetcoder","leetcode","od","hamlet","am"};
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for(int j=0;j<words.length;j++){
                if(i==j) continue;
                if(words[i].contains(words[j])){
                    res.add(words[j]);
                    break;
                }
            }
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
