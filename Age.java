import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
       boolean hasLicense = sc.nextBoolean();
        if(age >= 18){
            if(hasLicense == true){
                System.out.println("you can drive");
            }else{
                System.out.println("Need driving license");
            }
        }else{
            System.out.println("Too young to drive");
        } 
    }
}
