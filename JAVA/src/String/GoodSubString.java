package String;

public class GoodSubString {

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static int goodSubString(String str){
        int max = 0;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(isVowel(ch)){
                int count = 0;
                StringBuilder s = new StringBuilder();
                while (i < str.length() && isVowel(str.charAt(i))){
                    count++;
                    s.append(str.charAt(i));
                    i++;
                }
                if(count > max){
                    max = count;
                    ans = s.toString();
                }
            }
        }
        System.out.println(ans);
        return max;
    }

    public static void main(String[] args) {
        String str = "caeiocdefgaeiouaeiou";
        int ans = goodSubString(str);
        System.out.println(ans);
    }
}
