package my.school;
public class Classroom {
    private int roomNumber;
    protected static String teacherName;
    static int globalKey=54321;
    public static int floor=3;

    public Classroom(int r,String t) {
        roomNumber = r;
        teacherName=t;
    }
}
