package DSA;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        //String[] s = {"flower","flow","flight"};
        String[] s = {"dog","racecar","car"};
        System.out.println("Final Prefix ::"+longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort(strs);
        String head = strs[0];
        String tail = strs[strs.length - 1];
        for (int i = 0; i < Math.min(head.length(),tail.length()); i++) {
            if (head.charAt(i) != tail.charAt(i)) {
                break;
            }
            sb.append(head.charAt(i));
        }
        return sb.toString();
    }
}
