public class IsomorphicStringOrNotQ6 {
    public static boolean isIsomorphic(String a,String b){
        if (a.length() != b.length()) {
            return false;
        }
        char mapA[] = new char[256];
        char mapB[] = new char[256];
        
        for (int i = 0; i < a.length(); i++) {
            char charA = a.charAt(i);
            char charB = b.charAt(i);

            if(mapA[charA] == 0 && mapB[charB]==0){
                mapA[charA] = charB;
                mapB[charB] = charA;
            }
            else if (mapA[charA] != charB || mapB[charB] != charA) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "aabbcc";
        String b = "xxyyzz";
        if(a.length()!=b.length()){
            System.out.println("Given String length is not equal. Therefore Strings are not isomorphic");
        }
        if (isIsomorphic(a, b)) {
            System.out.println("The given Strings are isomorphic");
        }
        else{
            System.out.println("The given string are not isomorphic");
        }
    }
}
