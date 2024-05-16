package DSA;

public class Isomorphic {

    public static void main(String[] args) {
        String s = "egg", t = "add";
       // String s = "foo", t = "bar";
        System.out.println("Is Isomorphic :"+isomorphic(s,t));

    }

    public static boolean isomorphic(String s, String t){
        boolean isomorphic = true;
        int[] lastSeenPositionInS = new int[256] ;
        int[] lastSeenPositionInT = new int[256] ;

        for(int i=0; i<s.length(); i++){
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);
            System.out.println("charFromS :"+charFromS+" :charFromT :"+charFromT);

            System.out.println("lastSeenPositionInS[charFromS] :"+lastSeenPositionInS[charFromS]+
                    ":lastSeenPositionInT[charFromT]: "+lastSeenPositionInT[charFromT]);

            if(lastSeenPositionInS[charFromS] != lastSeenPositionInT[charFromT]){
                isomorphic = false;
            }

            lastSeenPositionInS[charFromS] = i+1;
            lastSeenPositionInT[charFromT] = i+1;
        }

        return isomorphic;
    }
}
