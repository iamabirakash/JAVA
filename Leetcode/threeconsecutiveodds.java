package Leetcode;

public class threeconsecutiveodds {

    public boolean threeConsecutiveOdd(int[] arr) {
        boolean a = false;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                a = true;
            }
        }
        return a;
    
    }
    public static void main(String[] args) {
        threeconsecutiveodds solution = new threeconsecutiveodds();
        int[] arr = {2, 6, 4, 1, 3, 5}; // Example array
        boolean result = solution.threeConsecutiveOdd(arr);
        System.out.println("Three consecutive odds: " + result);
    }
}
