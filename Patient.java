package com.bl.hms;
import java.util.Map;
public class Patient {
    enum Gender{
        MALE, FEMALE, OTHER
    }

    String name;
    int age;
    long mobileNumber;
    String patientId;
    String emailid;
    String address;
    String city;
    String disease;
    Gender gender;

    Map<Gender, String> info;

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobileNumber=" + mobileNumber +
                ", patientId='" + patientId + '\'' +
                ", emailid='" + emailid + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", disease='" + disease + '\'' +
                ", gender=" + gender +
                ", info=" + info +
                '}';
    }
}
