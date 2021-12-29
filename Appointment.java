package com.bl.hms;

import java.util.Date;

public class Appointment {

    String patientId;
    String doctorId;
    Date appointmentDate;
    int roomNumber;

    @Override
    public String toString() {
        return "Appointment{" +
                "patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
