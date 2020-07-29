package paymentCard;

public class CreditCard extends PaymentCard {

    private double creditLimit;

    public CreditCard(String cardNumber, String expiryDate, String securityNumber, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber, 0.02);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

     public void charge(double purchaseAmount) {
         // credit card specific code
         super.charge(purchaseAmount);
     }

}