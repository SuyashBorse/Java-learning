
interface A{
       int sum(int i, int j);
}
public class Intexp {
      public static void main(String[] args) {
           
        A obj = (i,j)  -> i+j;

        int result = obj.sum(3, 5);
        System.out.println(result);

      }
}
  