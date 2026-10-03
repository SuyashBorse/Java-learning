import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int A[] = new int[n];

        for(int i=0; i < n; i++){
            
            System.out.println("Enter the N");
            A[i] = sc.nextInt();
        }

        for(int i=0; i < n; i++){
            System.out.println(A[i]);
        }
    }
}
