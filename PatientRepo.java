package com.bl.hms;


import java.util.ArrayList;
import java.util.List;

public class PatientRepo {
    private static PatientRepo instance;
    private List<Patient> patientList = new ArrayList();

    private PatientRepo(){

    }
    public static PatientRepo getInstance(){
        if (instance==null){
            instance=new PatientRepo();
        }
        return instance;
    }

    public void add(Patient patient) {
        patientList.add(patient);
    }

    List getPatientList() {
        return patientList;
    }

    public boolean isPatientAvailable(String Id) {
        for (int i = 0; i < patientList.size(); i++) {
            if ((patientList.get(i).patientId.equals(Id)))
                return true;
            }
            return false;
        }


    }


