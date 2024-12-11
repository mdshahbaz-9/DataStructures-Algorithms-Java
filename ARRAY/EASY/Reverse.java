public class Reverse {
    public static void ReverseArray( int number[]){
        int  first =0;
        int last = number.length-1;

        while(first < last){
            int tmp = number[last];
            number[last] = number[first];
            number[first]= tmp;
        
            first++;
            last--;   
    }
    
}

public static void main (String args[]){
    int number[] = {2,3,4,6,8,9};
    ReverseArray(number);
    for(int i =0; i<number.length;i++){
        System.out.print(number[i] +" "+ "");
    }

}
}