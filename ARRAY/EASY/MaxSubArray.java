public class MaxSubArray {
    public static void  kadanes (int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<number.length;i++){
            cs = cs+number[i];
            // cs+=number[i];

            if(cs<0){
                cs =0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sub array:" +" " + ms);
    }
    public static void main(String[] args) {
        int number[] ={-2,1,-3,4,-1,2,1,-5,4};
        kadanes(number);
    }
    
}
