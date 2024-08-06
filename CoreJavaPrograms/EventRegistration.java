package exercisePackage.CoreJavaPrograms;

public class EventRegistration {
    public String name;
    public String nameOfEvent;
    double registrationFee;

    EventRegistration(String name,String nameOfEvent){
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    String getName(){
        return name;
    }
    String getNameOfEvent(){
        return nameOfEvent;
    }

    void setRegistrationFee(int noOfParticipants,int  baseFee){

        this.registrationFee = baseFee * noOfParticipants;



    }
    public void setRegistrationFee(int registrationFee) {
        this.registrationFee = registrationFee;
    }
    double getRegistrationFee () {
        return registrationFee;
    }



    void registerEvent(){
        System.out.println("""
                Events	    Base Fee
                1.ShakeALeg	100
                2.Sing&Win	150
                3.Hackathon	70
                4.PlayAway	130""");

    }


}
