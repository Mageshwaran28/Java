import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        String str = Integer.toString(number);
        int[] arr = new int[str.length()];
        int index = 0;
        while(number>0){
            arr[index++] = number%10;
            number/=10;
        }
        mergeSort(arr, 0, arr.length - 1);
        display(arr);
        sc.close();
    }

    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
    }

    static void mergeSort(int[] arr, int left, int right) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for( i = 0; i < n1; i++){
            L[i] = arr[left+i];
        }
        for(j=0; j < n2; j++){
            R[j] = arr[mid+1+j];
        }
        i=0;
        j=0;
        k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }
            else{
                arr[k++]=R[j++];
            }
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
    }
}
