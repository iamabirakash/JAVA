public class startswithtrie {
    static class Node{
        Node[] children;
        boolean eow;  //end of word

        public Node() {
            children = new Node[26]; // a to z
            for(int i = 0; i<26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int i = 0; i<word.length() ;i++) {   //0(L)
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                //add new note
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1) {
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int i = 0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(curr.children[idx] == null) {
                return false;
            }
            if(i == key.length()-1 && node.eow == false) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static boolean wordBreak(String key) {
        if(key.length()==0) {
            return true;
        }

        for(int i = 1; i<=key.length(); i++) {
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;

        for(int i = 0; i<prefix.length();i++) {
            int idx = prefix.charAt(i)-'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple","app","mango","man","woman"};
        String prefix = "app";

        for(int i = 0; i<words.length;i++) {
            insert(words[i]);
        }

        System.out.println(startsWith(prefix));
    }
}
