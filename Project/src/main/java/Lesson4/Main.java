package Lesson4;

import Lesson4.adapter.Message;
import Lesson4.adapter.MessageAdapter;
import Lesson4.adapter.MyMessage;
import Lesson4.adapter.ShowMessage;
import Lesson4.bridge.*;
import Lesson4.composite.Composite;

public class Main {

    public static void main(String[] args) {
        //adapter
        System.out.println("Adapter");
        ShowMessage showMessage = new ShowMessage();
        Message message = new Message("Hi message");
        MyMessage myMessage = new MyMessage();

        showMessage.showMessage(message);
        showMessage.showMessage(new MessageAdapter(myMessage));

        //bridge
        System.out.println("\n\nBridge");

        Shape circleGreen = new Circle(new Green(),10,5);
        Shape sqareRed = new Sqare(new Red(),8,2);

        System.out.println(circleGreen.toString());
        System.out.println("\n" + sqareRed.toString());

        //Composite
        System.out.println("\n\nComposite");
        Lesson4.composite.Shape sqare = new Lesson4.composite.Sqare();
        Lesson4.composite.Shape circle = new Lesson4.composite.Circle();

        Composite composite1 = new Composite();
        composite1.add(sqare);
        composite1.add(circle);

        Composite composite = new Composite();
        composite.add(composite1);
        composite.add(sqare);

        composite.draw();
    }






}
