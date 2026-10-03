import java.util.Scanner;

public class Array1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i=0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for(int i=0; i < 5; i++){
            if(arr[i] > arr[i+1]){
                largest = arr[i];
            }
        }
    }
}
