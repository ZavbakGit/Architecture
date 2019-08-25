package prototype;

public class Circle implements Cloneable{
    int x;
    int y;
    String color;
    int radius;

    public Circle(int x, int y, String color,Integer radius) {
       this.x = x;
       this.y = y;
       this.color = color;
       this.radius = radius;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle circle = (Circle) super.clone();
        circle.radius = 0;
        return circle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
