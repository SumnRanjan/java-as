package Recursion;

public class Permutation2 {
    public static void generatePermutation(String str , String ans) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        boolean [] vis = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!vis[ch - 97]) {
                vis[ch - 97] = true;
                generatePermutation(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String str = "aa";
        generatePermutation(str , "");
    }
}
