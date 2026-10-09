public class Person {
    void marriagemeet(){
        System.out.println("Lets attend the marriage");
    }
}
 class Friend extends Person {
   void marriagemeet(){
    System.out.println("Free food lets go");
   }
    
}
 class Relative extends Person{
    void marriagemeet(){
        System.out.println("Relative asked - in which class you are");
    }
}

 class Main {
   public static void main(String[] args) {
    Person p;

    p = new Friend();
    p.marriagemeet();

    p = new Relative();
    p.marriagemeet();
   }
}
