package ru.stqa.pft.sandbox;

public class DistanceCount
{
    public static void main(String[] args){

/*      ru.stqa.pft.sandbox.Point p1 = new ru.stqa.pft.sandbox.Point(3, 4);
        ru.stqa.pft.sandbox.Point p2 = new ru.stqa.pft.sandbox.Point(6,8);
        System.out.println(distance(p1, p2));  //вызов самостоятельной функции*/

        Point p = new Point(3,4,6,8);

        System.out.println(p.distance());


    }


/*    public static double distance(ru.stqa.pft.sandbox.Point po1, ru.stqa.pft.sandbox.Point po2){ *//*функция самостоятельная (не ассоциирована с объектом) *//*

        double difX = po2.x - po1.x;
        double difY = po2.y - po1.y;
        System.out.println(difX +" + " + difY + " = " + (difX + difY) );
        return Math.sqrt((difX * difX + difY * difY));
    }*/





}
