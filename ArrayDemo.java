import java.util.Scanner;

public class ArrayDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[6];

        System.out.println("enter array elements:");
        for(int i=0; i < marks.length; i++){
            marks[i] = sc.nextInt();
        }

//        for(int i=0; i < marks.length; i++){
//            System.out.println(marks[i]);
//        }
//

//        int sum = 0;
//        for(int i = 0; i < marks.length; i++){
//            sum =+ marks[i];
//        } System.out.println(sum);

//        int largest = Integer.MIN_VALUE;
//        for(int i=0; i < marks.length; i++) {
//            if (marks[i] > largest) {
//                largest = marks[i];
//            }
//        }
//            System.out.println("largest is :" +largest);
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i < marks.length; i++){
            if(marks[i] < smallest){
                smallest = marks[i];
            }
        }
        System.out.println("The smallest is: "+smallest);

    }
}
