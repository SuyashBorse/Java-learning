<<<<<<< HEAD
import java.lang.*;
public class GCD {
    public static void main(String[] args) {
        int a = 9;
        int b = 15;
        int gcd = 1;

        for(int i=2; i<=Math.min(a, b); i++){
            if(a % i ==0 && b % i ==0){
                gcd = i;
            } 
        }System.out.println(gcd);
    }
}
=======
import java.lang.*;
public class GCD {
    public static void main(String[] args) {
        int a = 9;
        int b = 15;
        int gcd = 1;

        for(int i=2; i<=Math.min(a, b); i++){
            if(a % i ==0 && b % i ==0){
                gcd = i;
            } 
        }System.out.println(gcd);
    }
}
>>>>>>> bb65199 (New codes added)
