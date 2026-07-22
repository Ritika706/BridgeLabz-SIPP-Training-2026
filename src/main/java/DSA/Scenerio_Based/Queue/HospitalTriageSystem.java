package main.java.DSA.Scenerio_Based.Queue;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient>{

    String name;
    int severity;

    Patient(String name,int severity){
        this.name=name;
        this.severity=severity;
    }

    @Override
    public int compareTo(Patient p){
        return p.severity-this.severity;
    }
}

public class HospitalTriageSystem {

    PriorityQueue<Patient> pq=new PriorityQueue<>();

    public void addPatient(String name,int severity){
        pq.offer(new Patient(name,severity));
    }

    public void treatPatient(){

        if(pq.isEmpty()){
            System.out.println("No Patient");
            return;
        }

        Patient p=pq.poll();

        System.out.println("Treating : "+p.name+
                " Severity : "+p.severity);
    }

    public static void main(String[] args){

        HospitalTriageSystem hospital=
                new HospitalTriageSystem();

        hospital.addPatient("Rahul",3);
        hospital.addPatient("Amit",8);
        hospital.addPatient("Riya",5);
        hospital.addPatient("Neha",10);

        hospital.treatPatient();
        hospital.treatPatient();
        hospital.treatPatient();
        hospital.treatPatient();

    }
}