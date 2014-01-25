public class TwoSum {
    int[] index = new int[2];
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers.length == 0){
            //return;
        }else if (numbers.length == 1){
            //return;
        }else{
            for(int i = 0; i < numbers.length-1; i++){
                for(int j = i+1; j < numbers.length; j++){
                    if(numbers[i]+numbers[j] == target){
                        index[0] = i+1;
                        index[1] = j+1;
                        
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        return index;
    }
}
