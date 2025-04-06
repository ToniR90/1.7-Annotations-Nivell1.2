package org.example;

public class RemoteWorker extends Worker{
    public static final double INTERNET = 80;

    public RemoteWorker(String name, String surename , double salaryPerHour){
        super(name , surename , salaryPerHour);
    }

    @Override
    public double calculateSalary(double workedHoursPerMonth) {
        return (super.getSalaryPerHour() * workedHoursPerMonth) + INTERNET;
    }

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("This method is not useful for RemoteWorker Class");
    }


}
