import java.util.*;

public class Array {
    public static void PrintPairs(int num[]) {
        int tp =0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.println("(" + num[i] + ", " + num[j] + ")");
                tp++;
            }
        }
        System.out.println("Total pairs:"+tp);
    }

    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 10}; 
        PrintPairs(num);
    }
}
