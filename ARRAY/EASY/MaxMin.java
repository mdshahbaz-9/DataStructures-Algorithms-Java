// // maximum and minium Element in a array
// import java.util.*;
// public class MaxMin{

//     public static int getlargest(int number[]){
//         int Largest = Integer.MIN_VALUE;
//         int Smallest = Integer.MAX_VALUE;

//         for(int i = 0;i<number.length;i++){
//             if(Largest < number[i]){
//                 Largest = number[i];
//             }
//             if(Smallest > number[i]){
//                 Smallest = number[i];
//             }

//         }

//         System.out.println("Minum value is:" +" "+ Smallest);
//         return Largest;
//     }

//     public static void main(String[] args) {
//         int number[] = {1,2,3,4,5,6,7,};
//         System.out.println("Maximun value is:" +" "+ getlargest(number));
//     }


// }


// import java.util.*;
// class MaxMin {
//     public static void main(String[] args) {
//         int a[]={1,423,6,46,34,23,13,53,4}; 
          
//           //Implemented inbuilt function to sort array
//         Arrays.sort(a);
      
//           // after sorting the value at 0th position will minimum and 
//         //nth position will be maximum
//         System.out.println("min:"+a[0]+ " max:"+a[a.length-1]);
//     }
// }


import java.util.*;
public class MaxMin{
public static void main(String[] args) {
  int arr[] = {3,5,7,6,3,10,5,2};
  Arrays.sort(arr);
  System.out.println("min:" + " " + arr[0]);
  System.out.println("max:" + " " + arr[arr.length-1]);
}

}
