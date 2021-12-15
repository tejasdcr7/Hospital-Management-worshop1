package com.bl.hms;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        UserInterface UserInterface = new UserInterface();
        int option = UserInterface.ShowMainMenu();
        UserInterface.ShowMainMenu();
        Application a = new Application();
        a.handleUserSelection(option);

    }
    void handleUserSelection(int option) {
        switch (option){
        case 1: addDoctor();
            break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;

        }

    }
    private void addDoctor() {
        Scanner scanner=new Scanner(System.in);
        Doctor doctor = new Doctor();
        System.out.println("enter doctor id");
        String doctorID = scanner.next();
        System.out.println("enter doctor name");
        String doctorName = scanner.next();
        System.out.println("enter doctor phone number");
        long doctormobileNumber = Scanner.nextInt();
        System.out.println("enter doctor emailId");
        String doctoremailId = Scanner.next();

        doctor.availability  = new HashMap();
        doctor.availability.put(Doctor.WeekDays.SUN, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.MON, "11 AM TO  2 PM");
        doctor.availability.put(Doctor.WeekDays.TUE, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.WED, "11 AM TO 1 PM");
        doctor.availability.put(Doctor.WeekDays.THU, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.FRI, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.SAT, "11 AM TO  2 PM");

        DoctorRepo doctorRepo = new DoctorRepo();
        doctorRepo.add(doctor);
    }
    private void Addpatient() {
        Patient patient = new Patient();
        System.out.println("enter the patient id");
        String patientId = Scanner.next();
        System.out.println("enter the patient mobile number");
         long patientmobileNumber = Scanner.next();
        System.out.println("enter the patient age");
        String patientAge = Scanner.nextInt();
        System.out.println("enter the patient adress");
        String patientadress = Scanner.nextInt();
        System.out.println("enter the patient disease");
        String patientdisease = Scanner.next();


    }
}
