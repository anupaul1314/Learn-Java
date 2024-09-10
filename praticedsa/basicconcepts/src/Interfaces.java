public class Interfaces {
    public static void main(String[] args) {
        S newObj = new S();
        newObj.show();
        newObj.config();
        System.out.println(I.place);
    }
}

interface I {

    String place = "Delhi";    // Final and static
    void show();
    void config();
}

class S implements I {
    public void show() {
        System.out.println("in a show");
    }
    public void config() {
        System.out.println("in config");
    }
}


