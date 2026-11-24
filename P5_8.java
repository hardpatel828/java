// Write a program to implement Multiple inheritance using interface.

interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {
    public void showFather() {
        System.out.println("Father interface method");
    }

    public void showMother() {
        System.out.println("Mother interface method");
    }
}

public class P5_8 {
    public static void main(String[] args) {
        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}