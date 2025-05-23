//Question: Given an array of stock prices, find the span of stock prices for each day. The span of stock 
//price on a given day is defined as the maximum number of consecutive days before the given day where the
// price was less than or equal to the price on that day.

import java.util.*;

public class StackQ4 {
    public static void StockSpan(int Stock[], int Span[]) {
        Stack<Integer> s = new Stack<>();
        Span[0] = 1;
        s.push(0);

        for (int i = 1; i < Stock.length; i++) {
            int currPrice = Stock[i];
            while (!s.isEmpty() && currPrice >= Stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                Span[i] = i + 1;
            } else {
                int PrevHigh = s.peek();
                Span[i] = i - PrevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int Stock[] = {100, 80, 60, 70, 60, 85, 100};
        int Span[] = new int[Stock.length];
        StockSpan(Stock, Span);
        for (int i = 0; i < Span.length; i++) {
            System.out.print(Span[i] + " ");
        }
    }
}
