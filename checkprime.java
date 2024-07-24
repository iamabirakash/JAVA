// import java.util.*;

public class checkprime {
    // int a = 30//2+1;
    public static int main(String[] args) {
        for(int i = 10; i <=30; i++) {
            for(int j = 2; j <= 30; j++) {
                if(i%j==0) {
                    return 1;
                } else {
                    System.out.println(i);
                }
            }
        }
    return 0;
    }
}
