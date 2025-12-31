public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {0,2,4,8,6,0,9,0,5};
        int ans[] = new int[arr.length];
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
