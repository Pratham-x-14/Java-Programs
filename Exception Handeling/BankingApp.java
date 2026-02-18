import java.sql.SQLException;

// Custom Checked Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankService {

    public void transferMoney(double balance, double amount)
            throws InsufficientBalanceException, SQLException {

        // Business validation
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }

        // Simulating DB failure
        if (amount > 50000) {
            throw new SQLException("Database connection failed");
        }

        System.out.println("Money transferred successfully");
    }
}


public class BankingApp {

    public static void main(String[] args) {

        BankService service = new BankService();
		

        try {
			 IO.print("Enter your current balance: ");
             double balance = Double.parseDouble(IO.readln());

			 IO.print("Enter your amount: ");
             double amount = Double.parseDouble(IO.readln());

			 service.transferMoney(balance,amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Business Error: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("System Error: " + e.getMessage());
        }
    }
}

