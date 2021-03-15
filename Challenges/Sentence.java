package String;
//"Hello, how are you doing"
public class Sentence {
    public static void main(String[] args) {
        String str = "Hello, how are you doing";

        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<='z' && str.charAt(i)>='A')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
