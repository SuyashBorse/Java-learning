import java.util.HashSet;
import java.util.*;

public class Set1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        
        int n = sc.nextInt(); 
        for(int i=0; i < n; i++){
            int element = sc.nextInt();

            set.add(element);
        }



         int x = sc.nextInt();
         System.out.println(set.contains(x));

        System.out.println(set);

        System.out.println(set.contains(30));

        System.out.println(set.isEmpty());
        System.out.println(set.hashCode());

        set.clear();
        System.out.println(set.isEmpty());


        
    }
}
