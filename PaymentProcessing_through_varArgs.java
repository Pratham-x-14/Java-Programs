public class PaymentProcessing_through_varArgs
{
    void main()
    {
        paymentGateway(new CreditCardPayment(),new DebitCardPayment(),new UPIPayment());
    }
        public static void paymentGateway(Payment ...payments)
        {
            for(Payment p : payments)
            {
                p.processPayment();
            }
        }
    
} 

class Payment
{
    public void processPayment() 
    {
        IO.println("Generic payment processing message");
    }
}

class CreditCardPayment extends Payment
{
    @Override
    public void processPayment()
    {
        IO.println("Processing Credit card payment");
    }
}
class DebitCardPayment extends Payment
{
    @Override
    public void processPayment()
    {
        IO.println("Processing Debit card payment");
    }
}
class UPIPayment extends Payment
{
    @Override
    public void processPayment()
    {
        IO.println("Processing UPI payment");
    }
}