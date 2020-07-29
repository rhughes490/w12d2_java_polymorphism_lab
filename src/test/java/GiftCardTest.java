import org.junit.Before;
import org.junit.Test;
import paymentCard.GiftCard;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard("Boots", 50.00);
    }

    @Test
    public void getVendor() {
        assertEquals("Boots", giftCard.getVendor());
    }

    @Test
    public void getBalance() {
        assertEquals(50.00, giftCard.getBalance(), 0.01);
    }

    @Test
    public void canCharge() {
        giftCard.charge(20.00);
        assertEquals(30.00, giftCard.getBalance(), 0.01);
    }

    @Test
    public void dontHaveTransactionCharge() {
        assertEquals(0.00, giftCard.getTransactionCost(100.00), 0.01);
    }

}
