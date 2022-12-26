// import java.util.Scanner;

// public class practise_set {
     

//     public static void main(String[] args) {
//     //   //problem 1     
// //     //  float [] marks ={45.3f ,32.3f,43.4f,43.5f,32.4f};
// //     //  float  sum=0;
// //     //  for(float element:marks){
// //     //    sum=sum+element;
// //     //    System.out.println("The value of marks is"+sum);
          
// //     //  }
// //   Scanner sc= new Scanner(System.in);
// //   System.out.println("Enter the value to check if its in the array");
// //   int num =sc.nextInt();

// //     // problem 2
// //     float [] marks ={45.3f ,32.3f,43.4f,43.5f,32.4f};
// // //    float num=45.3f;
// //    boolean isInArray= false;
// //    for(float element:marks){
// //        if(num==element){
// //            isInArray =true;
// //            break;

// //        }

// //    }
// //    if(isInArray){
// //        System.out.println("The value is present in the array");

// //    }
// //    else{
// //        System.out.println("The value is not present in the array");
// //    }


// //     }
//     //problem 5 reverse an array 
//     int [] arr={1,2,3,4,5,6};
//     int l=arr.length;
//     int n=Math.floorDiv(l, 2);//floor div is used to calculate the average of the array
//     int temp ;
// //   swapping logic is used to reverse a array;

//    for(int i=0;i<n;i++){
//     temp =arr[i];
//     arr[i]=arr[l-1-i];
//     arr[l-1-i]=temp;
    

//    }



//     for(int element: arr){
//         System.out.println(element);
//     }



//     // Reverse a string 
//    String st="Hsrry";
//   StringBuilder str =new StringBuilder(st);
//    str.reverse();
//   System.out.println(str);


// //   probelm 6 to find the max number in an array
// int [] number ={1,333,43,32,32};
// int max=0;
// int min=0;
// for(int e:number){

//     if(e>max){
//         max=e;
//         System.out.println(max);
//     }
    
//     for(int el:number){
//         if(el<min){
//             min=el;
//         System.out.println(min);
//         }
//     }
// }


// // problem 6 check wheather array is sorted or no
// boolean isSorted = true;
// int [] ary ={1,2,3,4,6};

// for(int i=0;i<ary.length-1;i++){
//     if(arr[i] > arr[i+1]){
//     isSorted = false;
//      break;

//     }
//     if(isSorted){
//         System.out.println("The array is sorted");

//     }
//     else{
//         System.out.println("The array is not sorted")  ;
//     }
// }

   


//     }


// }
