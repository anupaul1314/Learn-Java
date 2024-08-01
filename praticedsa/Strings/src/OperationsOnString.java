import java.util.Arrays;

public class OperationsOnString {
    public static void main(String[] args) {
        //frequenciesOfElements();
        //Fun();
        //changeReference();
        //isPalindromeStr("ABBA");
        //subsequencesStr("subsequence","sue");
        //isAnagram("listen","silent");
        //leftMost("abbcc");
        //reverseWords("I am going");
        //patSearch("ABCABCD","ABCD");
        patSearchDist("ABCABCD","ABCD");
    }

    public static void frequenciesOfElements() {
        String str = "geeksforgeeks";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
        System.out.println(str);
    }

    public static void inbuiltFun() {
        String str = "geeks";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));
    }

    public static void Fun() {
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        //Contains Function
        System.out.println(s1.contains(s2));

        //Equals Function
        System.out.println(s1.equals(s2));

        //Compare To
        int res = s1.compareTo(s2);
        if (res == 0)
            System.out.println("Same");
        else if (res > 0)
            System.out.println("s1 Greater");
        else
            System.out.println("s2 Smaller");

        //indexOf Function
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s2, 1));
    }

    public static void changeReference() {
        String s1 = "geeks";
        String s2 = s1;
        s1 = s1 + "forgeeks";
        System.out.println(s1);
    }

    public static Boolean isPalindromeStr(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        System.out.println(str.equals(rev.toString()));
        return str.equals(rev.toString());
    }

    public static Boolean subsequencesStr(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        System.out.println(j == m);
        return (j == m);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char arr[] = s1.toCharArray();
        Arrays.sort(arr);
        s1 = new String(arr);
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr2);
        s2 = new String(arr2);
        System.out.println(s1.equals(s2));
        return s1.equals(s2);
    }

    public static int leftMost(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(i);
                    return i;
                }
            }
        }
        System.out.println(-1);
        return -1;
    }

    public static void reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        System.out.println(reversed);
    }

    public static void patSearch(String str, String pat){
        int n = str.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++){
            int j;
            for (j=0; j<m; j++){
                if (pat.charAt(j) != str.charAt(i + j)){
                    break;
                }
            }
            if (j==m){
                System.out.println(i);
            }
        }
    }

    public static void patSearchDist(String txt, String patrn){
        int n = txt.length();
        int m = patrn.length();
        for (int i=0; i<=n-m;){
            int j;
            for (j=0; j<m; j++){
                if (patrn.charAt(j) != txt.charAt(i+j)){
                    break;
                }
            }
            if (j==m){
                System.out.println(i+" ");
            }
            if (j==0){
                i++;
            }else {
                i=i+j;
            }
        }
    }
}
