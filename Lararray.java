
public class Lararray {
    public static int largest ( int large[] ){
        int largest1 = Integer.MIN_VALUE;

        for(int i=0; i < large.length; i++){
             if(large[i] > largest1){
                largest1 = large[i];
             }  
        } return largest1;
    }


    public static void main(String[] args) {
        int large[] ={1,2,6,3,5};

        System.out.println("The largest of the numbers is "+ largest(large));
    }
}
