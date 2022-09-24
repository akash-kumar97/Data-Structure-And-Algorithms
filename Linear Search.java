package Concepts;

import java.util.Scanner;

public class Linear_Search {

    public static void linearSearch(int arr[], int n , int x){
        for (int i=0; i<n; i++){
            if (arr[i]==x){
                System.out.println(i);
                break;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // no of elements in array

        int arr[] = new int[n];
        int x = sc.nextInt();       // element to be search

        for (int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        linearSearch(arr,n,x);
    }
}
