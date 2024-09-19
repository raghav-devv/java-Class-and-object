package org.example;

public class Classobj {

    int speed;
    String Brand;

    public Classobj(int speed, String brand) {
        this.speed = speed;
        this.Brand = brand;
    }

    void result() {
        System.out.println("Brand: " + Brand + ", speed:" + speed);
    }


    public static void main(String[] args) {
        Classobj obj = new Classobj(100,"BMW");
        obj.result();
    }

}
