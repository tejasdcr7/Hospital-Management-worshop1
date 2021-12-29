package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class AppointmentRepo {
    private static AppointmentRepo instance;
    List appointmentList = new ArrayList();

    private AppointmentRepo(){

    }
    public static AppointmentRepo getInstance(){
        if(instance==null){
            instance=new AppointmentRepo();
        }
        return instance;
    }

    public void add(Appointment appointment) {
        appointmentList.add(appointment);
    }
    List getAppointmentList() { return appointmentList;}

}
