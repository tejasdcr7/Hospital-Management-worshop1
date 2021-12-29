package com.bl.hms;

import java.util.ArrayList;
import java.util.List;


public class DoctorRepo {
     private static DoctorRepo instance;
     List <Doctor> doctorList = new ArrayList();

     private DoctorRepo(){

     }
     public static DoctorRepo getInstance(){
         if (instance==null){
             instance=new DoctorRepo();
         }
         return instance;
     }
    public void add(Doctor doctor) {
        doctorList.add(doctor);
    }
    public void remove(Doctor doctor){
         doctorList.remove(doctor);
    }
    public Doctor getDoctor(String Id){
         for(int i=0; i < doctorList.size(); i++){
             if(doctorList.get(i).Id.equals(Id)){
                 return doctorList.get(i);
             }
         }
        return null;
    }

    List getDoctorList() {
        return doctorList;
    }


    public boolean isDoctorAvailable(String Id) {
        for (int i = 0; i < doctorList.size(); i++){
            if (doctorList.get(i).Id.equals(Id))
                return true;
            }
            return false;
        }


        }


