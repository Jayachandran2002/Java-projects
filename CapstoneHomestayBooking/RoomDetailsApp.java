package exercisePackage.CapstoneHomestayBooking;

import java.util.Scanner;



public class RoomDetailsApp extends RoomDetails{

    public RoomDetailsApp(RoomDetails obj) {
        System.out.println("\n\n================================");
        System.out.println("Counter Number: " + counter);
        System.out.println("BillID: " + obj.getBillID());
        System.out.println("Customer Name: " + obj.getCustomerName());
        System.out.println("No.of Days Stay: " + obj.getNoOfDaysStay());
        System.out.println("Total Bill Amount: " + obj.calculateBill());

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your bill ID: ");
            int billId = sc.nextInt();
            System.out.print("Enter Your Name: ");
            String name = sc.next();
            System.out.print("Enter Your Room type: ");
            String roomType = sc.next();
            System.out.print("Enter no.of days you stayed: ");
            int noOfDaysStay = sc.nextInt();
            System.out.print("Enter no.of Extra person: ");
            int noOfExtraPerson = sc.nextInt();

            RoomDetails roomDetails = new RoomDetails(billId, noOfDaysStay, noOfExtraPerson, name, roomType);
            new RoomDetailsApp(roomDetails);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
