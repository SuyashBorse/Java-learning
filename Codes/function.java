public class function {
      
    public static void checkPossitive(int a){
       int temp = 0;
       while (a > 0) {
          temp = a % 10;
          a = a/10;
          System.out.print(temp);
       } 
        
    }
    public static void main(String[] args) {
       
     checkPossitive(32456  );
    }
}
