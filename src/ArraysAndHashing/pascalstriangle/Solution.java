package src.ArraysAndHashing.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(new ArrayList<>(i));
            result.get(i-1).add(1);
            if(i>2){
                for(int j=1;j<i-1;j++){
                    result.get(i-1).add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
            }
            if(i>1) result.get(i-1).add(1);

        }
        return result;

    }

}
