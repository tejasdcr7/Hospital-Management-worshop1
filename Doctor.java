package com.bl.hms;
import java.util.Map;

public class Doctor {



    enum WeekDays {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    String Id;
    String name;
    String specialisation;
    long mobileNumber;
    String emailId;

    Map<WeekDays, String> availability;

    @Override
    public String toString() {
        return "Doctor{" +
                "DoctorId='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", emailId='" + emailId + '\'' +
                ", availability=" + availability +
                '}';
    }
}