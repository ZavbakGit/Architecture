package Lesson3.factory;

public class FactoryMeat implements IFactoryMeat {
    public IMeat getMeat(MeatEnum meatEnum) {
        switch (meatEnum) {
            case Checken:
                return new Checken();
            case Pork:
                return new Pork();
            default:
                return null;
        }
    }
}
