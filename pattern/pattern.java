package pattern;
import java.util.*;   //nested loops

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for(int i = 1; i <= n; i++){       //outer loop
            for(int j = 1; j <= m; j++){    //inner loop
                System.out.print("*"+" "); 
            }
        System.out.println("*");    
        }
        
    }
    
}
