import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Add a num n");
        int n = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            counter += i*2;
        }
           System.out.println(counter);
    }
}
