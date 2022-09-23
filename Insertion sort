package NewtonClass;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int a[], int n){
        for (int i=1; i<n; i++){  // starting from 2nd element
            int key = a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){  // go back
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;  // fitting into the right position
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        insertionSort(a, n);

        for (int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
