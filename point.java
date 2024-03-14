import java.util.Scanner;

public class point {
    private String name; 
    private double x; 
    private double y; 

    public point() {
        this.name = "A";
        this.x = 0;
        this.y = 0;
    }
    //phương thức khởi tạo nhận 2 số thực làm tham số ? 
    public point(double x, double y) {
        this.name = "B"; 
        this.x = x;
        this.y = y;
    }
    public point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void inputPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên điểm: ");
        this.name = sc.next();
        System.out.println("Nhập hoành độ x: ");
        this.x = sc.nextDouble();
        System.out.println("Nhập tung độ y: ");
        this.y = sc.nextDouble();
    }
    public void inTTin() {
        System.out.println(name + "(" + y + ", " + x + ")");
    }
    public static void main(String[] args) {
        point   Point1 = new point();
        point   Point2 = new point();
        Point1.inputPoint();
        Point1.inTTin();
        Point2.setName("BB");
        Point2.setX(5);
        Point2.setY(8);
        Point2.inTTin();
        
    }
}
