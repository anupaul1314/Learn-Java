public class LogicalOperators {
    public static void main(String[] args) {
        //And
        int a= 40;
        int b=30;
        if (a<50 && b<50) // both should be true
            System.out.println("both are less than 50");

        //Or
        if (a<50 || b<50) // any one of them true
            System.out.println("both are less than 50");

        //Not Operator
        boolean isAdult = true;
        if (!isAdult)
            System.out.println("is adult");
        else
            System.out.println("Not Adult");
    }
}
