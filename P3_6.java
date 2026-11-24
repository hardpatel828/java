// 6. Write a Java program using the StringBuilder class to demonstrate: append(), insert(), deleteCharAt(), replace(), reverse().

public class P3_6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt: " + sb);

        sb.replace(0, 4, "Python");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}