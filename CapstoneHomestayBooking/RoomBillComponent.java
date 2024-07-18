package exercisePackage.CapstoneHomestayBooking;

public interface RoomBillComponent {
    double tax = 0.12;
    double extraPersonCharge = 500.00;
    double foodCharge = 800.00;

    double calculateBill();

}
