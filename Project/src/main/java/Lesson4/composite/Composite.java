package Lesson4.composite;

import java.util.HashSet;
import java.util.Set;

public class Composite implements Shape {

    private Set<Shape> hashSet = new HashSet<>();

    public void add(Shape shape){
        hashSet.add(shape);
    }

    public void dell(Shape shape){
        hashSet.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape: hashSet) {
            shape.draw();
        }
    }
}
