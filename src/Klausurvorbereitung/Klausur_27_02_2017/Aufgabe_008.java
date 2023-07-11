package Klausurvorbereitung.Klausur_27_02_2017;

public class Aufgabe_008 {
    public static void main(String[] args) {
        A einA = new A();
        einA.print();
        A einB = new B();
        einB.print();
        System.out.println("B: " + einB.x);
        C einC = new C();
        einC.print();
        System.out.println("C: " + einC.x);
    }
}

class A {
    static int z;
    int x;

    public A() {
        z = 5;
        x = 1;
    }

    public void print() {
        System.out.println("A: " + z++);
        System.out.println("A: " + ++x);
    }

}

class B extends A {
    int x;

    public B() {
        x = 2;
    }

    public void print() {
        System.out.println("B: " + z++);
        System.out.println("B: " + ++x);
    }
}

class C extends B {
    int x;

    public void print() {
        System.out.println("C: " + ++z);
        System.out.println("C: " + ++super.x);
        super.print();
    }
}
