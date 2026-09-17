public class Arraycc {
    public static void linearSer(int num[], int key) {
        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                System.out.println("Key found at index: " + i);
                found = true;
                break; // Stop searching once key is found
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        
        // Pass 'num', NOT 'num[]'
        linearSer(num, key); 
    }
}