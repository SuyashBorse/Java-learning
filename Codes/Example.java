public class Example {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("some thing went wrong");
        }
        System.out.println(j);
    }
}
