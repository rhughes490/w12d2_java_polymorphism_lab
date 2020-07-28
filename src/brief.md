### Polymorphism Lab

An online retailer wants you to model an `OnlineAccount` used by them to charge customers and keep track of transaction costs via `ReportingSoftware`. Different cards incur different costs imposed by the issuer. Gift cards incur no cost as they are issued by the retailer. Credit cards have a fixed percentage and a risk multiplier. Debit cards charge a fixed percentage.

- `paymentCard.CreditCard`
- `paymentCard.DebitCard`
- `paymentCard.GiftCard`

<hr>

- Perhaps some of these cards could inherit from a `paymentCard.PaymentCard`?    
- In order to have the flexibility to charge, log transactions (via `ReportingSoftware`), and store a list of these different types of card there should be a `paymentCard.IChargeable` Interface that your classes `implement`
- TDD a solution. Making a class diagram would be a useful planning exercise.

<hr>

<details>
    <summary>We need more help! (Click the arrow!)</summary>
    
### paymentCard.IChargeable

```java
    double getTransactionCost(double purchaseAmount);
    void charge(double purchaseAmount);
```

### paymentCard.PaymentCard
#### Abstract class `implements paymentCard.IChargeable`
- `cardNumber`
- `expiryDate`
- `securityNumber`
- `charges`
- Charging implies updating the list of `charges`

### paymentCard.CreditCard
#### Concrete class `extends paymentCard.PaymentCard`
- `customerRiskMultiplier`
- `creditLimit`

- Charging implies reducing the credit limit
- Should be able calculate transaction cost of 2% and account for `customerRiskMultiplier`

### paymentCard.DebitCard
#### Concrete class `extends paymentCard.PaymentCard`
- `sortCode`
- `accountNumber`

- Should be able calculate transaction cost of 1%
- Charging has no implementation (left to superclass)

### paymentCard.GiftCard
#### Concrete class - no Superclass, `implements paymentCard.IChargeable`
- `vendor`
- `balance`

- Charging implies reducing the balance
- The transaction cost is zero
- Transactions are not logged

### OnlineAccount
#### Concrete class - no relation to other classes via extends / implements
- `name`
- `paymentMethods`
- `reportingSoftware`

- Should be able to `chargeCustomer(...)` via a selected `paymentMethod` and tell the `reportingSoftware` to log the cost of the transaction

### ReportingSoftware 
#### Concrete class - no relation to other classes via extends / implements
- `transactionCosts`

- Should be able to add to list of transaction costs
</details>



