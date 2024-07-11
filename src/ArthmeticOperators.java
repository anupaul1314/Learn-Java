
public class ArthmeticOperators {
    public static void main(String[] args) {
        double num1 = 4;
        double num2 = 5;

        //add
        double sum = num1+num2;
        System.out.println(sum); //9

        //subtract
        double sub = num2-num1;
        System.out.println(sub);//1

        //multiply
        double multi = num1*num2;
        System.out.println(multi);// 20

        //divide
        double div = num1/num2;
        System.out.println(div);//0.8

        //modulus
        double modulu = num2%num1;
        System.out.println(modulu);//1

        //uniary operator
        int numb = 1;
        System.out.println(numb++); //1
        System.out.println(numb); //2
        System.out.println(++numb);//3
        System.out.println(numb);//3
        //Same for Subtraction
    }
}
