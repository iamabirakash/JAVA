import java.util.HashSet;
import java.util.Iterator;

public class hasshing {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();
        //Arraylist<Integer> list = new Arraylist<>()

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //duplicates does'nr get added

        //size
        System.out.println("Size of set is : " + set.size());

        //printing all elements
        System.out.println(set);

        //search-contains
        if(set.contains(1)) {
            System.out.println("Set conatins");
        } 
        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("Does not contain 1");
        }

        set.add(1);

        //iterator
        Iterator it = set.iterator(); //"it" is used for storing the values of the iterator
        //hasNext, Next
        //Next --> gives us the vlaue next to the we are in...Null-->1-->2-->3.......
        //hasNext has two values True and False...it gives us True when there is any element after the another
        //it gives us False when there is no any element that is it is the last element of the set

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
