
// Single level Inheritence
class Shape {
    public void area() {
        System.out.print("Area");
    }
    public void volume() {
        System.out.println("Volume");
    }
}

class Triangle extends Shape {

}

public class Inheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.volume();
    }
}
