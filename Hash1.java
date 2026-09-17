import java.util.HashMap;
import java.util.Scanner;

public class Hash1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();
        int n = sc.nextInt();

        for(int i=0; i < n; i++){
            int element = sc.nextInt();
            String name = sc.nextLine();

            map.put(element, name);
        }

        System.out.println(map);

    }
}
