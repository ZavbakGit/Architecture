package Lesson3;

import Lesson3.builder.DepartmentBuilder;
import Lesson3.factory.*;
import Lesson3.prototype.Circle;
import Lesson3.singelton.DBHelper;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Test Lesson3.singelton
        DBHelper dbHelper = DBHelper.getInstance();
        System.out.println(dbHelper);
        dbHelper.setCount(1);
        dbHelper = DBHelper.getInstance();
        System.out.println(dbHelper);


        //Test Lesson3.builder
        DepartmentBuilder departmentBuilder = new DepartmentBuilder("Managers");
        System.out.println(departmentBuilder.count(5).general(true).build());

        //Test Clone
        Circle circle = new Circle(5,10,"red",8);
        Circle circleGrin = circle.clone();
        System.out.println(circle);
        System.out.println(circleGrin);

        //Lesson3.factory
        FactoryMeat factoryMeat = CreaterorFactory.getFactoryMeat();
        FactoryCoctail factryCoctail = CreaterorFactory.getFactoryCoctail();

        System.out.println(factoryMeat.getMeat(MeatEnum.Pork).getDescription());
        System.out.println(factryCoctail.getCoctail(CoctailEnum.Machito).getDescription());
    }
}
