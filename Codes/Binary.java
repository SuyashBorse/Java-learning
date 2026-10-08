public class Binary {
    public static int binarySearch(int number[], int key){

        int start = 0;
        int end = number.length-1;
        int mid = (start + end)/2;
       
        while(start <= end){
            if(number[mid] == key){
                return mid; 
            } 
            if(number[mid] > key){
               end = mid-1;
            } else if(number[mid] < key){
                start = mid+1;
            }
        }  return -1; 
      
           
    }  
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 10;
       
       if(binarySearch(number, key) == -1){
        System.out.println("Invalid key : number not found");
       }else{
         System.out.println("The key is at index "+ binarySearch(number, key));
       }
       

    }
}
