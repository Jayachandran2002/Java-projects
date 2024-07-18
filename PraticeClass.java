package exercisePackage;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PraticeClass {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Athens")));
    }


}

