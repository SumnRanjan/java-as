package BasicMath;

public class ReverseInt {
    public static int revInteger(int num){
        int temp = num;
        int rev = 0;
        while(temp != 0){
            rev = temp % 10 + rev * 10;
            temp = temp / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(revInteger(num));
    }
}
