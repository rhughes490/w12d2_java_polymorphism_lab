package paymentCard;

public class GiftCard implements IChargeable {

    private String vendor;
    private Double balance;


    public GiftCard(String vendor, double balance){
        this.vendor = vendor;
        this.balance = balance;
    }


    public String getVendor() {
        return vendor;
    }

    public Double getBalance() {
        return balance;
    }
    public void charge(double charge) {
        this.balance -= charge;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0.00 * purchaseAmount;
    }
}
