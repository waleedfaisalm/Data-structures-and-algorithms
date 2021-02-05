import java.util.ArrayList;
import java.util.Arrays;

public class pr3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3,4,5,6};
        ArrayList<Integer> arr_new = new ArrayList<>();
        int j=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new.add(arr[i]);

            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" +arr_new);

    }
}
