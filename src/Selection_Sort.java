import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Selection_Sort {
    public void algorithm(int n,int arr[]){
        for (int i=0;i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void print(int n,int[] arr){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Selection_Sort obj = new Selection_Sort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements to be sorted :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.algorithm(n,arr);
        obj.print(n,arr);
    }
}
