package DSA;

public class LengthofLastString {

    public static void main(String[] args) {
        // String s ="   fly me   to   the moon  ";
        String s ="Hello World";
        //String s ="luffy is still joyboy";
        int length = lengthOfLastString(s);
    }

    private static int lengthOfLastString(String s) {
        int len = 0;

        s = s.strip();
        System.out.println("After strip : "+s);
        System.out.println("s.length():"+s.length());
        for(int i = s.length()-1; i >= 0 && s.charAt(i) != ' '; i--){
            System.out.println("Get the current element:"+i);
            len++;
        }

        return len;
    }
}
