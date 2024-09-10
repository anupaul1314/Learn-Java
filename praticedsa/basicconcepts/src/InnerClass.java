
public class InnerClass {
    public static void main(String[] args) {
        A object = new A();
        object.vowel();
        A.B obj = object.new B();
        obj.value();

        //Anonymous Inner CLass Without making inner class.
        A object11 = new A(){
            public void vowel() {
                System.out.println("Value of the Alphabet");
            }
        };
        object11.vowel();
    }
}

class A {
    void vowel() {
        System.out.println("Vowel");
    }
    class B {
        void value() {
            System.out.println("Value of the Alphabet");
        }
    }
}
