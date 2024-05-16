package DSA;

public class FirstOccurence {
    public static void main(String[] args) {
//        String hayStack = "sadbutsad";
//        String needle = "sad";

        String hayStack = "leetcode";
        String needle = "leeto";

        firstOccurance(hayStack,needle);
    }

    private static void firstOccurance(String hayStack, String needle) {
        int index = -1;
        if(hayStack.contains(needle)){
             index =  hayStack.indexOf(needle);
        }
        System.out.println("Index :"+index+": hayStack :"+hayStack+": needle :"+needle);
    }
}
