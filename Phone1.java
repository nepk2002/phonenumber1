package com.company;

public class Phone1 {
    public static void main(String[] args) {
        Phone myPhone1 = new Phone("111","nokia",100);
        Phone myPhone2 = new Phone("222","apple");
        Phone myPhone3 = new Phone();


        System.out.println("Телефон: ");
        System.out.println("myPhone1 =" + myPhone1.getNumber());
        System.out.println("myPhone1 =" + myPhone1.getModel());
        System.out.println("myPhone1 =" + myPhone1.getWeight());

        System.out.println("Телефон: ");
        System.out.println("myPhone2 =" + myPhone2.getNumber());
        System.out.println("myPhone2 =" + myPhone2.getModel());
        System.out.println("myPhone2 =" + myPhone2.getWeight());

        System.out.println("Телефон: ");
        System.out.println("myPhone3 =" + myPhone3.getNumber());
        System.out.println("myPhone3 =" + myPhone3.getModel());
        System.out.println("myPhone3 =" + myPhone3.getWeight());

        myPhone1.receiveCall("Петрович");
        myPhone2.receiveCall("Николаевич");
        myPhone3.receiveCall("Андреевич","123456");

        myPhone1.sendMessage("111");
        myPhone2.sendMessage("222");
        myPhone3.sendMessage("123456");
    }
}
