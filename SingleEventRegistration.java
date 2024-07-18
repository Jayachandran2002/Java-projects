package exercisePackage;
import java.util.*;

public class SingleEventRegistration extends EventRegistration{
     private final int participantNo;

    SingleEventRegistration(String name, String nameOfEvent,int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }
    int getParticipantNo(){
        return participantNo;
    }


}
