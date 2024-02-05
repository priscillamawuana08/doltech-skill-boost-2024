package org.example.ProgrammingChallenge;

public class StockCommission {
    public static void main(String[] args) {
    // Given data
    int numberOfShares = 600;
    double stockPricePerShare = 21.77;
    double commissionRate = 0.02;  // 2%

    // Calculate the amount paid for the stock alone
    double stockAmount = numberOfShares * stockPricePerShare;

    // Calculate the commission
    double commission = stockAmount * commissionRate;

    // Calculate the total amount paid (stock amount + commission)
    double totalAmountPaid = stockAmount + commission;

    System.out.println("Amount paid for the stock alone: $" + stockAmount);
    System.out.println("Commission: $" + commission);
    System.out.println("Total amount paid: $" + totalAmountPaid);
}

}
