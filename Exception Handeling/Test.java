public class Test {

    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("CHAL NIKAL");
        }

        System.out.println("Eligible");
    }
}
