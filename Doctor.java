package com.bl.hms;
import java.util.Map;

public class Doctor {

    enum WeekDays {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    String DoctorId;
    String name;
    String specialisation;
    long mobileNumber;
    String emailId;

    Map<WeekDays, String> availability;
}