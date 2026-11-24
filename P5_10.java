// Write a program to implement following scenario.

interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class D {
    void methodD() {
        System.out.println("Method of Class D");
    }
}

class E extends D implements C {
    public void methodA() {
        System.out.println("Method of Interface A");
    }

    public void methodB() {
        System.out.println("Method of Interface B");
    }

    public void methodC() {
        System.out.println("Method of Interface C");
    }
}

public class P5_10 {
    public static void main(String[] args) {
        E obj = new E();

        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }
}