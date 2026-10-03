import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);

    //    for(int i=0; i < list.size(); i++){
    //     System.out.println(list.get(i));
    //    }

       list.set(2, 50);
       System.out.println(list.get(2));

       list.remove(2);
       System.out.println(list.get(2));

       list.add(90);
       list.set(3, 100);
    

    //    for(int i=0; i < list.size(); i++){
    //     System.out.println(list.get(i));
    //    }

       System.out.println("The size of the list is "+list.size());


       for(int a:list){
        System.out.println(a);
       }
        

       list.clear();
       
    }
}
