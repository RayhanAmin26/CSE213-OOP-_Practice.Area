package com.oop.practicearea_2220972.midterm2220972sec6;

public class Computer {
    private int serialNo;
    private String brand;
    private String model;
    private float price;
    private boolean hasGPU;
    private int noOfGPUCore;
    private static int computerList = 0;

    public Computer (int serialNo, String brand, String model, float price, boolean hasGPU, int noOfGPUCore){
        this.serialNo = serialNo;
        this. brand = brand;
        this.model = model;
        this.price = price;
        this.hasGPU = hasGPU;
        this.noOfGPUCore = noOfGPUCore;
        computerList++;
    }
    public int getSerialNo() {
        this.serialNo = serialNo;
    }
    public int getBrand() {
        this.brand = brand;
    }
    public int getModel() {
        this.model = model;
    }
    public int getPrice() {
        this.price = price;
    }
    public int getHasGPU() {
        this.hasGPU = hasGPU;
    }
    public int getNoOfGPUCore (){
        this.noOfGPUCore = noOfGPUCore;
    }


    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public Computer(int serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialNo=" + serialNo +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasGPU=" + hasGPU +
                ", noOfGPUCore=" + noOfGPUCore +
                '}';
    }
}
