package paymentCard;

import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {

    private String cardNumber;
    private String expiryDate;
    private String securityNumber;
    private ArrayList<Double> charges;
    private double transactionCostRate;

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public PaymentCard(String cardNumber, String expiryDate, String securityNumber, double transactionCostRate) {
    this.cardNumber = cardNumber;
    this.expiryDate = expiryDate;
    this.securityNumber = securityNumber;
    this.charges = new ArrayList<Double>();
    this.transactionCostRate = transactionCostRate;
  }

  public String getCardNumber() {
    return this.cardNumber;
  }

  public String getExpiryDate() {
    return this.expiryDate;
  }

  public String getSecurityNumber() {
    return this.securityNumber;
  }

  public double getTransactionCost(double purchaseAmount) {
    return purchaseAmount * this.transactionCostRate;
  }

  public void charge(double purchaseAmount) {
    this.charges.add(purchaseAmount);
  }
}
