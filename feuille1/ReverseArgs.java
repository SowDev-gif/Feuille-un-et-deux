public class ReverseArgs {
    public static void main(String[] args) {
        // print arguments in reverse order and each argument reversed
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(new StringBuilder(args[i]).reverse().toString());
        }
    }
}
