package Leetcode;
import java.util.*;
public class even_no_digits {
    public static int findNumbers(int[] nums) {
        int evencount = 0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int count = 0;
            while(a>0){
                a = a/10;
                count++;
            }
            if(count%2==0){
                evencount++;
                count=0;
            }
        }
        return evencount;
    }

    public static void main(String[] args) {
        int[] nums = {12, 3456, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println("The number of integers with an even number of digits is: " + result); // Output: 2
    }
}
