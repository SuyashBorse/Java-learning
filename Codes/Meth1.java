public class Meth1 {
    int modulo(int a, int b){
        return  a%b;
    }
    int modulo(int a , int b , int c){
        return  a%b%c;
    }

    double modulo(double a, double b){
        return a%b;
    }

    public static void main(String[] args) {
        Meth1 m = new Meth1();

        System.out.println(m.modulo(20, 10 ));
        System.out.println(m.modulo(10, 20, 10));
        System.out.println(m.modulo(20.5, 5.0));
    }
}
