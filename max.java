public class max {
     public static int max(int a){
        int min = Integer.MAX_VALUE;
        int digit;
        while(a > 0){
           digit = a % 10;
           if(digit < min){
            min = digit;
           } 
           a = a / 10;
        } return min;

     }
 public static void main(String[] args) {
    int result =  max(9874);
    System.out.println(result);
 }   
}
