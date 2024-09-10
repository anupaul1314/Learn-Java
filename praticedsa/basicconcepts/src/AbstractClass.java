
public class AbstractClass {
    public static void main(String[] args) {
        Men obj = new Men("John", 10);
        obj.canWalk();
    }
}

abstract class Humans {
    abstract void canWalk();   //Abstract Method
    void canTalk() {
        System.out.println("Humans can Talk");
    }

    Humans(String name, int age) {           //Constructor
        System.out.println("Humans have name and age");
    }
}

abstract class Women extends Humans {

    Women(String name, int age) {
        super(name, age);
    }
}

class Men extends Humans {

    Men(String name, int age) {
        super(name, age);
    }

    void canWalk() {
        System.out.println("Humans can walk.");
    }
}
