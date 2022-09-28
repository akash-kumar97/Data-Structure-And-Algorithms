package Concepts;

import java.util.Scanner;

public class Merge_Sort {

    public static void merge(int arr[], int l, int m, int r){

        int n1 = m-l+1;                     // taking two empty temporary arrays to store the value of an array
        int n2 = r-m;

        int L[] = new int[n1];            
        int R[] = new int[n2];

        for (int i=0; i<n1; i++){
            L[i] = arr[l+i];
        }

        for (int i=0; i<n2; i++){
            R[i] = arr[m+1+i];
        }

        int i =0, j=0, k=l;

        while(i<n1 && j<n2){                  // check the smaller number and storing it in a array
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){                        // checking whether the elements are left or not in an array
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int l, int r){

        if(l<r){
            int m = l+(r-l)/2;          // finding the middle point of the array
            mergeSort(arr, l,m);        // sorting the first half
            mergeSort(arr, m+1, r);     // sorting the second half
            merge(arr, l , m,r);        // merging all the elements
        }
    }

    public static void main(String[] args) {     // function to take an array from user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        mergeSort(arr,0,n-1);                     // calling the mergeSort function

        System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
