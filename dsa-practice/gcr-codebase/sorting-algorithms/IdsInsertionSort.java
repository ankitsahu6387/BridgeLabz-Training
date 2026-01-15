import java.util.*;
public class IdsInsertionSort {
    public static void main(String[] args) {
        int[] ids = { 105, 42, 73, 91, 66 };
        for(int i=1; i<ids.length; i++){
            int key = ids[i];
            int j = i - 1;
            while(j>=0 && ids[j]>key){
                ids[j+1] = ids[j];
                j--;
            }
            ids[j+1] = key;
        }      
        System.out.println("Sorted IDs:");
        System.out.println(Arrays.toString(ids));
    }
}
