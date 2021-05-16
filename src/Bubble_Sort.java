import java.util.Scanner;

public class Bubble_Sort {
    public void algorithm(int n,int arr[]){
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
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
