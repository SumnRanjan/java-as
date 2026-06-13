package String;

public class subString {
    public static void subStrings(String str , int i , int j){
        if(i == str.length()){
            return;
        }

        if(j == str.length() + 1){
            subStrings(str , i + 1 , i +  1);
       }else{
            System.out.println(str.substring(i , j));
            subStrings(str , i , j + 1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        subStrings(str , 0 , 1);
    }
}
