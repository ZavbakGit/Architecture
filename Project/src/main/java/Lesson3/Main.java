import builder.DepartmentBuilder;
import factory.*;
import prototype.Circle;
import singelton.DBHelper;
import sun.security.pkcs11.Secmod;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Test singelton
        DBHelper dbHelper = DBHelper.getInstance();
        System.out.println(dbHelper);
        dbHelper.setCount(1);
        dbHelper = DBHelper.getInstance();
        System.out.println(dbHelper);


        //Test builder
        DepartmentBuilder departmentBuilder = new DepartmentBuilder("Managers");
        System.out.println(departmentBuilder.count(5).general(true).build());

        //Test Clone
        Circle circle = new Circle(5,10,"red",8);
        Circle circleGrin = circle.clone();
        System.out.println(circle);
        System.out.println(circleGrin);

        //factory
        FactoryMeat factoryMeat = CreaterorFactory.getFactoryMeat();
        FactoryCoctail factryCoctail = CreaterorFactory.getFactoryCoctail();

        System.out.println(factoryMeat.getMeat(MeatEnum.Pork).getDescription());
        System.out.println(factryCoctail.getCoctail(CoctailEnum.Machito).getDescription());
    }
}
