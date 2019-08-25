package factory;

public class CreaterorFactory {

    public static FactoryCoctail getFactoryCoctail() {
        return new FactoryCoctail();
    }
    public static FactoryMeat getFactoryMeat() {
        return new FactoryMeat();
    }
}
