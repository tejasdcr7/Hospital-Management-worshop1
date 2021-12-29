package com.bl.hms;
import java.util.List;
import java.util.Scanner;


public class UserInterface {
    private static UserInterface instance;

    public static UserInterface getInstance(){
        if (instance==null){
            instance=new UserInterface();
        }
        return instance;
    }


    public int ShowMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1.Add Doctor\n 2.Delete Doctor\n 3.Update Doctor\n 4.Print All Doctor\n " +
                "5.Add Patient\n 6.Delete Patient\n 7.Update Patient\n 8.Print All Patient\n " +
                "9.Add Appointment\n 10.Delete Appointment\n 11.Update Appointment\n " +
                "12.Print All Appointment\n 13.Exit\n");

        int option = sc.nextInt();
        return option;
    }

    void printAllDoctor(List doctorList) {

        for (int i = 0; i < doctorList.size(); i++) {
            System.out.println(doctorList.get(i));
        }

    }

    static void printAllPatient(List patientList) {
        for (int i = 0; i < patientList.size(); i++){
            System.out.println(patientList.get(i));
        }

    }

    public static void printAllAppointments(List appointmentList) {
        for (int i = 0;  i < appointmentList.size(); i++ ){
            System.out.println(appointmentList.get(i));

        }
    }
}



