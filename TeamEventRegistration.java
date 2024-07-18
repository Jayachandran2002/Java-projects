package exercisePackage;

public class TeamEventRegistration extends EventRegistration{
    private final int noOfParticipants;
    private final int teamNo;
    TeamEventRegistration(String name, String nameOfEvent,int noOfParticipants,int teamNo) {
        super(name, nameOfEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;

    }

    int getTeamNo(){
        return teamNo;
    }

    int getNoOfParticipants(){
        return noOfParticipants;
    }

}
