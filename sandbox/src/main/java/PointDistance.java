public class PointDistance
{
    public static void main(String[] args){

/*      Point p1 = new Point(3, 4);
        Point p2 = new Point(6,8);
        System.out.println(distance(p1, p2));  //вызов самостоятельной функции*/

        Point p = new Point(3,4,6,8);

        System.out.println(p.distance());


    }


/*    public static double distance(Point po1, Point po2){ *//*функция самостоятельная (не ассоциирована с объектом) *//*

        double difX = po2.x - po1.x;
        double difY = po2.y - po1.y;
        System.out.println(difX +" + " + difY + " = " + (difX + difY) );
        return Math.sqrt((difX * difX + difY * difY));
    }*/





}
