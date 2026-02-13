class Armstrong {

    public static void main(String[] args) {

        int N = Integer.parseInt(IO.readln());

        for (int i = 0; i < N; i++) {

            int number = Integer.parseInt(IO.readln());
            int originalNumber = number;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum = sum + (digit * digit * digit);
                number = number / 10;
            }

            if (sum == originalNumber) {
                System.out.println("It is an ARMSTRONG number");
            } else {
                System.out.println("It is NOT an ARMSTRONG number");
            }
        }
    }
}
