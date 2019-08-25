package Lesson4.bridge;

public  abstract class Shape {
    private Color color;
    private Integer x,y;

    Shape(Color color, Integer x, Integer y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return (new StringBuilder())
                .append(this.getClass().getSimpleName())
                .append("\n")
                .append("x = " + x)
                .append("\n")
                .append("y = " + y)
                .append("\n")
                .append("color = " + color.getColor())
                .toString();
    }



}
