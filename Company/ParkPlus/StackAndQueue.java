import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for(int index = 0; index < n; index++){
            arr[index] = sc.nextLong();
        }
        long left = arr[0];
        long right = 0;
        for(int i = n - k + 1; i < n; i++){
            right += arr[i];
        }
        int left_add = 1;
        int right_remove = n - k + 1;
        int count = k - 1;
        long ans = left + right;
        while(count != 0){
            left += arr[left_add];
            left_add = left_add + 1;
            right -= arr[right_remove];
            right_remove = right_remove + 1;
            if(ans < left + right){
                ans = left + right;
            }
            count = count - 1;
        }
        System.out.println(ans);
    }
}
