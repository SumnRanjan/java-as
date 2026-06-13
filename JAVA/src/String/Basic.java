package String;

public class Basic {
    public static void main(String[] args) {
//        String str = new String("Hello");
        String str = "Hello";
        System.out.println(str);

        String s = "hello";  // creates "hello" in the string pool (if not already present)
        String s1 = "hello"; // refers to the same "hello" from the pool

        System.out.println(s == s1);       // true (same reference)
//        System.out.println(s.equals(s1));  // true (same content)

        Integer a = 10;
        Integer b = 10;

        System.out.println(a  == b);


    }
}
