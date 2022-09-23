import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
     static double median(int arr1[],int arr2[],int a,int b) {
        int finalArray[]=new int[a+b];
        int i=0,j=0,k=0;
        while(i<a && j<b) {                           // This is used to sort the elements between both arrays and store them in 3rd array
            if(arr1[i]<arr2[j]) {
                finalArray[k] = arr1[i];              // finalArray[k++] can be also written as finalArray[k]; k++;
                 k++;
                 i++;
            }
            else {
                finalArray[k++] = arr2[j++];
            }
        }
        if(i<a) {                                     // If after sorting elements are left in 1st array, then we will store them
            while(i<a)
                finalArray[k++] = arr1[i++];
        }
        if(j<b) {                                     // If after sorting elements are left in 1st array, then we will store them
            while(j<b)
                finalArray[k++] = arr2[j++];
        }
        b = a+b;
        if(b%2==1)
            return finalArray[((b+1)/2)-1];
        else return ((double)finalArray[(b/2)-1]+(double)finalArray[(b/2)])/2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // length for 1st array
        int b = sc.nextInt();  // length for 2nd array
        int arr1[] = new int[a];
        int arr2[] = new int[b];
        for (int i=0; i<a; i++){    // initializing the elements in 1st array
            arr1[i]=sc.nextInt();
        }
        for (int i=0; i<b; i++){   // initializing the elements in 2nd arrray
            arr2[i]=sc.nextInt();
        }
       // System.out.print("The Median of two sorted array is ");
        System.out.printf("%.2f",median(arr1,arr2,a,b));  // calling the median function
    }
}
