package exercisePackage;

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
           SingleEventRegistration ser = new SingleEventRegistration( "Jenny", "Single & Win",1);

           System.out.print(ser.name);
           ser.setRegistrationFee(150);
           System.out.println(ser.getRegistrationFee());

           TeamEventRegistration ter = new TeamEventRegistration( "jai", "sis",3, 3);
           ter.setRegistrationFee(5,50);
           System.out.print(ter.name);
           System.out.println(ter.getRegistrationFee());



    }
}
