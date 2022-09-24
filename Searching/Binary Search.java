package Concepts;

import java.util.Scanner;

public class Binary_Search {

    public static void binarySearch(int arr[], int n, int x){
        int l=0, r= n-1;
        int m;
        while(l<=r){
            m = l +(r-l)/2;

            if (arr[m]==x){
                System.out.println(m);
                return;
            }
            else if ( arr[m]<x){
                r = m-1;
            }
            else {
                l = m +1;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        int x = sc.nextInt();

        for (int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        binarySearch(arr,n,x);
    }
}
