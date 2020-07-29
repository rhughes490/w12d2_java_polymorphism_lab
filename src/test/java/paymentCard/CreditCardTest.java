package paymentCard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard("9004253720932020", "01/07/23", "593", 5000.00);
    }

    @Test
    public void hasCardNumber() {
        assertEquals("9004253720932020", creditCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
        assertEquals("01/07/23", creditCard.getExpiryDate());
    }

    @Test
    public void hasSecurityNumber() {
        assertEquals("593", creditCard.getSecurityNumber());
    }

    @Test
    public void hasCreditLimit(){
        assertEquals(5000.00, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void canSetCreditLimit(){
        creditCard.setCreditLimit(6000.00);
        assertEquals(6000.00, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void canGetTransactionCost() {
        assertEquals(2.00, creditCard.getTransactionCost(100.00), 0.01);
    }

}
