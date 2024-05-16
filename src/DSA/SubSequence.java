package DSA;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println("Subsequence found ??? : "+isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {

        int sLength = s.length(), tLength = t.length();
        int sPointer =0, tPointer=0;
        while (sPointer < sLength && tPointer < tLength){
            if(s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++;
                tPointer++;
            }else{
                tPointer++;
            }
        }
        return  (sPointer == sLength);
    }
}
