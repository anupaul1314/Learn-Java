public class FactorialRecu {
    public static int recursivefac(){
        int n =0;
        if (n==0){
            return 1;
        }
        int t = n* (n-1);
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {

    }
}

