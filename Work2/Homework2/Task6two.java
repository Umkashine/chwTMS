package Work2.Homework2;

public class Task6two {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        a = a + b - (b = a);
        System.out.println(a+","+b);
    }
}
