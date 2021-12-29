package com.bl.hms;
import java.util.Scanner;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    DoctorRepo doctorRepo = DoctorRepo.getInstance();
    public static void main(String[] args) {
        int option;
        int Exit = 13;
        UserInterface userInterface = UserInterface.getInstance();
        Application a = new Application();

        do {
            option = userInterface.ShowMainMenu();

            a.handleUserSelection(option);

        } while (option!= Exit);


    }



     void handleUserSelection(int option) {
        Scanner scanner = new Scanner(System.in);

        switch (option){
            case 1: addDoctor();
            break;
            case 2:
                System.out.println("Enter Doctor id");
                String Id = scanner.next();
                Doctor doctorRemove=  doctorRepo.getDoctor(Id);
                doctorRepo.remove(doctorRemove);

                break;
            case 3:
                break;
            case 4: DoctorRepo doctorRepo = DoctorRepo.getInstance();
                    UserInterface userInterface = new UserInterface();
                    List doctors = doctorRepo.getDoctorList();
                    userInterface.printAllDoctor(doctors);
                break;
            case 5:addPatient();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8: PatientRepo patientRepo = PatientRepo.getInstance();
                    List patients = patientRepo.getPatientList();
                    UserInterface.printAllPatient(patients);
                break;
            case 9:addAppointment();

                break;
            case 10:
                break;
            case 11:
                break;
            case 12: AppointmentRepo appointmentRepo = AppointmentRepo.getInstance();
                    List appointments = appointmentRepo.getAppointmentList();
                    UserInterface.printAllAppointments(appointments);
                break;
            case 13:
                break;


        }

    }
    private void addDoctor() {
        Scanner scanner=new Scanner(System.in);
        Doctor doctor = new Doctor();
        System.out.println("enter doctor id");
        doctor.Id = scanner.next();
        System.out.println("enter doctor name");
        doctor.name = scanner.next();
        System.out.println("enter doctor phone number");
        doctor.mobileNumber = scanner.nextInt();
        System.out.println("enter doctor specialisation");
        doctor.specialisation = scanner.next();
        System.out.println("enter doctor emailId");
        doctor.emailId  = scanner.next();

        doctor.availability  = new HashMap();
        doctor.availability.put(Doctor.WeekDays.SUN, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.MON, "11 AM TO  2 PM");
        doctor.availability.put(Doctor.WeekDays.TUE, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.WED, "11 AM TO 1 PM");
        doctor.availability.put(Doctor.WeekDays.THU, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.FRI, "10 AM TO 12 PM");
        doctor.availability.put(Doctor.WeekDays.SAT, "11 AM TO  2 PM");

        DoctorRepo doctorRepo = DoctorRepo.getInstance();
        doctorRepo.add(doctor);
    }


    private void addPatient() {
        Scanner scanner=new Scanner(System.in);
        Patient patient = new Patient();
        System.out.println("enter the patient id");
        patient.patientId = scanner.next();
        System.out.println("enter the patient mobile number");
        patient.mobileNumber = scanner.nextLong();
        System.out.println("enter the patient age");
        patient.age = scanner.nextInt();
        System.out.println("enter the patient adress");
        patient.address = scanner.next();
        System.out.println("enter the patient disease");
        patient.disease = scanner.next();
        System.out.println("Enter 1.MALE 2.FEMALE 3.OTHER");
        int option = scanner.nextInt();
        patient.info = new HashMap<>();
        switch(option){
            case 1:
                patient.info.put(Patient.Gender.MALE,"MALE");
                break;

            case 2:
                patient.info.put(Patient.Gender.FEMALE,"FEMALE");
                break;

            case 3:
                patient.info.put(Patient.Gender.OTHER,"OTHER");
                break;
        }

        PatientRepo patientRepo = PatientRepo.getInstance();
        patientRepo.add(patient);

    }


    private void addAppointment() {
        DoctorRepo doctorRepo = DoctorRepo.getInstance();
        PatientRepo patientRepo = PatientRepo.getInstance();
        Appointment appointment = new Appointment();
        System.out.println("Enter the appointment details");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the doctor id");
        appointment.patientId = scanner.next();
        if (!doctorRepo.isDoctorAvailable((appointment.doctorId))){
            System.out.println("Doctor id is not available");
            return;
        }
        System.out.println("enter the patient id");
        appointment.doctorId = scanner.next();
        if (!patientRepo.isPatientAvailable(appointment.patientId)){
            System.out.println("Patient id is not available");
            return;
        }
        System.out.println("enter the room number");
        appointment.roomNumber = scanner.nextInt();
        System.out.println("enter the date");
        String appointmentDate = scanner.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        Date date= null;
        try {
            date = formatter.parse(appointmentDate);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        appointment.appointmentDate = date;

        AppointmentRepo appointmentRepo = AppointmentRepo.getInstance();
        appointmentRepo.add(appointment);

        }



    }

