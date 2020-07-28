package paymentCard;

public class DebitCard extends PaymentCard{

  private int sortCode;
  private int accountNumber;

  public DebitCard(String cardNumber, String expiryDate, String securityNumber, int sortCode, int accountNumber) {
    super(cardNumber, expiryDate, securityNumber, 0.01);
    this.sortCode = sortCode;
    this.accountNumber = accountNumber;
  }

}
