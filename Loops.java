import java.util.*;
public class Loops {
    public static void main(String[] args) {
        //for(int counter = 0; counter < 100; counter = counter + 1){
        //for(int counter = 0; counter < 11 ; counter++){   //counter++ ==> counter = counter + 1
            //System.out.print(counter+" ");
        //for(int i = 0; i < 11; i++){
            //System.out.print(i+" ");
        Scanner sc = new Scanner(System.in);    //printing sum of first n numbers
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=0; i<=n; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
