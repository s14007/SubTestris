package jp.ac.it_college.std.s14007.android.subtestris;

/**
 * Created by s14007 on 15/12/23.
 */
public class Coordinate {
    public int x;
    public int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinate[] asArray(int...points) {
        Coordinate[] array = new Coordinate[4];
        array[0] = new Coordinate(points[0], points[1]);
        array[1] = new Coordinate(points[2], points[3]);
        array[2] = new Coordinate(points[4], points[5]);
        array[3] = new Coordinate(points[6], points[7]);

        return array;
    }
}
