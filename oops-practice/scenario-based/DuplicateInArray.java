import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.print("Enter element: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]==arr[j]){
                    if(!ans.contains(arr[i])) ans.add(arr[i]);
                }
            }
        }
        System.out.print("Duplicat eelements are: ");
        for(int ele: ans) System.out.print(ele+" ");
    }
}
