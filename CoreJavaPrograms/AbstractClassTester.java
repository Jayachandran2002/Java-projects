package exercisePackage.CoreJavaPrograms;

abstract class RRPaymentServices {
    static int counter = 1001;
    String paymentID = "S"+counter;
    int customerID;
    double balance;
    RRPaymentServices(int customerID,double balance){
        this.customerID = customerID;
        this.balance = balance;
        counter++;

    }
    double getBalance(){
        return balance;
    }
    int getCustomerID(){
        return customerID;
    }
    abstract void payBill(double amount);
}


class ShoppingPayment extends RRPaymentServices{



    ShoppingPayment(int customerID,double balance){
        super(customerID,balance);


    }

    @Override
    void payBill(double amount) {
        if (amount>0) {
            double due = balance - amount;
            System.out.println("\nCongrats you successfully made a transaction of rs." + amount + ". The payment details below");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("CustomerID: " + getCustomerID());
            System.out.println("paymentID: " + paymentID);
            System.out.println("Previous Due: " + getBalance());
            if (due>0) {
                System.out.println("Remaining Due: " + due);
            }
            if (amount > balance) {
                double wallet = amount-balance;
                System.out.println("CashBack Wallet Balance: " + wallet);
            }
        }
        else{
            System.out.println("Insufficient amount");
        }


    }
}

class CreditcardPayment extends RRPaymentServices{

    CreditcardPayment(int customerID, double balance) {
        super(customerID, balance);
    }

    @Override
    void payBill(double amount) {
        if (amount>0) {
            double due = balance - amount;
            System.out.println("\nCongrats you successfully made a transaction of rs." + amount + ". The payment details below");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("CustomerID: " + getCustomerID());
            System.out.println("paymentID: " + paymentID);
            System.out.println("Previous Due: " + getBalance());
            if (due>0) {
                System.out.println("Remaining Due: " + due);
            }
            if (amount > balance) {
                double wallet = amount-balance;
                System.out.println("CashBack Wallet Balance: " + wallet);
            }

        }
        else{
            System.out.println("Insufficient amount");
        }
    }
}

class AbstractClassTester{
    public static void main(String[] args) {
        ShoppingPayment sp = new ShoppingPayment(1001,10000.23);
        ShoppingPayment sp2 = new ShoppingPayment(1002,9000.23);
        sp.payBill(5000);
        sp2.payBill(6000);
        System.out.println("==================================");
        CreditcardPayment cp = new CreditcardPayment(1001,10000.23);
        CreditcardPayment cp2 = new CreditcardPayment(1002,9000.23);
        cp.payBill(15000);
        cp2.payBill(6000);
    }

}