package com.company;

import javax.naming.Name;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(String n, String m, double w){
        this(n,m);
        weight = w;
    }

    Phone(String n, String m){
        number = n;
        model = m;
    }

    Phone(){

    }

    void receiveCall(String Name){
        System.out.printf("Звонит"+ Name + "\n");
    }

    void receiveCall(String Name, String number){
        System.out.println("Звонит "+ Name + " Number " + number);
    }

    void sendMessage(String number){ System.out.println(" Number  " + number);}

    String getNumber(){
        return number;
    }

    String getModel(){
        return model;
    }

    double getWeight(){
        return weight;
    }

}
