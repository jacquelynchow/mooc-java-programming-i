
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {0, 1, 5, 10};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int num : array){
            for(int i=0; i<num; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

}
