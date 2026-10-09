import java.util.*;
public class Marks {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    int marks = sc.nextInt();

    if(marks >= 90){
        System.out.println("Grade A");
    }else if(marks >= 75){
        System.out.println("Grade B");
    }else if(marks >= 40){
        System.out.println("Grade C");
    }else{
        System.out.println("Failed");
    }
}
}

