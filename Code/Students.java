public class Students {
    private int id;
    private String name;
    private int Point;

    public Students(int id, String name, int Point) {
        this.id = id;
        this.name = name;
        this.Point = Point;
    }
    public int getId() {
        return id;
    }
    public int getPoint() {
        return Point;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "student id:"+ id + " "+" student name:" + name + " "+" student point:" + Point;
    }
}
