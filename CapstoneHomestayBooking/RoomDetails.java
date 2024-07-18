package exercisePackage.CapstoneHomestayBooking;

public class RoomDetails implements RoomBillComponent {
    private int billID;
    private String customerName;
    private String typeOfRoom;
    private int noOfExtraPerson;
    private int noOfDaysStay;
    private final String[] roomTypes = {"standard", "deluxe", "cottage"};
    static int counter = 0;

    public RoomDetails(int billID, int noOfDaysStay, int noOfExtraPerson, String customerName, String typeOfRoom) {
        this.billID = billID;
        this.noOfDaysStay = noOfDaysStay;
        this.noOfExtraPerson = noOfExtraPerson;
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom.toLowerCase();
        counter++;
    }

    public RoomDetails() {

    }

    public int getBillID() {
        return billID;
    }

//    public int getNoOfExtraPerson() {
//        return noOfExtraPerson;
//    }
//
//    public String getTypeOfRoom() {
//        return typeOfRoom;
//    }

    public String getCustomerName() {
        return customerName;
    }

    public int getNoOfDaysStay() {
        return noOfDaysStay;
    }

    private boolean validateNoOfExtraPerson() {
        return noOfExtraPerson < 2;
    }

    private boolean validateTypeOfRoom() {

        for (String s : roomTypes) {
            if(s.equals(typeOfRoom)){
                return true;
            }
        }
        return false;
    }

    private boolean validateNoOfDaysOfStay() {
        return noOfDaysStay >= 1 && noOfDaysStay <= 15;
    }

    @Override
    public double calculateBill() {
        if (!validateNoOfDaysOfStay() || !validateNoOfExtraPerson() || !validateTypeOfRoom()) {
            System.out.println("Error in fetching total bill amount ");
            return -1;
        }
            int baseRoomFare = switch (typeOfRoom.toLowerCase()) {
                case "standard" -> 2500;
                case "deluxe" -> 3500;
                default -> 5500;
            };

            double totalBill = (noOfDaysStay * baseRoomFare) + noOfDaysStay * (foodCharge) + (extraPersonCharge * noOfExtraPerson);

            totalBill = totalBill + tax * totalBill;

            return totalBill;


    }
}




