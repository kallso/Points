package Points;

public class TraceurDeLigne {
    public static void main(String[] args) {
        Point[] tab = new Point[3];

        tab[0] = new PointNommé(2,3,"A");
        tab[1] = new PointNommé(2,3,"A");
        tab[2] = new PointNommé(2,3,"A");

        System.out.println("Ma ligne : ");
        for (Point p: tab) {
            System.out.println(" _ " + p.toString());
        }




    /*    Point a = new Point(0,2);
        Point b = new Point(4,4);
        PointNommé pointC = new PointNommé(0,0, "C");
        PointNommé pointD = new PointNommé(0,1, "D");

        a.print();
        a.translate(1, 1);
        a.print();

        System.out.println(pointC.distance(pointD));
        pointC.print();
        pointC.renommer("pointC");
        pointC.print();*/

    }
}
