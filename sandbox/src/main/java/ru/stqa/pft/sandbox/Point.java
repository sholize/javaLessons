package ru.stqa.pft.sandbox;

public class Point {

/*
    public double x;
    public double y;

    public ru.stqa.pft.sandbox.Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    */

    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Point(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance(){

        double difX = this.x2 - this.x1;
        double difY = this.y2 - this.y1;
        System.out.println(difX +" + " + difY + " = " + (difX + difY) );
        return Math.sqrt(difX * difX + difY * difY);

    }

}
