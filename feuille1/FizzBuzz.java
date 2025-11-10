public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean f = (i % 5 == 0);
            boolean b = (i % 7 == 0);
            if (f && b) System.out.println("fizzbuzz");
            else if (f) System.out.println("fizz");
            else if (b) System.out.println("buzz");
            else System.out.println(i);
        }
    }
}
