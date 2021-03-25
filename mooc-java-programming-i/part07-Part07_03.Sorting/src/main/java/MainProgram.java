
public class MainProgram {

    public static void main(String[] args) {
        int[] array = {-1, 3, 1, 2};
        System.out.println(indexOfSmallestFrom(array, 2));
    }
    
    public static int smallest(int[] array){
        int smallestIndex = indexOfSmallest(array);
        return array[smallestIndex];
    }
    
    public static int indexOfSmallest(int[] array){
        return indexOfSmallestFrom(array, 0);
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {            
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}   

