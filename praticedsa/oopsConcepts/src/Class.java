
class Car {
    String name;
    int modalNumber;

     void printInfo() {
        System.out.println("Name : "+name);
        System.out.println("Modal Number : "+modalNumber);
    }

    Car(String name, int modalNumber) {
        this.name = name;
        this.modalNumber = modalNumber;
    }
}

public class Class {
    public static void main(String[] args) {
        Car tata = new Car("Nexon",100);  // Object of Car class
        tata.printInfo();

        Car maruti = new Car("Maruti", 200);
        maruti.printInfo();

    }
}
