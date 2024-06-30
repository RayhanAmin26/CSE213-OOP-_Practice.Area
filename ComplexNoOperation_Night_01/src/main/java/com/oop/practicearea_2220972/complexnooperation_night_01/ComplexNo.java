package com.oop.practicearea_2220972.complexnooperation_night_01;

public class ComplexNo {
    int real;
    int img;

    public ComplexNo(){

    }
            ;

    public ComplexNo(int real,int img) {
        this.real = real;
        this.img = img;
    }

    public ComplexNo add(ComplexNo c){
        ComplexNo temp = new ComplexNo();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }

    public ComplexNo subtract(ComplexNo c){
        ComplexNo temp = new ComplexNo();
        temp.real = this.real - c.real;
        temp.img = this.img - c.img;
        return temp;
    }

    @Override
    public String toString() {
        return "ComplexNo: " + real + " + " + img + "i";

    }
}
