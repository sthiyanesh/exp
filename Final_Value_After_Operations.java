public class Final_Value_After_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='+'){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}
